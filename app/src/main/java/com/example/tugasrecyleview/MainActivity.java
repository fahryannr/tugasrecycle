package com.example.tugasrecyleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements adapterbarang.OnItemClickListener {



    private ArrayList<modelbarang> barangmodels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();


        RecyclerView recyclerView = findViewById(R.id.recycle);
        adapterbarang AdapterBarang = new adapterbarang(barangmodels);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(AdapterBarang);

        AdapterBarang.setOnItemClickListener(this);


    }

    private void getData() {
        barangmodels = new ArrayList<>();
        barangmodels.add(new modelbarang("samsung s24", "dengan Corning Gorilla Armor. Galaxy S24 Ultra 5G disokong chipset Snapdragon 8 Gen 3 serta RAM 12 GB.", "13.469.000", R.drawable.s24));
        barangmodels.add(new modelbarang("samsung s23", "ponsel dengan kamera utama 50 MP dan kamera ultrawide 5 MP. Ponsel ini memiliki layar 6,6 inci dengan refresh rate 90 Hz.", "12.500.000", R.drawable.s23));
        barangmodels.add(new modelbarang("samsung s22", "memiliki layar Dynamic AMOLED 2X 6,1 inci dengan refresh rate 120Hz. Samsung Galaxy S22 ditenagai oleh prosesor Exynos 2200 atau Snapdragon 8 Gen 1,", "10.469.000", R.drawable.s22));
        barangmodels.add(new modelbarang("samsung s21", "memiliki layar Dynamic AMOLED berukuran 6,2 inci. Layar ini memiliki warna yang tajam dan gambar yang cerah. Bobotnya sekitar 177 gram dengan dimensi 155.7 x 74.5 x 7.9 mm.", "5.469.000", R.drawable.s21));
        barangmodels.add(new modelbarang("samsung s20", "memiliki layar Super AMOLED Plus dengan refresh rate 60 Hz, kamera selfie 10 MP, dan baterai berkapasitas 4.300 mAh. Sementara, Samsung Galaxy S20 memiliki layar Dynamic AMOLED 2X, ukuran 6,2 inci, dan berat 163 gram", "3.200.000", R.drawable.s20));
        barangmodels.add(new modelbarang("Oppo reno5", "dibekali chipset Snapdragon 765G dan RAM 8 GB yang hasilkan kinerja lancar. Bahkan, bisa digunakan bermain PUBG Mobile dan Free Fire tanpa hambatan. Ponsel ini juga dibekali dengan fitur-fitur yang mendukung gaming", "3.099.000", R.drawable.reno5));
        barangmodels.add(new modelbarang("Oppo reno6", "Oppo Reno6 ditenagai oleh chip Qualcomm Snapdragon 720G. Chip tersebut dipadukan dengan RAM 8 GB, dan memori internal 128 GB.", "5.199.000", R.drawable.reno6));
        barangmodels.add(new modelbarang("Oppo reno7", "AMOLED 6,4 inci, resolusi Full HD Plus (2.400 × 1.080 piksel), refresh rate 90 Hz, touch sampling rate 180 Hz, tingkat kecerahan (brightness) maksimum 800 nits, kerapatan piksel 409 ppi, kaca pelindung Corning Gorilla Glass 5", "7.499.000", R.drawable.reno7));
        barangmodels.add(new modelbarang("Oppo reno8", "ponsel dengan layar 6,4 inci dan OS Android 12. Ponsel ini memiliki RAM 8 GB dan didukung oleh Qualcomm Snapdragon 680", "5.600.000", R.drawable.reno8));
        barangmodels.add(new modelbarang("Oppo reno9", "memiliki layar AMOLED 6,7 inci dengan resolusi Full HD Plus. Ponsel ini memiliki gamut warna DCI-P3 100%, HDR10 Plus, dan kecerahan hingga 950 nit", "4.000.000", R.drawable.reno9));
        barangmodels.add(new modelbarang("Oppo reno10", "memiliki RAM 8 GB dan ROM 256 GB, serta tersedia dalam dua pilihan warna, yaitu Silvery Grey dan Ice Blue", "5.469.000", R.drawable.reno10));
        barangmodels.add(new modelbarang("Iphone 11", "layar Liquid Retina HD 6,1 inci dengan resolusi 1792 x 828 piksel. Layarnya memiliki rasio kontras 1400:1, layar True Tone, dan lapisan oleophobic anti sidik jari.", "6.677.000", R.drawable.ip11));
        barangmodels.add(new modelbarang("Iphone 12", "iPhone 12. Layar Super Retina XDR 6,1 inci yang begitu cerah.1 Ceramic Shield dengan ketahanan jatuh empat kali lebih baik.", "8.500.000", R.drawable.ip12));
        barangmodels.add(new modelbarang("Iphone 13", "tersedia dalam lima varian warna, yaitu pink, blue, midnight, starlight, dan red. Kapasitas memori internalnya ada tiga, yaitu 128 GB, 256 GB, dan 512 GB", "17.469.000", R.drawable.ip13));
        barangmodels.add(new modelbarang("Iphone 14", "memiliki teknologi pengisian cepat 20W dan SoC Apple A15 Bionic dengan core GPU lebih banyak dibandingkan generasi sebelumnya", "15.469.000", R.drawable.ip14));
        barangmodels.add(new modelbarang("Iphone 15", "menghadirkan Dynamic Island, kamera Utama 48 MP, dan USB-C — semuanya dalam desain aluminium dan kaca berwarna yang tangguh ", "20.469.000", R.drawable.ip15));
    }

    @Override
    public void onItemClick(int position) {
        modelbarang clickedItem = barangmodels.get(position);

        Intent intent = new Intent(MainActivity.this, deskripsi.class);

        intent.putExtra("nama", clickedItem.getNamabarang());
        intent.putExtra("deskripsi", clickedItem.getDeskripsi());
        intent.putExtra("harga", clickedItem.getHarga());
        intent.putExtra("gambar", clickedItem.getGambar());

        startActivity(intent);
    }
}