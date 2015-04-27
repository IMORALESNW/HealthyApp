package com.nubware.healthyapp;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by IMORALES on 27/04/2015.
 */
public class Prospect {

    private long _idProspect;
    public int IDDemonstrator;
    public int IDEvent;
    public int IDSubEvent;
    public int IDChair;
    public String Consecutive;
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
    public int SendEmailFeedback;//Boolean (0-1)
    public int ReadReleaseAndWaiver;//Boolean (0-1)
    public int SyncCloud;//Boolean (0-1)
    public int SyncInfusionSoft;//Boolean (0-1)
    public String PathPDF;
    public String PathApplicantSignature;
    public String PathWitnessSignature;
    public int RegistrationDate;//UnixTime (number of seconds since midnight 1 January 1970 UTC)
    public int SyncRegistrationDate;//UnixTime (number of seconds since midnight 1 January 1970 UTC)
    public String SessionStartDateTime;
    public String SessionEndDateTime;
    public String Notes;
    public String Estatus;

    public static void create(SQLiteDatabase database)
    {
        String createTable = "create table if not exist Prospect ("
                +" _idProspect primary key autoincrement, "
                +" IDDemonstrator text,"
                +" IDEvent text,"
                +" IDSubEvent text,"
                +" IDChair text,"
                +" Consecutive text,"
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
                +" SendEmailRegistered text,"
                +" SendEmailFeedback text,"
                +" ReadReleaseAndWaiver text,"
                +" SyncCloud text,"
                +" SyncInfusionSoft text,"
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
}
