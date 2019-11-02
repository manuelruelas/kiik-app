package com.mruelas.kiik.data.remote;

import com.mruelas.kiik.data.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UserService {

    //@GET("/users")
    @GET("")
    Call<List<User>> getAllUser();
}
