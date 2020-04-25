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
        Button button1= (Button) findViewById(R.id.homework_btn1);
        Button button2=(Button)findViewById(R.id.homework_btn2);
        Button button3=(Button)findViewById(R.id.homework_btn3);
        Button button4=(Button)findViewById(R.id.homework_btn4);
        Button button5=(Button)findViewById(R.id.homework_btn5);
    }
    public void startMain(View view){
        //界面跳转
        Intent intent=new Intent(this,HomeworkActivity1.class);
        startActivity(intent);
    }
}
