/*
	ҵ��Ҫ��:
		1���Ӽ����Ͻ���һ���˵����䡣
		2������Ҫ��Ϊ[0-150]������ֵ��ʾ�Ƿ�����Ҫ��ʾ�Ƿ���Ϣ��
		3�������˵���������̬���ж�����������������ĸ��׶Σ�
			[0-5]Ӥ�׶�
			[6-10]�ٶ�
			[11-18]����
			[19-35]����
			[35-55]����
			[56-150]����
		4����ʹ��if���������ϵ�ҵ���߼���
*/
public class IfTest02
{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("���������䣺");
		
		int age = s.nextInt();
		/*
		System.out.println("�������£�������������ǣ�" + age);
		if(age<0 || age>150){
			System.out.println("�Բ������䲻�Ϸ�");
			}
		else{
			if(age <= 5){
				System.out.println("Ӥ�׶�");
			}else if(age <= 10){
				System.out.println("�ٶ�");
			}else if(age <= 18){
				System.out.println("����");
			}else if(age <= 35){
				System.out.println("����");
			}else if(age <= 55){
				System.out.println("����");
			}else{
				System.out.println("����");
			}
		}
		*/

		//���ۡ�ִ��Ч�ʸ�
		String str = "����";
		if(age<0 || age>150){
			System.out.println("�Բ������䲻�Ϸ�");
			return;	
		}else if(age <= 5){
			str = "Ӥ�׶�";
		}else if(age <= 10){
			str = "�ٶ�";
		}else if(age <= 18){
			str = "����";
		}else if(age <= 35){
			str = "����";
		}else if(age <= 55){
			str = "����";
		}
		System.out.println(str);


	}
}