package com.example.adria.examenandroid.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.adria.examenandroid.Model.Amiibo;
import com.example.adria.examenandroid.Model.AmiiboParcelable;
import com.example.adria.examenandroid.R;
import com.example.adria.examenandroid.Views.DetailsActivity;
import com.example.adria.examenandroid.Views.ListActivity;
import com.squareup.picasso.Picasso;
import butterknife.ButterKnife;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class AmiiboAdapter extends RecyclerView.Adapter<AmiiboAdapter.ViewHolderAmiibo> implements View.OnClickListener{
    List<AmiiboParcelable> mlistaAmiibo;
    Context mcontext;
    private View.OnClickListener mlistener;

    public AmiiboAdapter(Context context, List<AmiiboParcelable> listaAmiibo) {
        mcontext=context;
        mlistaAmiibo = listaAmiibo;
    }

    @Override
    public AmiiboAdapter.ViewHolderAmiibo onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        view.setOnClickListener(this);
        return new AmiiboAdapter.ViewHolderAmiibo(view);
    }

    @Override
    public void onBindViewHolder(AmiiboAdapter.ViewHolderAmiibo holder, int position) {
        holder.name.setText(mlistaAmiibo.get(position).getName());
        holder.amiiboSeries.setText(mlistaAmiibo.get(position).getAmiiboSeries());
        Picasso.get().load(mlistaAmiibo.get(position).getImage()).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return mlistaAmiibo.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        mlistener=listener;
    }

    @Override
    public void onClick(View v) {
        if(mlistener !=null){
            mlistener.onClick(v);
        }
    }


    public class ViewHolderAmiibo extends RecyclerView.ViewHolder {
        @BindView(R.id.image) ImageView image;
        @BindView(R.id.name) TextView name;
        @BindView(R.id.amiiboSeries) TextView amiiboSeries;

        public ViewHolderAmiibo(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
