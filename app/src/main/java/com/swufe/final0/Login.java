package com.swufe.final0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    Button button;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_login);

        editText = (EditText) findViewById(R.id.main_et_username);

        button = (Button) findViewById(R.id.main_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this,Menu.class);
                Bundle bundle = new Bundle();
                bundle.putString("name",editText.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}
