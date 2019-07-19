package com.icss.autotest.framework.atc.microservice.demo.entity;

public class TbEnvironmentInfo {
    private String id;

    private String dbType;

    private String dbIp;

    private String dbPort;

    private String dbUsername;

    private String dbPassword;

    private String tbEnvironmentInfocol;

    private String tbAppInfoId;

    private String dbName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType == null ? null : dbType.trim();
    }

    public String getDbIp() {
        return dbIp;
    }

    public void setDbIp(String dbIp) {
        this.dbIp = dbIp == null ? null : dbIp.trim();
    }

    public String getDbPort() {
        return dbPort;
    }

    public void setDbPort(String dbPort) {
        this.dbPort = dbPort == null ? null : dbPort.trim();
    }

    public String getDbUsername() {
        return dbUsername;
    }

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername == null ? null : dbUsername.trim();
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword == null ? null : dbPassword.trim();
    }

    public String getTbEnvironmentInfocol() {
        return tbEnvironmentInfocol;
    }

    public void setTbEnvironmentInfocol(String tbEnvironmentInfocol) {
        this.tbEnvironmentInfocol = tbEnvironmentInfocol == null ? null : tbEnvironmentInfocol.trim();
    }

    public String getTbAppInfoId() {
        return tbAppInfoId;
    }

    public void setTbAppInfoId(String tbAppInfoId) {
        this.tbAppInfoId = tbAppInfoId == null ? null : tbAppInfoId.trim();
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName == null ? null : dbName.trim();
    }
}