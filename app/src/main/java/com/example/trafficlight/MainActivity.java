package com.example.trafficlight;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    private Button btnLight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLight = findViewById(R.id.btnLight);

        btnLight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count++;
                if(count==1){
                    btnLight.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                    btnLight.setText(R.string.go);
                }
                else if(count==2){

                    btnLight.setBackgroundColor(getResources().getColor(R.color.colorYellow));
                    btnLight.setText(R.string.wait);
                }
                else{
                    btnLight.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    btnLight.setText(R.string.stop);
                    count =0;
                }

            }

        });
    }
}
