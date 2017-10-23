package com.bignerdranch.android.criminalintent;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;//Changed from android.app.dialogfragment. hopefully ok
import android.support.v7.app.AlertDialog;

/**
 * Created by battl on 10/23/2017.
 */

public class DatePickerFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        return new AlertDialog.Builder(getActivity()).setTitle(R.string.date_picker_title).setPositiveButton(android.R.string.ok, null).create();
        //positivebutton is what prompts dialog box.

    }
}
