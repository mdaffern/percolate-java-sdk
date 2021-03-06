package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.percolate.sdk.dto.V5Meta;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.CampaignSections}.  Implements {@link Parcelable}
 */
public class CampaignSections extends com.percolate.sdk.dto.CampaignSections implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.meta);
        dest.writeList(this.data);
        dest.writeMap(this.extraFields);
    }

    public CampaignSections() {
    }

    protected CampaignSections(Parcel in) {
        this.meta = (V5Meta) in.readSerializable();
        this.data = new ArrayList<>();
        in.readList(this.data, CampaignSectionData.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Parcelable.Creator<CampaignSections> CREATOR = new Parcelable.Creator<CampaignSections>() {
        @Override
        public CampaignSections createFromParcel(Parcel source) {
            return new CampaignSections(source);
        }

        @Override
        public CampaignSections[] newArray(int size) {
            return new CampaignSections[size];
        }
    };
}

