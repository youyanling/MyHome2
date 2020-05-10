package cn.edu.sdwu.android02.home.sn170507180117;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

    }
    public void startMain(View view){
        //界面跳转
        Intent intent=new Intent(this,HomeworkActivity1.class);
        startActivity(intent);
    }
    public void startMain2(View view){
        Intent intent=new Intent(this,HomeworkActivity2.class);
        startActivity(intent);
    }

    public void startMain3(View view){
        Intent intent=new Intent(this,HomeworkActivity3.class);
        startActivity(intent);
    }
}
