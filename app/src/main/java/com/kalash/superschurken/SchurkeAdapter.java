package com.kalash.superschurken;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SchurkeAdapter extends ArrayAdapter<Schurke> {

    public SchurkeAdapter(Context context, ArrayList<Schurke> schurken) {
        super(context, 0, schurken);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        final Schurke currenSchurke = getItem(position);

        TextView schurkeTextView = listItemView.findViewById(R.id.schurke_text_view);

        schurkeTextView.setText(currenSchurke.getName());

        ImageView imageView = listItemView.findViewById(R.id.image);
        
        if (currenSchurke.hasImage()) {
            imageView.setImageResource(currenSchurke.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
