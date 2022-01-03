package com.kalash.superschurken;

// import android.os.Parcel;
// import android.os.Parcelable;

public class Schurke {
    private String[] mName;
    private String mAlias;
    private String mUniverse;
    private String mRole;
    private String[] mCapabilities;
    private String[] mHobby;
    private String mStatus;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Schurke(String[] name,
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

/*    @Override
    public int describeContents() {
        return hashCode();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mName);
        parcel.writeInt(mImageResourceId);

    }*/

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
