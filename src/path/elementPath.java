package path;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;




public class elementPath{
	public static void main(String[] args) throws Exception {
		System.out.println(read.readEmail(0));
		System.out.println(read.readPassWord(0));
		for(int i=0;i<3;i++) {
			System.out.println(read.readAddress(i));
		}
	}
}