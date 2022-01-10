package com.kalash.superschurken;

import android.os.Parcel;
import android.os.Parcelable;

public class SuperSchurke implements Parcelable {
    private String[] mName;
    private String mAlias;
    private String mUniverse;
    private String mRole;
    private String[] mCapabilities;
    private String[] mHobby;
    private String mStatus;
    private int mImageResourceId;
    private static final int NO_IMAGE_PROVIDED = -1;

    public SuperSchurke(String[] name,
                        String alias,
                        String universe,
                        String role,
                        String[] capabilities,
                        String[] hobby,
                        String status,
                        int imageResourceId) {
        mName = name;
        mAlias = alias;
        mUniverse = universe;
        mRole = role;
        mCapabilities = capabilities;
        mHobby = hobby;
        mStatus = status;
        mImageResourceId = imageResourceId;
    }

    public SuperSchurke(Parcel in) {
        mName = in.createStringArray();
        mAlias = in.readString();
        mUniverse = in.readString();
        mRole = in.readString();
        mCapabilities = in.createStringArray();
        mHobby = in.createStringArray();
        mStatus = in.readString();
        mImageResourceId = in.readInt();
    }

    public static final Creator<SuperSchurke> CREATOR = new SchurkenCreator();

    @Override
    public int describeContents() {
        return hashCode();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(mName);
        parcel.writeString(mAlias);
        parcel.writeString(mUniverse);
        parcel.writeString(mRole);
        parcel.writeStringArray(mCapabilities);
        parcel.writeStringArray(mHobby);
        parcel.writeString(mStatus);
        parcel.writeInt(mImageResourceId);
    }

    public String[] getName() { return mName; }

    public String getAlias() { return mAlias; }

    public String getUniverse() { return mUniverse; }

    public String getRole() { return mRole; }

    public String[] getCapabilities() { return mCapabilities; }

    public String[] getHobby() { return mHobby; }

    public String getStatus() { return mStatus; }

    public int getImageResourceId() { return mImageResourceId; }

    public boolean hasImage() { return mImageResourceId != NO_IMAGE_PROVIDED; }
}
