package com.reload.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;

public class MainActivity extends AppCompatActivity {

     AutoCompleteTextView autoCompleteTextView1,autoCompleteTextView2;
   // private MultiAutoCompleteTextView multiAutoCompleteTextView;
  // private ArrayAdapter<String>adapter;

    Button btn_submit,btn_signup;
//public static final String[] USER_NAME=new String[]{"manar_ahmed","MeRoO_AhMeD","MaNaR"};
 String[] email={"mnarahmed945@gmail.com","mero2000@gmail.com","ahmed157@gmail.com","ahmed@gmail.com"};
String[] username={"manar_ahmed","meRoO_AhMeD","maNaR","mero_152000","sara","sara_ahmed","sarsor","aHmeD_123","ahmed_mohamed",
        "ahmed_moh23","basant_Bs12","bobos_150","bosy_mo23","rery_89","reham_ali"};
    ArrayAdapter<String>adapter1;
   // ArrayAdapter<String>adapter2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView2=findViewById(R.id.password);

        autoCompleteTextView1=findViewById(R.id.username);
        adapter1=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,username);
        autoCompleteTextView1.setThreshold(1);
        autoCompleteTextView1.setAdapter(adapter1);

        autoCompleteTextView2=findViewById(R.id.email);
        adapter1=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,email);
        autoCompleteTextView2.setThreshold(1);
        autoCompleteTextView2.setAdapter(adapter1);


        btn_signup=findViewById(R.id.btn_2);
        btn_submit=findViewById(R.id.btn_1);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent (MainActivity.this,Chat_Activity.class);

                intent.putExtra("username",autoCompleteTextView1.getText().toString());
                intent.putExtra("password",autoCompleteTextView2.getText().toString());

                startActivity(intent);
            }
        });
        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,SignUpActivity.class);
                startActivity(i);
            }
        });
    }
    }




