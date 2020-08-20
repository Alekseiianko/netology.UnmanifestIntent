package com.example.unmanifestintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class NightActivity extends AppCompatActivity {

    private TextView textView;
    private DateFormat df;
    private String time;
    private static final String NIGHT_ACTIVITY = "Night Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_night);
        setTitle(NIGHT_ACTIVITY);
        textView = findViewById(R.id.current_time);
        df = new SimpleDateFormat("HH:mm");
        time = df.format(Calendar.getInstance().getTime());
        textView.setText("Current time: " + time + "\n" + "Night");
    }
}
