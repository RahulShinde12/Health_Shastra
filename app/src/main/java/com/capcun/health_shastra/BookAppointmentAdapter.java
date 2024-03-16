package com.capcun.health_shastra;



import android.content.Context;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.google.android.material.bottomsheet.BottomSheetDialog;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class BookAppointmentAdapter extends RecyclerView.Adapter<BookAppointmentAdapter.LeadData>{

    List<BookAppointmentModel> dataholder2;


    //    List<EVStation> evStations = new ArrayList<>();
//    private FirebaseFirestore firebaseFirestore;
    Context context;
    final String sharedPreferencesFileTitle = "ecoview";
    public BookAppointmentAdapter(List<BookAppointmentModel> dataholder2, Context context) {
        this.dataholder2 = dataholder2;
        this.context = context;

    }

//    private void init(){
//        firebaseAuth = FirebaseAuth.getInstance();
//        firebaseFirestore = FirebaseFirestore.getInstance();
//
//    }

    public void setFilteredList(List<BookAppointmentModel> filteredList) {
        Log.println(Log.DEBUG,"debug", "Finally"+filteredList);
        this.dataholder2 = filteredList;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public LeadData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        init();
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.bookapointmentcard,parent,false);
        return new LeadData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LeadData holder, int position) {

            holder.name.setText(dataholder2.get(position).getName());
            holder.address.setText(dataholder2.get(position).getAddress());
            holder.education.setText(dataholder2.get(position).getEducation());



    }

    private String getAddress(double lati,double longi) {

        String add = "";

        try {
            Geocoder geocoder;
            List<Address> addresses;
            geocoder = new Geocoder(context, Locale.getDefault());

            addresses = geocoder.getFromLocation(lati, longi, 1); // Here 1 represent max location result to returned, by documents it recommended 1 to 5

            add = addresses.get(0).getAddressLine(0);
        } catch (Exception e) {
            Toast.makeText(context, e.getMessage(), Toast.LENGTH_SHORT).show();
        }

        return add;
    }

    @Override
    public int getItemCount() {
        return dataholder2.size();
    }


    class LeadData extends RecyclerView.ViewHolder
    {
        TextView name,address,education;
        LinearLayout card;

        LinearLayout bottomsheet;
        TextView types;
        TextView avg;
        public LeadData(@NonNull View itemView)
        {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            address = itemView.findViewById(R.id.address);
            education = itemView.findViewById(R.id.education);
            card = itemView.findViewById(R.id.card);
//            bottomsheet = itemView.findViewById(R.id.bottomsheetcontainer);
//            card = itemView.findViewById(R.id.card);
//            stationname = itemView.findViewById(R.id.station_name);
//            address = itemView.findViewById(R.id.distance);
//            types = itemView.findViewById(R.id.types);
//            avg = itemView.findViewById(R.id.avgr);

        }
    }
    public boolean isNumeric(String str) {
        return str.matches("\\d+");
    }






}