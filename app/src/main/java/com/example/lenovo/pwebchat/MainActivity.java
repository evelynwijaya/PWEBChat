package com.example.lenovo.pwebchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    EditText et_ketik;
    Button bt_send;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = new User();
        user.setNamauser("Evelyn Wijaya");
        user.setEmailuser("evelynwilbert_16@kharisma.ac.id");
        user.setTelpn("082193149209");
        user.register();

        et_ketik = (EditText) findViewById(R.id.et_ketik);
        bt_send = (Button) findViewById(R.id.bt_send);

        bt_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Chat chat = new Chat();
                chat.setPesan(et_ketik.getText().toString());
                chat.setTanggal(new Date().getTime());
                chat.setSender(user);

                chat.send();
            }
        });

    }


}
