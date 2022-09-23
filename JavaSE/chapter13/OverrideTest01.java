public class OverrideTest01{
	public static void main(String[] args){
		Bird b = new Bird();
		b.move();
	}
}

class Animal{
	public void move(){
		System.out.println("动物在移动！");
	}
}

class Bird extends Animal
{

}

class Cat extends Animal{
	
}