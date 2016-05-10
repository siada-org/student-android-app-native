package ru.student_app.student;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Created by Admin on 06.05.2016.
 */

public class AuthActivity extends Activity implements OnClickListener{


    @Override
    public void onCreate(Bundle savedInstanceState){

        Button regButton;

        super.onCreate(savedInstanceState);

        setContentView(R.layout.auth_layout);

        regButton = (Button) findViewById(R.id.registration_button);
        regButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.registration_button:
                Intent intent = new Intent(this, RegActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}