package com.example.free_to_play;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.free_to_play.adapter.ListaJuegosPcAdapter;
import com.example.free_to_play.models.ListGamesPc;
import com.example.free_to_play.webservice.webServiceClient;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class JuegosPc extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ListaJuegosPcAdapter adapter;
    private LinearLayoutManager layoutManager;
    private webServiceClient webServiceClient;
    private List<ListGamesPc> todasRazas;
    //private SwipeRefreshLayout swipeRefreshLayout;
    private FloatingActionButton fab_listaVotos;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupView();
        initRetrofit();
        lanzarPeticion();
    }

    private void setupView() {


        recyclerView =  findViewById(R.id.recyclerView);
        adapter = new ListaJuegosPcAdapter(this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }


    private void initRetrofit() {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder().addInterceptor(loggingInterceptor);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(webServiceClient.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClientBuilder.build())
                .build();
        webServiceClient = retrofit.create(webServiceClient.class);
    }


    private void lanzarPeticion(){
        Call<List<ListGamesPc>> todosLosJuegosPc = webServiceClient.getAllGamesPc();

        todosLosJuegosPc.enqueue(new Callback<List<ListGamesPc>>() {
            //ssss
            @Override
            public void onResponse(Call<List<ListGamesPc>> call, Response<List<ListGamesPc>> response) {
                if (response.isSuccessful()) {
                    int code = response.code();

                    adapter.setLista(response.body());
                    //adapter.setLista(todasRazas);
                } else {
                    showErrorMessage();
                }
            }

            @Override
            public void onFailure(Call<List<ListGamesPc>> call, Throwable t) {
                showErrorMessage();
            }
        });
    }
    private void showErrorMessage() {
        Toast.makeText(JuegosPc.this, "Ha ocurrido un error desconocido. Por favor, vuelve a intentarlo más tarde.", Toast.LENGTH_SHORT).show();
    }
}
