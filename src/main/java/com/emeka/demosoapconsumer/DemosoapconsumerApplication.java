package com.emeka.demosoapconsumer;

import com.example.consumingwebservice.wsdl.GetCountryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemosoapconsumerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemosoapconsumerApplication.class, args);
    }

    @Autowired
    private CountryClient countryClient;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("SOAP Consumer Running");

        String country = "Spain";
        GetCountryResponse response = countryClient.getCountry(country);
        System.out.println(response.getCountry().getCurrency());

        System.out.println("Consumed");
    }
}
