package com.sinarex.distancecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String HEIGHT  = "com.sinarex.distancecalculator.HEIGHT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openCameraActivity(View view) {
        Intent intent = new Intent(this, CameraActivity.class);
        EditText heightText = (EditText) findViewById(R.id.heightText);
        String heightString = heightText.getText().toString();
        int height = Integer.parseInt(heightString);
        intent.putExtra(HEIGHT, height);
        startActivity(intent);

    }
}
