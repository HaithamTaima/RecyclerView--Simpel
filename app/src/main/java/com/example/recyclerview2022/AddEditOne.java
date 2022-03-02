package com.example.recyclerview2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class AddEditOne extends AppCompatActivity {
    Button btn_ok, btn_cancel;
    EditText et_presData, et_presName, et_presImage, et_age, et_number;
    List<President> presidentList;
    MyApplication myApplication = (MyApplication) this.getApplication();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_edit_one);
        btn_cancel = findViewById(R.id.btn_cancel);
        btn_ok = findViewById(R.id.btn_ok);
        et_presName = findViewById(R.id.et_tv_presidentldName);
        et_presData = findViewById(R.id.et_dateElection);
        et_age = findViewById(R.id.et_age);
        et_number = findViewById(R.id.et_number);
        et_presImage = findViewById(R.id.et_picturURL);


        presidentList = MyApplication.getPresidentList();

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //creat presdes object
                int nextId = MyApplication.getNexId();
                President newPresident = new President(nextId, et_presName.getText().toString(), Integer.parseInt(et_presData.getText().toString()), Integer.parseInt(et_age.getText().toString()), et_number.getText().toString(), et_presImage.getText().toString());
                //add tha object to tha global List of presidens
                presidentList.add(newPresident);
                MyApplication.setNexId(nextId++);
                //go bak main Actvete

                Intent intent = new Intent(AddEditOne.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddEditOne.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}