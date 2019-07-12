package com.test.ga3an.RegisterPage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;

import com.test.ga3an.HomePage.MainActivity;
import com.test.ga3an.LoginPage.LoginActivity;
import com.test.ga3an.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RigesterActivity extends AppCompatActivity {
    View v;

    @BindView(R.id.Name)
    EditText Name;
    @BindView(R.id.edemail)
    EditText edemail;
    @BindView(R.id.Phone_No)
    EditText Phone_No;
    @BindView(R.id.edPassword)
    EditText edPassword;
    @BindView(R.id.edConPassword)
    EditText edConPassword;
    @BindView(R.id.Male)
    RadioButton Male;
    @BindView(R.id.Femal)
    RadioButton Femal;
    @BindView(R.id.User)
    RadioButton User;
    @BindView(R.id.Chief)
    RadioButton Chief;
    @BindView(R.id.loginbu)
    Button loginbu;
    @BindView(R.id.CreateAccount)
    TextView CreateAccount;
    @BindView(R.id.pBar)
    ProgressBar pgsBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rigester);
        ButterKnife.bind(this);
        pgsBar=(ProgressBar)findViewById(R.id.pBar);
        pgsBar.setVisibility(v.GONE);
    }
    @OnClick(R.id.CreateAccount)
    public void CreateAcc(View v){
        pgsBar.setVisibility(v.VISIBLE);
        startActivity(new Intent(RigesterActivity.this, LoginActivity.class));
    }
    @OnClick(R.id.CreateAccount)
    public void Login(View v) {
        pgsBar.setVisibility(v.VISIBLE);
        startActivity(new Intent(RigesterActivity.this, LoginActivity.class));
    }
}
