public class HomeWork{
	public static void main(String[] args){
		Book b1 = new Book("高三数学人教版",219);
		Book b2 = new Book("高三语文人教版",213);
		
		/*
		b1.detail();
		b1.setPageNum(192);
		b1.detail();
		*/
		b1.detail();
		b2.detail();

		//调用无参构造方法
		//Book b2 = new Book();
		//b2.detail();
	}
}

class Book
{
	/*
	//名称
	private static String title;
	//页数
	private static int pageNum;
*/

	private String title;
	private int pageNum;
	
	//无参构造方法
	public Book(){
		title = "未知";
		pageNum = 200;
	}

	//有参构造方法
	public Book(String s, int i){
		title = s;
		
		if(i < 200){
			pageNum = 200;
			System.out.println("页数不得少于200，少于200时，默认值为200页");
		}else{
			pageNum = i;
		}

		//pageNum = i;
	}

	//用set来修改title的值
	public void setTitle(String s){
		title = s;
	}

	//用get来读取title的值
	public String getTitle(){
		return title;
	}

	//用set来修改pageNum的值
	public void setPageNum(int i){
		if(i < 200){
			System.out.println("本书页数不得少于200页,默认值200页");
			pageNum = 200;
			return;
		}else{
			pageNum = i;
		}
	}
	
	//用get来读取pageNum的值
	public int getPageNum(){
		return pageNum;
	}

	/*
	public static void detail(){
		System.out.println("教材名称：" + Book.title + ",总页数为：" + Book.pageNum);
		//如果用static静态方法调用，会导致数据值是固定的，比如需要输出有多行时，输出的结果也只是有参调用的最后一行代码执行时的结果。
		//这样会导致与业务不符合，因为静态方法存储在方法区中，是固定的一块空间。
	}*/

	public void detail(){
		System.out.println("教材名称：" + title +"总页数："+ pageNum);
	}

}