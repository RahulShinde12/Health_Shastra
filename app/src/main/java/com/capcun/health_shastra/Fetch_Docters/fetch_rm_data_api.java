package com.capcun.health_shastra.Fetch_Docters;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface fetch_rm_data_api {

//    @FormUrlEncoded
//
//    // register new user
//    @POST("fetch_rm_data_api.php")
//    Call<List<FetchRMResponceModel>> fetchRMData(
//
//            @Field("mobile") String mobile
//
//    );
//
//    @FormUrlEncoded
//    @POST("fetch_all_rm_data_api.php")
//    Call<List<FetchRMResponceModel>> fetchAllRMData(
//
//            @Field("mobile") String mobile
//
//    );
//
//    @FormUrlEncoded
//    @POST("remove_rm.php")
//    Call<String> removeRM(
//
//            @Field("rm_num") String rm_num
//
//    );
//
//    @FormUrlEncoded
//    @POST("remove_lead.php")
//    Call<String> removeLead(
//
//            @Field("lead_id") String lead_id
//
//    );


    @GET("fetch_doctors.php")
    Call<List<FetchManagersResponseModel>> fetchManagers(

    );

//    @FormUrlEncoded
//    @POST("set_pass.php")
//    Call<String> setPass(
//            @Field("emp_contact") String emp_contact
//    );
//
//    @FormUrlEncoded
//    @POST("change_pass.php")
//    Call<String> changePass(
//            @Field("emp_contact") String emp_contact,
//            @Field("emp_pass") String emp_pass
//    );
//
//
//    @FormUrlEncoded
//    @POST("send_otp.php")
//    Call<String> sendOTP(
//            @Field("emp_contact") String emp_contact,
//            @Field("otp") String otp
//    );

}
