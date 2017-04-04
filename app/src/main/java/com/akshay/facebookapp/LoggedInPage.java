package com.akshay.facebookapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.akshay.facebookapp.Adapters.FriendsAdapter;
import com.akshay.facebookapp.Model.Friends;

import java.util.ArrayList;
import java.util.List;

public class LoggedInPage extends AppCompatActivity {

    private List<Friends> friendsList = new ArrayList<>();
    private RecyclerView recyclerView;
    private FriendsAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friend_list_activity);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mAdapter = new FriendsAdapter(friendsList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }
}
