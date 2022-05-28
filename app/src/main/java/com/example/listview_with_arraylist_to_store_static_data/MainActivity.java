package com.example.listview_with_arraylist_to_store_static_data;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> abclist = new ArrayList<>();
    Button btn;
    ListView lstview;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        abclist.add("A");
        abclist.add("B");
        abclist.add("C");
        abclist.add("D");
        abclist.add("E");
        abclist.add("F");
        abclist.add("G");
        abclist.add("H");
        abclist.add("I");
        abclist.add("J");
        abclist.add("K");
        abclist.add("L");
        abclist.add("M");
        abclist.add("N");
        abclist.add("O");
        abclist.add("P");
        abclist.add("Q");
        abclist.add("R");
        abclist.add("S");
        abclist.add("T");
        abclist.add("U");
        abclist.add("V");
        abclist.add("W");
        abclist.add("X");
        abclist.add("Y");
        abclist.add("Z");


        ArrayAdapter<String> abcAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,abclist);


        lstview = findViewById(R.id.lstview);
        lstview.setAdapter(abcAdapter);
        btn = findViewById(R.id.btnEnter);
        editText = findViewById(R.id.editTextEnterName);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abclist.add(editText.getText().toString());
                abcAdapter.notifyDataSetChanged();
            }
        });

    }

    public void enterNameToList(View view) {
    }
}