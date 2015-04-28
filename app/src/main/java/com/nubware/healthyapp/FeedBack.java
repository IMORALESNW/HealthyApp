package com.nubware.healthyapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by IMORALES on 28/04/2015.
 */
public class FeedBack {

    public long IDFeedBack;
    public long IDProspect;
    public String AdditionalCommentsExperience;
    public String LearnLightEnergy;
    public String FollowUpSession;
    public String LocationOrCitySession;
    public String FriendOrFamilyBenefit;
    public String LocationOrCityBenefit;
    public String AdditionalQuestion;
    public String RegistrationDate;
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
        valuesFeedback.put("IDProspect",nFeedBack.IDProspect);
        valuesFeedback.put("AdditionalCommentsExperience",nFeedBack.AdditionalCommentsExperience);
        valuesFeedback.put("LearnLightEnergy",nFeedBack.LearnLightEnergy);
        valuesFeedback.put("FollowUpSession",nFeedBack.FollowUpSession);
        valuesFeedback.put("LocationOrCitySession",nFeedBack.LocationOrCitySession);
        valuesFeedback.put("FriendOrFamilyBenefit",nFeedBack.FriendOrFamilyBenefit);
        valuesFeedback.put("LocationOrCityBenefit",nFeedBack.LocationOrCityBenefit);
        valuesFeedback.put("AdditionalQuestion",nFeedBack.AdditionalQuestion);
        valuesFeedback.put("RegistrationDate",nFeedBack.RegistrationDate);

        return database.insert("FeedBack",null,valuesFeedback);
    }
}
