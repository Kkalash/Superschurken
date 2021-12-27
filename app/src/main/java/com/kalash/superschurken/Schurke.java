package com.kalash.superschurken;

public class Schurke {
    private String mName;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Schurke(String name, int imageResourceId) {
        mName = name;
        mImageResourceId = imageResourceId;
    }

    public String getName() { return mName; }

    public int getImageResourceId() { return mImageResourceId; }

    public boolean hasImage() { return mImageResourceId != NO_IMAGE_PROVIDED; }
}
