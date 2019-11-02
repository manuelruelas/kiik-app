package com.mruelas.kiik.data.model;

import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("name")
    String name;

    @SerializedName("email")
    String email;

    @SerializedName("password")
    String password;

    User(){}


}
