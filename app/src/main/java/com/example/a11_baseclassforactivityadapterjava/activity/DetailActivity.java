package com.example.a11_baseclassforactivityadapterjava.activity;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.a11_baseclassforactivityadapterjava.R;
import com.example.a11_baseclassforactivityadapterjava.adapter.DetailAdapter;
import com.example.a11_baseclassforactivityadapterjava.model.Member;

import java.util.List;

public class DetailActivity extends BaseActivity {
    Context context;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initViews();
        List<Member> members = prepareMemberList();
        refreshAdapterDetail(members);
    }

    private void refreshAdapterDetail(List<Member> members) {
        DetailAdapter adapter = new DetailAdapter(context, members);
        recyclerView.setAdapter(adapter);
    }

    void initViews() {
        context = this;
        recyclerView = findViewById(R.id.recyclerViewDetail);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 1));
    }
}