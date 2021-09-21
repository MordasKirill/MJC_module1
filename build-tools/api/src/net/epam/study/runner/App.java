package net.epam.study.runner;

import net.epam.study.utils.Utils;

public class App {
    public static void main(String[] args) {
        Utils utils = new Utils();
        System.out.println("Is all input numbers positive: " +
                utils.isAllPositiveNumbers("12", "79", "5515111"));
    }
}
