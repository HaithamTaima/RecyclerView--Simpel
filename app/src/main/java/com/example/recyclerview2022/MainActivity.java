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
    List<President> presidentList =new ArrayList<President>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        fillPresidentList();
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

    private void fillPresidentList() {
        President p0 =new President(0,"RRRR",1999,20,"0595791332","https://images.unsplash.com/photo-1642362796875-7cc629016f8e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80");
        President p1 =new President(0,"HHH",2022,17,"0595791332","https://images.unsplash.com/photo-1516245834210-c4c142787335?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1169&q=80");
        President p2 =new President(0,"RRRR",1666,23,"0595791332","https://images.unsplash.com/photo-1628151015658-94ee5e169368?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1172&q=80");
        President p3 =new President(0,"RRRR",23234,24,"0595791332","https://images.unsplash.com/photo-1587620962725-abab7fe55159?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1331&q=80");
        President p4 =new President(0,"RRRR",2736,93,"0595791332","https://images.unsplash.com/photo-1595776613215-fe04b78de7d0?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80");
        President p5 =new President(0,"RRRR",1999,20,"0595791332","https://images.unsplash.com/photo-1517336714731-489689fd1ca8?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1026&q=80");
        President p6 =new President(0,"RRRR",1999,20,"0595791332","https://images.unsplash.com/photo-1543966888-cbd9a4456f85?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1176&q=80");
        presidentList.addAll(Arrays.asList(new President[]{p0,p1,p2,p3,p4,p5,p6}));
    }


}