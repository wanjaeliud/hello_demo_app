package com.example.eliud.hello_world;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.yellow));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.turquoise));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Grab user input
                String updatedText = ((EditText)findViewById(R.id.editText)).getText().toString();
                //Set user input into text view once change text button is clicked
                if(TextUtils.isEmpty(updatedText)){
                    ((TextView) findViewById(R.id.textView)).setText("Hello from Eliud!");
                }
                else {
                    ((TextView) findViewById(R.id.textView)).setText(updatedText);
                }
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Reset text color to default

                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.colorAccent));

                //Reset background color to default

                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.colorPrimary));

                //Reset text to default

                ((TextView) findViewById(R.id.textView)).setText("Hello from Eliud!");

            }
        });

    }


}
