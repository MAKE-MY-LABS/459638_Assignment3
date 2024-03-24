package com.cog.cryptocurrency.services;

/*
* Create a service class called CryptoCurrencyServiceImpl which implements CryptoCurrencyService
* add autowire the RestTemplate
* add a value called API_BASE_URL which would read the value from application.properties API_BASE_URL
* create a method called getLatestCryptoCurrency which will call the endpoint API_BASE_URL +  "cryptocurrencies" using URIComponentsBuilder
* and return the list of cryptocurrencies
*/
import com.cog.cryptocurrency.model.CryptoCurrenciesList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class CryptoCurrencyServiceImpl implements CryptoCurrencyService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${API_BASE_URL}")
    private String API_BASE_URL;

    @Override
    public CryptoCurrenciesList getLatestCryptoCurrency() {
        System.out.println("API_BASE_URL: " + API_BASE_URL);
        return restTemplate.getForObject(
                UriComponentsBuilder.fromHttpUrl(API_BASE_URL + "cryptocurrencies").toUriString(),
                CryptoCurrenciesList.class);
    }
}