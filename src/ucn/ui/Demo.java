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
	//���������Ԫ��
//	public static void main(String[] args) {
//		//�����ṩ��һ�����ԣ�lengthר�����ڻ�ȡ����ĳ���
//		//��ʽ�ǣ�������.length
//		int[] arr= {1,3,45,6,7,8,98,9,34,2,568,98,9,348,98,9,348,98,9,348,98,9,348,98,9,348,98,9,348,98,9,34};
//		int[] arr2= {1,3,45,6,7,8,98,9,34,2,568,98,9,348,98,9,348,98,9,348,98,9,348,98,9,348,98,9,348,98,9,34,44,22,1223,444};
//		for(int x =0; x<arr.length;x++) {
//			System.out.println(arr[x]);
//		}
//		System.out.println("���鳤���ǣ�"+arr.length);
//		printArry(arr);
//		printArry2(arr2);
//	}
//	public static void printArry(int[] arr){
//		for(int x =0; x<arr.length;x++) {
//			System.out.println(arr[x]);
//		}
//	}
//	//��Ԫ�ذ���ʽһ�����
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
	
	//��ȡ�����е���ֵ
//	public static void main(String[] args) {
//		int[] arr1 = {23,34,45,123,554};
//		int[] arr2 = {23,34,45,123,554,12,234,545};
//		System.out.println("���ֵ�ǣ�"+getMax(arr1));
//		System.out.println("��Сֵ�ǣ�"+getMin(arr2));
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
	//�������򣬰�����0��arr.length-1�����ݽ���������1��arr.length-2�����ݽ���....����arr.length/2��ʱ�򼴿�
	//������ȷ������ֵ���ͣ�void�����˻��뷵�ص������飬û��Ҫ����Ϊ������������ʵ��ͬһ������
//	public static void main(String[] args) {
//		int[] arr = {1,2,3,4,5,6,7,8,9};
//		//��ʽ��ӡԭ����
//		System.out.println("��������ǰ�ǣ�");
//		printArry2(arr);
//		//��ʽ��ӡ��������
//		System.out.println("1������������ǣ�");
//		revers(arr);
//		System.out.println();
//		//����ֵ������ʽ��ӡ
//		System.out.println("2������������ǣ�");
//		revers2(arr);
//		printArry2(arr);
//	}
//	//ֱ�Ӱ���ʽ�����ӡ
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
//	//ֻ�������е�Ԫ������
//	public static void revers2(int[] arr) {
//		for(int start=0, end=arr.length-1;start<=end;start++,end--) {
//			int temp = arr[start];
//			arr[start]=arr[end];
//			arr[end]=temp;
//		}
//	}
	//�����������ݼ���¼�����������Ҷ�Ӧ���ڼ�
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("������Ҫ��ѯ��������");
//		getWeek(sc.nextInt());
//	}
//	public static void getWeek(int x) {
//		String[] strArry= {"����һ","���ڶ�","������","������","������","������","������"};
//		System.out.println(strArry[x-1]);
//	}
	//����Ԫ�ز��ң����Ҽ��������Ԫ���������е�һ�γ��ֵ�����
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("��������Ҫ���ҵ�Ԫ��");
//		int element = sc.nextInt();
//		getIndex(element);
//		System.out.println("----------------------------------");
//		int index = getIndex2(element);
//		System.out.println("��Ҫ���ҵ�Ԫ���������е�һ�γ����ǣ�"+index);
//	}
//	//ֱ�Ӵ�ӡ��λ��
//	public static void getIndex(int element) {
//		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
//		for(int x =0;x<arr.length;x++) {
//			if(arr[x]==element) {
//				System.out.println("��Ҫ�ҵ�"+element+"���Ѿ��ҵ�������λ����"+x);
//				break;
//			}else if(x==arr.length-1){
//				System.out.println("��Ҫ�ҵ�"+element+"û���ҵ�");
//			}
//		}
//	}
//	//����λ�õ�ֵ
//	public static int getIndex2(int value) {
//		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,7};
//		for(int x=0;x<arr.length;x++) {
//			if(arr[x]==value) {
//				return x;
//			}
//		}
//		return -1;
//	}
	//��ά�������
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
	//ͳ�����۶��ܺ�
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
	//��ӡ������ǣ������ü���¼��
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������������");
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