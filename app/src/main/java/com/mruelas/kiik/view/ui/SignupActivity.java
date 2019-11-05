package com.mruelas.kiik.view.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;


import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;
import com.mruelas.kiik.R;
import com.mruelas.kiik.data.model.User;
import com.mruelas.kiik.viewModel.UserViewModel;

public class SignupActivity extends AppCompatActivity {
    UserViewModel mUserViewModel;
    TextInputEditText mTxtName;
    TextInputEditText mTxtPassword;
    TextInputEditText mTxtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        mUserViewModel = ViewModelProviders.of(this).get(UserViewModel.class);

        mTxtName = findViewById(R.id.txt_name);
        mTxtEmail = findViewById(R.id.txt_email);
        mTxtPassword = findViewById(R.id.txt_password);
    }

    public void submit(View view) {
        User user = new User(mTxtName.getText().toString(), mTxtEmail.getText().toString(), mTxtPassword.getText().toString());
        mUserViewModel.createUser(user).observe(this, new Observer<User>() {
            @Override
            public void onChanged(User user) {
                System.out.println(user);
            }
        });

    }


}
