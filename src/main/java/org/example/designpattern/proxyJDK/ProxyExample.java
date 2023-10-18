package org.example.designpattern.proxyJDK;

/**
 * @author wzy
 * @since 2023/10/18
 *
 */
public class ProxyExample {
    public static void main(String[] args) {
        String customerName = "Sasha";
        ShoppingService shoppingService = new ShoppingProxy(customerName);
        shoppingService.buyItem("Shirt");
    }
}
