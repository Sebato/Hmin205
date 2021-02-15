package com.example.tp2_hmin205;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SensorManager mSensorManager;
    private TextView listeCap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSensorManager = (SensorManager)
                getSystemService(Context.SENSOR_SERVICE);

        List<Sensor> sensorsList =
                mSensorManager.getSensorList(Sensor.TYPE_ALL);
        listeCap = findViewById(R.id.listeCap);

        for (Sensor sen : sensorsList)
        {
            listeCap.append("New sensor detected : \r\n");
            listeCap.append("\tName: " + sen.getName() + "\r\n");
            listeCap.append("\tType: " + sen.getType() + "\r\n");
            listeCap.append("Version: " + sen.getVersion() + "\r\n");
            listeCap.append("Resolution (in the sensor unit): " +
                    sen.getResolution() + "\r\n");
            listeCap.append("Power in mA used by this sensor while in use" +
                    sen.getPower() +"\r\n");
            listeCap.append("Vendor: " + sen.getVendor() + "\r\n");
            listeCap.append("Maximum range of the sensor in the sensor's unit." +
                    sen.getMaximumRange() + "\r\n");
            listeCap.append("Minimum delay allowed between two events in microsecond" +
                    " or zero if this sensor only returns a value when the data it's measuring changes "+
                    sen.getMinDelay() + "\r\n");
            listeCap.append("\r\n -------------- \r\n");

        }

    }


}
