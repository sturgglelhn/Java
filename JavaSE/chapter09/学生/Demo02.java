public class Demo02
{
	public static void main(String[] args){
		Phone p = new Phone();

		System.out.println(p.brand);
		System.out.println(p.price);
		System.out.println(p.color);
		System.out.println("��������������������");

		p.brand = "iPhone 13 pro";
		p.price = 8999;
		p.color = "Զ����";

		System.out.println(p.brand);
		System.out.println(p.price);
		System.out.println(p.color);

		p.call("���»�");
		p.send();
	}
}

/*
���н����
������������������������������������
null
0
null
��������������������
iPhone 13 pro
8999
Զ����
�����»���绰
�������ã�
������������������������������������
*/