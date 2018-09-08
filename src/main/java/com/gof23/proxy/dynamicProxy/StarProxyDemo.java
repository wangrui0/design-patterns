package com.gof23.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理的模拟实现：
 * 
 * @author jack
 *
 */
public class StarProxyDemo implements Star {
    private InvocationHandler handler;

    public StarProxyDemo(InvocationHandler handler) {
        super();
        this.handler = handler;
    }

    @Override
    public void confer()  {
        try {
            Method method=this.getClass().getMethod("confer", null);
            handler.invoke(this, method, null);
        } catch(Exception e) {
            e.printStackTrace();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    @Override
    public void signContact() {
        try {
            Method method=this.getClass().getMethod("signContact",  null);
            handler.invoke(this, method, null);
        } catch(Exception e) {
            e.printStackTrace();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    @Override
    public void bookTicket() {
        try {
            Method method=this.getClass().getMethod("bookTicket", null);
            handler.invoke(this, method, null);
        } catch(Exception e) {
            e.printStackTrace();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    @Override
    public void sing() {
        try {
            Method method=this.getClass().getMethod("sing", null);
            handler.invoke(this, method, null);
        } catch(Exception e) {
            e.printStackTrace();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    @Override
    public void collectMoney() {
        try {
            Method method=this.getClass().getMethod("collectMoney", null);
            handler.invoke(this, method, null);
        } catch(Exception e) {
            e.printStackTrace();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}
