package com.example.ccs.redrock2.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ccs.redrock2.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        setButtom();
    }
    private void setButtom(){
        Button button_main = (Button)findViewById(R.id.button_main);
        button_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"你将进入测试页面",Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(MainActivity.this,TabLayout_Viewpager_FragmentActivity.class);
                startActivity(intent);
            }
        });
    }
}
