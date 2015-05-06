package com.nubware.healthyapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by IMORALES on 27/04/2015.
 */
public class TBProspect {

    private static long tabletConsecutive = 0;

    //region TBProspect variables

    private long _id;//IdTabletProspect
    public String IDProspect;
    public int IDDemonstrator;
    public int IDEvent;
    public int IDSubEvent;
    public int IDChair;
    public int Consecutive;
    public String FirstName;
    public String LastName;
    public String Profession;
    public String Street;
    public String City;
    public String Prov;
    public String PostalCode;
    public String DaytimePhone;
    public String EveningPhone;
    public String Mobile;
    public String Email;
    public String Pregnant;
    public String CancerTreatments;
    public String LightSensitive;
    public String Observations;
    public String AreaConcernOne;
    public String AreaConcernTwo;
    public String AreaConcernThree;
    public String Initials;
    public String PrintName;
    public String SignatureProspect;
    public String NameWitness;
    public String SignatureWitness;
    public String SendEmailRegistered;
    public boolean SendEmailFeedback;//Boolean (0-1)
    public boolean ReadReleaseAndWaiver;//Boolean (0-1)
    public boolean SyncCloud;//Boolean (0-1)
    public boolean SyncInfusionSoft;//Boolean (0-1)
    public String PathPDF;
    public String PathApplicantSignature;
    public String PathWitnessSignature;
    public String RegistrationDate;//UnixTime (number of seconds since midnight 1 January 1970 UTC)
    public String SyncRegistrationDate;//UnixTime (number of seconds since midnight 1 January 1970 UTC)
    public String SessionStartDateTime;
    public String SessionEndDateTime;
    public String Notes;
    public String Estatus;
    //endregion

    public static void create(SQLiteDatabase database)
    {
        String createTable = "create table TBProspect ("
                +" _id INTEGER primary key autoincrement, "
                +" IDProspect text,"
                +" IDDemonstrator text,"
                +" IDEvent text,"
                +" IDSubEvent text,"
                +" IDChair text,"
                +" Consecutive int,"
                +" FirstName text,"
                +" LastName text,"
                +" Profession text,"
                +" Street text,"
                +" City text,"
                +" Prov text,"
                +" PostalCode text,"
                +" DaytimePhone text,"
                +" EveningPhone text,"
                +" Mobile text,"
                +" Email text,"
                +" Pregnant text,"
                +" Observations text,"
                +" AreaConcernOne text,"
                +" AreaConcernTwo text,"
                +" AreaConcernThree text,"
                +" Initials text,"
                +" SignatureProspect text,"
                +" NameWitness text,"
                +" SignatureWitness text,"
                +" SendEmailRegistered int,"
                +" SendEmailFeedback int,"
                +" ReadReleaseAndWaiver int,"
                +" SyncCloud int,"
                +" SyncInfusionSoft int,"
                +" PathPDF text,"
                +" PathApplicantSignature text,"
                +" RegistrationDate text,"
                +" SyncRegistrationDate text,"
                +" SessionStartDateTime text,"
                +" SessionEndDateTime text,"
                +" Notes text,"
                +" Estatus text);";

        database.execSQL(createTable);
    }

    private static String getIDProspect()
    {
        String strIDProspect = "IDProspect";

        return  strIDProspect;
    }

    private static String getIDDemostrator()
    {
        String strIDDemonstrator = "IDDemostrator";

        return  strIDDemonstrator;
    }

    private static String getIDEvent()
    {
        String strIDEvent = Helps.strEvent;

        return  strIDEvent;
    }

    private static String getIDSubEvent()
    {
        String strIDSubEvent = Helps.strSubEvent;

        return  strIDSubEvent;
    }


    public static long newProspect(TBProspect nProspect, SQLiteDatabase database, boolean IsLocal)
    {
        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();

        values.put("IDProspect", getIDProspect());
        values.put("IDDemonstrator", getIDDemostrator());
        values.put("IDEvent", getIDEvent());
        values.put("IDSubEvent", getIDSubEvent());
        values.put("IDChair", nProspect.IDChair);

        values.put("Consecutive", nProspect.Consecutive);
        values.put("FirstName", nProspect.FirstName);
        values.put("LastName", nProspect.LastName);
        values.put("Profession", nProspect.Profession);
        values.put("Street", nProspect.Street);
        values.put("City", nProspect.City);
        values.put("Prov", nProspect.Prov);
        values.put("PostalCode", nProspect.PostalCode);
        values.put("DaytimePhone", nProspect.DaytimePhone);
        values.put("EveningPhone", nProspect.EveningPhone);
        values.put("Mobile", nProspect.Mobile);
        values.put("Email", nProspect.Email);
        values.put("Pregnant", nProspect.Pregnant);
        values.put("Observations", nProspect.Observations);
        values.put("AreaConcernOne", nProspect.AreaConcernOne);
        values.put("AreaConcernTwo", nProspect.AreaConcernTwo);
        values.put("AreaConcernThree", nProspect.AreaConcernThree);
        values.put("Initials", nProspect.Initials);
        values.put("SignatureProspect", nProspect.SignatureProspect);
        values.put("NameWitness", nProspect.NameWitness);
        values.put("SignatureWitness", nProspect.SignatureWitness);
        values.put("SendEmailRegistered", nProspect.SendEmailRegistered);
        values.put("SendEmailFeedback", nProspect.SendEmailFeedback);
        values.put("ReadReleaseAndWaiver", nProspect.ReadReleaseAndWaiver);
        values.put("SyncCloud", nProspect.SyncInfusionSoft);
        values.put("SyncInfusionSoft", nProspect.SyncInfusionSoft);
        values.put("PathPDF", nProspect.PathPDF);
        values.put("PathApplicantSignature", nProspect.PathApplicantSignature);
        values.put("RegistrationDate", nProspect.RegistrationDate);
        values.put("SyncRegistrationDate", nProspect.SyncRegistrationDate);
        values.put("SessionStartDateTime", nProspect.SessionStartDateTime);
        values.put("SessionEndDateTime", nProspect.SessionEndDateTime);
        values.put("Notes", nProspect.AreaConcernOne);
        values.put("Estatus", nProspect.Estatus);

        if(IsLocal)
            tabletConsecutive++;

        return database.insert("TBProspect",null,values);
    }

}
