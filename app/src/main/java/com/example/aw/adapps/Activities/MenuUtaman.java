package com.example.aw.adapps.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.aw.adapps.Model.Adab;
import com.example.aw.adapps.Adapter.AdabAdapter;
import com.example.aw.adapps.R;

import java.util.ArrayList;
import java.util.List;

public class MenuUtaman extends AppCompatActivity {
    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private AdabAdapter adapter;
    private List<Adab> adabList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuutama);
        toolbar = (Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("ADAPPS");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

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
                R.drawable.adappsicon,
                R.drawable.adappsicon,
                R.drawable.adappsicon,
                R.drawable.adappsicon};

        Adab adab = new Adab(1, "True Romance", "lalala", covers[0]);
        adabList.add(adab);

        adab = new Adab(2, "Xscpae", "blabla", covers[1]);
        adabList.add(adab);

        adab = new Adab(3, "Maroon 5", "yayaya", covers[2]);
        adabList.add(adab);

        adab = new Adab(4, "Fripside", "Two Soul Toward the Truth", covers[3]);
        adabList.add(adab);

        adab = new Adab(5, "Yanagi nagi", "Blabla", covers[4]);
        adabList.add(adab);

        adab = new Adab(6, "Lisa", "Sword art Online", covers[5]);
        adabList.add(adab);

        adab = new Adab(7, "Aqours", "Step Zero to One", covers[6]);
        adabList.add(adab);

        adapter.notifyDataSetChanged();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.utama, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            finish();
        }
        else if(id == R.id.action_logout){
            Toast.makeText(this, "logout", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(id == R.id.action_refresh){
            Toast.makeText(this, "refresh", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(id == R.id.action_about){
            Intent intent = new Intent(this, Keterangan.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
