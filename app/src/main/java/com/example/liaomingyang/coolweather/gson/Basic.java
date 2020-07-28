package com.example.liaomingyang.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liaomingyang on 2020/7/26.
 */

public class Basic {

  @SerializedName("city")
  public String cityName;

  @SerializedName("id")
  public String weatherId;

  public Update update;

  public class Update {
    @SerializedName("loc")
    public String updateTime;
  }

}
