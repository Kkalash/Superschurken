package com.kalash.superschurken;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<SuperSchurke> schurken = new ArrayList<>();
        schurken.add(
                new SuperSchurke(new String[] { "Robert DuBois (ursprünglich)", "Alexander Trent (Nachfolger)" },
                        "Bloodsport", "DC Comics","Handlanger Luthors Massenmörder",
                        new String[] { "Herbeiteleportieren von Schusswaffen" },  new String[] { "Superman töten" },
                        "Verstorben", R.drawable.bloodsport));

        schurken.add(new SuperSchurke(new String[] { "Norman Osborn" }, "Der Kobold", "Spider-Man (2002)",
                        "Wissenschaftler CEO von Oscorp",
                        new String[] { "Übermenschliche Stärke", "High-Tech-Kampfgleiter", "Gepanzerte Flugrüstung", "Kobold-Granaten" },
                        new String[] { "Forschen" },"Verstorben", R.drawable.kobold));

        schurken.add(new SuperSchurke(new String[] { "Quentin Beck" }, "Mysterio", "Marvel Comics",
                "Techniker für Spezialeffekte Superschurke Illusionist",
                new String[] { "Spezialeffekte", "Hypnose", "Illusionen" },  new String[] { "Spezialeffekte kreieren" },
                "Verstorben", R.drawable.mysterio));

        SchurkeAdapter adapter = new SchurkeAdapter(this, schurken);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Parcelable item = (Parcelable) parent.getItemAtPosition(position);
            Intent intent = new Intent(MainActivity.this, DetailsActivity.class);

            intent.putExtra("superSchurke", item);

            startActivity(intent);
        });
    }
}