package com.example.aw.adapps.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.aw.adapps.Adapter.Adab;
import com.example.aw.adapps.R;

import java.util.List;

public class MenuUtamaDetails extends AppCompatActivity {
    Toolbar toolbar;
    TextView judul, kategori, deskripsi;
    ImageView gambar;
    String Judul, Kategori, Deskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuutamadetails);

        toolbar = (Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("DETIL");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        judul = (TextView)findViewById(R.id.judul);
        deskripsi = (TextView)findViewById(R.id.deskripsi);
        kategori = (TextView)findViewById(R.id.kategori);
        gambar = (ImageView)findViewById(R.id.gambar);

        Intent intent = getIntent();
        Judul = intent.getStringExtra("nama");
        Deskripsi = intent.getStringExtra("deskripsi");
        int image_link = intent.getIntExtra("gambar", R.drawable.rightarrow);
        Glide.with(this).load(image_link).into(gambar);

//        Log.d("Judul", Judul);
//        Log.d("Deskripsi", Deskripsi);

        judul.setText(Judul);
        deskripsi.setText(Deskripsi);
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
            Toast.makeText(this, "haha", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
