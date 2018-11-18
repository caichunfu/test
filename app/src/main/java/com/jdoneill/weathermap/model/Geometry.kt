package com.jdoneill.weathermap.model

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class Geometry {
    @SerializedName("location")
    @Expose
    var location:Location? = null
}