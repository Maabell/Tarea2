package com.utic.apps62;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private ListView lv1;
    private String[] nombres = {"Samuel", "Valentina", "Santiago", "Alejandro", "Valeria",
            "Benjamin", "Gerardo", "Carlos", "David", "Sofía"};
    private String[] edades = {"18", "25", "32", "17", "24", "20", "27", "15", "19", "23"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        lv1 = findViewById(R.id.lv1);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, nombres);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener((adapterView, view, i, l) -> {
            tv1.setText("La edad de " + lv1.getItemAtPosition(i) + " es " + edades[i] + " años");
        });
    }
}
