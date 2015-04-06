package com.nubware.healthyapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.codepond.wizardroid.WizardStep;
import org.codepond.wizardroid.persistence.ContextVariable;

/**
 * Created by ACOLOR on 2015-04-03.
 */
public class ApplicationSummary extends WizardStep {

    @ContextVariable
    private String firstname;

    public ApplicationSummary(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.application_summary, container, false);

        TextView firstNameTv = (TextView) v.findViewById(R.id.lblFirstName);

        firstNameTv.setText(firstname);

        return v;
    }
}
