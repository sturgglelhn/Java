 /*
1、this可以使用在实例方法中，不能使用在静态方法中
2、this关键字大部分情况下可以省略，什么时候不能省略呢？
	在实例方法中，或者构造方法中，为了区分局部变量和实例变量，
	这种情况下：this. 是不能省略的

 */
 public class ThisTest03
 {
	 public static void main(String[] args){
		Student s1 = new Student();
		s1.setNo(111);
		s1.setName("张三");

		System.out.println("学号："+ s1.getNo());
		System.out.println("姓名："+ s1.getName());

		Student s2 = new Student(222,"李四");
		System.out.println("学号："+ s2.getNo());
		System.out.println("姓名："+ s2.getName());
	 }
 }

 class Student
 {
	 private int no;
	 private String name;

	 public Student(){

	 }
	
	/*
	 public Student(int i, String s){
		 no = i;
		 name = s;
	 }
	 */
	 public Student(int no, String name){
		 this.no = no;
		 this.name = name;
	 }
	

	 public int getNo(){
		 return no;
	 }
	 public void setNo(int no){
		this.no = no;
	 }

	 public String getName(){
		 return name;
	 }
	
	 public void setName(String name){
		this.name = name;
	 }

 }