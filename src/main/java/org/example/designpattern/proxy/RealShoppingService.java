package org.example.designpattern.proxy;

/**
 * @author wzy
 * @since 2023/10/18
 * 实际购物服务
 */
class RealShoppingService implements ShoppingService {
    @Override
    public void buyItem(String item) {
        System.out.println("Buying item: " + item);
    }
}