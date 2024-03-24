package com.cog.cryptocurrency.services;

/*
 * Create a service class called WishListServiceImpl which implements WishListService
 * autowire the WishListRepository
 * create below all methods
 */
import com.cog.cryptocurrency.Repository.WishListRepository;
import com.cog.cryptocurrency.exceptions.WishListAlreadyExistException;
import com.cog.cryptocurrency.model.CryptoCurrency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishListServiceImpl implements WishListService {

    @Autowired
    private WishListRepository wishListRepository;

    @Override
    public CryptoCurrency saveWishList(CryptoCurrency cryptoCurrency) throws WishListAlreadyExistException {

        if (wishListRepository.existsById(cryptoCurrency.getId())) {
            throw new WishListAlreadyExistException("WishList already exist");
        }
        return wishListRepository.save(cryptoCurrency);
    }
 // Create a override method called getWishList
    // return the list of wishListRepository.findAll()
          
     @Override
    public List<CryptoCurrency> getsWishList() {
        return (List<CryptoCurrency>) wishListRepository.findAll();
    }

    @Override
    public void deleteWishListById(String   id) {
        wishListRepository.deleteById(id);
    }

    @Override
    public CryptoCurrency updateWishList(CryptoCurrency cryptoCurrency) {
        return wishListRepository.save(cryptoCurrency);
    }
}