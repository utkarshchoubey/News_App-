package com.example.newsapp.api;

import android.widget.ShareActionProvider;

import com.example.newsapp.model.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("top-headlines")
    Call<News> getNews(

            @Query("country") String country ,
            @Query("apiKey") String apiKey

    );

    @GET("everything")
    Call<News> getNewsSearch(
            @Query("q")String keyword,
            @Query("langauge")String language,
            @Query("sortBy")String sortBy,
            @Query("apiKey") String apiKey

            );



}
