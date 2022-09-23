package com.javase.Array.homework;

public class Hotel {
    /**
     *  二维数组，模拟大夏所有的房间
     */
    private Room[][] rooms;

    //盖楼通过构造方法来盖楼。
    public Hotel() {
        //一共有几层，每层的房间类型是什么，每个房间的编号是什么。
        //我们可以先写死。共三层、一层单人间、二层标准间、三层总统套房，每层有10个房间。
        /*
         * 房间编号
         * 1楼：101 102 103 104 105
         * 2楼：201 202 203 204 205
         * 3楼：301 302 303 304 305
         * */
        rooms = new Room[3][10];
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if(i == 0){
                    rooms[i][j] = new Room((i+1)*100+j+1,"单人间",true);
                }else if(i == 1){
                    rooms[i][j] = new Room((i+1)*100+j+1,"标准间",true);
                }else if(i == 2){
                    rooms[i][j] = new Room((i+1)*100+j+1,"豪华间",true);
                }

            }
        }
    }

    //在酒店对象上提供一个打印房间列表的方法
    public void print(){
        for(int i = 0; i<rooms.length; i++){
            for(int j = 0; j<rooms[i].length;j++){
                Room room =  rooms[i][j];
                System.out.print(room.toString());
            }
            System.out.println();
        }
    }

    //订房方法。
    //调用此方法时需要传递一个房间编号过来，这个房间编号是前台小姐姐输入的。
    public void order(int roomNo){
        Room room = rooms[roomNo / 100-1][roomNo % 100-1];
        //修改为占用
        room.setStatus(false);
        System.out.println(roomNo+"已订房");
    }

    public void exit(int roomNo){
        Room room = rooms[roomNo / 100-1][roomNo % 100-1];
        //修改为空闲
        room.setStatus(true);
        System.out.println(roomNo+"已退房！");
    }

}
