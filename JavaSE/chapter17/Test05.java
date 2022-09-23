/*
	����Object���е�finalize()����

		1����Object���е�Դ����
			protected void finalize() throws Throwable{ }

		2��finalize()����ֻ��һ�������壬����û�д��룬�������������protected���ε�

		3�������������Ҫ����Ա�ֶ����ã�JVM����������������������������
		����equals toString,equals��toString()��������Ҫ��д������õġ�
		finalize()ֻ��Ҫ��д����д�꽫���Զ����г��������á�


		4��finalize()������ִ��ʱ����
			��һ��java���󼴽����������������յ�ʱ�������������������
			finalize()����
		
		5��finalize()����ʱ������SUN��˾Ϊjava����Ա׼����һ��ʱ������������ʱ����
		���ϣ���ڶ�������ʱ��ִ��һ�δ���Ļ�����δ���Ҫд��finalize()�������С�

		6����̬������������ʲô��
			static{
				...
			}
			��̬������������ʱ��ִ�У�����ִֻ��һ�Ρ�
			����һ��SUN׼���������ʱ����

			finalize()����ͬ��Ҳ��SUNΪ����Ա׼����һ��ʱ����
			���ʱ������������ʱ����
		
		7����ʾ��
			java�е������������������������ģ�
			����̫�٣�����ʱ��û�������������£�
			�п���������Ҳ�п��ܲ�������
*/
public class Test05{
	public static void main(String[] args){
		//��������
		//Person p = new Person();

		//��ô��Person������������
		//p = null;

		//���������
		/*for(int i = 0; i < 10000000; i++){
			Person p = new Person();
			p = null;
		}*/
		
		Person p = new Person();
		p = null;
		System.gc();//������������������
		//Person@16410030���������٣�

	}
}

class Person{
	protected void finalize() throws Throwable{
		System.out.println(this + "���������٣�");
	}
}