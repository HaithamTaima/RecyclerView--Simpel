package com.example.recyclerview2022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "President App";
    Button btn_addOne;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    List<President> presidentList;
    MyApplication myApplication = (MyApplication) this.getApplication();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presidentList =myApplication.getPresidentList();

        Log.d(TAG, "onCreate: "+presidentList.toString());
        Toast.makeText(this, "President count = "+presidentList.size(), Toast.LENGTH_SHORT).show();
        btn_addOne=findViewById(R.id.btn_addOne);

        btn_addOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,AddEditOne.class);
                startActivity(intent);
            }
        });

        recyclerView=findViewById(R.id.lv_presidentList);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter=new RecyleViewAdapter(presidentList,MainActivity.this);

        recyclerView.setAdapter(mAdapter);


    }



}