/*
	����1+2-3+4-5+6-7....+100�Ľ��
	�ҹ��ɣ�����ʱ������ż��ʱ�ӷ���

	1.��һ�����1��100���ۼ�
	2.
*/



public class HomeWork02
{
	public static void main(String[] args){
		
		int sum = 1;
		int str = 1;
		for(int i=2; i<=100; i++){
			//sum += i;
			//System.out.println(i);
			if(i%2 == 0){
				sum += i;
				//System.out.println(i);//2551
			}
		
			if(i%2 != 0)
			{
				str += i;
				//System.out.println(str);//2500
			}
		
		}


		//System.out.println("���Ϊ:" + (sum-str+1));
		
	}
}


/*
public class HomeWork02
{
	public static void main(String[] args){
		
		int sum = 1;
		for(int i = 2; i<=100; i++)
		{
			if(i%2 == 0){
				sum += i;	
				System.out.println(i);
				//System.out.println("str = " + sum);
				System.out.println(sum);
			}//else{
				//sum -= i;
				//
			//}
			if(i%2 != 0)
			{
				sum += i;
				//System.out.println("sum = " + sum);
				//System.out.println(i);
				//System.out.println(sum);
			}
		}
		//System.out.println("���Ϊ��" + sum);

	}
}*/


/*
public class HomeWork02
{
	public static void main(String[] args){
		int sum = 1;
		for(int i = 1; i<=100; i++)
		{
			if(i%2 == 0)
			{
				sum += i;
//				System.out.println(i);
				System.out.println(sum);//2551
			}

			if(i%2 != 0)
			{
				sum += i;
				System.out.println(sum);
				//System.out.println(i);

			}
		}
	}
}*/

/*
public class HomeWork02{
    public static void main(String[] args) {
        //ʹ��forѭ��ʵ��100���ڵ�ż��֮��
        int sum1=0;
        int sum2=0;
        for (int i=1;i<=100;i++){
            if (i%2==0){
                sum1+=i;//��ż��֮��
            }else{
                sum2+=i;//������֮��
            }
        }
        //���ż��֮��
        System.out.println("ż��֮��Ϊ��"+sum1);
        //�������֮��
        System.out.println("����֮��Ϊ��"+sum2);
    }
}*/

/*
//2������ 1+2-3+4-5+6-7....+100�Ľ��
public class HomeWork02{
	public static void main(String[] args){
		int m = 1;
		//int n = 1;
		for(int i = 2; i <= 100; i ++){
			if(i % 2 == 0){
				m += i;
				
			}else{
				m -= i;
			}
		}
		System.out.println(m);	
	}
}*/
/*
i = 2; m = 1+2= 3
i = 3; m = m = 3-3 = 0

i = 4; m = 0+4 = 4
i = 5; m = 4-5 = -1

i = 6; m = -1 + 6 = -5
*/


/*
public class HomeWork02
{
	public static void main(String[] args){
		int sum = 2;

		for(int i = 1; i<=100; i++)
		{	
			if(i % 2 == 0)
			{
				sum += i;
			}else{
				sum -= i;
			}

		}
		System.out.printf("sum = " + sum);
	}
}*/