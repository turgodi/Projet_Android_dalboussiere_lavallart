
package com.example.i345881.myapplication.Entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BoilVolume {

    @SerializedName("value")
    @Expose
    private Integer value;
    @SerializedName("unit")
    @Expose
    private String unit;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

}
