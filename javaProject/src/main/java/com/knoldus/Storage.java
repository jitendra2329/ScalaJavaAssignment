package com.knoldus;

import java.util.ArrayList;

public class Storage {
    ArrayList<Double> list = new ArrayList<>();

    public void addElement(double element){
       list.add(element);
    }


    public boolean removeElement(Object element) {
        list.remove(element);
        return false;
    }

    public void removeAll(){
        list.clear();
    }

    public boolean checkIfContains(double element){
        return list.contains(element);
    }




}
