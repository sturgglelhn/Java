package com.javase.Array.homework;

public class Room {
    /*
    * 房间编号
    * 1楼：101 102 103 104 105
    * 2楼：201 202 203 204 205
    * 3楼：301 302 303 304 305
    * */
    private int no;
    /*
     * 房间类型：标准件  单人间  总统套房
     * */
    private String type;
    /*
     * 房间状态
     * true：表示空闲，房间可以被预定
     * false：表示占用，房间不能被预定。
     * */
    private boolean status;

    public Room() {
    }

    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    //set and get
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //equals方法重写
    // equals是用来比较两个对象是否相等的。
    //至于怎么比较，这个还是程序员自己定。
    //你认为两个房间的编号相同，就表示同一个方法，那么你写代码比较房间编号就行。
    public boolean eqauls(Object obj){
        if(obj == null || !(obj instanceof Room))   return false;
        if(this == obj) return true;
        Room room = (Room)obj;
        return this.no == room.getNo();
    }

    //toString方法重写
    public String toString(){
        return "["+no+","+type+","+(status ? "空闲" : "占用")+"]";
    }

    //编写一个临时程序测试以下
    //一会可以删除这个main方法
    public static void main(String[] args){
        Room room = new Room(101,"单人间",false);
        //System.out.println(room.toString());

        //room是一个引用
        //println(引用)，会自动调用引用的toString()方法
        System.out.println(room);

        Room room1 = new Room(102,"单人间",false);
        System.out.println(room.eqauls(room1));
    }
}
