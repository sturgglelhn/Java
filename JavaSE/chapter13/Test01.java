
public class Test01{
	public static void main(String[] args){
		Master zhangsan = new Master();
		Cat maoMi = new Cat();
		zhangsan.feed(maoMi);

		Yingwu yingwu = new Yingwu();

		zhangsan.feed(yingwu);


	}
}

class Master{
	public void feed(Pet pet){
		pet.eat();
	}
}

class Pet{
	public void eat(){

	}
}

class Cat extends Pet{
	public void eat(){
		System.out.println("喵咪喜欢吃鱼，吃的很香！");
	}
}

class Yingwu extends Pet{
	public void eat(){
		System.out.println("鹦鹉喜欢吃小虫，吃的很香！");
	}
}


/*
public class Test01{
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
class Master{	
	public void feed(Pet pet){
		pet.eat();
	}
}

class Pet{
	public void eat(){

	}
}

class Dog extends Pet{
	//对Pet中的eat方法进行重写。
	public void eat(){
		System.out.println("狗狗喜欢吃骨头，吃的很香！");
	}
}

class Cat extends Pet{
	//对Pet中的eat方法进行重写。
	public void eat(){
		System.out.println("猫咪喜欢吃鱼，吃的很香！！");
	}
}

class YingWu extends Pet{
	//重写eat方法
	public void eat(){
		System.out.println("鹦鹉喜欢吃小虫子，吃的很香！！！");
	}
}

*/