package ucn.ui;
import java.util.Scanner;

public class Demo{
	//һ��0.01m���ֽ���۵����ٴ��ܵ������������ĸ߶ȣ�8848m��
//	public static void main(String[] args) {
//		int times = 0;
//		double y = 0.01;
//		
//		while(y<=8848) {
//			y = y*2;
//			times++;
//			System.out.println("�۵���"+times+"�εĺ����"+y);
//		}
//		System.out.println("���۵�������"+times);
//		
//	}
	
	//do while���10���ַ���
//	public static void main(String[] args) {
//		int x=0;
//		do {
//			System.out.println("dowhileѭ����");
//			x++;
//		}while(x<10);
//	}
	//���4��5�е�*
//	public static void main(String[] args) {
//		for(int y=0;y<4;y++) {
//			for(int x=0;x<5;x++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
	/*
	 ���
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
	//99�˷���
//	public static void main(String[] args) {
//		for(int x=1;x<=9;x++) {
//			for(int y=1;y<=x;y++) {
//				System.out.print(y+"x"+x+"="+y*x+"\t");
//			}
//			System.out.println();
//		}
//	}
	//break��ת���
//	public static void main(String[] args) {
//		//��������ѭ��
//		for(int x=0;x<10;x++) {
//			if(x==3) {
//				break;
//			}
//			System.out.println("��������ѭ����");
//		}
//		System.out.println("over!");
//		//�������ѭ��
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
	//ÿ���2.5Ԫ��ÿ����һ���ǵ�5�����5�ı������ͻỨȥ6ԪǮ���ʣ�������������Դ浽100Ԫ
	/*
	public static void main(String[] args) {
		double dayMoney = 2.5;
		double daySum = 0;
		int dayCount =1;
		double result = 100;
		//��Ϊ��֪��Ҫ������죬��������ѭ��
		while(true) {
			//ÿ���ۼ�Ǯ
			daySum +=dayMoney;
			//����湻��100Ԫ������
			if(daySum >= result) {
				System.out.println("��"+dayCount+"��浽��"+daySum+"Ԫ");
				break;
			}
			if(dayCount%5==0) {
				//����5���5��ı����򻨵�6Ԫ
				daySum -=6;
				System.out.println("��"+dayCount+"�컨��6Ԫ");
			}
			dayCount++;
		}
	}
	*/
	//���������������ֵ
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�������һ��ֵ��");
//		int a = sc.nextInt();
//		System.out.println("������ڶ���ֵ��");
//		int b = sc.nextInt();
//		System.out.println("�����������ֵ��");
//		int c = sc.nextInt();
//		int result = max(a,b,c);
//		System.out.println("����ֵ�ǣ�"+result);
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
	//�����������������������
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		System.out.println("����������");
//		int m = sc.nextInt();
//		System.out.println("����������");
//		int n = sc.nextInt();
//		printXing(m, n);
//		}
//		//���巽��
//	public static void printXing(int m,int n){
//		for(int x=0;x<m;x++){
//			for(int y=0;y<n;y++){
//					System.out.print("*");
//				}
//			System.out.println();
//			}
//		System.out.println("------------------------------");
//		}
	//���nn�˷���
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�����룺");
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