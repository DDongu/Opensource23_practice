package com.example.practicecheckbox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ComputableLiveData;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.google.android.material.appbar.AppBarLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox ck1, ck2, ck3;
        Button btn;

        ck1 = (CheckBox) findViewById(R.id.enable);
        ck2 = (CheckBox) findViewById(R.id.clickable);
        ck3 = (CheckBox) findViewById(R.id.rotation45);
        btn = (Button) findViewById(R.id.btn);

        ck1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    btn.setEnabled(false);
                }
                else
                    btn.setEnabled(true);
            }
        });
        ck2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    btn.setClickable(true);
                }
                else {
                    btn.setClickable(false);
                }
            }
        });
        ck3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    btn.setRotation(45);
                }
                else {
                    btn.setRotation(0);
                }
            }
        });
    }
}