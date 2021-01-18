package com.favwest.preschoolschedulemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText enterName;
    Spinner mon_spinner;
    Spinner tues_spinner;
    Spinner wed_spinner;
    Spinner thurs_spinner;
    Spinner fri_spinner;
    Spinner days_wanted_spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Attach enterName variable to EditText enterName
        //Other variable assignments happen within spinner creation
        enterName=findViewById(R.id.enterName);

        //Make Monday spinner
        mon_spinner = findViewById(R.id.mon_spinner);
        if (mon_spinner != null) {
            mon_spinner.setOnItemSelectedListener(this);
        }
        ArrayAdapter<CharSequence> mon_adapter = ArrayAdapter.createFromResource(this,
                R.array.day_array, R.layout.scheduler_spinner_style);
        mon_adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        if (mon_spinner != null) {
            mon_spinner.setAdapter(mon_adapter);
        }
        //Make Tuesday spinner
        tues_spinner = findViewById(R.id.tues_spinner);
        if (tues_spinner != null) {
            tues_spinner.setOnItemSelectedListener(this);
        }
        ArrayAdapter<CharSequence> tues_adapter = ArrayAdapter.createFromResource(this,
                R.array.day_array, R.layout.scheduler_spinner_style);
        tues_adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        if (tues_spinner != null) {
            tues_spinner.setAdapter(tues_adapter);
        }
        //Make Wednesday spinner
        wed_spinner = findViewById(R.id.wed_spinner);
        if (wed_spinner != null) {
            wed_spinner.setOnItemSelectedListener(this);
        }
        ArrayAdapter<CharSequence> wed_adapter = ArrayAdapter.createFromResource(this,
                R.array.day_array, R.layout.scheduler_spinner_style);
        wed_adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        if (wed_spinner != null) {
            wed_spinner.setAdapter(wed_adapter);
        }

        //Make Thursday spinner
        thurs_spinner = findViewById(R.id.thurs_spinner);
        if (thurs_spinner != null) {
            thurs_spinner.setOnItemSelectedListener(this);
        }
        ArrayAdapter<CharSequence> thurs_adapter = ArrayAdapter.createFromResource(this,
                R.array.day_array, R.layout.scheduler_spinner_style);
        thurs_adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        if (thurs_spinner != null) {
            thurs_spinner.setAdapter(thurs_adapter);
        }

        //Make Friday spinner
        fri_spinner = findViewById(R.id.fri_spinner);
        if (fri_spinner != null) {
            fri_spinner.setOnItemSelectedListener(this);
        }
        ArrayAdapter<CharSequence> fri_adapter = ArrayAdapter.createFromResource(this,
                R.array.day_array, R.layout.scheduler_spinner_style);
        fri_adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        if (fri_spinner != null) {
            fri_spinner.setAdapter(fri_adapter);
        }

        //Make Days Wanted spinner
        days_wanted_spinner = findViewById(R.id.days_wanted_spinner);
        if (days_wanted_spinner != null) {
            days_wanted_spinner.setOnItemSelectedListener(this);
        }
        ArrayAdapter<CharSequence> days_wanted_adapter = ArrayAdapter.createFromResource(this,
                R.array.days_wanted_array, R.layout.scheduler_spinner_style);
        days_wanted_adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        if (days_wanted_spinner != null) {
            days_wanted_spinner.setAdapter(days_wanted_adapter);
        }

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String spinnerLabel;
        spinnerLabel = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}