package com.example.energycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    class MainActicityListener implements View.OnClickListener, AdapterView.OnItemSelectedListener {

        @Override
        public void onClick(View view) {

        }

        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            cost.setText(Double.toString(sportCost[i]));
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {
            //no use
        }
    }

    //attribute declare
    Spinner sportSpinner;
    TextView cost, totalCost;
    EditText kg, hr;
    Button calBtn;
    MainActicityListener listener;
    double[] sportCost = {3.1, 4.4, 13.2, 9.7, 5.1, 3.7};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //attribute initialize
        cost = findViewById(R.id.outputCost);
        totalCost = findViewById(R.id.outputTotalCost);
        kg = findViewById(R.id.inputKg);
        hr = findViewById(R.id.inputHr);
        calBtn = findViewById(R.id.calBtn);
        sportSpinner = findViewById(R.id.sportSpinner);

        listener = new MainActicityListener();

        sportSpinner.setOnItemSelectedListener(listener);
        calBtn.setOnClickListener(listener);
    }
}
