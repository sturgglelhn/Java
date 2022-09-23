package com.javase.collection.FanXing;

public class City {
    private String name;    //名称
    private String shortName;    //简称
    private String localtion;    //所属区域

    public void intro(){
        System.out.println("名称："+name+",简称："+shortName+",所属地区："+localtion);
    }

    public City() {
    }

    public City(String name, String shortName, String localtion) {
        this.name = name;
        this.shortName = shortName;
        this.localtion = localtion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLocaltion() {
        return localtion;
    }

    public void setLocaltion(String localtion) {
        this.localtion = localtion;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                ", location='" + localtion + '\'' +
                '}';
    }
}
