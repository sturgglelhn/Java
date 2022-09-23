public class Vip
{
	long no;

	String name;

	String birth;

	boolean sex;

	public Vip(){
		
	}

	public Vip(long huiYuanHao,String xingMing){
		no = huiYuanHao;
		name = xingMing;
		//实际上这里有两行代码（没有手动赋值，系统都会默认赋值）
		//birth = null;
		//sex = false;
	}

	public Vip(long huiYuanHao, String xingMing, String shengRi){
		no = huiYuanHao;
		name = xingMing;
		birth = shengRi;

		//sex = false;

	}

	public Vip(long huiYuanHao, String xingMing, String shengRi,boolean xingBie){
		no = huiYuanHao;
		name = xingMing;
		birth = shengRi;
		sex = xingBie;
	}
}