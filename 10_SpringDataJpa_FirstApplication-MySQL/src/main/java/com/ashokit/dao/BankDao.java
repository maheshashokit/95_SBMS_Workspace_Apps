package com.ashokit.dao;

import com.ashokit.entity.Bank;
import org.springframework.data.repository.CrudRepository;

public interface BankDao extends CrudRepository<Bank, Integer> {
}
