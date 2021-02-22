package com.example.bmk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextFirstName;
    private EditText editTextLastName;
    private EditText editTextAge;
    private RadioGroup radioGroupGender;
    private RadioGroup radioGroupEducation;
    private Spinner spinnerCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextFirstName = findViewById(R.id.editTextFirstName);
        editTextLastName = findViewById(R.id.editTextLastName);
        editTextAge = findViewById(R.id.editTextAge);
        radioGroupGender = findViewById(R.id.radioGroupGender);
        radioGroupEducation = findViewById(R.id.radioGroupEducation);
        spinnerCountry = findViewById(R.id.spinnerCountry);
    }

    public void onInfo(View v) {

        Intent intent = new Intent(MainActivity.this, ResultActivity.class);

        RadioButton selectedGenderRadioButton = findViewById(radioGroupGender.getCheckedRadioButtonId());
        RadioButton selectedEducationRadioButton = findViewById(radioGroupEducation.getCheckedRadioButtonId());

        intent.putExtra("firstName", editTextFirstName.getText().toString());
        intent.putExtra("lastName", editTextLastName.getText().toString());
        intent.putExtra("age", editTextAge.getText().toString());
        intent.putExtra("gender", selectedGenderRadioButton.getText());
        intent.putExtra("education", selectedEducationRadioButton.getText());
        intent.putExtra("country", spinnerCountry.getSelectedItem().toString());

        startActivity(intent);
    }

}