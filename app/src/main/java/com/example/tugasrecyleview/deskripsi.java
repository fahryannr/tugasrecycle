package com.example.tugasrecyleview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class deskripsi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);

            ImageView gambar = findViewById(R.id.imgresult);
            TextView namabarang = findViewById(R.id.tvtitle);
            TextView detailDescription = findViewById(R.id.tvdeskripsi);
            TextView harga = findViewById(R.id.tvprice);
            Button btnShare = findViewById(R.id.btnshare);
            Button btncs = findViewById(R.id.btncs);

            int imageResId = getIntent().getIntExtra("gambar", 0);
            String title = getIntent().getStringExtra("nama");
            String description = getIntent().getStringExtra("deskripsi");
            detailDescription.setText(description);
            String price = getIntent().getStringExtra("harga");
            gambar.setImageResource(imageResId);
            namabarang.setText(title);
            harga.setText(price);



            btnShare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    shareContent();
                }
            });
        }

        private void shareContent() {
            String title = getIntent().getStringExtra("nama");
            String price = getIntent().getStringExtra("harga");

            String shareMessage = "nama barang: " + title + "\nharga: " + price;

            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Sharing " + title);
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);

            startActivity(Intent.createChooser(shareIntent, "Share via"));
        }


    }
