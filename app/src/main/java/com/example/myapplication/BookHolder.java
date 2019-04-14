package com.example.myapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BookHolder extends RecyclerView.ViewHolder {

    TextView tvBook;
    Context context;

    public BookHolder(@NonNull View itemView, Context context) {
        super(itemView);
        this.context = context;
        tvBook = itemView.findViewById(R.id.textView);
        tvBook.setOnClickListener(x -> onClick());
    }
    public void onClick() {
        AlertDialog.Builder a_builder = new AlertDialog.Builder(context);
        a_builder.setMessage("Скоро сдавать проект!")
                .setCancelable(false)
                .setPositiveButton("Ой", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(context,"Ой-ей", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Успеем", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

        AlertDialog alertDialog = a_builder.create();
        alertDialog.setTitle("СОС!");
        alertDialog.show();


    }
    public void bind(String name){
        tvBook.setText(name);
    }
}
