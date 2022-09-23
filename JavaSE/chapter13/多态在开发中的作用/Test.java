/*
	测试多态在开发中的作用
*/
public class Test{
	public static void main(String[] args){
		
		//创建主人对象
		Master zhangsan = new Master();
		//创建宠物对象
		Dog zangAo = new Dog();
		//主人喂
		zhangsan.feed(zangAo);

		//创建宠物对象
		Cat xiaoHua = new Cat();
		zhangsan.feed(xiaoHua);
		//写死了
		//软件开发过程中最好不要过多的修改
		
		YingWu yingWu = new YingWu();
		zhangsan.feed(yingWu);

	}
}

/*
	
*/


