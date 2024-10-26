package com.feign.account_micro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.feign.account_micro.constant.AccountMicroEndPoints.ENDPOINT_ACCOUNT;
import com.api.open.crud.api.controller.OpenCrudController;
import com.feign.account_micro.entity.AccountEntity;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
@RequestMapping(path = ENDPOINT_ACCOUNT)
public class AccountController
        extends OpenCrudController<AccountEntity, Long> implements IAccountController {

  @GetMapping("/hello")
  public String hello() {
    return "Hello World";
  }

}
