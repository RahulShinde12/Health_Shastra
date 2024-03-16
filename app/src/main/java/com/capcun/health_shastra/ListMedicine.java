package com.capcun.health_shastra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListMedicine extends AppCompatActivity {

    LinearLayoutManager layoutManager;
    FetchLeadAdpater fetchLeadAdpater;
    RecyclerView recycler;
    SearchView searchView;
    List<DataLeadsNew> data_list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_medicine);


        recycler = findViewById(R.id.recycler_for_leads);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recycler.setLayoutManager(layoutManager);


        data_list.add(0, new DataLeadsNew("Vasudev Pharmacy", "4.5", "Antop hill, Wadala, Mumbai",  "3.5", "201"));
        data_list.add(0, new DataLeadsNew("Vasudev Pharmacy", "4.5", "Antop hill, Wadala, Mumbai",  "3.5", "201"));
        data_list.add(0, new DataLeadsNew("Vasudev Pharmacy", "4.5", "Antop hill, Wadala, Mumbai",  "3.5", "201"));
        data_list.add(0, new DataLeadsNew("Vasudev Pharmacy", "4.5", "Antop hill, Wadala, Mumbai",  "3.5", "201"));
        data_list.add(0, new DataLeadsNew("Vasudev Pharmacy", "4.5", "Antop hill, Wadala, Mumbai",  "3.5", "201"));
        data_list.add(0, new DataLeadsNew("Vasudev Pharmacy", "4.5", "Antop hill, Wadala, Mumbai",  "3.5", "201"));



    fetchLeadAdpater = new FetchLeadAdpater(data_list,getApplicationContext());
                        recycler.setAdapter(fetchLeadAdpater);

    }
}