/*
	���úͱ�����ô���֣�
		�����á���ɶ���Ǵ洢�ڴ��ַ��һ������
		�����ߡ���ɶ������new������
*/
public class Test
{
	public static void main(String[] args){
		
		//�����ˡ�id��ʵ�������������ȴ�������ͨ��������.���ķ�ʽ���ʡ�
		/*
			User u = new User();
			u������
		*/
		//System.out.println(User.id);

		Address a = new Address();	//��������
		a.city = "����";
		a.street = "������";
		a.zipcode = "121221";

		User u = new User();
		System.out.println(u.id);
		System.out.println(u.username);
		System.out.println(u.addr);

		u.id = 1111;
		u.username = "zhangsan";
		u.addr = a;

		System.out.println(u.username +"��"+u.addr.city+"���еģ�");
	}
}