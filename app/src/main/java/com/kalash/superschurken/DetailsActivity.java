package com.kalash.superschurken;

import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    TextView name, alias, universe, role, capabilities, hobby, status, weitereInfos;
    ImageView image;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        name = findViewById(R.id.name_value);
        alias = findViewById(R.id.alias_value);
        universe = findViewById(R.id.universum_value);
        role = findViewById(R.id.rolle_value);
        capabilities = findViewById(R.id.faehigkeiten_value);
        hobby = findViewById(R.id.hobby_value);
        status = findViewById(R.id.status_value);
        image = findViewById(R.id.image);
        weitereInfos = findViewById(R.id.weitere_infos_value);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            SuperSchurke superSchurke = extras.getParcelable("superSchurke");

            name.setText(superSchurke.getName());
            alias.setText(superSchurke.getAlias());
            universe.setText(superSchurke.getUniverse());
            role.setText(String.join(", ", superSchurke.getRole()));
            capabilities.setText(String.join(", ", superSchurke.getCapabilities()));
            hobby.setText(String.join(", ", superSchurke.getHobby()));
            status.setText(superSchurke.getStatus());
            image.setImageResource(superSchurke.getImageResourceId());
            weitereInfos.setText(superSchurke.getWeitereInfosLink());

            setTitle(superSchurke.getAlias());
        }
    }
}
