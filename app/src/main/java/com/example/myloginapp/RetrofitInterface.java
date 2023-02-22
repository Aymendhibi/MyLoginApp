package com.example.myloginapp;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RetrofitInterface {

    @POST("login")
    Call<LoginResult> executeLogin(@Body LoginResult loginResult);

    @POST("register")
    Call<Void> executeSignup (@Body LoginResult loginResult);

}
