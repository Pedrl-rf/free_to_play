//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.free_to_play.webservice;

import com.example.free_to_play.models.ListGames;
import com.example.free_to_play.models.ListGamesBrowser;
import com.example.free_to_play.models.OneGame;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface webServiceClient {
    String BASE_URL = "https://www.freetogame.com/api/";

    @GET("games")
    Call<List<ListGames>> getAllGames();

    @GET("games/?platform=pc")
    <ListGamesPc>
    Call<List<ListGamesPc>> getAllGamesPc();

    @GET("games/?platform=browser")
    Call<List<ListGamesBrowser>> getAllGamesBrowser();

    @GET("game/?id=")
    Call<List<OneGame>> getOneGame(@Query("id") int var1);
}
