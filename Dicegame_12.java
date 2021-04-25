/*Dice game 12, Uppgift_3 Java
 *
 * Constants are created
 * We are using a scanner to fetch the information from the player
 * Two loops, one that keeps the game going, until the player press "q", the other that takes care of the game itself, i.e roles the dice.
 * System.out.format() is used to control the print output, when we include numbers in our code. https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
 * Booleans to set limits
 * *Increment operator; increments a value by 1, https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
 *
 * @author Nicklas Svensson, nicsve-1
 * 
 * */



import java.util.Scanner;

public class Uppgift3_case
{
   
   public static void main(String[] args)
   {
      
      int summa_vid_vinst = 12, vinster = 0, forluster = 0, antal_sidor_tarning = 6, summan_av_tarningar = 0;     
      
      // creating scanner to fetch
      Scanner fetch = new Scanner(System.in);
      
      System.out.format("Välkommen till spelet 12. Du ska slå 1-3 tärningar och försöka få summan 12... \n");
      
      do 
      {
         int tarning_1 = 0, tarning_2 = 0, tarning_3 = 0;
         //Rolling Dices
         do 
         {
         System.out.format("Ange vilken tärning du vill slå [1,2,3](avsluta med q): ");
         
            switch (fetch.nextLine())
            {
            case "1": //Rolling Dice number one
               if (tarning_1 == 0) 
               {
                  tarning_1 = 1+(int)(Math.random()*antal_sidor_tarning);
                  break;
               }
               
               else 
               {
                  System.out.format("Tärning redan slagen, vänligen välj tärning 2 eller 3. Om du önskar avbryta, vänligen tryck q \n");
                  break;
               }
                
            case "2": //Rolling Dice number two
               if (tarning_2 == 0) 
               {
                  tarning_2 = 1+(int)(Math.random()*antal_sidor_tarning);
                  break;
               }
               
               else 
               {
                  System.out.format("Tärning redan slagen, vänligen välj tärning 1 eller 3. Om du önskar avbryta, vänligen tryck \n");
                  break;
               }
               
            case "3": //Rolling Dice number three
               if (tarning_3 == 0) 
               {
                  tarning_3 = 1+(int)(Math.random()*antal_sidor_tarning);
                  break;
               }
               
               else 
               {
                  System.out.format("Tärning redan slagen, vänligen välj tärning 1 eller 2. Om du önskar avbryta, vänligen tryck q");
                  break;
               }
               
            case "q": //Stops the game
               System.out.format("Avslutar spel!");
               System.exit(0);
               break;
               
            default:
               System.out.println("Felaktigt värde, vänligen försök igen");
               break;
            }
            summan_av_tarningar = (tarning_1 + tarning_2 + tarning_3);
            System.out.format("%s %s %s sum: %s #vinst: %s #förlust: %s \n", tarning_1, tarning_2, tarning_3, summan_av_tarningar, vinster, forluster);
            
                        
         //Booleans to set limits
         }while((tarning_1 == 0 || tarning_2 == 0 || tarning_3 == 0) && summan_av_tarningar != summa_vid_vinst);     
         
         if (summa_vid_vinst == summan_av_tarningar)
         {
            vinster++; //*
         }
         
         else 
         {
            forluster++; //*
         } 
            
            
         System.out.format("Nästa omgång! \n");
         
      }while(true);
      
      
   }
   
}
