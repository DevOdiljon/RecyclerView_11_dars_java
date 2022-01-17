package com.example.a11_baseclassforactivityadapterjava.activity;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a11_baseclassforactivityadapterjava.model.Member;
import com.example.a11_baseclassforactivityadapterjava.netwoerk.BaseServer;

import java.util.ArrayList;
import java.util.List;

public class BaseActivity extends AppCompatActivity implements BaseServer {

    protected String getServer(){
        if (IS_TESTER){
            return SERVER_DEVELOPMENT;
        }
        return SERVER_DEPLOYMENT;
    }
    protected List<Member> prepareMemberList(){
        List<Member> members = new ArrayList<>();
        for (int i = 0; i < 30; i++){
            members.add(new Member("Odilbek" + i, "+998-97-775-17-79"));
        }
        return members;
    }
}
