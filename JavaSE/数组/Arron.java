/*
public class Arron
{
	public static void main(String[] args){
		int[] arr = new int[3];
		System.out.println(arr);
		arr[1] = 8;
		System.out.println(arr[1]);
	}
}*/

/*
public class Arron
{
	public static void main(String[] args){
		int[] arr1 = new int[2];
		int[] arr2 = new int[3];

		//System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);

		//System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);

		arr1[0] = 100;
		arr2[0] = 200;

		System.out.println("---------");
	
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);

		//System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
	}
}*/


/*
public class Arron
{
	public static void main(String[] args){
		int[] arr1 = {100, 200, 300};

		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println("------------");

		int[] arr2 = arr1;
		
		arr2[0] = 111;
		arr2[1] = 222;
		arr2[2] = 333;

		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println("-----------");
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
	}
}*/



//������Ϊ�����������ݣ����ݵĲ����������ڴ�ĵ�ַ��
/*
public class Arron
{
	public static void main(String[] args){
		int[] arr = new int[]{1,2,3,4,5};

		System.out.println(arr);
		print(arr);
	}

	public static void print(int[] arr){
		System.out.println(arr);
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}*/
/*
���н����
����������������������������������������
[I@15db9742
[I@15db9742
1
2
3
4
5
����������������������������������������
*/




//������Ϊ�����ķ���ֵ�����ص���������ڴ��ַ��
public class Arron{
	public static void main(String[] args){
		//����getarr�������շ�������ֵ�����յ�����������ڴ��ֵַ
		int[] arr = getarr();
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static int[] getarr(){
		int[] arr = {10, 20, 30};

		//����������ڴ��ֵַ
		return arr;
	}
}


