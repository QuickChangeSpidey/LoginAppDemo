package com.akshay.facebookapp.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.akshay.facebookapp.Model.Friends;
import com.akshay.facebookapp.R;

import java.util.List;

/**
 * Created by Akshay on 4/3/17.
 */

public class FriendsAdapter extends RecyclerView.Adapter<FriendsAdapter.MyViewHolder> {

    private List<Friends> friendsList;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView name, dob, gender;
        public ImageView photo;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            gender = (TextView) view.findViewById(R.id.gender);
            dob = (TextView) view.findViewById(R.id.dob);
            photo = (ImageView) view.findViewById(R.id.photo);
        }
    }
    public FriendsAdapter(List<Friends> friendsList) {
        this.friendsList = friendsList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.friends_list_row, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Friends friends = friendsList.get(position);
        holder.name.setText(friends.getName());
        holder.dob.setText(friends.getDob());
        holder.gender.setText(friends.getGender());
    }

    @Override
    public int getItemCount() {
        return friendsList.size();
    }
}