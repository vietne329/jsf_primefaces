package com.vietmd.jsf_primefaces.SelectCheckBoxMenu;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "checkboxView")
public class Color {
    private String[] selectedColors;
    private String[] selectedColors2;
    private List<String> colors;
    private List<SelectItem> primaryColors;
    private String[] selectedPrimaryColors;

    @PostConstruct
    public void init(){
        colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Pink");
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Violet");
        colors.add("Yellow");

        primaryColors = new ArrayList<SelectItem>();
        SelectItemGroup pc = new SelectItemGroup("Primary Colors");
        pc.setSelectItems(new SelectItem[]{
                new SelectItem("Red","RED"),
                new SelectItem("Green","GREEN"),
                new SelectItem("Blue","BLUE")
        });

        SelectItemGroup rc = new SelectItemGroup("Rest Colors");
        pc.setSelectItems(new SelectItem[]{
                new SelectItem("Pink","PINK"),
                new SelectItem("Yellow","YELLOW"),
                new SelectItem("Purple","PURPLE")
        });

        primaryColors.add(pc);
        primaryColors.add(rc);

    }

    public String[] getSelectedColors() {
        return selectedColors;
    }

    public void setSelectedColors(String[] selectedColors) {
        this.selectedColors = selectedColors;
    }

    public String[] getSelectedColors2() {
        return selectedColors2;
    }

    public void setSelectedColors2(String[] selectedColors2) {
        this.selectedColors2 = selectedColors2;
    }

    public List<String> getColors() {
        return colors;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public List<SelectItem> getPrimaryColors() {
        return primaryColors;
    }

    public void setPrimaryColors(List<SelectItem> primaryColors) {
        this.primaryColors = primaryColors;
    }

    public String[] getSelectedPrimaryColors() {
        return selectedPrimaryColors;
    }

    public void setSelectedPrimaryColors(String[] selectedPrimaryColors) {
        this.selectedPrimaryColors = selectedPrimaryColors;
    }
}
