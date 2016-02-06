package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;

/**
 * Android version of {@link com.percolate.sdk.dto.MobileAppPushToken}.  Implements {@link Parcelable}
 */
public class MobileAppPushToken extends com.percolate.sdk.dto.MobileAppPushToken implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.mobileAppPushTokenData);
    }

    public MobileAppPushToken() {
    }

    protected MobileAppPushToken(Parcel in) {
        this.mobileAppPushTokenData = (com.percolate.sdk.dto.MobileAppPushTokenData) in.readSerializable();
    }

    public static final Creator<MobileAppPushToken> CREATOR = new Creator<MobileAppPushToken>() {
        public MobileAppPushToken createFromParcel(Parcel source) {
            return new MobileAppPushToken(source);
        }

        public MobileAppPushToken[] newArray(int size) {
            return new MobileAppPushToken[size];
        }
    };
}
