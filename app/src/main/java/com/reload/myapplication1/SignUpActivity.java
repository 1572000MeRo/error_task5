package com.reload.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {
    EditText edt1,edt2,edt3,edt4;
    Button btn_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        edt1=findViewById(R.id.edt_username);
        edt2=findViewById(R.id.edt_password);
        edt3=findViewById(R.id.edt_email);
        edt4=findViewById(R.id.edt_phone);
        btn_show=findViewById(R.id.btn_show);
        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SignUpActivity.this,MainActivity2.class);
                i.putExtra("username",edt1.getText().toString());
                i.putExtra("password",edt2.getText().toString());
                i.putExtra("email",edt3.getText().toString());
                i.putExtra("phone",edt4.getText().toString());
                startActivity(i);
            }
        });


    }
}