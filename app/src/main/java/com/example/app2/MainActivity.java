package com.example.app2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText textfeild;
    Button btn;
    TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textfeild=findViewById(R.id.edittext1);
        btn=findViewById(R.id.button);
        txtView=findViewById(R.id.text_view1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String metersStr = textfeild.getText().toString();
                    if (!metersStr.isEmpty()) {
                        double meters = Double.parseDouble(metersStr);
                        double centimeters = meters * 100;
                        txtView.setText("Result: " + centimeters + " cm");
                    } else {
                        txtView.setText("Please enter a value in meters");
                    }
                }
        });


    }
}