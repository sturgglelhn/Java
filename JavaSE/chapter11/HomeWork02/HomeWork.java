public class HomeWork{
	public static void main(String[] args){
		Book b1 = new Book("������ѧ�˽̰�",219);
		Book b2 = new Book("���������˽̰�",213);
		
		/*
		b1.detail();
		b1.setPageNum(192);
		b1.detail();
		*/
		b1.detail();
		b2.detail();

		//�����޲ι��췽��
		//Book b2 = new Book();
		//b2.detail();
	}
}

class Book
{
	/*
	//����
	private static String title;
	//ҳ��
	private static int pageNum;
*/

	private String title;
	private int pageNum;
	
	//�޲ι��췽��
	public Book(){
		title = "δ֪";
		pageNum = 200;
	}

	//�вι��췽��
	public Book(String s, int i){
		title = s;
		
		if(i < 200){
			pageNum = 200;
			System.out.println("ҳ����������200������200ʱ��Ĭ��ֵΪ200ҳ");
		}else{
			pageNum = i;
		}

		//pageNum = i;
	}

	//��set���޸�title��ֵ
	public void setTitle(String s){
		title = s;
	}

	//��get����ȡtitle��ֵ
	public String getTitle(){
		return title;
	}

	//��set���޸�pageNum��ֵ
	public void setPageNum(int i){
		if(i < 200){
			System.out.println("����ҳ����������200ҳ,Ĭ��ֵ200ҳ");
			pageNum = 200;
			return;
		}else{
			pageNum = i;
		}
	}
	
	//��get����ȡpageNum��ֵ
	public int getPageNum(){
		return pageNum;
	}

	/*
	public static void detail(){
		System.out.println("�̲����ƣ�" + Book.title + ",��ҳ��Ϊ��" + Book.pageNum);
		//�����static��̬�������ã��ᵼ������ֵ�ǹ̶��ģ�������Ҫ����ж���ʱ������Ľ��Ҳֻ���вε��õ����һ�д���ִ��ʱ�Ľ����
		//�����ᵼ����ҵ�񲻷��ϣ���Ϊ��̬�����洢�ڷ������У��ǹ̶���һ��ռ䡣
	}*/

	public void detail(){
		System.out.println("�̲����ƣ�" + title +"��ҳ����"+ pageNum);
	}

}