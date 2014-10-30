package com.three_dr.services.android.lib.drone.property;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by fhuya on 10/28/14.
 */
public class Parameter implements Parcelable {

    private String name;
    private double value;
    private int type;

    private String displayName;
    private String description;

    private String units;
    private String range;
    private String values;

    public Parameter(String name, double value, int type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value){
        this.value = value;
    }

    public int getType() {
        return type;
    }

    public void setType(int type){
        this.type = type;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeDouble(this.value);
        dest.writeInt(this.type);
        dest.writeString(this.displayName);
        dest.writeString(this.description);
        dest.writeString(this.units);
        dest.writeString(this.range);
        dest.writeString(this.values);
    }

    private Parameter(Parcel in) {
        this.name = in.readString();
        this.value = in.readDouble();
        this.type = in.readInt();
        this.displayName = in.readString();
        this.description = in.readString();
        this.units = in.readString();
        this.range = in.readString();
        this.values = in.readString();
    }

    public static final Creator<Parameter> CREATOR = new Creator<Parameter>() {
        public Parameter createFromParcel(Parcel source) {
            return new Parameter(source);
        }

        public Parameter[] newArray(int size) {
            return new Parameter[size];
        }
    };
}
