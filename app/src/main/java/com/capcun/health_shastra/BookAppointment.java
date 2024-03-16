package com.capcun.health_shastra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.capcun.health_shastra.Fetch_Docters.FetchManagersResponseModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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




//        data_list.add(new BookAppointmentModel());
//        data_list.add(new BookAppointmentModel());
//        data_list.add(new BookAppointmentModel());
//        data_list.add(new BookAppointmentModel());
//        data_list.add(new BookAppointmentModel());
//        data_list.add(new BookAppointmentModel());

        Call<List<FetchManagersResponseModel>> fetch_call= ApiControlller
                .getInstance()
                .getRMdata()
                .fetchManagers();

        fetch_call.enqueue(new Callback<List<FetchManagersResponseModel>>() {
            @Override
            public void onResponse(Call<List<FetchManagersResponseModel>> call, Response<List<FetchManagersResponseModel>> response) {

                List<FetchManagersResponseModel> data = response.body();
                data_list = new ArrayList<>();

                if(data!=null) {
                    //Log.println(Log.DEBUG,"debug", "Rahulll222222222"+data.toString());
                    for (FetchManagersResponseModel lead : data) {

                        //Toast.makeText(All_Leads.this, "Yess we got", Toast.LENGTH_SHORT).show();


                        data_list.add(0, new BookAppointmentModel(lead.getName(), lead.getAddress(), lead.getAddress()));
                    }

                    bookApointmentAdapter = new BookAppointmentAdapter(data_list, BookAppointment.this);
                    bookapointmentcardRecycler.setAdapter(bookApointmentAdapter);
                }
            }

            @Override
            public void onFailure(Call<List<FetchManagersResponseModel>> call, Throwable t) {

            }
        });















    }
}