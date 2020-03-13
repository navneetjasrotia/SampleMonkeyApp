package com.bobble.monkeyapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private String text="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         final EditText editText=(EditText)findViewById(R.id.edittext);
        final Handler h = new Handler();
        h.postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                editText.setText("");
                h.postDelayed(this, 60000);
            }
        }, 60000);
    }
}
