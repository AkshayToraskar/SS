package com.ak.ss.app;



import com.ak.ss.Login;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by dg hdghfd on 22-03-2017.
 */

public interface ApiInterface {
    @FormUrlEncoded
    @POST("search/Login.php")
    Call<Login> getLogin(@Field("username") String username,
                         @Field("password") String password);


}
