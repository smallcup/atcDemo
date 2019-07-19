package com.icss.autotest.framework.atc.microservice.demo.entity;

public class ProtocolInfoKey {
    private String id;

    private String tbAppInfoId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTbAppInfoId() {
        return tbAppInfoId;
    }

    public void setTbAppInfoId(String tbAppInfoId) {
        this.tbAppInfoId = tbAppInfoId == null ? null : tbAppInfoId.trim();
    }
}