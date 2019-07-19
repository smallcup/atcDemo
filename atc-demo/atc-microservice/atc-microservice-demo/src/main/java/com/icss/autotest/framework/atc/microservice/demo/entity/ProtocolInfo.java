package com.icss.autotest.framework.atc.microservice.demo.entity;

public class ProtocolInfo extends ProtocolInfoKey {
    private String protocolType;

    private String ip;

    private String port;

    private String encryptionType;

    public String getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType == null ? null : protocolType.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port == null ? null : port.trim();
    }

    public String getEncryptionType() {
        return encryptionType;
    }

    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType == null ? null : encryptionType.trim();
    }
}