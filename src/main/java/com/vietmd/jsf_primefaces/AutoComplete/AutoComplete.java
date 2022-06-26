package com.vietmd.jsf_primefaces.AutoComplete;

import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "autoComplete")
public class AutoComplete {

    public List<String> results(String query){
        ArrayList<String> list = new ArrayList<>();

        if(query.equalsIgnoreCase("maidacviet")){
            list.add("India");
            list.add("Australia");
            list.add("Germany");
            list.add("Italy");
            list.add("United States");
            list.add("Russia");
        }else {
            for(int i = 0 ;i  < 10; i++){
                list.add(query+i);
            }
        }

        return list;
    }




}
