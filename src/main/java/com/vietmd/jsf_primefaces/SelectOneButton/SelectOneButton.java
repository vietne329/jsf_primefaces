package com.vietmd.jsf_primefaces.SelectOneButton;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "sob")
public class SelectOneButton {
    String option;
    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }
}
