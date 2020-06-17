package com.example.timestable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView timesTableListView;
    public void generateTimesTable (int timesTableNumber){
        ArrayList<String> timesTableContent = new ArrayList<String>();
        for(int j = 1; j<=10; j++){
            timesTableContent.add(Integer.toString(j*timesTableNumber));
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,timesTableContent);

        timesTableListView.setAdapter(arrayAdapter);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final SeekBar timeTableSeekBar = (SeekBar) findViewById(R.id.timesTableSeekBar);
        timesTableListView = (ListView) findViewById(R.id.timesTableListView);
        int max = 20;
        int startingPosition = 10;
        timeTableSeekBar.setMax(max);
        timeTableSeekBar.setProgress(startingPosition);
        generateTimesTable(startingPosition);
        timeTableSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int min = 1;
                int timesTableNumber;
                if(i < min){
                    timesTableNumber = min;
                    timeTableSeekBar.setProgress(timesTableNumber);
                }
                else{
                    timesTableNumber = i;
                }

                generateTimesTable(timesTableNumber);


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}