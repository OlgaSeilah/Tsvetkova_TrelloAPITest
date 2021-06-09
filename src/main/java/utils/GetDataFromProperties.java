package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public class GetDataFromProperties {
//    public static HashMap<String, String> properties;
//
//    public static void main() {
//        properties = new HashMap<>();
//        ReadKeyTokenFromProps readKeyTokenFromProps = new ReadKeyTokenFromProps();
//        readKeyTokenFromProps.printAll("testProps.properties");
//    }
//
//    private void printAll(String filename) {
//
//        try (InputStream input = getClass().getClassLoader().getResourceAsStream(filename)) {
//
//            Properties prop = new Properties();
//
//            if (input == null) {
//                System.out.println("Sorry, unable to find " + filename);
//                return;
//            }
//
//            prop.load(input);
//
//            for (String key : prop.stringPropertyNames()) {
//                properties.put(key, prop.getProperty(key));
//            }
//
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//    }




    private static final Properties PROPERTIES;

    static {
        PROPERTIES = new Properties();
        String testDataPropsPath = "src/main/resources/testProps.properties";
        try (InputStream in = new FileInputStream(testDataPropsPath)) {
            PROPERTIES.load(in);
        } catch (IOException e) {
            System.out.println("Can't load properties file");
            e.printStackTrace();
        }
    }

    public static Properties getProperties() {
        return PROPERTIES;
    }


}

