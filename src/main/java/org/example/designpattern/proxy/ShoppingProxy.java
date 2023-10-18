package org.example.designpattern.proxy;

/**
 * @author wzy
 * @since 2023/10/18
 * 购物服务代理
 */
class ShoppingProxy implements ShoppingService {
    private ShoppingService realService;
    private String customerName;

    public ShoppingProxy(String customerName) {
        this.realService = new RealShoppingService();
        this.customerName = customerName;
    }

    @Override
    public void buyItem(String item) {
        System.out.println(customerName + " has hired a proxy shopper.");
        realService.buyItem(item);
        System.out.println("Purchase completed by proxy shopper.");
    }
}
