package com.example.l;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView img_quran,img_azkar ,img_stories;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        img_stories = findViewById(R.id.btn_stories);
    img_stories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast .makeText(MainActivity.this,"ghg",Toast.LENGTH_SHORT).show();
                Toast .makeText(MainActivity.this,"ghg",Toast.LENGTH_SHORT).show();
                Toast .makeText(MainActivity.this,"ghg",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,Stories.class);
                startActivity(intent);
            }
        });

    }
}
