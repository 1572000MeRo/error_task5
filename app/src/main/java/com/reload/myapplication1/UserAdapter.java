package com.reload.myapplication1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class UserAdapter extends ArrayAdapter {

    public UserAdapter( Context context,  ArrayList<User> users) {
        super(context,0, users);
    }

    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        View currentListView=convertView;
        if (currentListView==null){
            currentListView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
       User currentUser = (User) getItem(position);

        TextView tv_username = currentListView.findViewById(R.id.tv_name);
        tv_username.setText(currentUser.getUser_name());

        TextView tv_password=currentListView.findViewById(R.id.tv_message);
        tv_password.setText(currentUser.getUser_message());

        ImageView img=currentListView.findViewById(R.id.img_user);
        img.setImageResource(currentUser.getUser_image());

        return currentListView;
    }
}
