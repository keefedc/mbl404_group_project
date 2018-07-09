package edu.phoenix.mbl404.mbl404_group_project;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class SavedViewAdapter extends RecyclerView.Adapter<SavedViewAdapter.MyViewHolder>{

    private Context mContext;
    private List<String> clinicData;

    public SavedViewAdapter(Context context, List<String> data){
        this.mContext = context;
        this.clinicData = data;

    }

    public class MyViewHolder extends RecyclerView.ViewHolder  {

        public TextView clinicName, clinicAddress, clinicPhone, clinicWeb;
        public Button callClinic, viewWeb;

        public MyViewHolder(View itemView) {
            super(itemView);
            clinicName = (TextView) itemView.findViewById(R.id.clinic_name);
            clinicAddress = (TextView) itemView.findViewById(R.id.address);
            clinicPhone = (TextView) itemView.findViewById(R.id.phone_number);
            clinicWeb = (TextView) itemView.findViewById(R.id.web_site);
            callClinic = (Button) itemView.findViewById(R.id.row_call);
            viewWeb = (Button) itemView.findViewById(R.id.row_view_site);
        }
    }

    @NonNull
    @Override
    public SavedViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.saved_row, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SavedViewAdapter.MyViewHolder holder, int position) {
        String preSplit = clinicData.get(position);
        String[] postSplit = preSplit.split(";");

        holder.clinicName.setText(postSplit[0].toString());

    }

    @Override
    public int getItemCount() {
        return 0;
    }


}
