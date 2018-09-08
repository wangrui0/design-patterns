package com.gof23.templateMethod;

public class Client {
    public static void main(String[] args) {
        BankTemplateMethod withdrawBankTemplateMethod = new WithdrawBankTemplateMethod();
        withdrawBankTemplateMethod.process();
        //使用内部类实现模板方法
        BankTemplateMethod bankTemplateMethod = new BankTemplateMethod() {
            
            @Override
            public void transact() {
                System.out.println("我要存钱，存1000W人民币");
            }
        };
        bankTemplateMethod.process();
        BankTemplateMethod templateMethod = new BankTemplateMethod() {
            
            @Override
            public void transact() {
                  System.out.println("我要理财，理财金额5000W人民币");
            }
        };
        templateMethod.process();
    }
}
