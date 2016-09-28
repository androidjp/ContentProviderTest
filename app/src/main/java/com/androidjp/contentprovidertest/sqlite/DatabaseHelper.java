package com.androidjp.contentprovidertest.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.androidjp.contentprovidertest.providers.MyProviderMetaData;

/**
 * Created by androidjp on 16/9/28.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final int VERSION = 1;

    /**
     * 在SQLiteOpenHelper的子类中，必须有该构造函数
     *
     * @param context activity对象
     * @param name    表名
     * @param factory
     * @param version 版本
     */
    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public DatabaseHelper(Context context, String name, int version) {
        this(context, name, null, version);
    }

    public DatabaseHelper(Context context, String name) {
        this(context, name, VERSION);
    }

    /**
     * 该函数在第一次创建时执行，实际上是第一次得到SQLiteDatabase对象的时候
     *
     * @param db
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i("juetion", "create a Database");
        db.execSQL("create table " + MyProviderMetaData.UserTableMetaData.TABLE_NAME
                + "(" + MyProviderMetaData.UserTableMetaData._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                MyProviderMetaData.UserTableMetaData.USER_NAME + " varchar(20)," +
                MyProviderMetaData.UserTableMetaData.USER_AGE + " int)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.i("juetion", "update Database");
//        db.execSQL("alter user t1 add age int");
    }

}
