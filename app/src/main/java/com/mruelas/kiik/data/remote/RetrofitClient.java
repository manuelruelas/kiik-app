package com.mruelas.kiik.data.remote;



import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitClient {

    private static Retrofit retrofit;
    private static final String APIURL = "http://192.168.0.20:3000";

    public static Retrofit getRetrofitInstance(){
        if (retrofit==null){
            retrofit = new retrofit2.Retrofit
                    .Builder()
                    .baseUrl(APIURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }

}
