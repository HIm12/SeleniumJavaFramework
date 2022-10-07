package Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Log4j {

	static File file = new File(
			"C://Users//himanshukumar05//eclipse-workspace//ExitTest//src/test//java//config//config.properties");
	static FileInputStream fis = null;
	static Properties prop = new Properties();
	public static Logger logger = LogManager.getLogger(Log4j.class);

	static {

		// Exception Handling for FIS
		try {

			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {

			logger.error(e.getMessage());
		}

		// Exception Handling for Prop
		try {

			prop.load(fis);
		} catch (IOException e) {

			logger.error(e.getMessage());
		}

	}
}
