package com.tradevan.ca.solid.dip.question;

/**
 * 增加一個共用api介面.
 */
public interface WeatherApi {

    /**
     * 回傳攝氏溫度.
     *
     * @return 攝氏溫度
     */
    double getTemperature();

    void setTemperature(double d);
}
