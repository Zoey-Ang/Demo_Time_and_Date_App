package sg.edu.rp.c346.id20046523.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate, btnDisplayTime;
    TextView tvDisplay;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp=findViewById(R.id.datePicker);
        tp=findViewById(R.id.timePicker);
        btnDisplayDate=findViewById(R.id.buttonDisplayDate);
        btnDisplayTime=findViewById(R.id.buttonDisplayTime);
        tvDisplay=findViewById(R.id.textViewDisplay);
        btnReset=findViewById(R.id.buttonReset);


        btnDisplayTime.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                String output="Time is " + String.valueOf(tp.getCurrentHour()) + ":" + String.valueOf(tp.getCurrentMinute());
                tvDisplay.setText(output);
            }
        });

        btnDisplayDate.setOnClickListener((new View.OnClickListener()
        {
            public void onClick(View v)
            {
                String date="Date is " + String.valueOf(dp.getDayOfMonth()) + "/" + String.valueOf(dp.getMonth()+1) + "/" + String.valueOf(dp.getYear());
                tvDisplay.setText(date);
            }
        }));

        btnReset.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                tp.setCurrentHour(0);
                tp.setCurrentMinute(0);
                dp.updateDate(2020,0,1);
            }
        });

    }



}