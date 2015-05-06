package com.nubware.healthyapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.codepond.wizardroid.WizardFlow;

import org.codepond.wizardroid.WizardFragment;

/**
 * Created by ACOLOR on 2015-04-28.
 */
public class CustomWizard {
    //You must have an empty constructor according to Fragment documentation
    public CustomWizard() {
    }
    /**
     * Binding the layout and setting buttons hooks
     *//*
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View wizardLayout = inflater.inflate(R.layout.wizard, container, false);
        nextButton = (Button) wizardLayout.findViewById(R.id.wizard_next_button);
        nextButton.setOnClickListener(this);
        previousButton = (Button) wizardLayout.findViewById(R.id.wizard_previous_button);
        previousButton.setOnClickListener(this);

        return wizardLayout;
    }

    //You must override this method and create a wizard flow by
    //using WizardFlow.Builder as shown in this example
    @Override
    public WizardFlow onSetup() {

        return new org.codepond.wizardroid.WizardFlow.Builder()
                .setActivity(this)
                //.setContainerId(R.id.step_container)
                .addStep(ApplicationStep1.class)
                .create();
    }

    *//**
     * Triggered when the wizard is completed.
     * Overriding this method is optional.
     *//*
    @Override
    public void onWizardComplete() {
        //Do whatever you want to do once the Wizard is complete
        //in this case I just close the activity, which causes Android
        //to go back to the previous activity.
        getActivity().finish();
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.wizard_next_button:
                //Tell the wizard to go to next step
                wizard.goNext();
                break;
            case R.id.wizard_previous_button:
                //Tell the wizard to go back one step
                wizard.goBack();
                break;
        }
        updateWizardControls();
    }

    *//**
     * Updates the UI according to current step position
     *//*
    private void updateWizardControls() {
        previousButton.setEnabled(!wizard.isFirstStep());
        nextButton.setText(wizard.isLastStep()
                ? R.string.action_finish
                : R.string.action_next);
    }*/
}
