package com.example.unmanifestintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AfternoonActivity extends AppCompatActivity {

    private TextView textView;
    private DateFormat df;
    private String time;
    private static final String AFTERNOON_ACTIVITY = "Afternoon Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afternoon);
        setTitle(AFTERNOON_ACTIVITY);
        textView = findViewById(R.id.current_time);
        df = new SimpleDateFormat("HH:mm");
        time = df.format(Calendar.getInstance().getTime());
        textView.setText("Current time: " + time + "\n" + "Afternoon");
    }
}
