package testproject;
import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import myproject.Triangle;

@RunWith(Parameterized.class)
public class TestTriangleByParameter {
	private String param1;		//���ձ߳�a��ֵ
	private String param2;		//���ձ߳�b��ֵ
	private String param3;		//���ձ߳�c��ֵ
	private String result1;		//���������ε��ܳ�
	private String result2;		//���������ε����
	private String result3;		//���������ε�����
	
	public TestTriangleByParameter(String param1,String param2,String param3,String result1,String result2,String result3) {
		super();
		this.param1 = param1;		//���ձ߳�a��ֵ
		this.param2 = param2;		//���ձ߳�b��ֵ
		this.param3 = param3;		//���ձ߳�c��ֵ
		this.result1 = result1;		//���������ε��ܳ�
		this.result2 = result2;		//���������ε����
		this.result3 = result3;		//���������ε�����
	}
	
	@Parameters
	public static Collection getData() {
		try {
			//��text_data.txt�ļ��ж�����
			BufferedReader reader=new BufferedReader(new FileReader("src\\testproject\\test_data.txt"));
			String line = null;
			List<String []> list=new ArrayList<>();
			//һ��һ�еĶ�ȡ�ı��ļ��е���
			while((line=reader.readLine())!=null) {
				//��ÿһ�е����ݶ��ָ�Ϊһ���ַ�������
				String [] strarr=line.split(",");
				//��ӵ�ĩβ
				list.add(strarr);
			}
			reader.close();
			return list;
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	@Test
	//���������ε��ܳ�
	public void test_girth() {
		//ʹ��Integer.parseInt()���ַ���ת��Ϊ����
		Triangle triangle = new Triangle(Integer.parseInt(param1),Integer.parseInt(param2),Integer.parseInt(param3));
		//�����������ܳ�����
		int ret = triangle.girth();
		//���Խ���Ƿ����
		assertEquals(Integer.parseInt(result1),ret);
	}
		
	@Test
	//���������ε����
	public void test_area() {
		Triangle triangle = new Triangle(Integer.parseInt(param1),Integer.parseInt(param2),Integer.parseInt(param3));
		//�����������������
		double ret = triangle.area();
		//ʹ��Double.parseDouble()���ַ���ת��Ϊ������
		
		//ʹ��if�ж��Ƿ����
		if(Double.parseDouble(result2)==ret) {
			//ͨ�����Խ��м��
			assertEquals(1,1);
		}else {
			assertEquals(1,0);
		}
	}
		
	@Test
	//���������ε�����
	public void test_judgmentType() {
		Triangle triangle = new Triangle(Integer.parseInt(param1),Integer.parseInt(param2),Integer.parseInt(param3));
		//�������������ͷ���
		String ret = triangle.judgmentType();
		//ʹ���ַ���.equals()�ж��Ƿ����
		if(result3.equals(ret)) {
			assertEquals(1,1);
		}else {
			assertEquals(1,0);
		}
	}	
}







