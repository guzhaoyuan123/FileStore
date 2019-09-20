package com.example.filestore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnStorage,mBtnFile,mBtnFile2,mBtnImageFile2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnStorage = findViewById(R.id.storage);
        mBtnFile = findViewById(R.id.file);
        mBtnFile2 = findViewById(R.id.file2);
        mBtnImageFile2 = findViewById(R.id.imagefile);

        mBtnStorage.setOnClickListener(this);
        mBtnFile.setOnClickListener(this);
        mBtnFile2.setOnClickListener(this);
        mBtnImageFile2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.storage:
                Intent intent = new Intent(MainActivity.this, StaredPreferencesActivity.class);
                startActivity(intent);
                break;
            case R.id.file:
                Intent intent1 = new Intent(MainActivity.this, FileActivity.class);
                startActivity(intent1);
                break;
            case R.id.file2:
                Intent intent2 = new Intent(MainActivity.this, File2Activity.class);
                startActivity(intent2);
                break;
            case R.id.imagefile:
                Intent intent3 = new Intent(MainActivity.this, ImageFileActivity.class);
                startActivity(intent3);
                break;
        }
    }
}
