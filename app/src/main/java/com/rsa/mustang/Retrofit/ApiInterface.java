package com.rsa.mustang.Retrofit;

import com.google.gson.JsonObject;
import com.rsa.mustang.Pojo.Cobra;

import org.json.JSONObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {

    @Headers({ "AuthKey: 6257 1/n2D6fw1kgAAAAAAAAAAAAAAAAAAAAA 0tsy9X+98x1Ib4YwuzAs6XvFI74Jd6HQqHVCgFFR sharmila.k+new@dotnetethics.com Android SDK built for x86",
            "Content-Type:application/json",
            "Accept:application/json"})
    @POST("GetContactList")
    Call<Cobra> GetContactList(@Body JsonObject jsonObject);
}
