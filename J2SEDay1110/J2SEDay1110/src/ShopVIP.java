
public class ShopVIP {
	/*
	 * 属性：姓名，卡号，积分，余额
	 * 方法:查看积分，查看余额，消费，充值
	 * 需求：
	 * 1.消费满1000元打九折，满2000元打八折，低于1000元不打折
	 * 2.每消费100元获得1积分
	 * 3.编写ShopVIP类和相应的测试类测试以上方法
	 * */
	String name="张三";//姓名
	String cardNum="1001";//卡号
	int score=0;//积分
	double money=0;//余额
	//默认构造方法(无参构造方法)
	public ShopVIP() {
		//this访问构造方法，这条语句必须在该构造方法的第一行出现
//		System.out.println();
		this("王五", "3003");
	}
	//自定义构造方法(带参构造方法)
	public ShopVIP(String name) {
		//this访问成员变量
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
	//查看积分
	public void getScore() {
		System.out.println("积分："+score);
	}
	//查看余额
	public void getMoney() {
		System.out.println("余额："+money);
	}
	//充值
	public void keJin(double num) {
		money+=num;
		//this访问成员方法
		this.getMoney();
	}
	//消费
	public void buy(double num) {
		//1.能否消费？
		if(num<=money) {
			//2.消费多少？
			if(num>=2000) {
				//最终付钱和积分变化
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
			System.out.println("没钱想啥呢！");
		}
	}
	
}
