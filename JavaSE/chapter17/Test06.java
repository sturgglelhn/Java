/*
	hashCode������
		��Object�е�hashCode�����������ģ�
			public native int hashCode();

			����������ǳ��󷽷�������native�ؼ��֣��ײ����C++����
		
		hashCode()�������ص��ǹ�ϣ��:
			ʵ���Ͼ���һ��java������ڴ��ַ��������ϣ�㷨���ó�һ��ֵ��
			����hashCode()������ִ�н�����Ե�ͬ����һ��java������ڴ��ַ��		
*/
public class Test06{
	public static void main(String[] args){
		Object o = new Object();
		int hashCodeValue = o.hashCode();

		// �����ڴ��ַ������ϣ�㷨ת����һ�����֡����Ե�ͬ�����ڴ��ַ��
		System.out.println(o.hashCode());	//366712642

		Myclass mc = new Myclass();
		int hashCodeValue2 = mc.hashCode();
		System.out.println(hashCodeValue2);	//1829164700
	}
}

class Myclass{
}