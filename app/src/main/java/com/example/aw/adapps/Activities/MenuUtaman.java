package com.example.aw.adapps.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.aw.adapps.Adapter.Adab;
import com.example.aw.adapps.Adapter.AdabAdapter;
import com.example.aw.adapps.R;

import java.util.ArrayList;
import java.util.List;

public class MenuUtaman extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdabAdapter adapter;
    private List<Adab> adabList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuutama);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adabList = new ArrayList<>();
        adapter = new AdabAdapter(this, adabList);

        recyclerView.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter(adapter);
        prepareAlbums();
    }
    private void prepareAlbums() {
        int[] covers = new int[]{
                R.drawable.adappsicon,
                R.drawable.adappsicon,
                R.drawable.adappsicon,
                R.drawable.adappsicon};

        Adab a = new Adab(1,"True Romance", "lalala", covers[0]);
        adabList.add(a);

        a = new Adab(2,"Xscpae", "blabla", covers[1]);
        adabList.add(a);

        a = new Adab(3,"Maroon 5", "yayaya", covers[2]);
        adabList.add(a);

        a = new Adab(4,"Born to Die", "kyaaaa", covers[3]);
        adabList.add(a);

        adapter.notifyDataSetChanged();
    }
}
