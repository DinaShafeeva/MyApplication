package com.example.myapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.BookHolder;
import com.example.myapplication.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BookAdapter extends RecyclerView.Adapter<BookHolder>  {

    private ArrayList<String> bookList;
    Context context;

    public BookAdapter(ArrayList<String> list, Context context){
        this.bookList = list;
        this.context = context;
    }

    @NonNull
    @Override
    public BookHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_book, parent, false);
        return new BookHolder(v, context);
    }


    @Override
    public void onBindViewHolder(@NonNull BookHolder holder, int position) {
        holder.bind(bookList.get(position));

    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }


}
