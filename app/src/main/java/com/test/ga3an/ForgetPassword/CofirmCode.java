package com.test.ga3an.ForgetPassword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.test.ga3an.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CofirmCode extends AppCompatActivity {
    View v;

    @BindView(R.id.edemail)
    EditText edemail;
    @BindView(R.id.codeconfirm)
    Button codeconfirm;
    @BindView(R.id.pBar)
    ProgressBar pgsBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cofirm_code);
        ButterKnife.bind(this);
        pgsBar = (ProgressBar) findViewById(R.id.pBar);
        pgsBar.setVisibility(v.GONE);
    }

    @OnClick(R.id.codeconfirm)
    public void CodeConfirm(View v) {
        pgsBar.setVisibility(v.VISIBLE);
        startActivity(new Intent(CofirmCode.this, NewPass.class));
    }
}
