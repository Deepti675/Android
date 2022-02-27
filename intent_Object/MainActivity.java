package com.example.activitystarter;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.net.HttpCookie;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void launchIntent(View view){
        Intent intent= new Intent(Intent.ACTION_VIEW);

        intent.setData(Uri.parse("https://www.packtpub.com/"));
        startActivity(intent);
    }
}
