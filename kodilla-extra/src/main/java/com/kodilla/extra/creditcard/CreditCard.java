package com.kodilla.extra.creditcard;

public class CreditCard {
    public String maskify(String ccNumber) {

        if (ccNumber == null || ccNumber.equals("")){
            return "";
        } else if (ccNumber.length() > 6 && !ccNumber.matches(".*[a-z].*")){
            String toMask = ccNumber.substring(1, ccNumber.length()-4);
            toMask = toMask.replaceAll("[0-9]", "#");
            String creditcardNumber = ccNumber.charAt(0) + toMask + ccNumber.substring(ccNumber.length() - 4);

            return creditcardNumber;
        }
        return ccNumber;
    }

}
