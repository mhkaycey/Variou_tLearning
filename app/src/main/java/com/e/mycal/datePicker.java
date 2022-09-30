package com.e.mycal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.squareup.timessquare.CalendarPickerView;

import java.util.Calendar;
import java.util.Date;

public class datePicker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_datepicker);

        Date today = new Date ();
        Calendar nextYear = Calendar.getInstance ();
        nextYear.add (Calendar.YEAR,1);

        CalendarPickerView datePicker = findViewById (R.id.calendarView);
        datePicker.init (today, nextYear.getTime ()).withSelectedDate (today);
        datePicker.setOnDateSelectedListener (new CalendarPickerView.OnDateSelectedListener ( ) {
            @Override
            public void onDateSelected(Date date) {

            }

            @Override
            public void onDateUnselected(Date date) {

            }
        });
    }
}
