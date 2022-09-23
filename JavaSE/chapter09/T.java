public class T
{
	public static void main(String[] args){
		D d = new D();
		C c = new C();
		B b = new B();
		A a = new A();
		T t = new T();
			
		c.o4 = d;
		b.o3 = c;
		a.o2 = b;
		t.o1 = a;
		System.out.println(t.o1.o2.o3.o4.i);
	}
}
class A
{
	B o2;
}
class B
{
	C o3;
}
class C
{
	D o4;
}
class D
{
	int i;
}