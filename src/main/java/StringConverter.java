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
        StringBuilder sb = new StringBuilder();

        for(int i =0; i<input.length()-1; i++){
            int j = i + 1;
            if(Character.isLowerCase(input.charAt(i)) && Character.isUpperCase(input.charAt(j)) && Character.isUpperCase(input.charAt(j+1))){
                sb.append(input.charAt(i));
                sb.append("_");

            }else if(Character.isUpperCase(input.charAt(i)) && Character.isLowerCase(input.charAt(j)) && i!=0){
                sb.append("_");
                sb.append(input.charAt(i));
            }else{
                sb.append(input.charAt(i));
            }
        }
        sb.append(input.charAt(input.length()-1));

        return String.valueOf(sb);
    }
}

