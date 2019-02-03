package com.example.android.practiceall2;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class DatePickerImplementation extends AppCompatActivity {
    Button button;
    int year_x, month_x, day_x;
    static final int DIALOG_ID = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker_implementation);
        final Calendar cal = Calendar.getInstance();
        year_x = cal.get(Calendar.YEAR);
        month_x = cal.get(Calendar.MONTH);
        day_x = cal.get(Calendar.DAY_OF_MONTH);
        showDialog();
    }

    public void showDialog(){
        button = (Button)findViewById(R.id.DatePickerButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DIALOG_ID);
            }
        });
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        if(id == DIALOG_ID){
            return new DatePickerDialog(DatePickerImplementation.this, dpickerListener,year_x,month_x,day_x);
        }
        return null;
    }
    private DatePickerDialog.OnDateSetListener dpickerListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            year_x = year;
            month_x = month + 1;
            day_x = dayOfMonth;
            Toast.makeText(DatePickerImplementation.this, year_x+"/"+month_x+"/"+day_x, Toast.LENGTH_SHORT).show();
        }
    };
}
