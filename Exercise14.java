/*
* Name: David Rodriguez
* Section: COSC/ITSE 1336
* Homework: Excercise 14
* Description: Switch Excercise
*/

/*
* -------------------------------PSUDO CODE---------------------------------------------
* Get userinput
*   while(intIndex <word.length)
*   
*---------------------------------------------------------------------------------------
*/

import java.util.Scanner;

public class Exercise14 {

    public static void main (String [] strArgs) {
        Scanner scnnrUserinput = new Scanner (System.in);
        String  strUserinput = "";
        int intIndex = 0;
        int intAcounter = 0;
        int intEcounter = 0;
        int intIcounter = 0;
        int intOcounter = 0;
        int intUcounter = 0;
        int intacounter = 0;
        int intecounter = 0;
        int inticounter = 0;
        int intocounter = 0;
        int intucounter = 0;
        int intNotVowelCounter = 0;

        System.out.println("Please enter a word.");
          strUserinput = scnnrUserinput.next();
    
        while (intIndex < strUserinput.length()) {

          switch (strUserinput.charAt(intIndex)) {
             case 'A':
                intAcounter++;
                break;
              case 'a': 
                intacounter++;
                break;
              case 'E':
                intEcounter++;
              case 'e': 
                intecounter++;              
                break;
              case 'I':
                intIcounter++;
                break;
              case 'i': 
                inticounter++;
                break;
              case 'O':
                intOcounter++;
                break;
              case 'o': 
                intocounter++;
                break;
              case 'U':
                intucounter++;
              case 'u':  
                intucounter++;
                break;

          default:
          intNotVowelCounter++;
          break;
    }
        intIndex++;
        }
  
        

          System.out.println("The number of vowels and nonvowels of your word are displayed in the menu below.");

            //Header display

System.out.println("////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n\t\t\t==\tVowel Menue Counter \t==");
System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\/////////////////////////////////////////");
            //Categories

            System.out.println("\t\tUpper Case\tLower Case\tNon Vowels\n\t\t----------\t----------\t----------");
            //Vowel and non vowel displays

            System.out.println("A's counted\t"+intAcounter+"\t\t"+intacounter+"\t\t"+intNotVowelCounter);
            System.out.println("E's counted\t"+intEcounter+"\t\t"+intecounter+"\t\t");
            System.out.println("I's counted\t"+intIcounter+"\t\t"+inticounter+"\t\t");
            System.out.println("O's counted\t"+intOcounter+"\t\t"+intocounter+"\t\t");
            System.out.println("U's counted\t"+intUcounter+"\t\t"+intucounter+"\t\t");
         







    }
}