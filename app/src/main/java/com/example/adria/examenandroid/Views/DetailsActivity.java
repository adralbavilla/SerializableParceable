package com.example.adria.examenandroid.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.adria.examenandroid.Model.Amiibo;
import com.example.adria.examenandroid.Model.AmiiboParcelable;
import com.example.adria.examenandroid.R;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailsActivity extends AppCompatActivity {
    private ArrayList<Amiibo> amiibo;
    @BindView(R.id.imagen) ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ButterKnife.bind(this);

        //Amiibo ammiboObjeto =(Amiibo) getIntent().getSerializableExtra("data");
        AmiiboParcelable ammiboObjeto =(AmiiboParcelable) getIntent().getParcelableExtra("data");
        detailsObjetos(ammiboObjeto);
    }

    public void detailsObjetos(AmiiboParcelable amiiboParcelable){
       Picasso.get().load(amiiboParcelable.image).into(imageView);
    }
}
