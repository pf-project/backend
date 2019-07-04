package com.pfproject.api.dto;

import java.io.Serializable;

public class StringDTO implements Serializable {

    private static final long serialVersionUID = -4159366509929151486L;

    private String string;

    public StringDTO() {
    }

    public String getString() {
        return string;
    }

    public void setString(final String string) {
        this.string = string;
    }

}
