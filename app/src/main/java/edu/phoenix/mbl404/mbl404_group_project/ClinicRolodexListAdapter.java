package edu.phoenix.mbl404.mbl404_group_project;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ClinicRolodexListAdapter extends ArrayAdapter<RolodexLoader> {

    List<RolodexLoader> mRolodex;
    LayoutInflater mInflater;

    public ClinicRolodexListAdapter(@NonNull Context context, @NonNull List<RolodexLoader> objects) {
        super(context, R.layout.list_clinics, objects);

        mRolodex = objects;
        mInflater = LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_clinics, parent, false);
        }

        TextView tvClinics = convertView.findViewById(R.id.tvClinic);
        TextView tvLocations = convertView.findViewById(R.id.tvLocation);
        TextView tvStatusUpdate = convertView.findViewById(R.id.tvStatus);
        TextView tvCall = convertView.findViewById(R.id.tvCall);
        TextView tvWebsite = convertView.findViewById(R.id.tvWebsite);

        RolodexLoader item = mRolodex.get(position);

        tvClinics.setText(item.getContact());
        tvLocations.setText(String.valueOf(item.getAddress()));
        tvStatusUpdate.setText(item.getStatus());
        tvCall.setText(String.valueOf(item.getPhone()));
        tvWebsite.setText(String.valueOf(item.getWebsite()));

        return convertView;
    }
}