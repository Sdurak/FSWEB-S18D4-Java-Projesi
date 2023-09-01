package com.workintech.service;

import com.workintech.entity.Address;

import java.util.List;

public interface AddressService {
    List<Address> findAll();
    Address find(int id);
    Address save(Address address);
    void delete(Address address);
}
