package com.oracle.test;
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

import com.oracle.main.Task;


@RunWith(Parameterized.class)
public class TestTriangleByParameter {
	private int param1;
	private int param2;
	private int param3;
	private int result;
	
	Task task = new Task();
	
	public TestTriangleByParameter(int param1,int param2,int param3,int result) {
		super();
		this.param1 = param1;
		this.param2 = param2;
		this.param3 = param3;
		this.result = result;
	}
	

	@Parameters
	public static Collection getData() {
//		return Arrays.asList(new Integer[][] {{2,2,2,1},{1,1,1,1},{1,2,3,0}});
		try {
			BufferedReader reader=new BufferedReader(new FileReader("src\\com\\oracle\\test\\text_triangle.txt"));
			String line = null;
			List<Integer []> list=new ArrayList<>();
			while((line=reader.readLine())!=null) {
				String [] strarr=line.split(",");
				Integer [] intarr=new Integer[4];
				for(int i = 0;i < strarr.length;i++) {
					intarr[i]=Integer.parseInt(strarr[i]);
				}
				list.add(intarr);
			}
			reader.close();
			return list;
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@Test
	//测试是否是三角形
	//1:是三角形		0：不是三角形
	public void testTriangle() {
		int ret = task.isTriangle(param1,param2,param3);
		assertEquals(result,ret);
	}
}