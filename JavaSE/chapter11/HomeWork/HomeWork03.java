/*
(封装)已知一个类Student 代码如下：
class Student{
	String name;
	int age;
	String address;
	String zipcode;
	String mobile;
}
要求：
	1、把Student 的属性都作为私有，并提供get/set 方法以及适当的构造方法
	2、为Student 类添加一个getPostAddress 方法，要求返回Student 对象的地址和邮编
*/

public class HomeWork03{
	public static void main(String[] args){
		Student s1 = new Student();
		System.out.println(s1.name+","+s1.getPostAddress());
		
		Student s2 = new Student("李四",18,"湖北荆州","11111","1347968432");
		System.out.print("姓名："+s2.name+"\n年龄："+s2.age+"\n手机号:"+s2.mobile+"\n"+s2.getPostAddress());

	}
}

class Student
{
	String name;
	int age;
	String address;
	String zipcode;
	String mobile;

	public Student(){

	}
	public Student(String name, int age, String address, String zipcode, String mobile){
		this.name = name;
		this.age = age;
		this.address = address;
		this.zipcode = zipcode;
		this.mobile = mobile;
	}
	public String getPostAddress(){
		return "地址：" + this.address + "\n邮编：" + this.zipcode;
	}

	public String getName(){
		return name;
	}
	public  void setName(String name){
		this.name = name;
	}

	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}

	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address = address;
	}

	public String getZipcode(){
		return zipcode;
	}
	public void setZipcode(String zipcode){
		this.zipcode = zipcode;
	}

	public String getMobile(){
		return mobile;
	}

	public void setMobile(String mobile){
		this.mobile = mobile;
	}
}