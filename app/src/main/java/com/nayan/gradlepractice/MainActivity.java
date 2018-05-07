package com.nayan.gradlepractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.nayan.customtextview.AlphabateChecking;
import com.nayan.customtextview.Model;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Model model = new Model("Faizul","Nayan");
        AlphabateChecking checking = new AlphabateChecking(model);
        Toast.makeText(this,checking.getFullName(),Toast.LENGTH_LONG).show();
    }
}
