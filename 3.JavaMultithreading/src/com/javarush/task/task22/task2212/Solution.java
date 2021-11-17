package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/

import java.util.regex.Pattern;

public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if (telNumber==null) {
            return false;
        }

        if(Pattern.matches("(?=^.?\\d*(\\(\\d{3}\\))?\\d+$)^(\\+(.?\\d){2})?([()]?\\d){10}$", telNumber) && (telNumber.replaceAll("\\D", "").length()==12 || telNumber.replaceAll("\\D", "").length()==10) ) {
            return true;
        }

       /* if(Pattern.matches("^(\\+|\\d|\\()((\\d{2})?\\(?\\d{3}\\)?\\d{6,7}$)", telNumber) && (telNumber.replaceAll("\\D", "").length()==12 || telNumber.replaceAll("\\D", "").length()==10) ){
            return true;
        }*/

            /*if(Pattern.matches("^(\\+)(\\d{2}\\(?\\d{3}\\)?\\d{7}$)", telNumber) && telNumber.replaceAll("\\D", "").length()==12){
                return true;
            }
            if(Pattern.matches("^(\\d|\\(?)(\\(?\\d{3}\\)?\\d{6,7}$)", telNumber)&& telNumber.replaceAll("\\D", "").length()==10){
                return true;
            }*/

            return false;
        //----------------------------------------------------------------
        /*boolean isIt = false;
        /*if(telNumber.matches("^\\+")&& telNumber.length()==12){
            return true;
        }*/
        /*boolean isIt = false;
        if( telNumber==null || telNumber.length() < 10)
            return isIt;
        if(Pattern.matches("^(((\\+))((\\d{12}$)|((((\\d{2}))(\\(\\d{3}\\))))(\\d{7}))$)|^(((\\(\\d{3}\\))|(\\d\\(\\d{3}\\)))((\\d{7})|(\\d{6}))$)", telNumber)) {
        //if(Pattern.matches("\\+?(\\d{2})\\(?(\\d{3})\\)?\\d-?(\\d{2})-?(\\d{2})-?(\\d{2})?", telNumber)){
            isIt = true;
        }

        return isIt;*/
    }

    public static void main(String[] args) {
        System.out.println("+380501234567 - " + checkTelNumber("+380501234567")); //- true
        System.out.println("+38(050)1234567 - " + checkTelNumber("+38(050)1234567")); //- true
        System.out.println("(050)1234567 - " + checkTelNumber("(050)1234567"));//- true
        System.out.println("0(501)234567 - " + checkTelNumber("0(501)234567")); //- true
        System.out.println("+38)050(1234567 - " + checkTelNumber("+38)050(1234567"));// - false
        System.out.println("+38(050)123-45-67 - " + checkTelNumber("+38(050)123-45-67"));//- false
        System.out.println("050ххх4567 - " + checkTelNumber("050ххх4567"));//- false
        System.out.println("050123456 - " + checkTelNumber("050123456")); //- false
        System.out.println("(0)501234567 - " + checkTelNumber("(0)501234567")); //- false
        System.out.println("050123(456)7 - " + checkTelNumber("050123(456)7"));


    }
}
