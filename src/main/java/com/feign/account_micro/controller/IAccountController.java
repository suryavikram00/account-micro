package com.feign.account_micro.controller;

import com.api.open.crud.api.controller.IOpenCrudController;
import com.feign.account_micro.entity.AccountEntity;


public interface IAccountController
        extends IOpenCrudController<AccountEntity, Long> {

}