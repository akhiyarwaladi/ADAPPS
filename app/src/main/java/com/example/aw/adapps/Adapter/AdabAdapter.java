package com.example.aw.adapps.Adapter;

/**
 * Created by AW on 11/25/2016.
 */

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.aw.adapps.Activities.MenuUtamaDetails;
import com.example.aw.adapps.Model.Adab;
import com.example.aw.adapps.R;

import java.util.List;

public class AdabAdapter extends RecyclerView.Adapter<AdabAdapter.MyViewHolder> {

    private Context mContext;
    private List<Adab> adabList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, count;
        public ImageView thumbnail;
        public Button bDetail;
        public CardView cv;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            count = (TextView) view.findViewById(R.id.count);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
            bDetail = (Button) view.findViewById(R.id.bDetail);
            cv = (CardView) view.findViewById(R.id.cv);
        }
    }

    public AdabAdapter(Context mContext, List<Adab> adabList) {
        this.mContext = mContext;
        this.adabList = adabList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adab_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        final Adab adab = adabList.get(position);
        holder.title.setText(adab.getNama());
        holder.count.setText(adab.getDeskripsi() + " songs");
        Glide.with(mContext).load(adab.getUrlImage()).into(holder.thumbnail);

        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v) {
                Toast.makeText(mContext, "pilih "+adab.getNama(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(mContext, MenuUtamaDetails.class);
                intent.putExtra("idd", adab.getId());
                intent.putExtra("nama", adab.getNama());
                intent.putExtra("deskripsi", adab.getDeskripsi());
                intent.putExtra("gambar", adab.getUrlImage());

                mContext.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return adabList.size();
    }

}