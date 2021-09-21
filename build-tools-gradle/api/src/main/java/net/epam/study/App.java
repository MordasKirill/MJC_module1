package net.epam.study;

public class App {
    public static void main(String[] args) {
        Utils utils = new Utils();
        System.out.println("Is all input numbers positive: " +
                utils.isAllPositiveNumbers("21", "12121", "1242272545"));
    }
}
