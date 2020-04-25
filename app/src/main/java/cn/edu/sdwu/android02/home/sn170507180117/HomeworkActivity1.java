package cn.edu.sdwu.android02.home.sn170507180117;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeworkActivity1 extends AppCompatActivity {
    private ServiceConnection serviceConnection;
    private boolean bound;
    private MediaService mediaService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homework1);
        bound=false;
        serviceConnection= new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                bound=true;
                MediaService.MyBinder myBinder= (MediaService.MyBinder) iBinder;
                mediaService=myBinder.getMediaService();
            }

            @Override
            public void onServiceDisconnected(ComponentName componentName) {
                bound=false;
            }
        };
    }
    public void homework1_start(View view){
        startServiceClick(view);
    }
    public void homework1_pause(View view){
        startServiceClick(view);
    }
    public void homework1_stop(View view){
        startServiceClick(view);
    }
    public void homework1_stopservice(View view){
        startServiceClick(view);
    }

    private void startServiceClick(View view){
        //使用本方法统一处理用户的点击（启动方式的按键）
        int id=view.getId();
        Intent intent=new Intent(this,MediaService.class);
        switch (id){
            case R.id.homework1_start:
                intent.putExtra("PlayerState","START");
                break;
            case R.id.homework1_pause:
                intent.putExtra("PlayerState","PAUSE");
                break;
            case R.id.homework1_stop:
                intent.putExtra("PlayerState","STOP");
                break;
            case R.id.homework1_stopservice:
                intent.putExtra("PlayerState","STOPSERVICE");
        }
        startService(intent);
    }
    public void  bindClick(View view){
        int id=view.getId();
        switch (id){
            case R.id.homework1_bind:
                Intent intent=new Intent(this,MediaService.class);
                bindService(intent,serviceConnection,BIND_AUTO_CREATE);
                break;
            case R.id.homework1_unbind:
                unbindService(serviceConnection);
                bound=false;
                break;
            case R.id.homework1_bindstart:
                if(bound){
                    mediaService.start();
                }
                break;
            case R.id.homework1_bindpause:
                if(bound){
                    mediaService.pause();
                }
                break;
            case R.id.homework1_bindstop:
                if(bound){
                    mediaService.stop();
                }
                break;
        }
    }
}
