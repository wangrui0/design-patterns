package com.gof23.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 动态代理处理器：
 * @author jack
 *
 */
public class StarHandler implements InvocationHandler{
    private Star star;
    public StarHandler(Star star) {
        super();
        this.star = star;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object=null;
        System.out.println("唱歌之前的步骤：面谈，签协议，订票");
        if("sing".equals(method.getName())){
            object = method.invoke(star, args);//调用真实对象的方法，object为返回值；
        }
        System.out.println("唱歌之后的步骤：拿钱");
        return object;
    }
}
