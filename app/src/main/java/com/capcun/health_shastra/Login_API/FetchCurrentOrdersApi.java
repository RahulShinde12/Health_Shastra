package com.capcun.health_shastra.Login_API;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface FetchCurrentOrdersApi {



    @FormUrlEncoded
    @POST("update_lead_desc.php")
    Call<String> updateLeadDesc(
            @Field("lead_id") String lead_id,
            @Field("lead_desc") String lead_desc
    );



    @FormUrlEncoded

    @POST("set_fav_lead.php")
    Call<String> setFavLead(
            @Field("lead_id") String lead_id
    );

    @FormUrlEncoded
    @POST("remove_fav_lead.php")
    Call<String> removeFavLead(
            @Field("lead_id") String lead_id
    );


    @FormUrlEncoded
    @POST("user_login.php")
    Call<String>getOrderData2(
            @Field("emp_contact") String emp_contact,
            @Field("emp_pass") String emp_pass
    );

    @FormUrlEncoded
    // register new offer
    @POST("updateDeviceToken.php")
    Call <String>  updateDeviceTokenss (
            @Field("manager_mobile") String manager_mobile,@Field ("device_token") String device_token
    );


}
