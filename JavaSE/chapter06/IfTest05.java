public class IfTest05
{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("�����뵱ǰ���Ա�1��ʾ�У�0��ʾŮ��");
		int gander = s.nextInt();
		System.out.print("�����뵱ǰ��������1��ʾ���죬0��ʾ���죺");
		int weather = s.nextInt();

		if(weather == 1){
			//System.out.println("����");
			if(gander == 1){
				System.out.println("�����ˣ�С˧�磡�ǵ���һ�Ѵ��ɡŶ��");
			}else if(gander == 0){
				System.out.println("�����ˣ�С��㣡һ���ǵô�һ�Ѵ�ɡŶ��");
			}
		}else if(weather == 0){
			//System.out.println("����");
			if(gander == 1){
				System.out.println("�������ʣ������ʺϳ�ȥ��ƤŶ");
			}else if(gander == 0){
				System.out.println("���������������绨�������һ�����ǵô��÷�ɹ˪Ŷ");
			}
		}

		
	}
}