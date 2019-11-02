package com.mruelas.kiik.data.repository;

import androidx.lifecycle.MutableLiveData;

import com.mruelas.kiik.data.model.User;
import com.mruelas.kiik.data.remote.RetrofitClient;
import com.mruelas.kiik.data.remote.UserService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserRepository {
    private static UserRepository userRepository;
    private UserService userService;

    public static UserRepository getInstance(){
        if (userRepository == null) {
            userRepository = new UserRepository();
        }
        return userRepository;
    }

    public UserRepository(){
        userService = RetrofitClient.getRetrofitInstance().create(UserService.class);
    }


    public MutableLiveData<List<User>> getAllUsers(){
        final MutableLiveData<List<User>> usersData = new MutableLiveData<>();
        userService.getAllUser().enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                if (response.isSuccessful()){
                    usersData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                usersData.setValue(null);
            }
        });
        return usersData;
    }
}
