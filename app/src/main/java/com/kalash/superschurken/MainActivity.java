package com.kalash.superschurken;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Schurke> schurken = new ArrayList<>();
        //schurken.add(new Schurke("test1", R.drawable.bloodsport));
        //schurken.add(new Schurke("test2", R.drawable.kobold));
        schurken.add(new Schurke("Quentin Beck", "Mysterio", "Marvel Comics",
                "Techniker für Spezialeffekte Superschurke Illusionist",
                new String[] {"Spezialeffekte"},  new String[] {"Spezialeffekte kreieren"},
                "Verstorben", R.drawable.mysterio));

        SchurkeAdapter adapter = new SchurkeAdapter(this, schurken);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Schurke item = (Schurke) parent.getItemAtPosition(position);
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("name", item.getName());
                intent.putExtra("alias", item.getAlias());
                intent.putExtra("universe", item.getUniverse());
                intent.putExtra("role", item.getRole());
                intent.putExtra("capabilities", item.getCapabilities());
                intent.putExtra("hobby", item.getHobby());
                intent.putExtra("status", item.getStatus());

                startActivity(intent);
            }
        });
    }
}