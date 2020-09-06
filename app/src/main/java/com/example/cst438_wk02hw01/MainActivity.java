package com.example.cst438_wk02hw01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;
    private TextView InfoU;
    private TextView InfoP;
    private TextView RemindU;
    private TextView RemindP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.etName);
        Password = (EditText)findViewById(R.id.etPassword);
        InfoU = (TextView)findViewById(R.id.tvInfoU);
        InfoP = (TextView)findViewById(R.id.tvInfoP);
        Login = (Button)findViewById(R.id.btnLogin);
        RemindU = (TextView)findViewById(R.id.tvRemindU);
        RemindP = (TextView)findViewById(R.id.tvRemindP);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validData(Name.getText().toString(), Password.getText().toString());
                checkUsername(Name.getText().toString());
                checkUsername(Password.getText().toString());
            }
        });

    }

    private void validData(String userName, String userPassword){
        if((userName.equals("din_djarin")) && (userPassword.equals("baby_yoda_ftw"))){
            Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
            startActivity(intent);

            InfoP.setText("");
            RemindP.setText("");

            RemindU.setText("");
            InfoU.setText("");
        }
        else{
            if(!userName.equals("din_djarin") && userPassword.equals("baby_yoda_ftw")){
                //Name.setHighlightColor(0xffff3030);
                RemindU.setText("x");
                InfoU.setText("Incorrect Username!");
                //Password
                InfoP.setText("");
                RemindP.setText("");
            }
            else if(!userPassword.equals("baby_yoda_ftw") && userName.equals("din_djarin")){
                //Password.setHighlightColor(0xffff3030);
                InfoP.setText("Incorrect Password!");
                RemindP.setText("x");
                //Username
                RemindU.setText("");
                InfoU.setText("");
            }
            else{
                RemindU.setText("x");
                InfoU.setText("Incorrect Username!");

                InfoP.setText("Incorrect Password!");
                RemindP.setText("x");
            }
        }
    }

    public static boolean checkUsername(String name){
        if (name.equals("din_djarin")){
            return true;
        }else{
            return false;
        }
    }

    public static boolean checkPassword(String password){
        if(password.equals("baby_yoda_ftw")){
            return true;
        }else{
            return false;
        }
    }
}