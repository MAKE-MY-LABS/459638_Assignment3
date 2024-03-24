package com.cog.cryptocurrency.Repository;

import com.cog.cryptocurrency.model.CryptoCurrency;
/*
 * Create a repository interface called WishListRepository which extends CrudRepository
 * add a type of CryptoCurrency and String
 * add a annotation called @Repository
 */
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishListRepository extends CrudRepository<CryptoCurrency, String> {

}