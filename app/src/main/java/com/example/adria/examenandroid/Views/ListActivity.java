package com.example.adria.examenandroid.Views;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.adria.examenandroid.Adapters.AmiiboAdapter;
import com.example.adria.examenandroid.Api.AmiiboService;
import com.example.adria.examenandroid.Api.RetrofitInstance;
import com.example.adria.examenandroid.Model.Amiibo;
import com.example.adria.examenandroid.Model.AmiiboParcelable;
import com.example.adria.examenandroid.R;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListActivity extends AppCompatActivity {
    AmiiboAdapter amiiboAdapter;
    ArrayList<AmiiboParcelable> amiibos;
    @BindView(R.id.RecyclerId) RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ButterKnife.bind(this);

        AmiiboService api = RetrofitInstance.getRetrofitInstance().create(AmiiboService.class);

        Call<AmiiboParcelable> call = api.getAmiibo();

        call.enqueue(new Callback<AmiiboParcelable>() {
            @Override
            public void onResponse(@NonNull Call<AmiiboParcelable> call, @NonNull Response<AmiiboParcelable> response) {
                if(response.isSuccessful()){
                    amiibos = response.body().getListaAmiibo();
                    recyclerView.setLayoutManager(new LinearLayoutManager(ListActivity.this));
                    recyclerView.setHasFixedSize(true);
                    amiiboAdapter= new AmiiboAdapter(ListActivity.this, amiibos);
                    recyclerView.setAdapter(amiiboAdapter);
                    amiiboAdapter.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            Intent intent = new Intent(ListActivity.this,DetailsActivity.class);
                            AmiiboParcelable objAmiibo = amiibos.get(recyclerView.getChildAdapterPosition(v));
                            intent.putExtra("data",objAmiibo);
                            ListActivity.this.startActivity(intent);

                        }
                    });

                }
            }
            @Override
            public void onFailure(Call<AmiiboParcelable> call, Throwable t) {

            }
        });
    }
}
