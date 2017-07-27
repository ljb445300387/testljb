
/**
 *UDPServer
 *@author Winty wintys@gmail.com
 *@version 2008-12-15
 */
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

class UDPServer {
	public static void main(String[] args) throws IOException {
		System.out.println(URLEncoder.encode("www.baidu.com?name=赖建波","gbk"));
		System.out.println(URLEncoder.encode("www.baidu.com?name=赖建波","gbk"));
		System.out.println(URLDecoder.decode("www.baidu.com%3Fname%3D%E8%B5%96%E5%BB%BA%E6%B3%A2"));
	}
}