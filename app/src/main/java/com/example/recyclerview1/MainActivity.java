package com.example.recyclerview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
 String s1[],s2[];
 int image[]={R.drawable.CPP,R.drawable.Java,R.drawable.python};
 RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv=findViewById(R.id.RV);

        s1=getResources().getStringArray(R.array.programmingLanguages);
        s2=getResources().getStringArray(R.array.description);

        MyAdapter myAdapter=new MyAdapter(this,s1,s2,image);
        rv.setAdapter(myAdapter);
        rv.setLayoutManager(new LinearLayoutManager(this));

        
    }
}