package com.capcun.health_shastra.AddNewUser;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface AddNewUserApi {

    @FormUrlEncoded
    @POST("add_new_user_api.php")
    Call<AddNewUserApiResponseModel> addNewUser(
            @Field("fname") String fname_dt,
            @Field("lname") String lname_dt,
            @Field("mail") String email_dt,
            @Field("contact") String contact_dt,
            @Field("password") String password_dt,
            @Field("age") String age_dt
    );
}
