package com.nubware.healthyapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by IMORALES on 27/04/2015.
 */
public class SQLiteHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Healthy.db";
    private static final int DATABASE_VERSION = 1;

    public SQLiteHelper(Context context)
    {
        super(context, DATABASE_NAME, null,DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db)
    {
        Prospect.create(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void open()
    {
        getWritableDatabase();
    }

    public void create()
    {
        open();
    }
}
