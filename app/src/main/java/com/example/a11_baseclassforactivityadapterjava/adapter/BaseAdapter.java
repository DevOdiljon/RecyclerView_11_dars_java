package com.example.a11_baseclassforactivityadapterjava.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a11_baseclassforactivityadapterjava.netwoerk.BaseServer;

public class BaseAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements BaseServer {

    @Override
    public int getItemCount() {
        return 0;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }
    protected String getServer(){
        if (IS_TESTER){
            return SERVER_DEVELOPMENT;
        }
        return SERVER_DEPLOYMENT;
    }
    protected static boolean isEmpty(final String s){
        return s == null || s.trim().isEmpty();
    }
}
