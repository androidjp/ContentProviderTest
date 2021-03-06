package com.androidjp.contentprovidertest.providers;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * 提供数据类型等数据
 */
public class MyProviderMetaData {
  
  
    public static final String AUTHORIY = "org.juetion.cp.MyContentProvider";  
    /** 
     * 数据库名称 
     */  
    public static final String DATABASE_NAME = "MyProvider.db";  
    /** 
     * 数据库版本 
     */  
    public static final int DATABASE_VERSION = 1;  
    /** 
     * 表名 
     */  
    public static final String USERS_TABLE_NAME = "users";  
  
    /** 
     * 继承了BaseColumns，所以已经有了_ID 
     */  
    public static final class UserTableMetaData implements BaseColumns {
        /** 
         * 表名 
         */  
        public static final String TABLE_NAME = "users";  
        /** 
         * 访问该ContentProvider的URI 
         */  
        public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORIY + "/users");
        /** 
         * 该ContentProvider所返回的数据类型定义 
         */  
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/org.juetion.user";  
        public static final String CONTENT_TYPE_ITEM = "vnd.android.cursor.item/org.juetion.user";  
        /** 
         * 列名 
         */  
        public static final String USER_NAME = "name";  
        public static final String USER_AGE = "age";  
        /** 
         * 默认的排序方法 
         */  
        public static final String DEFAULT_SORT_ORDER = "_id desc";  
    }  
}  