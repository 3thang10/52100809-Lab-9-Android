package vn.edu.lab09_ex2;

public interface IMusicPlayerListener {
    void onUpdate(
            long currentDuration,
            long maxDuration,
            String songName
    );

    void onStartNotificationForegroundDone();

    void onServiceStopped();

    void onMusicPause();
}
