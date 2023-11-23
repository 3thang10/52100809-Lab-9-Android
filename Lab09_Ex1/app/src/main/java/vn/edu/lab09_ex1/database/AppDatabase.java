package vn.edu.lab09_ex1.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import vn.edu.lab09_ex1.dao.DownloadFileDao;
import vn.edu.lab09_ex1.model.FileModel;

@Database(entities = {FileModel.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DownloadFileDao fileDao();

}
