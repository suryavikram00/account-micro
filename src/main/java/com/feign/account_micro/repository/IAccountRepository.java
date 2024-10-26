/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.feign.account_micro.repository;

import com.feign.account_micro.entity.AccountEntity;
import com.api.open.crud.api.repository.OpenCrudApiRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author NMSLAP570
 */
@Repository
@Transactional
public interface IAccountRepository
        extends OpenCrudApiRepository<AccountEntity, Long> {

}
