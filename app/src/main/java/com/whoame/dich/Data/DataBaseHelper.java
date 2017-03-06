package com.whoame.dich.Data;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataBaseHelper extends SQLiteOpenHelper{

    // путь к базе данных вашего приложения
    private static String DB_PATH;
    private static String DB_NAME = "DB.db";
    private static final int SCHEMA = 1;

    static final String TABLE = "MAIN";
    static final String COLUMN_ID = "_id";
    static final String COLUMN_CATEGORY = "category";
    static final String COLUMN_PICTURE = "picture";
    static final String COLUMN_ARTICLE_NAME = "article_name";
    static final String COLUMN_ARTICLE = "article";

    private final Context mContext;

    /**
     * Конструктор
     * Принимает и сохраняет ссылку на переданный контекст для доступа к ресурсам приложения
     * @param context
     */
    public DataBaseHelper(Context context) {
        super(context, DB_NAME, null, SCHEMA);
        this.mContext = context;
        DB_PATH = context.getFilesDir().getPath() + DB_NAME;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    /**
     * Проверяет, существует ли уже эта база, чтобы не копировать каждый раз при запуске приложения
     * @return true если существует, false если не существует
     */
    private boolean checkDataBase(){
        SQLiteDatabase checkDB = null;

        try{
            SQLiteDatabase.openDatabase(DB_PATH, null, SQLiteDatabase.OPEN_READONLY);
        }catch(SQLiteException e){
            //база еще не существует
        }
        if(checkDB != null){
            checkDB.close();
        }
        return checkDB != null ? true : false;
    }

    /**
     * Копирует базу из папки assets заместо созданной локальной БД
     * Выполняется путем копирования потока байтов.
     * */
    private void copyDataBase() throws IOException {
        InputStream myInput = null;
        OutputStream myOutput = null;

        //Открываем локальную БД как входящий поток
        try {
            File file = new File(DB_PATH);
            if (!file.exists()) {
                this.getReadableDatabase();

                //Получаем БД как поток
                myInput = mContext.getAssets().open(DB_NAME);

                //Путь ко вновь созданной БД
                String outFileName = DB_PATH;

                //Открываем пустую базу данных как исходящий поток
                myOutput = new FileOutputStream(outFileName);

                //перемещаем байты из входящего файла в исходящий
                byte[] buffer = new byte[1024];
                int length;
                while ((length = myInput.read(buffer)) > 0) {
                    myOutput.write(buffer, 0, length);
                }

                //закрываем потоки
                myOutput.flush();
                myOutput.close();
                myInput.close();
            }
        }
        catch (IOException ex){
            Log.d("DataBaseHelper", ex.getMessage());
        }
    }

    public void openDataBase() throws SQLException {
        //открываем БД
        SQLiteDatabase.openDatabase(DB_PATH, null, SQLiteDatabase.OPEN_READONLY);
    }

    //TODO !?!?!??!?!?!?
    /*@Override
    public synchronized void close() {
        if(myDataBase != null)
            myDataBase.close();
        super.close();
    }*/
    // Здесь можно добавить вспомогательные методы для доступа и получения данных из БД
    // вы можете возвращать курсоры через "return myDataBase.query(....)", это облегчит их использование
    // в создании адаптеров для ваших view
}
