package com.cog.cryptocurrency.services;

// Create a service interface called CryptoCurrencyService
// add a method called getLatestCryptoCurrency

import com.cog.cryptocurrency.model.CryptoCurrenciesList;

public interface CryptoCurrencyService {
    CryptoCurrenciesList getLatestCryptoCurrency();
}