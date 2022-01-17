package com.example.a11_baseclassforactivityadapterjava.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a11_baseclassforactivityadapterjava.R;
import com.example.a11_baseclassforactivityadapterjava.activity.MainActivity;
import com.example.a11_baseclassforactivityadapterjava.model.Member;

import java.util.List;

public class MainAdapter extends BaseAdapter {
    Context  context;
    List<Member> members;
    MainActivity mainActivity;

    public MainAdapter(MainActivity activity, List<Member> members) {
        this.members = members;
        this.mainActivity = activity;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_main_view, parent, false);
        return new CustomHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Member member = members.get(position);
        if (holder instanceof CustomHolder){
            TextView tv_name = ((CustomHolder) holder).tv_name;
            TextView tv_tel_number = ((CustomHolder) holder).tv_tel_number;
            LinearLayout ll_main = ((CustomHolder) holder).lay_click;
            ll_main.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mainActivity.openDetailActivity(member);
                }
            });

            tv_name.setText(member.getTv_name());
            tv_tel_number.setText(member.getTv_tel_number());
        }
    }

    @Override
    public int getItemCount() {
        return members.size();
    }

    private static class CustomHolder extends RecyclerView.ViewHolder {

        public final TextView tv_name;
        public final TextView tv_tel_number;
        public final View view;
        public final LinearLayout lay_click;

        @SuppressLint("CutPasteId")
        public CustomHolder(View v) {
            super(v);
            view = v;

            tv_name = view.findViewById(R.id.tv_name_main);
            tv_tel_number = view.findViewById(R.id.tv_tel_name_main);
            lay_click = view.findViewById(R.id.ll_main);
        }
    }
}
