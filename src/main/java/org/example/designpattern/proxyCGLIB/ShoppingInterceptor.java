package org.example.designpattern.proxyCGLIB;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author wzy
 * @since 2023/10/18
 */
public class ShoppingInterceptor implements MethodInterceptor {
    private String customerName;
    ShoppingInterceptor(String customerName) {
        this.customerName = customerName;
    }
    @Override
    public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(customerName + " hired a shopping agent");
        Object result = methodProxy.invokeSuper(obj, objects);
        System.out.println("Purchase completed by proxy shopper.");
        return result;
    }
}
