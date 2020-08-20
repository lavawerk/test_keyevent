package com.lavawerk.test.keyevent;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView logText = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        append(getString(R.string.please_press_a_button));
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        append("onKeyDown keyCode = " + keyCode);
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        append("onKeyUp keyCode = " + keyCode);

        return super.onKeyUp(keyCode, event);
    }

    private void append(String msg) {
        if (logText == null) {
            logText = findViewById(R.id.logText);
        }
        if (logText != null) {
            logText.append("\n" + msg);
        }

    }
}