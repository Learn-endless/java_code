
public class ShopVIP {
	/*
	 * ���ԣ����������ţ����֣����
	 * ����:�鿴���֣��鿴�����ѣ���ֵ
	 * ����
	 * 1.������1000Ԫ����ۣ���2000Ԫ����ۣ�����1000Ԫ������
	 * 2.ÿ����100Ԫ���1����
	 * 3.��дShopVIP�����Ӧ�Ĳ�����������Ϸ���
	 * */
	String name="����";//����
	String cardNum="1001";//����
	int score=0;//����
	double money=0;//���
	//Ĭ�Ϲ��췽��(�޲ι��췽��)
	public ShopVIP() {
		//this���ʹ��췽���������������ڸù��췽���ĵ�һ�г���
//		System.out.println();
		this("����", "3003");
	}
	//�Զ��幹�췽��(���ι��췽��)
	public ShopVIP(String name) {
		//this���ʳ�Ա����
		this.name = name;
	}
	
	public ShopVIP(String name,String cardNum) {
		this.name = name;
		this.cardNum = cardNum;
	}
	
	/*public ShopVIP(String vipName,int s) {
		name = vipName;
		score = s;
	}
	
	public ShopVIP(int s,String vipName) {
		name = vipName;
		score = s;
	}*/
	//�鿴����
	public void getScore() {
		System.out.println("���֣�"+score);
	}
	//�鿴���
	public void getMoney() {
		System.out.println("��"+money);
	}
	//��ֵ
	public void keJin(double num) {
		money+=num;
		//this���ʳ�Ա����
		this.getMoney();
	}
	//����
	public void buy(double num) {
		//1.�ܷ����ѣ�
		if(num<=money) {
			//2.���Ѷ��٣�
			if(num>=2000) {
				//���ո�Ǯ�ͻ��ֱ仯
				money=money-num*0.8;
				score += num*0.8/100;
			}else if(num>=1000) {
				money=money-num*0.9;
				score += num*0.9/100;
			}else {
				money-=num;
				score+=num/100;
			}
		}else {
			System.out.println("ûǮ��ɶ�أ�");
		}
	}
	
}
