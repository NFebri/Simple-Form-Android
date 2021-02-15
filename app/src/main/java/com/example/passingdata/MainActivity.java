package com.example.passingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView output;
    EditText nama, nis;
    Button submit;
    public static final String messageMain = "MessageMainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = (TextView) findViewById(R.id.output);
        nama = (EditText) findViewById(R.id.nama);
        nis = (EditText) findViewById(R.id.nis);
        submit = (Button) findViewById(R.id.btnsubmit);
    }

    public void goToHome(View view) {
        Intent intGoToHome = new Intent(this, HomeActivity.class);
        String[] message = {
                nama.getText().toString(),
                nis.getText().toString()
        };
        intGoToHome.putExtra(messageMain, message);
        startActivity(intGoToHome);
    }

    public void printOutput(View view) {
        output.setText("Nama \t : " + nama.getText().toString() +
                    "\nNIS Anda \t : " + nis.getText().toString());
    }
}