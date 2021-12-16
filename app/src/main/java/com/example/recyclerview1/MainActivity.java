package com.example.recyclerview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
 String s1[],s2[];
 int Image[]={R.drawable.CPP,R.drawable.Java,R.drawable.python};
 RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1=getResources().getStringArray(R.array.programmingLanguages);
        s2=getResources().getStringArray(R.array.description);
        rv=findViewById(R.id.RV);
        
    }
}