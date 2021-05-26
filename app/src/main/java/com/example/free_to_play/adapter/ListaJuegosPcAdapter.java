package com.example.free_to_play.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.free_to_play.JuegoPcDetail;
import com.example.free_to_play.R;
import com.example.free_to_play.models.ListGamesPc;

import java.util.ArrayList;
import java.util.List;

public class ListaJuegosPcAdapter extends RecyclerView.Adapter<ListaJuegosPcAdapter.JuegosPcHolder> {
    private List<ListGamesPc>juegospc;
    private final Context context;

    public ListaJuegosPcAdapter(Context context) {
        this.context = context;
        this.juegospc = new ArrayList<>();
    }


    @NonNull
    @Override
    public ListaJuegosPcAdapter.JuegosPcHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapterjuegospc, parent, false);
        return new JuegosPcHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ListaJuegosPcAdapter.JuegosPcHolder holder, int position) {
        ListGamesPc juego = juegospc.get(position);
        holder.tvJuegosPc.setText(juego.getTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, JuegoPcDetail.class);
                intent.putExtra("data", juego);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return juegospc.size();
    }

    public void setLista(List<ListGamesPc> body) {
        this.juegospc = body;
        notifyDataSetChanged();
    }

    public class JuegosPcHolder extends RecyclerView.ViewHolder{
        private final TextView tvJuegosPc;

        public JuegosPcHolder(View itemView) {
            super(itemView);
            this.tvJuegosPc = itemView.findViewById(R.id.nombreJuego);
        }
    }
}
