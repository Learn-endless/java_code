public class code{
	
	//ע����дjava����ʱ�����һ��Դ�ļ�һ���ࡣ
	//���п�����һ������������(��������д������)
	
	public static void main(String[]args){
		short a = 50;  //short���ʹ�СΪ2���ֽ�
		System.out.println(a);
		
		//ע���ڳ����У�����Ҫ��һ���������Ǹ�����������Ż��Ǹ�����
		int b = 8;
		float c = 3.0f;
		double d = 3.0;
		System.out.println(b/c);
		System.out.println(c/d);
		//�����������Ļ������ֻ��ȡ����
	}

	
	public static void main_6(String[]args){
		//�������ͺ�C������char���ͻ���һ����
		//��С��1���ֽڣ����ʵ���������������������������μ���ġ�
		byte b = 10; 
		byte c = -128; //һ���ֽڴ�ŵ���С��ֵ��
		byte d = 127; //һ���ֽڴ�ŵ�����ֵ��
		System.out.println(c);
		System.out.println(d);
		
	    //byte n = 129;  //������Χ���ᱨ��.
	    //System.out.println(n);
	}
	
	public static void main_5(String[]args){
		char ch = 'Ǯ'; //java��char���ڴ��С��2���ֽڴ�С
		//����һ���������ֵĴ�С��2���ֽڣ�����char���Դ�����ġ�
		//ASCII����ȻҲ���Դ�š�
		char ch2 = 97;
		System.out.println(ch);
		System.out.println(ch2);
	}
	
	public static void main_4(String[]args){
		float a = 3.14f; //����������F/f������ʾ��float����
		//��java�в��ᷢ���ضϣ�������ֱ�ӱ���
		
		System.out.println(a);
	}
	
	public static void main_3(String[]args){
		double a = 10.0;  //java��һ������������Ĭ����double���͵�
		double b = 3;
		System.out.println(b);
	}
	
	public static void main_2(String[]args){
		//ע����java��û����ν���޷�������
		long a = 10;   //java����û��long long�������ͣ�����long��С����8���ֽ�
		//������д��ʱ������ں������ L(��д)�����淶һЩ��
		System.out.println(a);
		//����ע��Long �� ����� Integer ����java�������͵İ�װ��
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
	}
	
	public static void main_1(String[]args){
		
		/**
	 	* -----------����һ���ĵ�ע��-------------
		* ����������������
		* 1.������ֻ�������֡���ĸ���»��ߺ���Ԫ������ɡ�
		* 2.���ֲ��ܿ�ͷ��
		* 3.����Ͱ͵Ĺ涨�������������»��߻���Ԫ���ſ�ͷ���β
		* 4.���������ܵ��������»��߻���Ԫ���Ź��ɡ�
		* 5.��ȷ��������ʽΪ��С�շ�״
		*/
		//��������ȷ���������ӣ�
		int a3 = 0;   //ע����java�ж������ʱ����ʼ���ᱨ��
	    int maxNum = 10; //Ӣ�ĵ�������ĸ��д������ͷ����֮�⣩ 
		int max_num = 10; //�����дҲ�������»������ӡ�
		int max3_num = 10;
		int max$num = 10; //һ�㲻Ҫʹ����Ԫ����������������
		//�﷨֧�֣�����low�����ӣ�
		int ____ = 10;
		int _______ = 10;
		int _________ = 10;
		int $ = 10;
		int $$ = 10;
		int Ǯ = 10;
		
		
		
	    //����һ�����Σ��ĸ��ֽڴ�С������ӡ�������ܴ�ŵ����ֵ����Сֵ
		int i = 0;
		System.out.println(i);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		//�����������������Ƚ�
		//�˽�int�����ֵ��һ�Ľ��
		//�˽�int����Сֵ��һ�Ľ��
		System.out.println(Integer.MAX_VALUE + 1);
		System.out.println(Integer.MIN_VALUE - 1);
		//��������ֵ����Сֵ����Сֵ�����ֵ��
		//int�͵������ڴ洢ʱ�����������һ��Բ��
		
		/*
		for(i = 0; i < args.length; i++){
			System.out.println(args[i]);
		}*/
		
		//ʹ��lengthѭ����ӡ������ַ���
		/*for(i = 0; i < args.length; i++){
			System.out.println(args[0]);
			System.out.println(args[1]);
			System.out.println(args[2]);
			System.out.println(args[3]);
		}*/
		
		//��ӡ������
      System.out.println("hello world");
	    //��ӡ������
	  System.out.print("hello world");
	    //��ʽ����ӡ����
	  System.out.printf("%d\n",100);
	  
	}
}