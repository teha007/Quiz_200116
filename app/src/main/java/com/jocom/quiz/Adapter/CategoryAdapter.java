package com.jocom.quiz.Adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.jocom.quiz.Model.Category;
import com.jocom.quiz.R;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.MyViewHolder> {

    Context context;
    List<Category> categories;

    public class MyViewHolder extends RecyclerView.ViewHolder{

        CardView card_category;
        TextView txt_category_name;

        public MyViewHolder(@NonNull View itemView){
            super(itemView);
            card_category= itemView.findViewById(R.id.card_category);
            txt_category_name = itemView.findViewById(R.id.txt_category_name);
            card_category.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, "Click at category", Toast.LENGTH_SHORT).show();

                }
            });
        }

    }
}
