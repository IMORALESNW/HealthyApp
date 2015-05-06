package com.nubware.healthyapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by IMORALES on 28/04/2015.
 */
public class TBDemonstrator {
    public String IDDemonstrator;
    public String Name;
    public String KeyD;
    public String Mobile;
    public String Email;
    public String Estatus;


    public static void createTable(SQLiteDatabase database)
    {
        String createTable = "CREATE TABLE Demonstrator ("
                +" _idDemonstrator INTEGER PRIMARY KEY, "
                +" Name text,"
                +" KeyD text,"
                +" Mobile text,"
                +" Email text,"
                +" Estatus text);";

        database.execSQL(createTable);
    }

    public static void newDemonstrator(TBDemonstrator nDemostrator, SQLiteDatabase database)
    {
        ContentValues valuesDemos = new ContentValues();

        valuesDemos.put("_idDemonstrator",nDemostrator.IDDemonstrator);
        valuesDemos.put("Name",nDemostrator.Name);
        valuesDemos.put("KeyD",nDemostrator.KeyD);
        valuesDemos.put("Mobile",nDemostrator.Mobile);
        valuesDemos.put("Email",nDemostrator.Email);
        valuesDemos.put("Estatus",nDemostrator.Estatus);

        long newRowID = database.insert("TBDemonstrator",null,valuesDemos);
    }
}
