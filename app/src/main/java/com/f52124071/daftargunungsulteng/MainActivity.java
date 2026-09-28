package com.f52124071.daftargunungsulteng;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listViewGunung;
    private List<Gunung> listGunung;
    private GunungAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Pewarnaan Status Bar Hijau Tua saat aplikasi pertama dibuka
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(Color.parseColor("#1B5E20"));
        }

        listViewGunung = findViewById(R.id.listViewGunung);

        // Inisialisasi Data Gunung Sulawesi Tengah
        listGunung = new ArrayList<>();

        listGunung.add(new Gunung(
                "Gunung Kondoruang",
                "2.900 mdpl",
                "Kabupaten Sigi, Sulawesi Tengah",
                R.drawable.kondoruang
        ));

        listGunung.add(new Gunung(
                "Gunung Fuyul Sojol",
                "2.898 mdpl",
                "Kabupaten Donggala, Sulawesi Tengah",
                R.drawable.fuyul_sojol
        ));

        listGunung.add(new Gunung(
                "Gunung Katopasa",
                "2.865 mdpl",
                "Kabupaten Tojo Una-Una, Sulawesi Tengah",
                R.drawable.katopasa
        ));

        listGunung.add(new Gunung(
                "Gunung RoreKautimbu",
                "2.400 mdpl",
                "Taman Nasional Lore Lindu, Poso",
                R.drawable.rore_kautimbu
        ));

        listGunung.add(new Gunung(
                "Gunung Nokilalaki",
                "2.355 mdpl",
                "Kabupaten Sigi, Sulawesi Tengah",
                R.drawable.nokilalaki
        ));

        listGunung.add(new Gunung(
                "Gunung Galang",
                "2.254 mdpl",
                "Kabupaten Tolitoli, Sulawesi Tengah",
                R.drawable.galang
        ));

        listGunung.add(new Gunung(
                "Gunung Gawalise",
                "2.023 mdpl",
                "Kota Palu / Sigi, Sulawesi Tengah",
                R.drawable.gawalise
        ));

        // Pasang Adapter ke ListView
        adapter = new GunungAdapter(this, listGunung);
        listViewGunung.setAdapter(adapter);
    }
}