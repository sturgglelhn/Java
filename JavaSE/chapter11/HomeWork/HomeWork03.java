/*
(��װ)��֪һ����Student �������£�
class Student{
	String name;
	int age;
	String address;
	String zipcode;
	String mobile;
}
Ҫ��
	1����Student �����Զ���Ϊ˽�У����ṩget/set �����Լ��ʵ��Ĺ��췽��
	2��ΪStudent �����һ��getPostAddress ������Ҫ�󷵻�Student ����ĵ�ַ���ʱ�
*/

public class HomeWork03{
	public static void main(String[] args){
		Student s1 = new Student();
		System.out.println(s1.name+","+s1.getPostAddress());
		
		Student s2 = new Student("����",18,"��������","11111","1347968432");
		System.out.print("������"+s2.name+"\n���䣺"+s2.age+"\n�ֻ���:"+s2.mobile+"\n"+s2.getPostAddress());

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
		return "��ַ��" + this.address + "\n�ʱࣺ" + this.zipcode;
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