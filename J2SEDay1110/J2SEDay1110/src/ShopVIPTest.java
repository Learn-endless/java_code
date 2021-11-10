//理发店会员类测试类
public class ShopVIPTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ShopVIP vip = new ShopVIP();
		/*ShopVIP vip2 = new ShopVIP("李四");
		ShopVIP vip3 = new ShopVIP("李四","2002");*/
		System.out.println("会员名称："+vip.name+
				"\n会员卡号："+vip.cardNum);
		//充值
		vip.keJin(3000);
		//消费
		vip.buy(2000);
		//查看积分
		vip.getScore();
		//查看余额
		vip.getMoney();
	}

}
