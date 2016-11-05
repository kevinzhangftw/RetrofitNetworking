package com.example.kevinzhang.retrofitnetworking;

/**
 * Created by kevinzhang on 2016-11-05.
 */
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.Callback;

public interface StackOverflowAPI {
    @GET("/2.2/questions?order=desc&sort=creation&site=stackoverflow")
    Call<com.example.kevinzhang.retrofitnetworking.StackOverflowQuestions> loadQuestions(@Query("tagged") String tags);
}
