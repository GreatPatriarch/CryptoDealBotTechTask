package com.deal.repository;

import com.deal.dto.CryptoCurrency;
import org.springframework.data.repository.CrudRepository;

public interface CryptoCurrencyRepository extends CrudRepository<CryptoCurrency,String> {

}
