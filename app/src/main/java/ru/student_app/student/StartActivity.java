package ru.student_app.student;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Admin on 06.05.2016.
 */
public class StartActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.start_layout);

        //Переход на экран авторизации
        Intent intent = new Intent(this, AuthActivity.class);
        startActivity(intent);
    }
}