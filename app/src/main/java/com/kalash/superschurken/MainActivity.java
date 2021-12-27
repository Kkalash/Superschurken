package com.kalash.superschurken;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Schurke> schurken = new ArrayList<>();
        schurken.add(new Schurke("test1", R.drawable.bloodsport));
        schurken.add(new Schurke("test2", R.drawable.kobold));
        schurken.add(new Schurke("test3", R.drawable.mysterio));

        SchurkeAdapter adapter = new SchurkeAdapter(this, schurken);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }

    public void onListItemClick(ListView parent, View v,
                                int position, long id) {
    }
}