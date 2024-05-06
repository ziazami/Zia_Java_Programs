package Day40;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.IOException;
import java.util.Collection;
import java.util.Set;


public class Readingproperties
{
public static void main(String[] args) throws IOException{
	Properties prop = new Properties();
	String filePath = System.getProperty("user.dir")+"\\testdata\\config.properties";
	FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
	
	//loading prop file
	prop.load(fi);
	
	//read data from prop file
	String url = prop.getProperty("appurl");
	String email = prop.getProperty("email");
	String password = prop.getProperty("password");
	String orderid = prop.getProperty("orderid");
	String custid = prop.getProperty("customerid");
	
	System.out.println(url);
	System.out.println(email);
	System.out.println(password);
	System.out.println(orderid);
	System.out.println(custid);
	
	fi.close();
}
}