package com.feign.account_micro.entity;

import com.open.feign_client.entity.account_micro.AccountEntityModel;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "account")
public class AccountEntity extends AccountEntityModel{

}
