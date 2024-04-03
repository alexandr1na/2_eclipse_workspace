package utilities;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
	public static void main(String[] args) throws IOException {
		
		FileReader fr1 = new FileReader("C:\\2_eclipse-workspace\\sandraProject\\src\\test\\resources\\configFiles\\config.properties");
		Properties pr = new Properties();
		pr.load(fr1);
		
	}
}