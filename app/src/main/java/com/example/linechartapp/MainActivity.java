package com.example.linechartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.eazegraph.lib.charts.ValueLineChart;
import org.eazegraph.lib.models.ValueLinePoint;
import org.eazegraph.lib.models.ValueLineSeries;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        *
        * learner about more link
        * link - https://github.com/systembugtj/EazeGraph
        *
        * */

        ValueLineChart mCubicValueLineChart = (ValueLineChart) findViewById(R.id.cubiclinechart);

        ValueLineSeries series = new ValueLineSeries();
        series.setColor(0xFF56B7F1);

        series.addPoint(new ValueLinePoint("Sunday", 50));
        series.addPoint(new ValueLinePoint("Moday", 40));
        series.addPoint(new ValueLinePoint("Tuesday", 30));
        series.addPoint(new ValueLinePoint("Wednesday", 20));
        series.addPoint(new ValueLinePoint("Thursday", 10));
        series.addPoint(new ValueLinePoint("Friday", 5));
        series.addPoint(new ValueLinePoint("Saturday", 1));


        mCubicValueLineChart.addSeries(series);
        mCubicValueLineChart.startAnimation();
    }
}