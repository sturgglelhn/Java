 /*
1��this����ʹ����ʵ�������У�����ʹ���ھ�̬������
2��this�ؼ��ִ󲿷�����¿���ʡ�ԣ�ʲôʱ����ʡ���أ�
	��ʵ�������У����߹��췽���У�Ϊ�����־ֲ�������ʵ��������
	��������£�this. �ǲ���ʡ�Ե�

 */
 public class ThisTest03
 {
	 public static void main(String[] args){
		Student s1 = new Student();
		s1.setNo(111);
		s1.setName("����");

		System.out.println("ѧ�ţ�"+ s1.getNo());
		System.out.println("������"+ s1.getName());

		Student s2 = new Student(222,"����");
		System.out.println("ѧ�ţ�"+ s2.getNo());
		System.out.println("������"+ s2.getName());
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