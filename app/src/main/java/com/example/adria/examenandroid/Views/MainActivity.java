package com.example.adria.examenandroid.Views;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.adria.examenandroid.R;
import butterknife.ButterKnife;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.btnLogin) Button btnLogin;
    @BindView(R.id.user) EditText user;
    @BindView(R.id.password) EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnLogin)
    public void submit(){
        if(user.getText().toString().equals("test@mail.com") && password.getText().toString().equals("test123")){
            Intent intent = new Intent(this, ListActivity.class);
            startActivity(intent);
        }
        else{
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Mensaje")
                    .setMessage("Creadenciales incorrectas.")
                    .setPositiveButton("OK",null)
                    .create()
                    .show();


        }

    }
}
