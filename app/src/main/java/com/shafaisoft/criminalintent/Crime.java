package com.shafaisoft.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by shafai on 5/15/16.
 */
public class  Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime(){
        mId = UUID.randomUUID();
        mDate = new Date();
    }


    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public UUID getId()

    {
        return mId;
    }  

    public String getTitle()

    {
        return mTitle;
    }


    public void setTitle(String title){
        mTitle = title;
    }
}
