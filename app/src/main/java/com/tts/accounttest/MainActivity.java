package com.tts.accounttest;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed_username;
    EditText ed_email;
    EditText ed_password;
    ImageView x1;
    ImageView x2;
    ImageView x3;
    TextView speaker1;
    TextView speaker2;
    TextView speaker3;
    int name;
    int email;
    int password;
    int result1 = 0;
    int result2 = 0;
    int result3 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ed_username = findViewById(R.id.ed_username);
        ed_email = findViewById(R.id.ed_email);
        ed_password = findViewById(R.id.ed_password);
        x1 = findViewById(R.id.x1);
        x2 = findViewById(R.id.x2);
        x3 = findViewById(R.id.x3);
        speaker1 = findViewById(R.id.speaker1);
        speaker2 = findViewById(R.id.speaker2);
        speaker3 = findViewById(R.id.speaker3);
        Log.d("hahahayo","mes:"+name);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();







            }
        });
    }

    public void confirm(View view){
        name = ed_username.getText().toString().length();
        password = ed_password.getText().toString().length();
        email = ed_email.getText().toString().length();
    for(int i=1;i<3;i++) {
        if (result1 == 1 && result2 == 1 && result3 ==1) {
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Tip")
                    .setMessage("創建成功")
                    .setPositiveButton("OK", null)
                    .show();
            result1 = 0;
            result2 = 0;
            result3 = 0;

        } else {
            if (name < 4 && name != 0) {
                    speaker1.setText("longer than 3 words");
                    speaker1.setVisibility(View.VISIBLE);
                    x1.setImageResource(R.drawable.x);
                    x1.setVisibility(View.VISIBLE);
                    result1 = 0;
                } else if (name == 0) {
                    speaker1.setText("cannot be empty");
                    speaker1.setVisibility(View.VISIBLE);
                    x1.setImageResource(R.drawable.x);
                    x1.setVisibility(View.VISIBLE);
                    result1 = 0;
                } else {
                    speaker1.setVisibility(View.GONE);
                    x1.setVisibility(View.GONE);
                    result1 = 1;
            }
            if (email == 0) {
                speaker2.setText("cannot be empty");
                speaker2.setVisibility(View.VISIBLE);
                x2.setImageResource(R.drawable.x);
                x2.setVisibility(View.VISIBLE);
                result2 = 0;
            } else {
                speaker2.setVisibility(View.GONE);
                x2.setVisibility(View.GONE);
                result2 = 1;
            }
            if (password < 6 && name != 0) {
                speaker3.setText("longer than 5 words");
                speaker3.setVisibility(View.VISIBLE);
                x3.setImageResource(R.drawable.x);
                x3.setVisibility(View.VISIBLE);
                result3 = 0;
            } else if (name == 0) {
                speaker3.setText("cannot be empty");
                speaker3.setVisibility(View.VISIBLE);
                x3.setImageResource(R.drawable.x);
                x3.setVisibility(View.VISIBLE);
                result3 = 0;
            } else {
                speaker3.setVisibility(View.GONE);
                x3.setVisibility(View.GONE);
                result3 = 1;
            }

        }
    }

        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
