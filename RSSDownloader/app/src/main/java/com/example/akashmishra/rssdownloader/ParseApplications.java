package com.example.akashmishra.rssdownloader;

import java.util.ArrayList;

/**
 * Created by akash.mishra on 2/12/16.
 */

public class ParseApplications {
    private static final String TAG = "ParseApplications";
    private ArrayList<FeedEntry> applications;

    public ParseApplications() {
        this.applications = new ArrayList<>();
    }

    public ArrayList<FeedEntry> getApplications() {
        return applications;
    }

    public boolean parse(String xmlData) {
        boolean status = true;
        FeedEntry currentRecord;
        boolean inEntry = false;
        String textValue = "";

        try {

        } catch (Exception e) {
            status = false;
            e.printStackTrace();
        }

        return status;
    }
}
