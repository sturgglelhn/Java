/*
在程序中经常要对时间进行操作但是并没有时间类型的数据
那么我们可以自己实现一个时间来满足程序中的需要

定义名为MyTime的类其中应有三个整型成员是时hour分minute秒second
为了保证数据的安全性这三个成员变量应声明为私有
为MyTime类定义构造方法以方便创建对象时初始化成员变量
在定义display方法用于将时间信息打印出来。
为MyTime类添加以下方法
    addSecond(int sec)
    addMinute(int min)
    addHour(int hou)
    addSecond(int sec)
    addMinute(int min)
    addHour(int hou)
* */
public class HomeWork03 {
    public static void main(String[] args) {
        MyTime t1 = new MyTime();
        t1.display();

        MyTime t2 = new MyTime(13,20,50);
        t2.display();

        t2.addSecond(5);
        t2.display();

        t2.addSecond(6);
        t2.display();
    }
}

class MyTime{
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    //加秒、分、时
    public void addSecond(int sec){
        //this.setSecond(this.getSecond() + sec);
        int oldSec = this.getSecond();
        int newSec = oldSec + sec;
        if(newSec < 60){
            this.setSecond(newSec);
        }else if(newSec == 60){
            this.addMinute(1);
            this.addSecond(0);
        }else{
            int newMinute = newSec / 60;
            this.addMinute(newMinute);
            this.setSecond(newSec % 60);
        }
    }
    public void addMinute(int min){
        int oldMinute = this.getMinute();
        int newMinute = oldMinute + min;
        this.setMinute(newMinute);
    }
    public void addHour(int hou){

    }

    //减秒、分、时
    public void subSecond(int sec){

    }
    public void subMinute(int min){

    }
    public void subHour(int hou){

    }

    //set方法就是修改，get方法就是读取
    public void display(){
        System.out.println(this.hour+"时"+this.minute+"分"+this.second+"秒");
    }

}