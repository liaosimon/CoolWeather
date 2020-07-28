package com.example.liaomingyang.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liaomingyang on 2020/7/26.
 */

public class Now {

  @SerializedName("tmp")
  public String temperature;

  @SerializedName("cond")
  public More more;

  public class More {
    @SerializedName("txt")
    public String info;
  }
}
