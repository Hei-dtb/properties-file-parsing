package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesParser {

    public Properties read(File file) throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream(file);
        properties.load(inputStream);
        return properties;
    }
}