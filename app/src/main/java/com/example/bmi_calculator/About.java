package com.example.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class About extends AppCompatActivity {

    Button gitlink = findViewById(R.id.github);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        gitlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl();
            }
        });

        TextView link = (TextView) findViewById(R.id.github);
        String linkText = link.getText() + "<a href='https://github.com/mirzafrina/BMI_Calculator.git";
        link.setText(Html.fromHtml(linkText));
        link.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void gotoUrl(){
        Uri uri = Uri.parse("https://github.com/mirzafrina/BMI_Calculator.git");
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}