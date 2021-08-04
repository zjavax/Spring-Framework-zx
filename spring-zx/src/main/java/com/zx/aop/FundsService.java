package com.zx.aop;

import java.util.Arrays;
import java.util.stream.Collectors;

//模拟资金操作
public class FundsService {
	//账户余额
	private double balance = 1000;

	//模拟充值
	public double recharge(String userName, double price) {
		System.out.println(String.format("%s充值%s", userName, price));
		balance += price;
		return balance;
	}

	//模拟提现
	public double cashOut(String userName, double price) {
		if (balance < price) {
			throw new RuntimeException("余额不足!");
		}
		System.out.println(String.format("%s提现%s", userName, price));
		balance -= price;
		return balance;
	}

	//获取余额
	public double getBalance(String userName) {
		return balance;
	}

	public void list(Object... args) {
		System.out.println(Arrays.stream(args).collect(Collectors.toList()));
	}
}
