package com.pagorithm.com.smsnotificationserver.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by td-engagia
 */
public class ServerDatabase extends SQLiteOpenHelper{
    public static final String DB_NAME = "EngagiaDb.sqlite";
    private static final int DB_VERSION = 1;

    private static ServerDatabase mDbInstance = null;

    private ServerDatabase(Context context){
        super(context,DB_NAME,null,DB_VERSION);
    }

    public static ServerDatabase getInstance(Context context){
        if(mDbInstance == null){
            mDbInstance = new ServerDatabase(context.getApplicationContext());
        }
        return mDbInstance;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
