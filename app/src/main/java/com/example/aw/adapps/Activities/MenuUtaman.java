package com.example.aw.adapps.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.aw.adapps.Adapter.AdabAdapter;
import com.example.aw.adapps.Model.Adab;
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
                "d. Jangan mencela makanan jika tidak menyukainya\n" +
                "e. Jangan menggunakan bejana emas dan perak\n" +
                "f. Makan dan minum sebaiknya dalam posisi duduk dengan tenang\n" +
                "g. Gunakanlah tangan kanan, dan mulailah hidangan dari yang ada di depan\n" +
                "h. Ambilah makanan dengan porsi secukupnya\n", covers[0]);
        adabList.add(adab);

        adab = new Adab(2, "Adab Tidur dan Bangun", "a. Tidurlah seawal mungkin, jangan terlalu larut\n" +
                "b. Berwudhulah sebelum tidur dan berbaring ke sebelah kanan\n" +
                "c. Sebelum tidur, sebaiknya mengingat kembali kesalahan yang telah diperbuat dan memohon ampun kepada Allah swt\n" +
                "d. Bacalah doa dan dzikir\n" +
                "e. Tutuplah pintu, jendela, makanan dan memadamkan api dan lampu sebelum tidur\n" +
                "f. Ketika bangun tidur, hendaklah bersyukur", covers[1]);
        adabList.add(adab);

        adab = new Adab(3, "Adab Membuang Hajat", "a. Jangan menunda-nunda, baiknya disegerakan\n" +
                "b. Menjauhlah dari pandangan manusia saat buang hajat\n" +
                "c. Jangan membuang hajat di aliran air, jalan yang dilewati orang, dan tempat berteduh\n" +
                "d. Jangan membawa sesuatu yang berisi ungkapan Allah swt kecuali karena terpaksa\n" +
                "e. Jangan membelakangi atau menghadap kiblat jika terpaksa buang hajat di temmpat terbuka\n" +
                "f. Jangan buang air kecil di air tergenang\n" +
                "g. Gunakan tangan kiri saat membersihkan sisa kotoran\n" +
                "h. Jangan berbicara saat buang hajat, kesuali darurat", covers[2]);
        adabList.add(adab);

        adab = new Adab(4, "Adab Berpakaian", "a. Pakailah pakaian yang suci, jangan memakai pakaian yang bernajis\n" +
                "b. Pakaian harus menutup aurat, yaitu longgar tidak membentuk lekuk tubuh\n" +
                "c. Pakaian laki-laki jangan menyerupai pakaian wanita, dan sebaliknya\n" +
                "d. Laki-laki tidak boleh memakai emas dan kain sutera\n" +
                "e. Dianjurkan mendahulukan bagian kanan saat berpakaian\n" +
                "f. Gunakanlah sandal/sepatu sepasang, jangan sebelah\n", covers[3]);
        adabList.add(adab);

        adab = new Adab(5, "Adab di Jalanan", "a. Berjalannlah dengan tenang, bersikap wajar yaitu tawadhu agar tak terlihat sombong\n" +
                "b. Jangan mengganggu, membuang sampah dan buang hajat di jalanan\n" +
                "c. Singkirkan gangguan dari jalan, seperti beling, duri dan sebagainya.\n" +
                "d. Jawablah salam dari orang yang memberi salam di jalan, baik dari orang yang dikenal atau tidak\n" +
                "e. Berikan bantuan kepada orang yang tersesat jika mampu membantunya\n" +
                "f. Jika menggunakan kendaraan, jangan membuat gaduh dengan klakson, suara knalpot dan sebagainya. dahulukan pejalan kaki yang akan menyebrang\n" +
                "g. Parkirkan kendaraan pada tempatnya agar tidak mengganggu yang lain\n", covers[4]);
        adabList.add(adab);

        adab = new Adab(6, "Adab Memberi Salam", "a. Keraskan suara ketika mengucapkan atau membalas salam\n" +
                "b. Jika sedang berkendara, ucapkan salam kepada yang berjalan kaki\n" +
                "c. Ucapkan salam ketika masuk ke suatu majlis dan saat meninggalkan majelis\n" +
                "d. Ucapkan salam saat memasuki rumah, walaupun rumah tersebut kosong\n" +
                "e. Jangan memberi salam kepada orang yang sedang berada di WC\n" +
                "f. Orang dewasa harus memberikan salam ke pada anak-anak\n" +
                "g. Dianjurkan berjabat tangan  saat memberi salam kepada mahramnya ", covers[5]);
        adabList.add(adab);

        adab = new Adab(7, "Adab Bergaul", "a. Perhatikan perasaan orang lain dan hormatilah\n" +
                "b. Kenali karakter dan ahlak mereka\n" +
                "c. Tanyakanlah kabar mereka, dan jagalah rahasia mereka\n" +
                "d. Tawadhulah kepada mereka, jangan merasa lebih hebat dari mereka\n" +
                "e. Tersenyumlah saat bertemu mereka denga berwajah manis dan lapang dada\n" +
                "f. Berbicalah sesuai dengan akal mereka\n" +
                "g. Berbaik sangka kepada orang lain dan tidak memata-matai mereka\n" +
                "h. Maafkan kekeliruan mereka dan tidak mencari-cari kesalahannya\n" +
                "i. Jaga selalu perdamaian meskipun harus merekayasanya", covers[6]);
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
