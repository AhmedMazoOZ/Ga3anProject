package com.test.ga3an.ForgetPassword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.test.ga3an.HomePage.MainActivity;
import com.test.ga3an.LoginPage.LoginActivity;
import com.test.ga3an.R;
import com.test.ga3an.RegisterPage.RigesterActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ForgetPass extends AppCompatActivity {

    View v;

    @BindView(R.id.edemail)
    EditText edemail;
    @BindView(R.id.loginbu)
    Button loginbu;
    @BindView(R.id.pBar)
    ProgressBar pgsBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_pass);
        ButterKnife.bind(this);
        pgsBar = (ProgressBar) findViewById(R.id.pBar);
        pgsBar.setVisibility(v.GONE);
    }


    @OnClick(R.id.loginbu)
    public void ForgetPass(View v) {
        pgsBar.setVisibility(v.VISIBLE);
        startActivity(new Intent(ForgetPass.this, CofirmCode.class));
    }
}