package Utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class DeviceCapabilities {
	public static String getCapabilities(String inp) {
		String out = null;
		String projectPath=System.getProperty("user.dir");
		try {
		Properties prop=new Properties();
		InputStream input=new FileInputStream(projectPath+"\\src\\main\\java\\Utils\\Config.properties");
		prop.load(input);
		out=prop.getProperty(inp);
		}
		catch(Exception exp) {
			System.out.print(exp.getMessage());
			exp.printStackTrace();
		}
		return out;
	}

}
