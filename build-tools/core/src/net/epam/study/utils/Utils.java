package net.epam.study.utils;

import net.epam.study.StringUtils;

public class Utils {
    public boolean isAllPositiveNumbers(String... stringArr){
        StringUtils stringUtils = new StringUtils();
        int counter = 0;
        for (String string : stringArr) {
            if (stringUtils.isPositiveNumber(string)) {
                counter++;
            }
        }
        return counter == stringArr.length;
    }
}
