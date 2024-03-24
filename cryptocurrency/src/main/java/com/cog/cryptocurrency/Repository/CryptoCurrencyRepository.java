package com.cog.cryptocurrency.Repository;

// Create a repository interface called CryptoCurrencyRepository which extends CrudRepository
// add a type of CryptoCurrency and String
// add a annotation called @Repository

import com.cog.cryptocurrency.model.CryptoCurrency;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CryptoCurrencyRepository extends CrudRepository<CryptoCurrency, String> {

}