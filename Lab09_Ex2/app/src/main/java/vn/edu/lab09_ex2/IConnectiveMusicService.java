package vn.edu.lab09_ex2;

import android.content.ComponentName;
import android.os.IBinder;

public interface IConnectiveMusicService {
    void onServiceConnected(ComponentName name, IBinder service);
    void onServiceDisconnected(ComponentName name);
}
