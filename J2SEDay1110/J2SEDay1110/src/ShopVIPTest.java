//�����Ա�������
public class ShopVIPTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ShopVIP vip = new ShopVIP();
		/*ShopVIP vip2 = new ShopVIP("����");
		ShopVIP vip3 = new ShopVIP("����","2002");*/
		System.out.println("��Ա���ƣ�"+vip.name+
				"\n��Ա���ţ�"+vip.cardNum);
		//��ֵ
		vip.keJin(3000);
		//����
		vip.buy(2000);
		//�鿴����
		vip.getScore();
		//�鿴���
		vip.getMoney();
	}

}
