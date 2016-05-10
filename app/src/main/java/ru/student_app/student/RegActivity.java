package ru.student_app.student;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Admin on 06.05.2016.
 */
public class RegActivity extends Activity implements View.OnClickListener {

    Button regSubmitBtn;
    EditText telN;

    @Override
    public void onCreate(Bundle savedinstanceState) {

        super.onCreate(savedinstanceState);
        setContentView(R.layout.reg_layout);

        regSubmitBtn = (Button) findViewById(R.id.regSubmitButton);
        regSubmitBtn.setOnClickListener(this);

        telN = (EditText) findViewById(R.id.authTelEnter);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.regSubmitButton:
                String takeTelN = telN.getText().toString();
                Log.i("Teltext", takeTelN);
                break;
            default:
                break;
        }
    }
}