package com.nubware.healthyapp;

import android.appwidget.AppWidgetHost;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.codepond.wizardroid.WizardStep;
import org.codepond.wizardroid.persistence.ContextVariable;

/**
 * Created by ACOLOR on 2015-04-03.
 */
public class ApplicationSummary extends WizardStep {

    @ContextVariable
    private String firstname;
    @ContextVariable
    private String lastname;
    @ContextVariable
    private String profession;
    @ContextVariable
    private String street;
    @ContextVariable
    private String city;
    @ContextVariable
    private String province;
    @ContextVariable
    private String postalcode;
    @ContextVariable
    private String homephone;
    @ContextVariable
    private String workphone;
    @ContextVariable
    private String mobile;
    @ContextVariable
    private String email;
    @ContextVariable
    private String receiveinfo;

    public ApplicationSummary(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.application_summary, container, false);

        //TextView firstNameTv = (TextView) v.findViewById(R.id.lblFirstName);

        //firstNameTv.setText(firstname);

        SQLiteHelper sqlHelper = new SQLiteHelper(v.getContext());

        sqlHelper.create();

        TBProspect.newProspect(this.getProspectData(), sqlHelper.getWritableDatabase(), true);

        saveInterestedConcepts(sqlHelper.getWritableDatabase());
        return v;
    }

    public TBProspect getProspectData()
    {
        TBProspect dataProspect = new TBProspect();

        dataProspect.FirstName = firstname;
        dataProspect.LastName = lastname;
        dataProspect.Profession = profession;
        dataProspect.Street = street;
        dataProspect.City = province;
        dataProspect.PostalCode = postalcode;
        dataProspect.DaytimePhone = homephone;
        dataProspect.EveningPhone = workphone;
        dataProspect.Mobile = mobile;
        dataProspect.Email = email;
        //dataProspect.ReceiveInfo

        return dataProspect;
    }

    public void saveInterestedConcepts(SQLiteDatabase database)
    {
        View curretView = getView();
        RadioGroup rdioPhysical, rdioSkin, rdioWeigth, rdioWound;
        TBInterestedConcepts InterPhysical;

        rdioPhysical = (RadioGroup)curretView.findViewById(R.id.radioPhysical);

        InterPhysical = TBInterestedConcepts.getInterestedConcept(rdioPhysical,(RadioButton)curretView.findViewById(rdioPhysical.getCheckedRadioButtonId()));

        TBInterestedConcepts.newInterestedConcept(InterPhysical,database);
    }


}
