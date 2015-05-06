package com.nubware.healthyapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by IMORALES on 05/05/2015.
 */
public class TBInterestedConcepts {

    private long _id;//IdTablet_InterestedConcept

    public String IDInterestedConcept;
    public String IDProspect;
    public String Description;
    public int Result;


    public enum Concepts
    {
        Physical_Training_and_Exercise,
        Skin_Rejuvenation,
        Weight_Loss_Body_Contouring
    }

    public static void create(SQLiteDatabase database)
    {
        String createTable = "create table TBInterestedConcepts("
                +" _id INTEGER primary key autoincrement, "
                +" IDInterestedConcept text,"
                +" IDProspect text,"
                +" Description text,"
                +" Result int)";

        database.execSQL(createTable);

    }

    public static long newInterestedConcept(TBInterestedConcepts tbInterestedConcepts, SQLiteDatabase database)
    {
        ContentValues values = new ContentValues();

        values.put("IDInterestedConcept", tbInterestedConcepts.IDInterestedConcept);
        values.put("IDProspect", tbInterestedConcepts.IDProspect);
        values.put("Description", tbInterestedConcepts.Description);
        values.put("Result", tbInterestedConcepts.Result);

        return database.insert("TBProspect",null,values);
    }

    public static TBInterestedConcepts getInterestedConcept(RadioGroup radioGroup, RadioButton radioButton)
    {
        String strRes =  "";
        TBInterestedConcepts nTBInterestedConcepts = new TBInterestedConcepts();

        switch (radioGroup.getId())
        {
            case R.id.radioPhysical:
                nTBInterestedConcepts.Description = "Physical Training & Exercise";
            break;

            case R.id.radioSkin:
                nTBInterestedConcepts.Description = "Skin Rejuvenation";
            break;

            case R.id.radioWeight:
                nTBInterestedConcepts.Description = "Weight Loss/Body Contouring";
            break;

            case R.id.radioWound:
                nTBInterestedConcepts.Description = "Wound Healing";
            break;
        }

        nTBInterestedConcepts.Result = getResult(radioButton.getText().toString());

        return nTBInterestedConcepts;
    }

    public static int getResult(String Result)
    {
       return Result.toUpperCase() == "YES" ? 1:0 ;
    }
}
