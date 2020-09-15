package com.example.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage1 {
    public static void display(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
