/*
	java�й��ڷ�������ʱ��������ʵ����ֻ��һ������:
		�������ǻ����������ͣ����������������ͣ�ʵ�����ڴ��ݵ�ʱ��
		���ǽ������б�����Ǹ���ֵ����ֵһ�ݣ�����ȥ��
*/
public class Test02
{
	public static void main(String[] args){
		Person p = new Person();
		p.age = 10;
		add(p);//���ݵ���new�ڶ������ɵĶ���ָ��p��p���ǵ�ַ���ѵ�ַ���ݸ�add����
		System.out.println("main-->"+ p.age);
	}

	public static void add(Person p){
		p.age++;
		System.out.println("add -->" + p.age);
	}
}
class Person
{
	int age;
}