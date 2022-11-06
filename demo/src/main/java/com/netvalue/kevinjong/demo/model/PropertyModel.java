package com.netvalue.kevinjong.demo.model;

public class PropertyModel {
    private int appVersion;
    private int dbVersion;

    public PropertyModel() {
    }

    public PropertyModel(int appVersion, int dbVersion) {
        this.appVersion = appVersion;
        this.dbVersion = dbVersion;
    }

    public int getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(int appVersion) {
        this.appVersion = appVersion;
    }

    public int getDbVersion() {
        return dbVersion;
    }

    public void setDbVersion(int dbVersion) {
        this.dbVersion = dbVersion;
    }
}
