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
	public static void main(String[] args) {
		
	}
}