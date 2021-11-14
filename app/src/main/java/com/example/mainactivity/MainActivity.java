package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private EditText et_user,et_password;
    private MaterialButton btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // include resource id xml
        init();
        // check condition edittext
        btn_login.setOnClickListener( e -> {
           try {
               if(et_user.getText().toString().isEmpty() || et_password.getText().toString().isEmpty()) {
                   et_user.setText("");
                   et_password.setText("");
                   Toast.makeText(MainActivity.this,
                           "please fill in the blank", Toast.LENGTH_SHORT).show();
               }else {
                   if(et_user.getText().toString().length() < 5 || et_password.getText().toString().length() < 5) {
                       et_user.setText("");
                       et_password.setText("");
                       Toast.makeText(MainActivity.this,
                               "please fill in more than five", Toast.LENGTH_SHORT).show();
                   }else {
                       et_user.setText("");
                       et_password.setText("");
                       Toast.makeText(MainActivity.this,
                               "Succes Login", Toast.LENGTH_SHORT).show();
                   }
               }
           }catch (Exception ex) {}
        });
    }
    private void init() {
        et_user = findViewById(R.id.editusername);
        et_password = findViewById(R.id.editpassword);
        btn_login = findViewById(R.id.btnlogin);
    }
}