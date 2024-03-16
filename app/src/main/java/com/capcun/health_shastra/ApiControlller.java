package com.capcun.health_shastra;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiControlller {

    // give url of your api folder
    static final String url = "https://capcun.com/health_shastra/";

    private static ApiControlller clientObject;

    // Create object of retrofit
    private static Retrofit retrofit;

    ApiControlller()
    {
        retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized ApiControlller getInstance()
    {
        if(clientObject == null)
            clientObject = new ApiControlller();
        return clientObject;
    }

    // for verifying employee's credentials
//    VerifyLoginDataApi getVerifyLoginDataApi() {return retrofit.create(VerifyLoginDataApi.class);}

//    ExportAPI exportData() {return retrofit.create(ExportAPI.class);}
//
//    public fetching_message_api fetching_meesage_api() {return retrofit.create(fetching_message_api.class);}
//


}