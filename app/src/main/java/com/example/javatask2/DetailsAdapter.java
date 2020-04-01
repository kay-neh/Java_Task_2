package com.example.javatask2;

import android.content.Context;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;
import java.util.List;

public class DetailsAdapter extends ArrayAdapter<Details> {
    public DetailsAdapter(@NonNull Context context, @NonNull List<Details> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view_items,parent,false);
        }
        //Updating the ui
        Details currentDetails = getItem(position);
        TextView interest = listItemView.findViewById(R.id.interest);
        TextView description = listItemView.findViewById(R.id.description);

        assert currentDetails != null;
        interest.setText(currentDetails.getInterest());
        description.setText(currentDetails.getDescription());

        return listItemView;
    }
}
