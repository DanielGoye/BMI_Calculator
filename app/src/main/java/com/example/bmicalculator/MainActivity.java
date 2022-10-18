package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnOnClick(View view){
        EditText name = findViewById(R.id.editTxtName);
        EditText height = findViewById(R.id.editTxtHeight);
        EditText weight = findViewById(R.id.editTxtWeight);

        float height_value = Float.parseFloat(height.getText().toString());
        float weight_value = Float.parseFloat(weight.getText().toString());
        float BMI = weight_value / (height_value * height_value);
        String BMI_status = "";

        if (BMI <= 18) {
            BMI_status = "Underweight";
        } else if (BMI <= 25 && BMI > 18) {
            BMI_status = "Normal";
        } else if (BMI <= 30 && BMI > 25) {
            BMI_status = "Overweight";
        } else {
            BMI_status = "Obese";
        }

        TextView name_view = findViewById(R.id.txtViewName);
        TextView BMI_view = findViewById(R.id.txtViewBMI);
        TextView status_view = findViewById(R.id.txtviewStatus);
        TextView weight_view = findViewById(R.id.txtViewWeight);

        name_view.setText("Name: " + name.getText().toString());
        BMI_view.setText("BMI: " + BMI);
        status_view.setText("Status: " + BMI_status);
        weight_view.setText("Weight: " + weight.getText().toString() + " kg");
    }
}