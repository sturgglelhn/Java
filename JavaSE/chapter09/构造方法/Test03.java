public class Test03
{
	public static void main(String[] args){

		Vip v1 = new Vip();
		System.out.println(v1.no);
		System.out.println(v1.name);
		System.out.println(v1.birth);
		System.out.println(v1.sex);
		System.out.println();

		Vip v2 = new Vip(1111L,"�����");
		System.out.println(v2.no);
		System.out.println(v2.name);
		System.out.println(v2.birth);
		System.out.println(v2.sex);
		System.out.println();

		Vip v3 = new Vip(2222L,"С����","2000-10-1");
		System.out.println(v3.no);
		System.out.println(v3.name);
		System.out.println(v3.birth);
		System.out.println(v3.sex);
		System.out.println();

		Vip v4 = new Vip(3333L,"ů����","1991-03-1");
		System.out.println(v4.no);
		System.out.println(v4.name);
		System.out.println(v4.birth);
		System.out.println(v4.sex);

	}
}

/*
���н����
������������������������������������
0
null
null
false

1111
�����
null
false

2222
С����
2000-10-1
false

3333
ů����
1991-03-1
false
������������������������������������

*/