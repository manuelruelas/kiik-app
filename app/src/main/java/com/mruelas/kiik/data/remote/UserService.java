package com.mruelas.kiik.data.remote;

import com.mruelas.kiik.data.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UserService {


    @GET("/users")
    Call<List<User>> getAllUser();

    @POST("/users")
    Call<ApiResponse<User>> createUser(@Body User user);
}
