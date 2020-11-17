package com.reload.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Chat_Activity extends AppCompatActivity {
    ListView listView;
    EditText edt_message;
    Button btn_send;
   static String UserName;
    ArrayList<User> users=new ArrayList<User>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_);

        listView=findViewById(R.id.lv_chat);
        final UserAdapter userAdapter=new UserAdapter(getApplicationContext(),users);
        listView.setAdapter(userAdapter);
        edt_message=findViewById(R.id.edt_message);
        btn_send=findViewById(R.id.btn_send);

        if(getIntent()!=null){

            UserName=getIntent().getStringExtra("username");

        }
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final User user=new User(UserName,edt_message.getText().toString(),R.drawable.space3);
                users.add(user);
                userAdapter.notifyDataSetChanged();
                edt_message.setText("");
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Toast.makeText(getApplicationContext(),users.get(position).toString(),Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}