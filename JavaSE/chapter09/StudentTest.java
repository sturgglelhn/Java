public class StudentTest{
	public static void main(String[] args){
		//i���ھֲ������𣿵�Ȼ��
		//�ֲ������洢��ջ�ڴ浱�С�(ջ��Ҫ�洢�ֲ�����)
		//int i = 100;
		//����ѧ����������ֱ��ͨ��������
		//ѧ��������һ��ʵ��������ʵ�������Ƕ��󼶱�ı�����
		//�ǲ���Ӧ�����ж������˵�������¶���
		//����ͨ��"����"��ֱ�ӷ��ʡ�ʵ����������
		//System.out.println(Student.name);
		//����ѧ������1
		//s1���ھֲ�������?��Ȼ��
		//s1����ֲ�������������
		Student s1 = new Student();
		//��ô����ʵ��������
		//�﷨������.ʵ��������
		System.out.println(s1.no);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.sex);
		System.out.println(s1.addr);
		System.out.println("��������������������������������");
		//����ѧ������2
		//s2Ҳ�Ǿֲ�������
		//s2Ҳ������
		Student s2 = new Student();
		System.out.println(s2.no);
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.sex);
		System.out.println(s2.addr);
		s1.no = 110;
		s1.name = "����";
		s1.age = 20;
		s1.sex = true;
		s1.addr = "���ڱ�����";

		System.out.println("ѧ��="+s1.no);
		System.out.println("����="+s1.name);
		System.out.println("����="+s1.age);
		System.out.println("�Ա�="+s1.sex);
		System.out.println("סַ="+s1.addr);

		s1.addr = "����������";
		System.out.println("סַ��"+s1.addr);
	}
	public static void method(){
		//i s1 s2����main�����еľֲ����������������޷����ʵ�
		/*
		System.out.println(i);
		System.out.println(s1);
		System.out.println(s2);
		*/
	}
}
