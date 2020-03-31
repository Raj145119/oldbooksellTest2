package com.oldBookSell.repository;

import org.springframework.data.repository.CrudRepository;

import com.oldBookSell.model.SellOrderRequest;

public interface SellOrderRequestRepository extends CrudRepository<SellOrderRequest, Integer>{

}
