public class De01
{
	public static void main(String[] args){
		Student s1 = new Student();
		
		s1.name = "С��";
		s1.age = 16;

		get(s1);

		Student s2 = new Student();
		s2.name = "С��";
		s2.age = 18;
		
		get(s2);
	}

	public static void get(Student st){
		System.out.println("��Һã��ҽ�"+st.name+",����"+st.age+"��");
	}
}