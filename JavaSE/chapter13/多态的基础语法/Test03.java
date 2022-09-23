public class Test03{
	public static void main(String[] args){
		AnimalTest a = new AnimalTest();
		a.test(new Cat());
		a.test(new Bird());
	}
}

class AnimalTest{
	public void test(Animal a){
		if(a instanceof Cat){
			Cat c = (Cat)a;
			c.catchMouse();
		}else if(a instanceof Bird){
			Bird b = (Bird)a;
			b.sing();
		}

	}
}