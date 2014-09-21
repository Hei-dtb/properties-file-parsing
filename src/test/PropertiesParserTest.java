package test;

import main.PropertiesParser;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.util.Properties;

public class PropertiesParserTest {

    @Test
    public void test_read_properties_file() throws Exception {
        String path = getClass().getResource("my-properties-file.properties").getPath();
        Properties properties = new PropertiesParser().read(new File(path));

        Assert.assertEquals(properties.getProperty("animeTitle"), "Darker Than Black");
        Assert.assertEquals(properties.getProperty("episodesNumber"), "24");
        Assert.assertEquals(properties.getProperty("animeType"), "Mysterious");
    }
}