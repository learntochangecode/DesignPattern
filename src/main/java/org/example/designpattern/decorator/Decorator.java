package org.example.designpattern.decorator;

/**
 * @author wzy
 * @since 2023/10/18
 */
public class Decorator {
    public static void main(String[] args) {
        //原味咖啡
        ICoffee coffee = new OriginalCoffee();
        coffee.makeCoffee();
        System.out.println("");

        //加奶的咖啡
        coffee = new MilkDecorator(coffee);
        coffee.makeCoffee();
        System.out.println("");

        //先加奶后加糖的咖啡
        coffee = new SugarDecorator(coffee);
        coffee.makeCoffee();
    }
}
