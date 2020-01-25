package com.example.guizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button StartBtn ;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        StartBtn = findViewById (R.id.Start_btn  );

        StartBtn.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick (View v) {
                Intent CategoriesIntent = new Intent ( MainActivity.this,CategoriesActivity.class );
                startActivity ( CategoriesIntent );

            }
        } );



    }
}
