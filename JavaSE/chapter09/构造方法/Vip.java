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
		//ʵ�������������д��루û���ֶ���ֵ��ϵͳ����Ĭ�ϸ�ֵ��
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