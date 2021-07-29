package models;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class DataModel {

    Properties properties = new Properties();
    InputStream inputStream = null;


    //ensure environment is set before test can be run example, is vm Options is set to -Denv=test
    public String getBaseURL () {

        String  environment = "" ;

        if(System.getProperty("env") == null || System.getProperty("env") == "") {

            System.out.println("Environment not set. Please set environment to run test");
        }

        switch (System.getProperty("env")) {

            case "test":
                environment = "https://v6.exchangerate-api.com" ;
                break;

            case "prod":
                environment = "https://dfdfdf.com" ;
                break;

        }

        return environment ;
    }





    public String getEnvProperties(String key) {
        try {
            inputStream = new FileInputStream("src/test/java/data/testdata.properties");
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(key) ;
    }


}
