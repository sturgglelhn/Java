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

//��������д�������ԣ�ֻҪʹ�ö�̬�Ϳ�����

	}
}

/*
//����
//��һ��д����������������
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

//��������
//����������
class Instrument{
	//��������
	public void makeSound(){
		
	}
}

//����
class Erhu extends Instrument{
	public void makeSound(){
		System.out.println("��������������");
	}
}
//����
class Piano extends Instrument{
	public void makeSound(){
		System.out.println("���ٵ���������");
	}
}
//����
class Violin extends Instrument{	
	public void makeSound(){
		System.out.println("С���ٵ���������");
	}
}
