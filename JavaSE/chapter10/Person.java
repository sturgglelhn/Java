/*
	�������Ȳ�ʹ�÷�װ���ƣ������������ʲôȱ�㣿
		Person���age���Զ��Ⱪ¶���������ⲿ������������ʣ������˲���ȫ��

	��ô���������⣿
		��װ��
*/
//����û�з�װ��Person
/*public class Person
{
	int age;
}*/


//���Է�װһ��
//���ڶ��Ⱪ¶���ӵ����ݣ���װ����
//��ֻ�ṩ�򵥵Ĳ������
//�ŵ㣺��һ���ݰ�ȫ�ˡ��ڶ�������Ҳ������
public class Person
{
	private int age;

	private String name;
	//�����ṩ�򵥵ķ������(���ӻ���ң�������൱�ڵ��ӻ��ķ�����ڣ�������)
	//�ⲿ����ֻ��ͨ���������µĴ�������ɷ���
	//˼������Ӧ�ö����ṩ����������ڣ�
	//˼������Щ��������Ƿ�Ӧ���Ƿ����أ�
	//дһ������ר������ɶ�����get��
	//дһ������ר�������д����set��
	
	/*
		ע�⣺
			java�����淶����Ҫ��set������get����Ҫ�������¸�ʽ��
				get
				public ����ֵ���� get+��������ĸ��д(�޲�){
					return xxx;
				}

				set
				public ����ֵ���� set+��������ĸ��д(��1������){
					xxx = ����;
				}

		
	*/

	//get
	public int getAge(){
		return age;
	}
	
	//set
	public void setAge(int nianLing){
		if(nianLing < 0 || nianLing > 150){
			System.out.println("����������䲻�Ϸ������������룡");
		}
		else{
			age = nianLing;
		}
	}

	public String getName(){
		return name;
	}

	public void setName(String names){
		name = names;
	}

}








