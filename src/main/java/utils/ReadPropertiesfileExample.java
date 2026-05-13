
package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesfileExample {

	public String Read(String FilePath, String propName) throws IOException {

		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(FilePath);

		prop.load(file);
		return prop.getProperty(propName);
	}
}
