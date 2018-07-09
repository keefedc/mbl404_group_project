package edu.phoenix.mbl404.mbl404_group_project;

import java.util.ArrayList;

public class PlaceInfoContainer {

    private ArrayList<PlaceInfo> dataList;

    public PlaceInfoContainer(){
        dataList = new ArrayList<>();
    }

    public void addPlace(PlaceInfo data){
        this.dataList.add(data);
    }

    public PlaceInfo getPlace(int i){
        return this.dataList.get(i);
    }

    public ArrayList<PlaceInfo> getList(){
        return this.dataList;
    }

}
