package com.example.bmk;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView textViewResultData = findViewById(R.id.textViewResultData);

        textViewResultData.append(String.format("" + "Имя: %s\n" + "Фамилия: %s\n" + "Возраст: %s\n" + "Пол: %s\n" + "Образование: %s\n" + "Страна: %s",
                getIntent().getStringExtra("firstName"),
                getIntent().getStringExtra("lastName"),
                getIntent().getStringExtra("age"),
                getIntent().getStringExtra("gender"),
                getIntent().getStringExtra("education"),
                getIntent().getStringExtra("country")));
    }

    public void onBack(View v) {
        setResult(RESULT_OK);
        finish();
    }

    public void onExit(View v) {
        finishAffinity();
    }
}