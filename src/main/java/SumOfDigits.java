package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfDigits {


    public static void main(String[] args) throws IOException
    {

        String inputLen = readInputFromConsole();
        if(!checkValidInput(inputLen)){
            System.out.println("Please enter the non-negative numeric value");
        }else{
            String[] inpNum = new String[Integer.parseInt(inputLen)];
            enterValidIntNumber(inpNum);
        }
    }

    private static void enterValidIntNumber(String[] inpNum) throws IOException {

        for(int i =0; i< inpNum.length; i++){
            inpNum[i] = readInputFromConsole();
            if(!checkValidInteger(inpNum[i])){
                System.out.println("Please enter the non-negative numeric value");
            }
        }
        calSumOfDigits(inpNum);
    }

    private static void calSumOfDigits(String[] inpDigits) {

        for(int i = 0; i< inpDigits.length; i++){
            int sum = 0;
            String inputNum = inpDigits[i];
            for(int j=0; j < inputNum.length(); j++){
                sum += Character.getNumericValue(inputNum.charAt(j));
            }
            System.out.println("Sum of numeric value: " + sum);

        }
    }


    public static String readInputFromConsole() throws IOException {

        String input = null;
        BufferedReader bf= null;
        try {
            bf = new BufferedReader(new InputStreamReader(System.in));

            input = bf.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }
        return input;
    }

    public static boolean checkValidInput(String input) {

        int val = Integer.parseInt(input);
        if(val < 0 || val >= 30){
            return false;
        }
        return true;
    }

    private static boolean checkValidInteger(String s) {

        int val = Integer.parseInt(s);
        if(val < 0 || val >= 1000){
            return false;
        }
        return true;
    }

}
