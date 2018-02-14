package com.example.sdc.assignment13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.MotionEvent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] imagesId = {
                android.R.drawable.alert_dark_frame,
                android.R.drawable.alert_dark_frame,
                android.R.drawable.alert_dark_frame,
                android.R.drawable.alert_dark_frame,
                android.R.drawable.alert_dark_frame,
                android.R.drawable.alert_dark_frame,
                android.R.drawable.alert_dark_frame

        };

        String[] titles = {
                "Avocado Shrimp Salsa Recipe",
                "Cheesy Chicken Fritters",
                "Cranberry Apricot Loaf",
                "Garlic Pampushki, Grains are Good for You",
                "Mom’s Rye and Whole Wheat Bread",
                "Persimmon Bread Recipe",
                "Stuffed Potato Pancakes – Draniki"
        };

        String[] descriptions = {
                getString(R.string.Avocado_Shrimp_Salsa_Recipe),
                getString(R.string.Cheesy_Chicken_Fritters),
                getString(R.string.cranberry_apricot_loaf),
                getString(R.string.garlic_pampushki),
                getString(R.string.moms_bread),
                getString(R.string.Cheesy_Chicken_Fritters),
                getString(R.string.Avocado_Shrimp_Salsa_Recipe)
        };

        RecyclerView recyclerView = findViewById(R.id.my_list_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.setAdapter(new MyAdapter(MainActivity.this, imagesId, titles, descriptions));
    }
}
