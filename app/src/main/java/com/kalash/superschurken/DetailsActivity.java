package com.kalash.superschurken;

import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    TextView name, alias, universe, role, capabilities, hobby, status;
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

        Bundle extras =getIntent().getExtras();
        if (extras != null) {
            String nameValue = extras.getString("name");
            String aliasValue = extras.getString("alias");
            String universeValue = extras.getString("universe");
            String roleValue = extras.getString("role");
            String[] capabilitiesValue = extras.getStringArray("capabilities");
            String[] hobbyValue = extras.getStringArray("hobby");
            String statusValue = extras.getString("status");
            int imageValue = extras.getInt("image");

            name.setText(nameValue);
            alias.setText(aliasValue);
            universe.setText(universeValue);
            role.setText(roleValue);
            status.setText(statusValue);
            capabilities.setText(String.join(", ", capabilitiesValue));
            hobby.setText(String.join(", ", hobbyValue));
            image.setImageResource(imageValue);

            setTitle(nameValue);
        }
    }
}
