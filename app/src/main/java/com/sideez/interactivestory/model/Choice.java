/*
 * Copyright (c) 2015. Sideez Inc.
 */

package com.sideez.interactivestory.model;

/**
 * Created by sideez on 2015-06-25.
 */
public class Choice {
    private String mText; // Text for choice
    private int mNextPage; // Page to go to

    public Choice(String text, int nextPage) {
        mText = text;
        mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
