/*
1�������Ϣ������̨��
	System.out.println(...);
2����Java����ô���ܼ��̵������أ�
	

*/
public class KeyInput
{
	public static void main(String[] args){
		
	//����һ������ɨ��������
	java.util.Scanner s = new java.util.Scanner(System.in);

	//�����û������룬�Ӽ����Ͻ���һ��int���͵�����
	//�������д��룬�����ô�����ף�����ִ�е������ʱ�򣬻���ͣ����
	//�ȴ��û������룬�û����ԴӼ���������һ��������Ȼ��س����س�֮��
	//i��������ֵ�ˣ�����i�����б�������ֵ���û���������֡�
	//i�������ǽ��ռ������ݵġ�
	int i = s.nextInt();
	System.out.println("������������ǣ�" + i);

	int j = s.nextInt();
	System.out.println("������������ǣ�" + j);

	String str = s.next();
	System.out.println("��������:" + str);

	System.out.print("�������û�����");
	String name = s.next();
	System.out.println("��ӭ"+name+"����");
	}
}