package com.mruelas.kiik.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.mruelas.kiik.data.model.User;
import com.mruelas.kiik.data.repository.UserRepository;

import java.util.List;

public class UserViewModel extends ViewModel {
    private UserRepository repository;
    private MutableLiveData<List<User>> allUsers;
    private MutableLiveData<User> mUser;

    public UserViewModel(){
        repository = new UserRepository();
        allUsers = repository.getAllUsers();

    }

    private LiveData<List<User>> getAllUsers() {
        return allUsers;
    }

    public LiveData<User> createUser(User user) {
        mUser = repository.createUser(user);
        return mUser;
    }
}
