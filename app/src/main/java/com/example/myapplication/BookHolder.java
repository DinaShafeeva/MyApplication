package com.example.myapplication;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BookHolder extends RecyclerView.ViewHolder {

    TextView tvBook;

    public BookHolder(@NonNull View itemView) {
        super(itemView);
        tvBook = itemView.findViewById(R.id.textView);
    }
    public void bind(String name){
        tvBook.setText(name);
    }
}
