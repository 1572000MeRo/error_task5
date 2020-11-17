package com.reload.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView tv_username,tv_password,tv_email,tv_phone;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv_username = findViewById(R.id.tv_username);
        tv_password = findViewById(R.id.tv_password);
        tv_email=findViewById(R.id.tv_email);
        tv_phone=findViewById(R.id.tv_phone);
        btn=findViewById(R.id.btn_go_to_chat);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity2.this,Chat_Activity.class);
                startActivity(i);
                finish();
            }
        });
        Toast.makeText(getApplicationContext(),"You have been successfully signed up",Toast.LENGTH_LONG).show();
        if (getIntent() != null)
        {
            tv_username.setText(getIntent().getStringExtra("username"));
            tv_password.setText(getIntent().getStringExtra("password"));
            tv_email.setText(getIntent().getStringExtra("email"));
            tv_phone.setText(getIntent().getStringExtra("phone"));

        }
        tv_phone.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("MissingPermission")
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+tv_phone.getText().toString()));
                startActivity(i);
            }
        });
    }
}