package com.example.justjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Question2 extends AppCompatActivity {
    Button btnQuestion2;
    EditText editText2;
    String valueOfText2;
    int age2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        btnQuestion2 = (Button) findViewById(R.id.button);
        editText2 = (EditText) findViewById(R.id.editText);
    }
    public void btnClickQuest2(View v){
        Intent a = new Intent(this,MainActivity.class);
        Intent i = new Intent(this,Question3.class);
        valueOfText2 = editText2.getText().toString();
        age2 =Integer.parseInt(valueOfText2);
        a.putExtra("age_dog1",valueOfText2);
        startActivity(i);
    }
}
