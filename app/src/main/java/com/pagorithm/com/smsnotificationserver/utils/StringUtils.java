package com.pagorithm.com.smsnotificationserver.utils;

/**
 * Created by pao
 */
public class StringUtils {

    /**
     * Check if string is a valid
     * phone number
     */
    public static boolean isValidPhoneNumber(String number){
        return (isNumeric(number) && number.length() == 10);
    }

    private static boolean isNumeric(String number){
        try{
            double d = Double.parseDouble(number);
        }catch (Exception e){
            return false;
        }
        return true;
    }


}
