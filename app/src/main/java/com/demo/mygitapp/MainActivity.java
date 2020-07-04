package com.demo.mygitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("OpenCV","Git Demo");

    }

    int add(int a, int b) {
        return a + b;
    }
    void Hi (){
        Log.d("Omega", "My name is William");
    }
    int sub(int a, int b){
        return a - b ;
    }
    void hello(){
        Log.d("Da Best Team","ooooof");
    }

    void hello(){
        Log.d("omega", "I love Michael");
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
    void Joshua(){
        Log.d("omega", "I love miachel");
    }

    int z(int a){
        return a;
    }
}
