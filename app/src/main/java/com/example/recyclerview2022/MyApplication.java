package com.example.recyclerview2022;

import android.app.Application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyApplication extends Application {
    private static List<President> presidentList =new ArrayList<President>();
    private  static int nexId =10;

    public MyApplication() {
        fillPresidentList();

    }

    private void fillPresidentList() {
        President p0 =new President(0,"RRRR",1999,20,"0595791332","https://images.unsplash.com/photo-1642362796875-7cc629016f8e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80");
        President p1 =new President(1,"HHH",2022,17,"0595791332","https://images.unsplash.com/photo-1516245834210-c4c142787335?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1169&q=80");
        President p2 =new President(2,"RRRR",1666,23,"0595791332","https://images.unsplash.com/photo-1628151015658-94ee5e169368?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1172&q=80");
        President p3 =new President(3,"RRRR",23234,24,"0595791332","https://images.unsplash.com/photo-1587620962725-abab7fe55159?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1331&q=80");
        President p4 =new President(4,"RRRR",2736,93,"0595791332","https://images.unsplash.com/photo-1595776613215-fe04b78de7d0?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80");
        President p5 =new President(5,"RRRR",1999,20,"0595791332","https://images.unsplash.com/photo-1517336714731-489689fd1ca8?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1026&q=80");
        President p6 =new President(6,"RRRR",1999,20,"0595791332","https://images.unsplash.com/photo-1543966888-cbd9a4456f85?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1176&q=80");
        presidentList.addAll(Arrays.asList(new President[]{p0,p1,p2,p3,p4,p5,p6}));
    }

    public static List<President> getPresidentList() {
        return presidentList;
    }

    public static void setPresidentList(List<President> presidentList) {
        MyApplication.presidentList = presidentList;
    }

    public static int getNexId() {
        return nexId;
    }

    public static void setNexId(int nexId) {
        MyApplication.nexId = nexId;
    }
}
