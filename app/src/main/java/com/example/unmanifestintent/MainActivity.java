package com.example.unmanifestintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private Date currentTime;
    private String date;
    private DateFormat df;
    private StringBuilder sb;
    private String timeInt;
    private int time;
    private static final String MORNING_ACTION = "http://morning";
    private static final String AFTERNOON_ACTION = "http://afternoon";
    private static final String NIGHT_ACTION = "http://night";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void synchronizeMethod(View view) {

        Intent intent = new Intent(Intent.ACTION_SYNC);

        currentTime = Calendar.getInstance().getTime();
        df = new SimpleDateFormat("HH:mm");
        date = df.format(Calendar.getInstance().getTime());
        sb = new StringBuilder();
        sb.append(date);
        sb.delete(2, 3);
        timeInt = sb.toString();
        time = Integer.parseInt(timeInt);
        if (time > 600 && time < 1400) {
            intent.setData(Uri.parse(MORNING_ACTION));
            startActivity(intent);
        } else if (time > 1400 && time < 1500) {
            intent.setData(Uri.parse(AFTERNOON_ACTION));
            startActivity(intent);
        } else if (time > 1500) {
            intent.setData(Uri.parse(NIGHT_ACTION));
            startActivity(intent);
        } else {
            Toast.makeText(this, "Incorrect time", Toast.LENGTH_LONG).show();
        }
    }
}
