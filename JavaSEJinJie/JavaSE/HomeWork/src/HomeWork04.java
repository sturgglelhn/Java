/*编写java程序模拟简单的计算器
定义名为Number的类其中有两个整型数据成员n1和n2应声明为私有。
编写构造方法赋予n1和n2初始值
在为该类定义加addition(),减subtration(),乘multiplication(),除division()等公有实例方法
分别对两个成员变量执行加、减、乘、除的运算。

在main方法中创建Number类的对象调用各个方法并显示计算结果 */
public class HomeWork04 {
    public static void main(String[] args) {
        Number number = new Number(20,4);
        number.addition();
        number.subtration();
        number.multiplication();
        number.division();
    }
}
class Number{
    private int n1;
    private int n2;

    public Number() {
    }

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    //可以返回值类型为void，也可以是int
    public void addition(){
        System.out.println(n1 + "+" + n2 + "=" + (n1+n2));
    }

    public void subtration(){
        int result = n1 - n2;
        System.out.println(n1 + "-" + n2 + "=" + result);
    }

    public void multiplication(){
        int result = n1 * n2;
        System.out.println(n1 + "*" + n2 + "=" + result);
    }

    public void division(){
        if(n2 == 0){
            System.out.println("除数不能为0");
        }
        int result = n1/n2;
        System.out.println(n1 + "/" + n2 + "=" + result);
    }
}
