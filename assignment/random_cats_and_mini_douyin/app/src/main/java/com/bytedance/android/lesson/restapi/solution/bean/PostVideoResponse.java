package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.18 17:53
 */
public class PostVideoResponse {

    // TODO-C2 (3) Implement your PostVideoResponse Bean here according to the response json

    @SerializedName("success")boolean success;
    @SerializedName("item")Feed item;

    public void setSuccess(boolean s){
        this.success = s;
    }

    public void setItem(Feed s){
        this.item = s;
    }

    public boolean getSuccess(){
        return success;
    }
    public Feed getItem(){
        return item;
    }

}
