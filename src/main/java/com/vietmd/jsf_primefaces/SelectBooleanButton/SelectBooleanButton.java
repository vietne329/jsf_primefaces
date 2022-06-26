package com.vietmd.jsf_primefaces.SelectBooleanButton;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name = "sbbd")
public class SelectBooleanButton {
    private boolean check;

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public void addMessage(){
        String detail = check ? "Accepted" : "Not Accepted";
        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(detail));

    }
}
