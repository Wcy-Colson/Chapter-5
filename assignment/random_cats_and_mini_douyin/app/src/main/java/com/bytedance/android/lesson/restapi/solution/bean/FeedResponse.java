package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:17
 */
public class FeedResponse {

    // TODO-C2 (2) Implement your FeedResponse Bean here according to the response json
    @SerializedName("success")boolean success;
    @SerializedName("feeds") List<Feed> feeds;


    public void setSuccess(boolean s){
        success =s;
    }

    public void setFeeds(List<Feed> s){
        feeds =s ;
    }

    public boolean getSuccess(){
        return success;
    }

    public List<Feed> getFeeds(){
        return feeds;
    }

}
