package reusableComponents;

import java.io.FileInputStream;
import java.util.Properties;

import io.opentelemetry.api.internal.StringUtils;

public class PropertiesOpertaion {
	
	static Properties p=new Properties();
	
	public static String getPropertyValueByKey(String key) throws Exception {
		//Load data 
		FileInputStream fis=new FileInputStream("./src/test/resources/config.properties");
		p.load(fis);
		
		//Read Data
		String value=p.getProperty(key);	
		if(StringUtils.isNullOrEmpty(value)) {
			throw new Exception("Key value is not specified for key"+key+" in properties file");
		}
		
		return value;		
	}

}
