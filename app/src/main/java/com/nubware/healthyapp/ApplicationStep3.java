package com.nubware.healthyapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.codepond.wizardroid.WizardStep;

/**
 * Created by ACOLOR on 2015-05-02.
 */
public class ApplicationStep3 extends WizardStep {
    public ApplicationStep3(){};

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        final View v = inflater.inflate(R.layout.application_step3, container, false);

        return v;
    }

    @Override
    public void onExit(int exitCode){
        switch (exitCode){
            case WizardStep.EXIT_NEXT:
                //bindDataFields();
                break;
            case WizardStep.EXIT_PREVIOUS:
                break;
        }
    }
}
