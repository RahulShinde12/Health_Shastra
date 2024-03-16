package com.capcun.health_shastra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class BookAppointment extends AppCompatActivity {


    RecyclerView bookapointmentcardRecycler;

    List<BookAppointmentModel> data_list;
    private BookAppointmentAdapter bookApointmentAdapter;
    LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_appointment);


        bookapointmentcardRecycler = findViewById(R.id.bookapointmentcardRecycler);
        layoutManager = new LinearLayoutManager(this);

        layoutManager.setOrientation(RecyclerView.VERTICAL);
        bookapointmentcardRecycler.setLayoutManager(layoutManager);


        data_list = new ArrayList<>();




        data_list.add(new BookAppointmentModel());
        data_list.add(new BookAppointmentModel());
        data_list.add(new BookAppointmentModel());
        data_list.add(new BookAppointmentModel());
        data_list.add(new BookAppointmentModel());
        data_list.add(new BookAppointmentModel());


        bookApointmentAdapter = new BookAppointmentAdapter(data_list, BookAppointment.this);
        bookapointmentcardRecycler.setAdapter(bookApointmentAdapter);










    }
}