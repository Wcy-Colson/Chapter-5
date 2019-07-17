package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

import java.util.Locale;

/**
 * @author Xavier.S
 * @date 2019.01.17 18:08
 */
public class Cat {

    // TODO-C1 (1) Implement your Cat Bean here according to the response json

    @SerializedName("url")private String url;
    @SerializedName("width")private int width;
    @SerializedName("height")private int height;

    public String getUrl(){
        return url;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
}
