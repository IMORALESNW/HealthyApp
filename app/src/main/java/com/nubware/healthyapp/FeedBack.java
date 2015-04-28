package com.nubware.healthyapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by IMORALES on 28/04/2015.
 */
public class FeedBack {

    public long IDFeedBack;
    public long IDProspect;
    public String Name;
    public String KeyD;
    public String Mobile;
    public String Email;
    public String Estatus;

    public static void createTable(SQLiteDatabase database)
    {
        String createTable = "CREATE TABLE Feedback ("
                +" _idFeedBack INTEGER PRIMARY KEY, "
                +" IDProspect integer,"
                +" AdditionalCommentsExperience text,"
                +" LearnLightEnergy text,"
                +" FollowUpSession text,"
                +" LocationOrCitySession text,"
                +" FriendOrFamilyBenefit text,"
                +" LocationOrCityBenefit text,"
                +" AdditionalQuestion text,"
                +" RegistrationDate text,"

                +" Estatus text);";

        database.execSQL(createTable);
    }

    public static long newFeedBack(FeedBack nFeedBack, SQLiteDatabase database)
    {
        ContentValues valuesFeedback = new ContentValues();

        valuesFeedback.put("_idFeedBack",nFeedBack.IDFeedBack);
        valuesFeedback.put("IDProspect",nFeedBack.IDFeedBack);
        valuesFeedback.put("AdditionalCommentsExperience",nFeedBack.IDFeedBack);
        valuesFeedback.put("LearnLightEnergy",nFeedBack.IDFeedBack);
        valuesFeedback.put("FollowUpSession",nFeedBack.IDFeedBack);
        valuesFeedback.put("LocationOrCitySession",nFeedBack.IDFeedBack);
        valuesFeedback.put("FriendOrFamilyBenefit",nFeedBack.IDFeedBack);
        valuesFeedback.put("LocationOrCityBenefit",nFeedBack.IDFeedBack);
        valuesFeedback.put("AdditionalQuestion",nFeedBack.IDFeedBack);
        valuesFeedback.put("RegistrationDate",nFeedBack.IDFeedBack);

        return database.insert("FeedBack",null,valuesFeedback);
    }
}
