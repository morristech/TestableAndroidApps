package it.cosenonjaviste.testableandroidapps;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class WelcomeDialog extends DialogFragment {

    @Override public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity()).setTitle(R.string.app_name).setMessage(R.string.welcome).create();
    }
}
