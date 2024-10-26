/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.feign.account_micro.service;

import com.feign.account_micro.entity.AccountEntity;
import com.api.open.crud.api.service.IOpenCrudService;
/**
 *
 * @author NMSLAP570
 */
public interface IAccountService
        extends IOpenCrudService<AccountEntity, Long> {    
}
