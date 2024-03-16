package com.capcun.health_shastra;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.List;

public class FetchLeadAdpater extends RecyclerView.Adapter<FetchLeadAdpater.myviewholder> {

    List<DataLeadsNew> data;
    String name="Shinde";

    Context context;
    public FetchLeadAdpater(List<DataLeadsNew> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_lead_design,parent,false);
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.single_medicine_store_card,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {


        holder.name.setText(data.get(position).getName());
        holder.location.setText(data.get(position).getLocation());
        holder.rating.setText(data.get(position).getRating());
        holder.reviews.setText("("+data.get(position).getReviews()+" reviews)");
        holder.distance.setText("Distance less than "+data.get(position).getDistance()+"km");


        holder.lead_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final BottomSheetDialog bottomSheetDialog1 = new BottomSheetDialog(
                        context, R.style.BottomSheetDialogTheme
                );

                View bottomSheetView = LayoutInflater.from(context)
                        .inflate(R.layout.medical_bottom_sheet, holder.fullSheet);

                bottomSheetDialog1.setContentView(bottomSheetView);
                bottomSheetDialog1.show();
//                Intent intent = new Intent(context,Lead_info.class);
//                intent.putExtra("user_id",data.get(position).getId());
//                intent.putExtra("user_name",data.get(position).getName()+"");
//                intent.putExtra("is_fav",data.get(position).getIsFav()+"");
//                intent.putExtra("lead_desc",data.get(position).getLead_desc()+"");
//
//                intent.putExtra("lead_type",data.get(position).getLead_type_hot_cold()+"");
//
//                intent.putExtra("lead_mobile",data.get(position).getPhone());
//                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    public void setFilteredList(List<DataLeadsNew> filteredList) {

        this.data = filteredList;
        notifyDataSetChanged();
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        TextView name,location,rating,reviews,distance;
        LinearLayout lead_card;

        LinearLayout fullSheet;


        public myviewholder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.med_name);
            lead_card = itemView.findViewById(R.id.fullLead);
            location = itemView.findViewById(R.id.med_location);
            rating = itemView.findViewById(R.id.med_rating);
            reviews = itemView.findViewById(R.id.med_reviews);
            distance = itemView.findViewById(R.id.med_distance);
            fullSheet = itemView.findViewById(R.id.full_sheet);



        }
    }
}
