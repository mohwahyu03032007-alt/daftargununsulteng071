package com.f52124071.daftargunungsulteng;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class GunungAdapter extends ArrayAdapter<Gunung> {

    private final Context context;
    private final List<Gunung> listGunung;

    public GunungAdapter(@NonNull Context context, @NonNull List<Gunung> listGunung) {
        super(context, 0, listGunung);
        this.context = context;
        this.listGunung = listGunung;
    }

    @Override
    public int getCount() {
        return listGunung.size();
    }

    @Nullable
    @Override
    public Gunung getItem(int position) {
        return listGunung.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(context).inflate(R.layout.item_gunung, parent, false);
        }

        Gunung gunung = listGunung.get(position);

        ImageView imgGunung = listItem.findViewById(R.id.imgGunung);
        TextView tvNama = listItem.findViewById(R.id.tvNamaGunung);
        TextView tvKetinggian = listItem.findViewById(R.id.tvKetinggian);
        TextView tvLokasi = listItem.findViewById(R.id.tvLokasi);

        imgGunung.setImageResource(gunung.getGambarResId());
        tvNama.setText(gunung.getNama());
        tvKetinggian.setText(gunung.getKetinggian());
        tvLokasi.setText(gunung.getLokasi());

        return listItem;
    }
}