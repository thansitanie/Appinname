package com.example.avi03.appinname;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class thannieapp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thannieapp);
        final TextView showname = findViewById(R.id.tv_showname);
        final TextView showlastname = findViewById(R.id.tv_showlastname);
        final EditText inputname = findViewById(R.id.et_inputname);
        final EditText inputlastname = findViewById(R.id.et_inputlastname);
        Button btndata =  findViewById(R.id.btn_setdata);

     btndata.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             showname.setText(inputname.getText());
             showlastname.setText(inputlastname.getText());
         }
     });
    }
}
