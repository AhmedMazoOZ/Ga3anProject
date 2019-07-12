package com.test.ga3an.StartPage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.test.ga3an.HomePage.MainActivity;
import com.test.ga3an.LoginPage.LoginActivity;
import com.test.ga3an.R;

public class StartActivity extends AppCompatActivity {
    Button Start;
    View v;
    SharedPreferences preferences;
    String token,email,name="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        final ProgressBar pgsBar = (ProgressBar) findViewById(R.id.pBar);
        pgsBar.setVisibility(v.GONE);

        preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        token = preferences.getString("token", "");
        email = preferences.getString("email", "");
        name = preferences.getString("name", "");



        Start = (Button) findViewById(R.id.Start);

        Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pgsBar.setVisibility(v.VISIBLE);
                checktoken();
            }
        });



    }

    public void checktoken(){
        if (token.length() != 0) {
                /*
                if (preferences.getBoolean("update canceled", true))
                    forceUpdatee();
                else
                */
            openMain();
        } else {
            Intent intent = new Intent(StartActivity.this, LoginActivity.class);
            intent.putExtra("email", email);
            intent.putExtra("name", name);
            startActivity(intent);
            finish();
        }
    }
    public void openMain(){
        Intent intent = new Intent(StartActivity.this, MainActivity.class);
        final String email = preferences.getString("email", "");
        final String name = preferences.getString("name", "");
        intent.putExtra("name", name);
        intent.putExtra("email", email);
        startActivity(intent);
        finish();
    }
}
