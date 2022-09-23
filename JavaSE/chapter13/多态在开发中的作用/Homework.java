public class Homework{
	public static void main(String[] args){
		/*
		Erhu erhu = new Erhu();
		Piano piano = new Piano();
		Violin violin = new Violin();
		
		Musician musician = new Musician();
		musician.play(erhu);
		musician.play(piano);
		musician.play(violin);
		*/

	/*
		Instrument erhu = new Erhu();
		Instrument piano = new Piano();
		Instrument violin = new Violin();
		
		Musician musician = new Musician();
		musician.play(erhu);
		musician.play(piano);
		musician.play(violin);
	*/

		Musician musician = new Musician();
		musician.play(new Erhu());
		musician.play(new Piano());
		musician.play(new Violin());

//以上三种写法都可以，只要使用多态就可以了

	}
}

/*
//乐手
//第一种写法，但不符合题意
class Musician{
	Instrument i;

	public Musician(){
	}
	public Musician(Instrument i){
		this.i = i;
	}
	public void play(){
		i.makeSound();
	}
}
*/

class Musician{
	

	public void play(Instrument i){
		i.makeSound();
	}
}

//乐器父类
//更符合题意
class Instrument{
	//乐器发声
	public void makeSound(){
		
	}
}

//子类
class Erhu extends Instrument{
	public void makeSound(){
		System.out.println("二胡的声音！！");
	}
}
//子类
class Piano extends Instrument{
	public void makeSound(){
		System.out.println("钢琴的声音！！");
	}
}
//子类
class Violin extends Instrument{	
	public void makeSound(){
		System.out.println("小提琴的声音！！");
	}
}
