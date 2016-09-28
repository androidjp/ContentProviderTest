package com.androidjp.client;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

/**
 * Created by androidjp on 16/9/28.
 */

public class Searcher {

    public static void insert(Context context){
        ContentValues contentValues = new ContentValues();
        contentValues.put("name","zhangsan");
        contentValues.put("age",19);
        Uri uri = context.getContentResolver().insert(Uri.parse("content://org.juetion.cp.MyContentProvider/users"),contentValues);
        Log.i("juetion", "insert uri-->" + uri.toString());
    }

    public static void query(Context context){
        Cursor cursor = context.getContentResolver().query(Uri.parse("content://org.juetion.cp.MyContentProvider/users"),
                new String[]{"name", "age"},
                null, null, null);
        while (cursor.moveToNext()) {
            Log.i("juetion", cursor.getString(cursor.getColumnIndex("name")));
        }
    }
}
