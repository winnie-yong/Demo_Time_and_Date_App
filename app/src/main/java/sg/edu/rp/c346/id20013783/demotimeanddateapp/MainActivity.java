package sg.edu.rp.c346.id20013783.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatePicker dp;
        TimePicker tp;
        Button btnDisplayDate;
        Button btnDisplayTime;
        TextView tvDisplay;
        Button btnReset;

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnReset= findViewById(R.id.resetButton);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "Time is ";
                int hour = tp.getCurrentHour();
                int minute = tp.getCurrentMinute();


                msg = msg + hour + ":" + minute;
                tvDisplay.setText(msg);
            }
        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "Date is ";
                int day = dp.getDayOfMonth();
                int month = dp.getMonth();
                int year = dp.getYear();
                msg = msg + day + "/" + month + "/" + year;
                tvDisplay.setText(msg);
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tp.setCurrentHour(0);
                tp.setCurrentMinute(0);
                dp.updateDate(2020,0,1);
            }
        });


    }
}