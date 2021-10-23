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
public class TestGradeByParameter {
	private int param1;
	private int result;
	
	Task task = new Task();
	
	public TestGradeByParameter(int param1, int result) {
		super();
		this.param1 = param1;
		this.result = result;
	}
	

	@Parameters
	public static Collection getData() {
//		return Arrays.asList(new Integer[][] {{95,1},{65,3},{85,2},{55,4},{-1,5});
		try {
			BufferedReader reader=new BufferedReader(new FileReader("src\\com\\oracle\\test\\text_grade.txt"));
			String line = null;
			List<Integer []> list=new ArrayList<>();
			while((line=reader.readLine())!=null) {
				String [] strarr=line.split(",");
				Integer [] intarr=new Integer[2];
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
	//测试成绩等级
	//1:优		2：良		3：中		4：差		5：出错
	public void testTriangle() {
		int ret = task.testGrade(param1);
		assertEquals(result,ret);
	}
}