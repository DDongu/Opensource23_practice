package com.example.practiceimgbtn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView img;
    Integer r = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btn);
        img = (ImageView) findViewById(R.id.imgDuck);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r += 10;
                img.setRotation(r);
            }
        });
    }
}