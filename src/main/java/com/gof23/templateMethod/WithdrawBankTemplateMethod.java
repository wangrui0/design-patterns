package com.gof23.templateMethod;

public class WithdrawBankTemplateMethod extends BankTemplateMethod {

    @Override
    public void transact() {
        System.out.println("我要取钱");
    }

}
