package com.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class afficher extends AppCompatActivity {

    EditText et1, et2;
    Button b;
    TextView ans1, ans2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tets);

        et1 = (EditText) findViewById(R.id.firstname);
        et2 = (EditText) findViewById(R.id.lastname);
        b = (Button) findViewById(R.id.btn);
        ans1 = (TextView) findViewById(R.id.frst);
        ans2 = (TextView) findViewById(R.id.lst);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first_name = et1.getText().toString();
                String last_name = et2.getText().toString();
                ans1.setText(first_name);
                ans2.setText(last_name);
            }
        });
    }


}