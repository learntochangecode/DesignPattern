package org.example.designpattern.proxyCGLIB;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author wzy
 * @since 2023/10/18
 */
public class CglibProxyExample {
    public static void main(String[] args) {
        String customName = "Sasha";
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealShoppingService.class);
        enhancer.setCallback(new ShoppingInterceptor(customName));
        RealShoppingService service = (RealShoppingService)enhancer.create();
        service.buyItem("Macbook Pro 16");

    }
}
