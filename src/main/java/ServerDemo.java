import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.CharsetDecoder;
import java.util.Arrays;

import org.springframework.util.StringUtils;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(10004);
		Socket s = ss.accept();
		InputStream inputStream = s.getInputStream();
		InputStreamReader in2 = new InputStreamReader(inputStream);
		BufferedReader in = new BufferedReader(in2);
		String line = null;

		/*PrintWriter buf=new PrintWriter(new FileWriter("C:\\Users\\Administrator\\Desktop\\2.txt"),true);
		while((line=in.readLine())!=null)
		{    
		    buf.println(line);
		}*/
		//		BufferedWriter buf = new BufferedWriter(new FileWriter("C:\\Users\\Administrator\\Desktop\\2.txt"));
		byte[] result = new byte[50];
		int j = 0;
		int i = 0;
		while ((i = inputStream.read(result)) != -1) {
			j = j + i;
			//			buf.write(line);
			//			buf.newLine();
			//			System.out.println(new String(result));
			//			System.out.println(new String(line.getBytes(), "GBK"));
			//			System.out.println(new String(line.getBytes(), "gb2312"));
			//			System.out.println(new String(line.getBytes(), "utf-8"));
			//			buf.flush();
		}
		System.out.println(new String(result));
		System.out.println(new String(result, "GBK"));
		System.out.println(new String(result, "gb2312"));
		System.out.println(new String(result, "utf-8"));
		byte[] copyOf = Arrays.copyOf(result, 2);
		System.out.println(new String(copyOf, "gb2312"));
		byte[] bs = "我".getBytes("utf-8");
		System.out.println(bs.length);
		byte[] copyOf2 = Arrays.copyOfRange(result, 2, 5);
		System.out.println(new String(copyOf2, "utf-8"));
		
		
		String string = new String(copyOf, "utf-8");
		System.out.println(string);
		String stringgbk = new String(copyOf, "gbk");
		System.out.println(stringgbk);

		/*		while ((line = in.readLine()) != null) {
		//			buf.write(line);
		//			buf.newLine();
					System.out.println(new String(line.getBytes(), "GBK"));
					System.out.println(new String(line.getBytes(), "gb2312"));
					System.out.println(new String(line.getBytes(), "utf-8"));
		//			buf.flush();
				}
		*/
		PrintWriter out = new PrintWriter(s.getOutputStream(), true);
		out.println("传输成功");
		ss.close();
		//		buf.close();
	}
}