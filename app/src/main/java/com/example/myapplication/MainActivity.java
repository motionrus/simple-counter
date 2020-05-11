package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private Integer counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setCounter(this.counter);
    }

    public void increaseEvent(View view) {
        this.setCounter(this.counter + 1);
    }

    public void decreaseEvent(View view) {
        this.setCounter(this.counter - 1);
    }

    public void clearEvent(View view) {
        this.setCounter(0);
    }

    private void setCounter(Integer counter) {
        this.counter = counter;
        TextView textView = findViewById(R.id.textView3);
        String stringCounter = String.format(Locale.getDefault(), "%d", this.counter);
        textView.setText(stringCounter);
    }
}
