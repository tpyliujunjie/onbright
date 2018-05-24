package com.bright.apollo.enums;

public enum AliCmdTypeEnum {
    UPLOAD("upload");

    private String cmd;

    public String getCmd() {
        return cmd;
    }

    private AliCmdTypeEnum(String v) {
        this.cmd = v;
    }
}
