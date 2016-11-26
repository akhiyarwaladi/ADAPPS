package com.example.aw.adapps.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aw.adapps.Model.Developer;
import com.example.aw.adapps.R;
import com.google.android.flexbox.FlexboxLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class Keterangan extends AppCompatActivity {

    private Toolbar toolbar;
    @Bind(R.id.fb_buddies)
    FlexboxLayout flexboxLayout;
    List<Developer> developers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.keterangan);

        toolbar = (Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Tentang Kami");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        ButterKnife.bind(this);
        developers = new ArrayList<Developer>();

        prepareDeveloper();
        renderBuddies();

    }
    private void prepareDeveloper(){
        Developer developer = new Developer(1, "Indra");
        developers.add(developer);

        developer = new Developer(2, "Akhiyar");
        developers.add(developer);

        developer = new Developer(3, "Syamsul");
        developers.add(developer);
    }

    private void addBuddiesView(final Developer d) {
        final View itemView = getLayoutInflater().inflate(R.layout.layout_buddies, null);
        final String name = d.getNama();
        TextView tv = (TextView) itemView.findViewById(R.id.tv_name);
        tv.setText(name);

        if(flexboxLayout!=null)
            flexboxLayout.addView(itemView);
    }
    private void renderBuddies() {
        if(flexboxLayout!=null)
            if(flexboxLayout.getChildCount()>0)
                flexboxLayout.removeAllViews();
        for (Developer p : developers) {
            addBuddiesView(p);
        }
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
