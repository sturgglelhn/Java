public class De01
{
	public static void main(String[] args){
		Student s1 = new Student();
		
		s1.name = "小明";
		s1.age = 16;

		get(s1);

		Student s2 = new Student();
		s2.name = "小红";
		s2.age = 18;
		
		get(s2);
	}

	public static void get(Student st){
		System.out.println("大家好！我叫"+st.name+",今年"+st.age+"岁");
	}
}