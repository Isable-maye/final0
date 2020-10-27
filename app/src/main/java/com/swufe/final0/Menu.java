package com.swufe.final0;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;


public class Menu extends AppCompatActivity {
    TextView name;
    Button button_input,button_recite,button_self;
    MyInput fragmentInput = new MyInput();
    Recite recite = new Recite();
    Center center = new Center();
    DBOpenHelper dbOpenHelper;
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_menu);
        button_input = (Button) findViewById(R.id.frist_btn_input);
        button_recite = (Button) findViewById(R.id.frist_btn_recite);
        button_self = (Button) findViewById(R.id.frist_btn_self);

        name = (TextView) findViewById(R.id.name);



        dbOpenHelper = new DBOpenHelper( Menu.this,"tb_dict",null,1);

        //获取ID
        Bundle buddle = getIntent().getExtras();
        name.setText(buddle.getString("name"));
        //点击录入按钮
        button_input.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.HONEYCOMB)
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.first_fl,fragmentInput).commitAllowingStateLoss();
            }
        });

        //点击背诵按钮
        button_recite.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.HONEYCOMB)
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.first_fl,recite).commitAllowingStateLoss();

            }
        });

        //点击个人按钮
        button_self.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.HONEYCOMB)
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.first_fl,center).commitAllowingStateLoss();
            }
        });

        //默认录入界面
        getFragmentManager().beginTransaction().add(R.id.first_fl, fragmentInput).commitAllowingStateLoss();

    }

}
