import java.io.UnsupportedEncodingException;

public class Test {
	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] bs = "我".getBytes("utf-8");
		byte[] bs2 = "我我我我".getBytes("gbk");
		System.out.println(bs.length);
		System.out.println(bs2.length);
		String string = new String(bs2, "utf-8");
		System.out.println(string);
		String stringgbk = new String(bs2, "gbk");
		System.out.println(stringgbk);
	}
}
