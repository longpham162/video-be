package com.interview.security.jwt.utils;

public enum JwtClaimKey {
    ID("id"),
    EMAIL("email");

    private String value;

    private JwtClaimKey(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
