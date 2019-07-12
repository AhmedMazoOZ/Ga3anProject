package com.test.ga3an.ForgetPassword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.test.ga3an.LoginPage.LoginActivity;
import com.test.ga3an.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NewPass extends AppCompatActivity {
    View v;
    @BindView(R.id.new_pass)
    EditText new_pass;
    @BindView(R.id.confirm_new_pass)
    EditText confirm_new_pass;
    @BindView(R.id.set_new_pass)
    Button set_new_pass;
    @BindView(R.id.pBar)
    ProgressBar pgsBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_pass);
        ButterKnife.bind(this);
        pgsBar = (ProgressBar) findViewById(R.id.pBar);
        pgsBar.setVisibility(v.GONE);
    }

    @OnClick(R.id.set_new_pass)
    public void CodeConfirm(View v) {
        pgsBar.setVisibility(v.VISIBLE);
        startActivity(new Intent(NewPass.this, LoginActivity.class));
    }

}
