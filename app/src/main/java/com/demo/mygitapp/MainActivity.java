package com.demo.mygitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private boolean False;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("OpenCV","Git Demo");

    }

    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b){
        return a - b ;
    }

    void ok(){
        Log.d("omega" , "ok");
    }

    void hello(){
        Log.d("omega", "I love Michael");
    }
    void hi(){
        Log.d("omega", "My name is Will");
    }
    int mul(int a, int b){
        return a*b;
    }
    int f(int a)
    {
        if(a == 1 || a == 2)
            return 1;
        else
            return f(a-1) + f(a-2);
    }

    int truefalse(int a, int b){
        if (a==b)
            return 1;
        else
            return 0;
    }

    void casper (){
        Log.d("ni", "hao");
    }
    void joshua(){
        Log.d("omega", "I love Michael");
    }

    int z(int a){
        return a;
    }
    public static void random (String[]args){
        int x = Integer.parseInt(args[0]);
        double r = Math.random();
        int n = (int)(x*r);
        System.out.println(n);
    }


    void ethan(){
        Log.d("omega","Baron shut up");
    }
    int divide_x(int a, int b){
        return a/b;
    }
    void test(){Log.d("test","test");}
}
