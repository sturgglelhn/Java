public class PersonTest02
{
	public static void main(String[] args){
		Person p1 = new Person();

		//Person��age��
/*		System.out.println(p1.age);

		p1.age = 50;

		System.out.println(p1.age);
*/
	
	//ͨ��������.�����Ե���set��get�����𣿲���
	//ֻ�з������η��б�����static��ʱ�򣬲���ʹ�á�����.���ķ�ʽ����
	//�����
		//Person.getAge();


		//int nianLing = p1.getAge();
		//System.out.println(nianLing);
		System.out.println(p1.getAge());

		p1.setAge(18);
		System.out.println(p1.getAge());

		p1.setAge(-100);
		System.out.println(p1.getAge());



		System.out.println(p1.getName());

		p1.setName("�����");
		System.out.println(p1.getName());

		p1.setName("������");
		System.out.println(p1.getName());
	}
}