package ucn.ui;
import java.util.Scanner;

public class Demo{
	//一个0.01m厚的纸，折叠多少次能到到珠穆朗玛峰的高度（8848m）
//	public static void main(String[] args) {
//		int times = 0;
//		double y = 0.01;
//		
//		while(y<=8848) {
//			y = y*2;
//			times++;
//			System.out.println("折叠第"+times+"次的厚度是"+y);
//		}
//		System.out.println("总折叠次数："+times);
//		
//	}
	
	//do while输出10次字符串
//	public static void main(String[] args) {
//		int x=0;
//		do {
//			System.out.println("dowhile循环！");
//			x++;
//		}while(x<10);
//	}
	//输出4行5列的*
//	public static void main(String[] args) {
//		for(int y=0;y<4;y++) {
//			for(int x=0;x<5;x++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
	/*
	 输出
	 *
	 **
	 ***
	 ****
	 *****
	*/
//	public static void main(String[] args) {
//		for(int x=0;x<5;x++) {
//			for(int y=0;y<=x;y++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
	//99乘法表
//	public static void main(String[] args) {
//		for(int x=1;x<=9;x++) {
//			for(int y=1;y<=x;y++) {
//				System.out.print(y+"x"+x+"="+y*x+"\t");
//			}
//			System.out.println();
//		}
//	}
	//break跳转语句
//	public static void main(String[] args) {
//		//跳出单层循环
//		for(int x=0;x<10;x++) {
//			if(x==3) {
//				break;
//			}
//			System.out.println("跳出单层循环！");
//		}
//		System.out.println("over!");
//		//跳出多层循环
//		wc:for(int i=1;i<=9;i++) {
//			nc:for(int j=1;j<=i;j++) {
//				if(j==5) {
////					break wc;
//					break nc;
//				}
//				System.out.print(j+"*"+i+"="+i*j+"\t");
//			}
//			System.out.println();
//		}
//	}
	//每天存2.5元，每当这一天是第5天或者5的倍数，就会花去6元钱，问：经过多少天可以存到100元
	/*
	public static void main(String[] args) {
		double dayMoney = 2.5;
		double daySum = 0;
		int dayCount =1;
		double result = 100;
		//因为不知道要存多少天，所以用死循环
		while(true) {
			//每天累加钱
			daySum +=dayMoney;
			//如果存够了100元则跳出
			if(daySum >= result) {
				System.out.println("第"+dayCount+"天存到了"+daySum+"元");
				break;
			}
			if(dayCount%5==0) {
				//到了5天或5天的倍数则花掉6元
				daySum -=6;
				System.out.println("第"+dayCount+"天花掉6元");
			}
			dayCount++;
		}
	}
	*/
	//返回三个数的最大值
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("请输入第一个值：");
//		int a = sc.nextInt();
//		System.out.println("请输入第二个值：");
//		int b = sc.nextInt();
//		System.out.println("请输入第三个值：");
//		int c = sc.nextInt();
//		int result = max(a,b,c);
//		System.out.println("最大的值是："+result);
//	}
//	public static int max(int a,int b,int c) {
////		if(a>b) {
////			if(a>c) {
////				return a;
////			}else {
////				return c;
////			}
////		}else {
////			if(b>c) {
////				return b;
////			}else {
////				return c;
////			}
////		}
//		int temp = ((a>b)?a:b);
//		int max = ((temp>c)?temp: c);
//		return max;
//	}
	//输入行数和列数，输出星形
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		System.out.println("输入行数：");
//		int m = sc.nextInt();
//		System.out.println("输入列数：");
//		int n = sc.nextInt();
//		printXing(m, n);
//		}
//		//定义方法
//	public static void printXing(int m,int n){
//		for(int x=0;x<m;x++){
//			for(int y=0;y<n;y++){
//					System.out.print("*");
//				}
//			System.out.println();
//			}
//		System.out.println("------------------------------");
//		}
	//输出nn乘法表
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("请输入：");
//		int n =sc.nextInt();
//		chengFaBiao(n);
//	}
//	public static void chengFaBiao(int n) {
//		for(int x =1;x<=n;x++) {
//			for(int y=1;y<=x;y++) {
//				System.out.print(y+"*"+x+"="+y*x+"\t");
//			}
//			System.out.println();
//		}
//	}
	//遍历数组的元素
//	public static void main(String[] args) {
//		//数组提供了一个属性，length专门用于获取数组的长度
//		//格式是：数组名.length
//		int[] arr= {1,3,45,6,7,8,98,9,34,2,568,98,9,348,98,9,348,98,9,348,98,9,348,98,9,348,98,9,348,98,9,34};
//		int[] arr2= {1,3,45,6,7,8,98,9,34,2,568,98,9,348,98,9,348,98,9,348,98,9,348,98,9,348,98,9,348,98,9,34,44,22,1223,444};
//		for(int x =0; x<arr.length;x++) {
//			System.out.println(arr[x]);
//		}
//		System.out.println("数组长度是："+arr.length);
//		printArry(arr);
//		printArry2(arr2);
//	}
//	public static void printArry(int[] arr){
//		for(int x =0; x<arr.length;x++) {
//			System.out.println(arr[x]);
//		}
//	}
//	//让元素按格式一行输出
	public static void printArry2(int[] arr) {
		System.out.print("[");
		for(int x =0;x<arr.length;x++) {
			if(x == arr.length-1) {
				System.out.println(arr[x]+"]");
			}else {
				System.out.print(arr[x]+",");
			}
		}
	}
	
	//获取数组中的最值
//	public static void main(String[] args) {
//		int[] arr1 = {23,34,45,123,554};
//		int[] arr2 = {23,34,45,123,554,12,234,545};
//		System.out.println("最大值是："+getMax(arr1));
//		System.out.println("最小值是："+getMin(arr2));
//	}
//	public static int getMax(int[] arr) {
//		int max = arr[0];
//		for(int x=1;x<arr.length;x++) {
//			if(max<arr[x]) {
//				max = arr[x];
//			}
//		}
//		return max;
//	}
//	public static int getMin(int[] arr) {
//		int mix = arr[0];
//		for(int x=1;x<arr.length;x++) {
//			if(mix>arr[x]) {
//				mix = arr[x];
//			}
//		}
//		return mix;
//	}
	//数组逆序，把索引0和arr.length-1的数据交换，索引1和arr.length-2的数据交换....做到arr.length/2的时候即可
	//两个明确：返回值类型：void，有人会想返回的是数组，没必要，因为这两个数组其实是同一个数组
//	public static void main(String[] args) {
//		int[] arr = {1,2,3,4,5,6,7,8,9};
//		//格式打印原数组
//		System.out.println("数组逆序前是：");
//		printArry2(arr);
//		//格式打印逆序数组
//		System.out.println("1、数组逆序后是：");
//		revers(arr);
//		System.out.println();
//		//数组值逆序后格式打印
//		System.out.println("2、数组逆序后是：");
//		revers2(arr);
//		printArry2(arr);
//	}
//	//直接按格式逆序打印
//	public static void revers(int[] arr) {
//		System.out.print("[");
//		for(int x=arr.length-1;x>=0;x--) {
//			if(x==0) {
//				System.out.println(arr[x]+"]");
//			}else {
//				System.out.print(arr[x]+",");
//			}
//		}
//	}
//	//只把数组中的元素逆序
//	public static void revers2(int[] arr) {
//		for(int start=0, end=arr.length-1;start<=end;start++,end--) {
//			int temp = arr[start];
//			arr[start]=arr[end];
//			arr[end]=temp;
//		}
//	}
	//数组查表法，根据键盘录入索引，查找对应星期几
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("请输入要查询的索引：");
//		getWeek(sc.nextInt());
//	}
//	public static void getWeek(int x) {
//		String[] strArry= {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
//		System.out.println(strArry[x-1]);
//	}
	//数组元素查找，查找键盘输入的元素在数组中第一次出现的索引
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("请输入你要查找的元素");
//		int element = sc.nextInt();
//		getIndex(element);
//		System.out.println("----------------------------------");
//		int index = getIndex2(element);
//		System.out.println("你要查找的元素在数组中第一次出现是："+index);
//	}
//	//直接打印出位置
//	public static void getIndex(int element) {
//		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
//		for(int x =0;x<arr.length;x++) {
//			if(arr[x]==element) {
//				System.out.println("你要找的"+element+"的已经找到，索引位置是"+x);
//				break;
//			}else if(x==arr.length-1){
//				System.out.println("你要找的"+element+"没有找到");
//			}
//		}
//	}
//	//返回位置的值
//	public static int getIndex2(int value) {
//		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,7};
//		for(int x=0;x<arr.length;x++) {
//			if(arr[x]==value) {
//				return x;
//			}
//		}
//		return -1;
//	}
	//二维数组遍历
//	public static void main(String[] args) {
//		int[][] arr = {{1,2,3,4},{3,4,5,6,7,8},{12,8,45,9,8,1,4,5,6,9,78,6,3,2,2,21,4,786}};
//		getTwoIndex(arr);
//		
//	}
//	public static void getTwoIndex(int[][] arr) {
//		for(int x =0;x<arr.length;x++){
//			for(int y=0;y<arr[x].length;y++) {
//				System.out.print(arr[x][y]+" ");
//			}
//			System.out.println();
//		}
//	}
	//统计销售额总和
//	public static void main(String[] args) {
//		int[][] arr = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
//		int sum = saleSum(arr);
//		System.out.println(sum);
//	}
//	public static int saleSum(int[][] arr) {
//		int monSum =0;
//		for(int x =0;x<arr.length;x++) {
//			for(int y =0;y<arr[x].length;y++) {
//				monSum += arr[x][y];
//			}
//		}
//		return monSum;
//	}
	//打印杨辉三角，行数用键盘录入
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入行数：");
		int line = sc.nextInt();
		sanJiao(line);
		
	}
	public static void sanJiao(int value) {
		int[][] arr = new int[value][value];
		for(int x=0;x<arr.length;x++) {
			arr[x][0]=1;
			arr[x][x]=1;
		}
		for(int x =2;x<arr.length;x++) {
			for(int y=1;y<=x-1;y++) {
				arr[x][y]=arr[x-1][y-1]+arr[x-1][y];
			}
		}
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
}