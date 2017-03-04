package com.whoame.dich.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.whoame.dich.Data.MainContract.CategoryList;


public class MainDbHelper extends SQLiteOpenHelper {

    public static final String LOG_TAG = MainDbHelper.class.getSimpleName();

    /**
     * Имя файла базы данных
     */
    private static final String DATABASE_NAME = "mainl.db";

    /**
     * Версия базы данных. При изменении схемы увеличить на единицу
     */
    private static final int DATABASE_VERSION = 1;

    /**
     * Конструктор {@link MainDbHelper}.
     *
     * @param context Контекст приложения
     */
    public MainDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     * Вызывается при создании базы данных
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        // Строка для создания таблицы
        String SQL_CREATE_GUESTS_TABLE = "CREATE TABLE " + CategoryList.TABLE_NAME + " ("
                + MainContract.CategoryList._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + CategoryList.URL_IMAGE_FIRST + " TEXT NOT NULL, "
                + CategoryList.CATEGORY_NAME + " TEXT NOT NULL, ";

        // Запускаем создание таблицы
        db.execSQL(SQL_CREATE_GUESTS_TABLE);
    }

    /**
     * Вызывается при обновлении схемы базы данных
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Запишем в журнал
       /* Log.w("SQLite", "Обновляемся с версии " + oldVersion + " на версию " + newVersion);

        // Удаляем старую таблицу и создаём новую
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_TABLE);
        // Создаём новую таблицу
        onCreate(db);*/
    }
}