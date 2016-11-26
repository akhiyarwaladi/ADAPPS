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
                R.drawable.makan,
                R.drawable.tidur,
                R.drawable.adappsicon,
                R.drawable.adappsicon,
                R.drawable.adappsicon,
                R.drawable.adappsicon,
                R.drawable.adappsicon};

        Adab adab = new Adab(1, "Adab Makan dan Minum", "a. Berusahalah dengan hati-hati untuk mencari makanan dan minuman yang halal\n" +
                "b. Cuci tangan sebelum makan, dan bersihkan mulut jika telah selesai. terutama jika hendak sholat\n" +
                "c. Mulailah makan dan  minum dengan mmembaca basmalah, dan diakhiri dengan hamdalah\n" +
                "d. jangan mencela makanan jika tidak menyukainya\n" +
                "e. Jangan menggunakan bejana emas dan perak\n" +
                "f. makan dan minum sebaiknya dalam posisi duduk dengan tenang\n" +
                "g. gunakanlah tangan kanan, dan mulailah hidangan dari yang ada di depan\n" +
                "h. Ambilah makanan dengan porsi secukupnya\n", covers[0]);
        adabList.add(adab);

        adab = new Adab(2, "Adab Tidur dan Bangun", "a. tidurlah seawal mungkin, jangan terlalu larut\n" +
                "b. Berwudhulah sebelum tidur dan berbaring ke sebelah kanan\n" +
                "c. Sebelum tidur, sebaiknya mengingat kembali kesalahan yang telah diperbuat dan memohon ampun kepada Allah swt\n" +
                "d. bacalah doa dan dzikir\n" +
                "e. Tutuplah pintu, jendela, makanan dan memadamkan api dan lampu sebelum tidur\n" +
                "f. Ketika bangun tidur, hendaklah bersyukur", covers[1]);
        adabList.add(adab);

        adab = new Adab(3, "Adab Membuang Hajat", "a. jangan menunda-nunda, baiknya disegerakan\n" +
                "b. menjauhlah dari pandangan manusia saat buang hajat\n" +
                "c. jangan membuang hajat di aliran air, jalan yang dilewati orang, dan tempat berteduh\n" +
                "d. jangan membawa sesuatu yang berisi ungkapan Allah swt kecuali karena terpaksa\n" +
                "e. jangan membelakangi atau menghadap kiblat jika terpaksa buang hajat di temmpat terbuka\n" +
                "f. jangan buang air kecil di air tergenang\n" +
                "g. gunakan tangan kiri saat membersihkan sisa kotoran\n" +
                "h. jangan berbicara saat buang hajat, kesuali darurat", covers[2]);
        adabList.add(adab);

        adab = new Adab(4, "Adab Berpakaian", "a. pakailah pakaian yang suci, jangan memakai pakaian yang bernajis\n" +
                "b. pakaian harus menutup aurat, yaitu longgar tidak membentuk lekuk tubuh\n" +
                "c. pakaian laki-laki jangan menyerupai pakaian wanita, dan sebaliknya\n" +
                "d. Laki-laki tidak boleh memakai emas dan kain sutera\n" +
                "e. dianjurkan mendahulukan bagian kanan saat berpakaian\n" +
                "f. gunakanlah sandal/sepatu sepasang, jangan sebelah\n", covers[3]);
        adabList.add(adab);

        adab = new Adab(5, "Adab di Jalanan", "a. Berjalannlah dengan tenang, bersikap wajar yaitu tawadhu agar tak terlihat sombong\n" +
                "b. jangan mengganggu, membuang sampah dan buang hajat di jalanan\n" +
                "c. singkirkan gangguan dari jalan, seperti beling, duri dan sebagainya.\n" +
                "d. jawablah salam dari orang yang memberi salam di jalan, baik dari orang yang dikenal atau tidak\n" +
                "e. berikan bantuan kepada orang yang tersesat jika mampu membantunya\n" +
                "f. jika menggunakan kendaraan, jangan membuat gaduh dengan klakson, suara knalpot dan sebagainya. dahulukan pejalan kaki yang akan menyebrang\n" +
                "g. parkirkan kendaraan pada tempatnya agar tidak mengganggu yang lain\n", covers[4]);
        adabList.add(adab);

        adab = new Adab(6, "Adab Memberi Salam", "a. keraskan suara ketika mengucapkan atau membalas salam\n" +
                "b. jika sedang berkendara, ucapkan salam kepada yang berjalan kaki\n" +
                "c. Ucapkan salam ketika masuk ke suatu majlis dan saat meninggalkan majelis\n" +
                "d. Ucapkan salam saat memasuki rumah, walaupun rumah tersebut kosong\n" +
                "e. jangan memberi salam kepada orang yang sedang berada di WC\n" +
                "f. Orang dewasa harus memberikan salam ke pada anak-anak\n" +
                "g. dianjurkan berjabat tangan  saat memberi salam kepada mahramnya ", covers[5]);
        adabList.add(adab);

        adab = new Adab(7, "Adab Bergaul", "a. perhatikan perasaan orang lain dan hormatilah\n" +
                "b. kenali karakter dan ahlak mereka\n" +
                "c. Tanyakanlah kabar mereka, dan jagalah rahasia mereka\n" +
                "d. tawadhulah kepada mereka, jangan merasa lebih hebat dari mereka\n" +
                "e. tersenyumlah saat bertemu mereka denga berwajah manis dan lapang dada\n" +
                "f. berbicalah sesuai dengan akal mereka\n" +
                "g. berbaik sangka kepada orang lain dan tidak memata-matai mereka\n" +
                "h. maafkan kekeliruan mereka dan tidak mencari-cari kesalahannya\n" +
                "i. jaga selalu perdamaian meskipun harus merekayasanya", covers[6]);
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
