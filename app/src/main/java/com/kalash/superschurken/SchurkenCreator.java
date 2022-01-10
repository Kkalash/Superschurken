package com.kalash.superschurken;

import android.os.Parcel;
import android.os.Parcelable;

public class SchurkenCreator implements Parcelable.Creator<SuperSchurke> {
    public SuperSchurke createFromParcel(Parcel source) {
        return new SuperSchurke(source);
    }

    public SuperSchurke[] newArray(int size) {
        return new SuperSchurke[size];
    }
}
