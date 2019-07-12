package com.test.ga3an.LoginPage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.test.ga3an.ForgetPassword.ForgetPass;
import com.test.ga3an.HomePage.MainActivity;
import com.test.ga3an.R;
import com.test.ga3an.RegisterPage.RigesterActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {
    View v;

    @BindView(R.id.edemail)
    EditText email;
    @BindView(R.id.edPassword)
    EditText pass;
    @BindView(R.id.loginbu)
    Button Login;
    @BindView(R.id.ForgetPass)
    Button ForgetPass;
    @BindView(R.id.CreateAccount)
    TextView Signup;
    @BindView(R.id.pBar)
    ProgressBar pgsBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        pgsBar=(ProgressBar)findViewById(R.id.pBar);
        pgsBar.setVisibility(v.GONE);
    }


    @OnClick(R.id.CreateAccount)
    public void CreateAcc(View v){
        pgsBar.setVisibility(v.VISIBLE);
        startActivity(new Intent(LoginActivity.this, RigesterActivity.class));
    }
    @OnClick(R.id.loginbu)
    public void Login(View v) {
        pgsBar.setVisibility(v.VISIBLE);
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }
    @OnClick(R.id.ForgetPass)
    public void ForgetPass(View v) {
        pgsBar.setVisibility(v.VISIBLE);
        startActivity(new Intent(LoginActivity.this, ForgetPass.class));
    }

}

