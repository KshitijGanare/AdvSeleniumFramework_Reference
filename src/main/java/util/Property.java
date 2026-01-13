package util;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class Property {

    public static String getProperty(String key) throws IOException {
        String path = System.getProperty("user.dir") + "/src/main/java/config/properties";
        FileInputStream file = new FileInputStream(path);
        Properties prop = new Properties();
        prop.load(file);
        return prop.getProperty(key);

    }

}


