package com.example.adria.examenandroid.Api;

import com.example.adria.examenandroid.Model.Amiibo;
import com.example.adria.examenandroid.Model.AmiiboParcelable;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AmiiboService {
    @GET("amiibo")
    Call<AmiiboParcelable> getAmiibo();
}
