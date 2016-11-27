package com.example.aw.adapps.Activities;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
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
import com.facebook.FacebookSdk;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.ShareDialog;

public class MenuUtamaDetails extends AppCompatActivity {
    private Toolbar toolbar;
    private ShareDialog shareDialog;

    private TextView judul, kategori, deskripsi;
    private ImageView gambar;

    private FloatingActionButton fab;

    private String Id, Judul, Deskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuutamadetails);
        FacebookSdk.sdkInitialize(getApplicationContext());
        shareDialog = new ShareDialog(this);

        toolbar = (Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        judul = (TextView)findViewById(R.id.judul);
        deskripsi = (TextView)findViewById(R.id.deskripsi);
        kategori = (TextView)findViewById(R.id.kategori);
        gambar = (ImageView)findViewById(R.id.gambar);


        Intent intent = getIntent();
        int idd = intent.getIntExtra("idd", 1);
        Judul = intent.getStringExtra("nama");
        Deskripsi = intent.getStringExtra("deskripsi");
        int image_link = intent.getIntExtra("gambar", R.drawable.rightarrow);
        Id = Integer.toString(idd);

        Log.d("Id", Id);
        Log.d("Judul", Judul);
        Log.d("Deskripsi", Deskripsi);


        judul.setText(Judul);
        setTitle(Judul);
        deskripsi.setText(Deskripsi);
        kategori.setText(Judul);
        Glide.with(this).load(image_link).into(gambar);

        fab = (FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ShareDialog.canShow(ShareLinkContent.class)) {
                    ShareLinkContent linkContent = new ShareLinkContent.Builder()
                            .setContentTitle(Judul)
                            .setContentDescription(Deskripsi)
                            .setContentUrl(Uri.parse("http://agribotipb.xyz/"))
                            .setImageUrl(Uri.parse("http://sipadat.agri.web.id/"+Id+".png"))
                            .build();

                    shareDialog.show(linkContent);
                }
            }
        });

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
