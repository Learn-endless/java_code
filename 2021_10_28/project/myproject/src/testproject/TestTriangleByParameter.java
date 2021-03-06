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
	private int param1;
	private int param2;
	private int param3;
	private int result; 

	
	public TestTriangleByParameter(int param1, int param2, int param3) {
		super();
		this.param1 = param1;
		this.param2 = param2;
		this.param3 = param3;
		this.result = result;
		
	}
	@Parameters
	public static Collection getData() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("src\\testproject\\text_grade.txt"));
			String line = null;
			List<Integer []> list = new ArrayList<>();
			while((line=reader.readLine())!=null) {
				String[] strarr = line.split(",");
				Integer[] intarr = new Integer[4];
				for(int i = 0;i < strarr.length;i++) {
					intarr[i] = Integer.parseInt(strarr[i]);
				}
				list.add(intarr);
			}
			reader.close();
			return list;
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	Triangle triangle = new Triangle(param1,param2,param3);
	@Test
	public void test() {
		int ret = triangle.girth();
		assertEquals(result,ret);
	}
}
