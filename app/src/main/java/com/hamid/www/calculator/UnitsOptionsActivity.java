package com.hamid.www.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class UnitsOptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_units_options);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.area:
                startActivity(new Intent(this,AreaConverter.class));
                finish();
        }
    }
}
