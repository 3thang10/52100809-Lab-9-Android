package vn.edu.lab09_ex1.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import vn.edu.lab09_ex1.model.DownloadFile;
import vn.edu.lab09_ex1.model.FileModel;

@Dao
public interface DownloadFileDao {
    @Query("SELECT * FROM File")
    List<FileModel> getAll();
    @Insert
    void insert(FileModel file);
}
