package yahtzee;

import java.util.Random;
import java.util.Scanner;

public class Yahtzee {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        Random gen = new Random();
        int boolStart, roundCount, rollCount, topTotal, bottomTotal, plus1;
        int die1, die2, die3, die4, die5;
        boolean c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, rtrn; 
        c1 = false;
        c2 = false;
        c3 = false;
        c4 = false;
        c5 = false;
        c6 = false;
        c7 = false;
        c8 = false;
        c9 = false;
        c10 = false; 
        c11 = false;
        c12 = false;
        c13 = false;
        rtrn = false;
        String hold1, hold2, hold3, hold4, hold5, categChoose;
        roundCount = 0;
        rollCount = 0;
        boolStart = 0; 
        plus1 = 0;
        topTotal = 0;
        bottomTotal = 0;
    
        System.out.println ("YAHTZEE");
        while (boolStart == 0 && roundCount < 13)
        {
             System.out.println ("----------------------");
            System.out.println ("Top so far: " + topTotal);
            System.out.println ("Bottom so far: " + bottomTotal);
             System.out.println ();
            roundCount++;
            rollCount++; 
            die1 = gen.nextInt(6) + 1;
            die2 = gen.nextInt(6) + 1;
            die3 = gen.nextInt(6) + 1;
            die4 = gen.nextInt(6) + 1;
            die5 = gen.nextInt(6) + 1;
            System.out.println ("Round: " + roundCount);
            System.out.println ("Roll 1:");
            System.out.println ("1st  2nd  3rd  4th  5th");
            System.out.println (" " + die1 + "    " + die2 + "    " + die3 + "    " + die4 + "    " + die5);
            System.out.println ();
            System.out.println ("Hold which dice? y/n");
            System.out.print ("Hold 1st die? :");
            hold1 = scan.nextLine();
            System.out.print ("Hold 2nd die? :"); 
            hold2 = scan.nextLine();
            System.out.print ("Hold 3rd die? :");
            hold3 = scan.nextLine();
            System.out.print ("Hold 4th die? :"); 
            hold4 = scan.nextLine();
            System.out.print ("Hold 5th die? :"); 
            hold5 = scan.nextLine();
            System.out.println ();
            
            if (hold1.equalsIgnoreCase("y") && hold2.equalsIgnoreCase("y") && hold3.equalsIgnoreCase("y") && hold4.equalsIgnoreCase("y") && hold5.equalsIgnoreCase("y"))
                rollCount = 3;
            if (hold1.equalsIgnoreCase("n") || hold2.equalsIgnoreCase("n") || hold3.equalsIgnoreCase("n") || hold4.equalsIgnoreCase("n") || hold5.equalsIgnoreCase("n"))
                rollCount ++;
            if (hold1.equalsIgnoreCase("n") || hold2.equalsIgnoreCase("n") || hold3.equalsIgnoreCase("n") || hold4.equalsIgnoreCase("n") || hold5.equalsIgnoreCase ("n"))
                System.out.println ("Roll 2:");
            if (hold1.equalsIgnoreCase("n"))
                die1 = gen.nextInt(6) + 1;
            if (hold2.equalsIgnoreCase ("n"))
                die2 = gen.nextInt(6) + 1;
            if (hold3.equalsIgnoreCase("n"))
                die3 = gen.nextInt(6) + 1;
            if (hold4.equalsIgnoreCase("n")) 
                die4 = gen.nextInt(6) + 1;
            if (hold5.equalsIgnoreCase("n"))
                die5 = gen.nextInt(6) + 1;
            System.out.println ("1st  2nd  3rd  4th  5th"); 
            System.out.println (" " + die1 + "    " + die2 + "    " + die3 + "    " + die4 + "    " + die5);
            System.out.println ();
            System.out.println ("Hold which dice? y/n");
            System.out.print ("Hold 1st die? :"); 
            hold1 = scan.nextLine();
            System.out.print ("Hold 2nd die? :"); 
            hold2 = scan.nextLine();
            System.out.print ("Hold 3rd die? :"); 
            hold3 = scan.nextLine();
            System.out.print ("Hold 4th die? :"); 
            hold4 = scan.nextLine ();
            System.out.print ("Hold 5th die? :"); 
            hold5 = scan.nextLine();
            System.out.println ();
            
            
            if (hold1.equalsIgnoreCase("y") && hold2.equalsIgnoreCase("y") && hold3.equalsIgnoreCase("y") && hold4.equalsIgnoreCase("y") && hold5.equalsIgnoreCase("y"))
                rollCount = 3;
            if (hold1.equalsIgnoreCase("n") || hold2.equalsIgnoreCase("n") || hold3.equalsIgnoreCase("n") || hold4.equalsIgnoreCase("n") || hold5.equalsIgnoreCase("n"))
                rollCount ++;
            if (hold1.equalsIgnoreCase("n") || hold2.equalsIgnoreCase("n") || hold3.equalsIgnoreCase("n") || hold4.equalsIgnoreCase("n") || hold5.equalsIgnoreCase ("n"))
                System.out.println ("Final Roll:");
            if (hold1.equalsIgnoreCase("n"))
                die1 = gen.nextInt(6) + 1;
            if (hold2.equalsIgnoreCase ("n"))
                die2 = gen.nextInt(6) + 1;
            if (hold3.equalsIgnoreCase("n"))
                die3 = gen.nextInt(6) + 1;
            if (hold4.equalsIgnoreCase("n")) 
                die4 = gen.nextInt(6) + 1;
            if (hold5.equalsIgnoreCase("n"))
                die5 = gen.nextInt(6) + 1;
            System.out.println ("1st  2nd  3rd  4th  5th"); 
            System.out.println (" " + die1 + "    " + die2 + "    " + die3 + "    " + die4 + "    " + die5);
            System.out.println ();
            
            while (rollCount == 3) 
            {
                System.out.println ("Categories:");
                System.out.println ("1: 1's");
                System.out.println ("2: 2's");
                 System.out.println ("3: 3's");
                System.out.println ("4: 4's");
                System.out.println ("5: 5's");
                System.out.println ("6: 6's"); 
                System.out.println ("7: 3 Of A Kind");
                System.out.println ("8: 4 Of A Kind");
                System.out.println ("9: Full House");
                 System.out.println ("10: Small Straight");
                System.out.println ("11: Big Straight");
                System.out.println ("12: YAHTZEE!");
                System.out.println ("13: Chance");
                System.out.print ("Choose the category #: ");
                categChoose = scan.nextLine();
                
//1's
                while (categChoose.equalsIgnoreCase ("1") && c1 == false)
                {
                    if (die1 == 1)
                        topTotal += 1;
                    if (die2 == 1)
                        topTotal += 1;
                    if (die3 == 1)
                        topTotal += 1;
                    if (die4 == 1)
                        topTotal += 1;
                    if (die5 == 1)
                        topTotal += 1; 
                        
                    c1 = true;
                    rtrn = false;
                    categChoose = ("0");
                }    
                if (categChoose.equalsIgnoreCase ("1") && c1 == true)
                    rtrn = true;
                    
//2's    
                while (categChoose.equalsIgnoreCase("2") && c2 == false)
                { 
                    if (die1 == 2)
                        topTotal += 2;
                    if (die2 == 2)
                        topTotal += 2;
                    if (die3 == 2)
                        topTotal += 2; 
                    if (die4 == 2)
                        topTotal += 2;
                    if (die5 == 2)
                        topTotal += 2;
                        
                    c2 = true; 
                    rtrn = false;
                    categChoose = ("0");
                }        
                if (categChoose.equalsIgnoreCase("2") && c2 == true)
                    rtrn = true; 
                            
//3's            
                while (categChoose.equalsIgnoreCase("3") && c3 == false)
                {
                    if (die1 == 3)
                        topTotal += 3; 
                    if (die2 == 3)
                        topTotal += 3;
                    if (die3 == 3)
                        topTotal += 3;
                    if (die4 == 3)
                        topTotal += 3; 
                    if (die5 == 3)
                        topTotal += 3;
                        
                    c3 = true;
                    rtrn = false;
                    categChoose = ("0"); 
                }
                if (categChoose.equalsIgnoreCase("3") && c3 == true)
                    rtrn = true;
                        
//4's
                while (categChoose.equalsIgnoreCase ("4") && c4 == false)
                {
                    if (die1 == 4)
                        topTotal += 4;
                    if (die2 == 4)
                        topTotal += 4;
                    if (die3 == 4)
                        topTotal += 4;
                    if (die4 == 4)
                        topTotal += 4;
                    if (die5 == 4)
                        topTotal += 4; 
                        
                    c4 = true;
                    rtrn = false;
                    categChoose = ("0");
                }
                if (categChoose.equalsIgnoreCase ("4") && c4 == true)
                    rtrn = true;
                        
//5's
                while (categChoose.equalsIgnoreCase("5") && c5 == false)
                { 
                    if (die1 == 5)
                        topTotal += 5;
                    if (die2 == 5)
                        topTotal += 5;
                    if (die3 == 5)
                        topTotal += 5; 
                    if (die4 == 5)
                        topTotal += 5;
                    if (die5 == 5)
                        topTotal += 5;
                        
                    c5 = true; 
                    rtrn = false;
                    categChoose = ("0");
                }
                if (categChoose.equalsIgnoreCase("5") && c5 == true)
                    rtrn = true; 
                        
//6's
                while (categChoose.equalsIgnoreCase("6") && c6 == false)
                {
                    if (die1 == 6)
                        topTotal += 6; 
                    if (die2 == 6)
                        topTotal += 6;
                    if (die3 == 6)
                        topTotal += 6;
                    if (die4 == 6)
                        topTotal += 6; 
                    if (die5 == 6)
                        topTotal += 6;
                        
                    c6 = true;
                    rtrn = false;
                    categChoose = ("0"); 
                }
                if (categChoose.equalsIgnoreCase("6") && c6 == true)
                    rtrn = true;
                        
//3 of a kind
                
//4 of a kind 
//full house

//sm straight
//bg straight

//yahtzee
                while (die1 == die2 && die2 == die3 && die3 == die4 && die4 == die5 && c12 == false)
                { 
                    System.out.println ("Nice Yahtzee, man.");
                    bottomTotal += 50;
                    c12 = true;
                    rtrn = false;
                    categChoose = ("0"); 
                }
                
//chance
                
                if (rtrn == false)
                    rollCount = 0;
                if (rtrn == true)
                    rollCount = 3; 
            }
            
        }
        while (roundCount == 13)
        {
            if (topTotal >= 63)
                topTotal += 35;
            if (topTotal >= 63)
                 System.out.println ("Bonus 35 points for achieving 63+ on Upper Section!");
            System.out.println ("Top Section: " + topTotal);
            System.out.println ("Bottom Section: " + bottomTotal); 
            System.out.println ("GRAND TOTAL: *" + (topTotal + bottomTotal) + "*");
        }
    }

}
