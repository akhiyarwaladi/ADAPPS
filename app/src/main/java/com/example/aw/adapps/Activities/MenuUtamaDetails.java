package com.example.aw.adapps.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.aw.adapps.R;

public class MenuUtamaDetails extends AppCompatActivity {
    private Toolbar toolbar;

    private TextView judul, kategori, deskripsi;
    private ImageView gambar;
    private Button share;

    private String Judul, Deskripsi;

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
        share = (Button)findViewById(R.id.bshare);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MenuUtamaDetails.this, "shared", Toast.LENGTH_SHORT).show();
            }
        });

        Intent intent = getIntent();
        Judul = intent.getStringExtra("nama");
        Deskripsi = intent.getStringExtra("deskripsi");
        int image_link = intent.getIntExtra("gambar", R.drawable.rightarrow);

        Log.d("Judul", Judul);
        Log.d("Deskripsi", Deskripsi);

        judul.setText(Judul);
        deskripsi.setText(Deskripsi);
        kategori.setText(Judul);
        Glide.with(this).load(image_link).into(gambar);
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
        return super.onOptionsItemSelected(item);
    }
}
