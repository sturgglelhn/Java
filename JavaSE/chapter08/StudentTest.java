/*
	����Ĵ�����ʹ�á�
*/
public class StudentTest
{
	public static void main(String[] args){

		int i = 100;
		System.out.println("i = "+i);

		//��������Է���Student����
		//��Ȼ����
		/*
			����������﷨��ʲô��
				Ŀǰ����Ӳ�����ȼ�ס�������������ˡ�
					new ����();
				����ģ�壬ͨ��һ���࣬�ǿ��Դ���N�������ġ�
				new��һ���������ר�Ÿ������Ĵ�����
		*/
		/*
			Student s1 = new Student();
			��
			int i = 100;һ����
			����һ�£�
				i�Ǳ�����
				int�Ǳ�������������
				100�Ǿ�������ݡ�

				��s1�Ǳ�������s1���ǽ�������s1ֻ��һ���������֣�
				XueSheng�Ǳ���s1���������ͣ������������ͣ�
				new Student()����һ�����󡣣�ѧ���ഴ��������ѧ������
				 
			�������Ͱ������֣�
				�����������ͣ�byte short int long float double boolean char
				�����������ͣ�String,Student.....

			java�����еġ��ࡱ��������������������
		*/

		Student s1 = new Student();//��int i = 10;һ������
		Student s2 = new Student();
	}
}