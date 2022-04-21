import java.util.Scanner;

public class StringConverter {

    public static void main(String[] args) {

        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Please key in a string input: ");
            String input = sc.nextLine();

            String newStr = convertStr(input);
            System.out.println("The converted string is: " + newStr);
        }

        catch(Exception e) {
            System.out.println("No input detected, please key in the following format: \"getXXXXXXX\"");
        }
    }

    public static String convertStr(String input){
        input = input.substring(3);
        String returnStr = "";

        for(int i =0; i<input.length()-1; i++){
            int j = i + 1;
            if(Character.isLowerCase(input.charAt(i)) && Character.isUpperCase(input.charAt(j)) && Character.isUpperCase(input.charAt(j+1))){
                returnStr += input.charAt(i);
                returnStr += "_";

            }else if(Character.isUpperCase(input.charAt(i)) && Character.isLowerCase(input.charAt(j)) && i!=0){
                returnStr += "_";
                returnStr += input.charAt(i);
            }else{
                returnStr += input.charAt(i);
            }
        }
        returnStr += input.charAt(input.length()-1);

        return returnStr;
    }
}

