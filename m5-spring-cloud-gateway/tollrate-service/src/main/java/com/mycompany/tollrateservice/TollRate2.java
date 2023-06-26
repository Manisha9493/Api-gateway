package com.mycompany.tollrateservice;

public class TollRate2 {

    private Integer stationId;
    private Float currentRate;
    private String timestamp;
    private Boolean isBaseRate;
    

    public TollRate2() {
    }

    public TollRate2(Integer stationId, Float currentRate, String timestamp, Boolean isBaseRate) {
        this.stationId = stationId;
        this.currentRate = currentRate;
        this.timestamp = timestamp;
        this.isBaseRate=isBaseRate;
    }

    public Boolean getIsBaseRate() {
        return isBaseRate;
    }

    public Integer getStationId() {
        return stationId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Float getCurrentRate() {
        return currentRate;
    }

    public void setCurrentRate(Float currentRate) {
        this.currentRate = currentRate;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public void setIsBaseRate(Boolean isBaseRate) {
        this.isBaseRate = isBaseRate;
    }

}
