
public class Work2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//将原数组中重复的数据去除，并把剩余的数据传入一个新的数组
		int[] oldArr = {1,2,2,3,4,4,5,6,7,7,8};
		int k = 0;
		int[] temp = new int[oldArr.length];
		for(int i=0;i<oldArr.length;i++) {
			boolean flag = true;
			for(int j=i+1;j<oldArr.length;j++) {
				//重复了
				if(oldArr[i]==oldArr[j]) {
					flag = false;
					break;
				}
			}
			//根据flag值来存入新数组
			if(flag) {
				temp[k] = oldArr[i];
				k++;
			}
		}
		//遍历temp数组
		/*for (int i : temp) {
			System.out.print(i+" ");
		}*/
		int[] newArr = new int[k];
		System.arraycopy(temp, 0, newArr, 0, k);
		System.out.println();
		//遍历新数组
		for (int i : newArr) {
			System.out.print(i+" ");
		}
	}
}
