package com.example.a11_baseclassforactivityadapterjava.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a11_baseclassforactivityadapterjava.R;
import com.example.a11_baseclassforactivityadapterjava.adapter.MainAdapter;
import com.example.a11_baseclassforactivityadapterjava.model.Member;

import java.util.List;

public class MainActivity extends BaseActivity {
    Context context;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        List<Member> members = prepareMemberList();
        refreshAdapterMain(members);
    }

    private void refreshAdapterMain(List<Member> members) {
        MainAdapter adapter = new MainAdapter(this, members);
        recyclerView.setAdapter(adapter);
    }

    void initViews(){
        context = this;
        recyclerView = findViewById(R.id.recyclerViewMain);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 1));
    }

    public void openDetailActivity(Member member){
        Intent intent = new Intent(context, DetailActivity.class);
        startActivity(intent);
    }
}