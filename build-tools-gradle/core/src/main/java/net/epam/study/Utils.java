package net.epam.study;

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
