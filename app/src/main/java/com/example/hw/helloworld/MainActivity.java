package com.example.hw.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    public void addListenerOnButton(){
    button=(Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
         @Override
            public void onClick(View v){
                Intent testIntent = new Intent(MainActivity.this, secondActivity.class);
                        startActivity(testIntent);
         }
        });

}
}
