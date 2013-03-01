package dealornodeal;

import java.util.Random;
import java.util.Scanner;

public class DealOrNoDeal {

	public static void main(String[] args) {
		Random gen = new Random();
        Scanner scan = new Scanner( System.in);

        int c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21, c22, c23, c24, c25, c26;
        int d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20, d21, d22, d23, d24, d25, d26; 
        String v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v24, v25, v26;
        int firstCase, caseChoose;
        int caseAvg; 
        boolean b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26;
        boolean rtrn = false;
        String s01, s02, s03, s04, s05, s06, s07, s08, s09, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26; 
        s01 = ("01");
        s02 = ("02");
        s03 = ("03");
        s04 = ("04");
        s05 = ("05");
        s06 = ("06"); 
        s07 = ("07");
        s08 = ("08");
        s09 = ("09");
        s10 = ("10");
        s11 = ("11");
        s12 = ("12"); 
        s13 = ("13");
        s14 = ("14");
        s15 = ("15");
        s16 = ("16");
        s17 = ("17");
        s18 = ("18"); 
        s19 = ("19");
        s20 = ("20");
        s21 = ("21");
        s22 = ("22");
        s23 = ("23");
        s24 = ("24"); 
        s25 = ("25");
        s26 = ("26");
        b1 = false;
        b2 = false;
        b3 = false;
        b4 = false;
        b5 = false; 
        b6 = false;
        b7 = false;
        b8 = false;
        b9 = false;
        b10 = false;
        b11 = false;
        b12 = false;
        b13 = false; 
        b14 = false;
        b15 = false;
        b16 = false;
        b17 = false;
        b18 = false;
        b19 = false;
        b20 = false;
        b21 = false;
        b22 = false;
        b23 = false;
        b24 = false;
        b25 = false;
        b26 = false;
        caseAvg = 0;
        caseChoose = 0; 
        v1 = ("--------1");
        v2 = ("--------2");
        v3 = ("--------5");
        v4 = ("-------10");
        v5 = ("-------25"); 
        v6 = ("-------50");
        v7 = ("-------75");
        v8 = ("------100");
        v9 = ("------200");
        v10 = ("------300"); 
        v11 = ("------400");
        v12 = ("------500");
        v13 = ("------750");
        v14 = ("-----1000");
        v15 = ("-----5000"); 
        v16 = ("----10000");
        v17 = ("----25000");
        v18 = ("----50000");
        v19 = ("----75000");
        v20 = ("---100000"); 
        v21 = ("---200000");
        v22 = ("---300000");
        v23 = ("---400000");
        v24 = ("---500000");
        v25 = ("---750000"); 
        v26 = ("--1000000");
        d1 = 1;
        d2 = 2;
        d3 = 5;
        d4 = 10;
        d5 = 25;
        d6 = 50;
        d7 = 75; 
        d8 = 100;
        d9 = 200;
        d10 = 300;
        d11 = 400;
        d12 = 500;
        d13 = 750;
        d14 = 1000;
        d15 = 5000; 
        d16 = 10000;
        d17 = 25000;
        d18 = 50000;
        d19 = 75000;
        d20 = 100000;
        d21 = 200000;
        d22 = 300000;
        d23 = 400000;
        d24 = 500000;
        d25 = 750000;
        d26 = 1000000;

        //randomizes #s 1-26 exclusively
        c1 = gen.nextInt(26) + 1; 
        c2 = gen.nextInt(26) + 1;
        while (c2 == c1)
                c2 = gen.nextInt(26) + 1;
        c3 = gen.nextInt(26) + 1;
        while (c3 == c1 || c3 == c2) 
                c3 = gen.nextInt(26) + 1;
        c4 = gen.nextInt(26) + 1;
        while (c4 == c1 || c4 == c2 || c4 == c3)
                c4 = gen.nextInt(26) + 1;
        c5 = gen.nextInt(26) + 1;
        while (c5 == c1 || c5 == c2 || c5 == c3 || c5 == c4)
                c5 = gen.nextInt(26) + 1;
        c6 = gen.nextInt(26) + 1;
        while (c6 == c1 || c6 == c2 || c6 == c3 || c6 == c4 || c6 == c5) 
                c6 = gen.nextInt(26) + 1;
        c7 = gen.nextInt(26) + 1;
        while (c7 == c1 || c7 == c2 || c7 == c3 || c7 == c4 || c7 == c5 || c7 == c6)
                c7 = gen.nextInt(26) + 1;
        c8 = gen.nextInt(26) + 1;
        while (c8 == c1 || c8 == c2 || c8 == c3 || c8 == c4 || c8 == c5 || c8 == c6 || c8 == c7)
                c8 = gen.nextInt(26) + 1; 
        c9 = gen.nextInt(26) + 1;
        while (c9 == c1 || c9 == c2 || c9 == c3 || c9 == c4 || c9 == c5 || c9 == c6 || c9 == c7 || c9 == c8)
                c9 = gen.nextInt(26) + 1;
        c10 = gen.nextInt(26) + 1;
        while (c10 == c1 || c10 == c2 || c10 == c3 || c10 == c4 || c10 == c5 || c10 == c6 || c10 == c7 || c10 == c8 || c10 == c9)
                c10 = gen.nextInt(26) + 1;
        c11 = gen.nextInt(26) + 1;
        while (c11 == c1 || c11 == c2 || c11 == c3 || c11 == c4 || c11 == c5 || c11 == c6 || c11 == c7 || c11 == c8 || c11 == c9 || c11 == c10)
                c11 = gen.nextInt(26) + 1; 
        c12 = gen.nextInt(26) + 1;
        while (c12 == c1 || c12 == c2 || c12 == c3 || c12 == c4 || c12 == c5 || c12 == c6 || c12 == c7 || c12 == c8 || c12 == c9 || c12 == c10 || c12 == c11)
                c12 = gen.nextInt(26) + 1;
        c13 = gen.nextInt(26) + 1;
        while (c13 == c1 || c13 == c2 || c13 == c3 || c13 == c4 || c13 == c5 || c13 == c6 || c13 == c7 || c13 == c8 || c13 == c9 || c13 == c10 || c13 == c11 || c13 == c12) 
                c13 = gen.nextInt(26) + 1;
        c14 = gen.nextInt(26) + 1;
        while (c14 == c1 || c14 == c2 || c14 == c3 || c14 == c4 || c14 == c5 || c14 == c6 || c14 == c7 || c14 == c8 || c14 == c9 || c14 == c10 || c14 == c11 || c14 == c12 || c14 == c13) 
                c14 = gen.nextInt(26) + 1;
        c15 = gen.nextInt(26) + 1;
        while (c15 == c1 || c15 == c2 || c15 == c3 || c15 == c4 || c15 == c5 || c15 == c6 || c15 == c7 || c15 == c8 || c15 == c9 || c15 == c10 || c15 == c11 || c15 == c12 || c15 == c13 || c15 == c14) 
                c15 = gen.nextInt(26) + 1;
        c16 = gen.nextInt(26) + 1;
        while (c16 == c1 || c16 == c2 || c16 == c3 || c16 == c4 || c16 == c5 || c16 == c6 || c16 == c7 || c16 == c8 || c16 == c9 || c16 == c10 || c16 == c11 || c16 == c12 || c16 == c13 || c16 == c14 || c16 == c15) 
                c16 = gen.nextInt(26) + 1;
        c17 = gen.nextInt(26) + 1;
        while (c17 == c1 || c17 == c2 || c17 == c3 || c17 == c4 || c17 == c5 || c17 == c6 || c17 == c7 || c17 == c8 || c17 == c9 || c17 == c10 || c17 == c11 || c17 == c12 || c17 == c13 || c17 == c14 || c17 == c15 || c17 == c16) 
                c17 = gen.nextInt(26) + 1;
        c18 = gen.nextInt(26) + 1;
        while (c18 == c1 || c18 == c2 || c18 == c3 || c18 == c4 || c18 == c5 || c18 == c6 || c18 == c7 || c18 == c8 || c18 == c9 || c18 == c10 || c18 == c11 || c18 == c12 || c18 == c13 || c18 == c14 || c18 == c15 || c18 == c16 || c18 == c17) 
                c18 = gen.nextInt(26) + 1;
        c19 = gen.nextInt(26) + 1;
        while (c19 == c1 || c19 == c2 || c19 == c3 || c19 == c4 || c19 == c5 || c19 == c6 || c19 == c7 || c19 == c8 || c19 == c9 || c19 == c10 || c19 == c11 || c19 == c12 || c19 == c13 || c19 == c14 || c19 == c15 || c19 == c16 || c19 == c17 || c19 == c18) 
                c19 = gen.nextInt(26) + 1;
        c20 = gen.nextInt(26) + 1;
        while (c20 == c1 || c20 == c2 || c20 == c3 || c20 == c4 || c20 == c5 || c20 == c6 || c20 == c7 || c20 == c8 || c20 == c9 || c20 == c10 || c20 == c11 || c20 == c12 || c20 == c13 || c20 == c14 || c20 == c15 || c20 == c16 || c20 == c17 || c20 == c18 || c20 == c19) 
                c20 = gen.nextInt(26) + 1;
        c21 = gen.nextInt(26) + 1;
        while (c21 == c1 || c21 == c2 || c21 == c3 || c21 == c4 || c21 == c5 || c21 == c6 || c21 == c7 || c21 == c8 || c21 == c9 || c21 == c10 || c21 == c11 || c21 == c12 || c21 == c13 || c21 == c14 || c21 == c15 || c21 == c16 || c21 == c17 || c21 == c18 || c21 == c19 || c21 == c20) 
                c21 = gen.nextInt(26) + 1;
        c22 = gen.nextInt(26) + 1;
        while (c22 == c1 || c22 == c2 || c22 == c3 || c22 == c4 || c22 == c5 || c22 == c6 || c22 == c7 || c22 == c8 || c22 == c9 || c22 == c10 || c22 == c11 || c22 == c12 || c22 == c13 || c22 == c14 || c22 == c15 || c22 == c16 || c22 == c17 || c22 == c18 || c22 == c19 || c22 == c20 || c22 == c21) 
                c22 = gen.nextInt(26) + 1;
        c23 = gen.nextInt(26) + 1;
        while (c23 == c1 || c23 == c2 || c23 == c3 || c23 == c4 || c23 == c5 || c23 == c6 || c23 == c7 || c23 == c8 || c23 == c9 || c23 == c10 || c23 == c11 || c23 == c12 || c23 == c13 || c23 == c14 || c23 == c15 || c23 == c16 || c23 == c17 || c23 == c18 || c23 == c19 || c23 == c20 || c23 == c21 || c23 == c22) 
                c23 = gen.nextInt(26) + 1;
        c24 = gen.nextInt(26) + 1;
        while (c24 == c1 || c24 == c2 || c24 == c3 || c24 == c4 || c24 == c5 || c24 == c6 || c24 == c7 || c24 == c8 || c24 == c9 || c24 == c10 || c24 == c11 || c24 == c12 || c24 == c13 || c24 == c14 || c24 == c15 || c24 == c16 || c24 == c17 || c24 == c18 || c24 == c19 || c24 == c20 || c24 == c21 || c24 == c22 || c24 == c23) 
                c24 = gen.nextInt(26) + 1;
        c25 = gen.nextInt(26) + 1;
        while (c25 == c1 || c25 == c2 || c25 == c3 || c25 == c4 || c25 == c5 || c25 == c6 || c25 == c7 || c25 == c8 || c25 == c9 || c25 == c10 || c25 == c11 || c25 == c12 || c25 == c13 || c25 == c14 || c25 == c15 || c25 == c16 || c25 == c17 || c25 == c18 || c25 == c19 || c25 == c20 || c25 == c21 || c25 == c22 || c25 == c23 || c25 == c24) 
                c25 = gen.nextInt(26) + 1;
        c26 = gen.nextInt(26) + 1;
        while (c26 == c1 || c26 == c2 || c26 == c3 || c26 == c4 || c26 == c5 || c26 == c6 || c26 == c7 || c26 == c8 || c26 == c9 || c26 == c10 || c26 == c11 || c26 == c12 || c26 == c13 || c26 == c14 || c26 == c15 || c26 == c16 || c26 == c17 || c26 == c18 || c26 == c19 || c26 == c20 || c26 == c21 || c26 == c22 || c26 == c23 || c26 == c24 || c26 == c25) 
                c26 = gen.nextInt(26) + 1;

        //random order of case amounts
        int[] cases = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21, c22, c23, c24, c25, c26}; 

        //case values
        int[] money = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
        money[c1-1] = d1;
        money[c2-1] = d2; 
        money[c3-1] = d3;
        money[c4-1] = d4;
        money[c5-1] = d5;
        money[c6-1] = d6;
        money[c7-1] = d7;
        money[c8-1] = d8;
        money[c9-1] = d9; 
        money[c10-1] = d10;
        money[c11-1] = d11;
        money[c12-1] = d12;
        money[c13-1] = d13;
        money[c14-1] = d14;
        money[c15-1] = d15; 
        money[c16-1] = d16;
        money[c17-1] = d17;
        money[c18-1] = d18;
        money[c19-1] = d19;
        money[c20-1] = d20;
        money[c21-1] = d21; 
        money[c22-1] = d22;
        money[c23-1] = d23;
        money[c24-1] = d24;
        money[c25-1] = d25;
        money[c26-1] = d26;

        //money is parallel to Strings 
        String[] val = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26"}; 
        val[c1-1] = v1;
        val[c2-1] = v2;
        val[c3-1] = v3;
        val[c4-1] = v4;
        val[c5-1] = v5;
        val[c6-1] = v6;
        val[c7-1] = v7; 
        val[c8-1] = v8;
        val[c9-1] = v9;
        val[c10-1] = v10;
        val[c11-1] = v11;
        val[c12-1] = v12;
        val[c13-1] = v13;
        val[c14-1] = v14; 
        val[c15-1] = v15;
        val[c16-1] = v16;
        val[c17-1] = v17;
        val[c18-1] = v18;
        val[c19-1] = v19;
        val[c20-1] = v20;
        val[c21-1] = v21; 
        val[c22-1] = v22;
        val[c23-1] = v23;
        val[c24-1] = v24;
        val[c25-1] = v25;
        val[c26-1] = v26;
        
        boolean show = true; //will be changed later 
        if (show == true)
                for (int display = 0; display < 26; display++)
                        System.out.println ("value " + (display + 1) + "th\t\tcase " + cases[display] + "\t\t\t" + val[display] + "\t\t$" + money[display]); 
        if (show == true)
                System.out.println ("display\t\t\tcases[display]\tval[display]\tmoney[display]");

        System.out.println ();
        System.out.println ("        * DEAL OR NO DEAL *\n\n");
        System.out.println ("        |  CASE  CHOICES  |\n");
        System.out.println ("| " + s20 + " | " + s21 + " | " + s22 + " | " + s23  + " | " + s24 + " | " + s25 + " | " + s26 + " |\n"); 
        System.out.println ("| " + s13 + " | " + s14 + " | " + s15 + " | " + s16  + " | " + s17 + " | " + s18 + " | " + s19 + " |\n"); 
        System.out.println ("  | " + s07 + " | " + s08 + " | " + s09 + " | " + s10  + " | " + s11 + " | " + s12 + " |\n");
        System.out.println ("  | " + s01 + " | " + s02 + " | " + s03 + " | " + s04  + " | " + s05 + " | " + s06 + " |\n");
        System.out.println ();

        System.out.print ("Choose your first case: ");
        firstCase = scan.nextInt();

        if (firstCase == 1)
                b1 = true;
        if (firstCase == 2) 
                b2 = true;
        if (firstCase == 3)
                b3 = true;
        if (firstCase == 4)
                b4 = true;
        if (firstCase == 5) 
                b5 = true;
        if (firstCase == 6)
                b6 = true;
        if (firstCase == 7)
                b7 = true;
        if (firstCase == 8) 
                b8 = true;
        if (firstCase == 9)
                b9 = true;
        if (firstCase == 10)
                b10 = true;
        if (firstCase == 11) 
                b11 = true;
        if (firstCase == 12)
                b12 = true;
        if (firstCase == 13)
                b13 = true;
        if (firstCase == 14) 
                b14 = true;
        if (firstCase == 15)
                b15 = true;
        if (firstCase == 16)
                b16 = true;
        if (firstCase == 17) 
                b17 = true;
        if (firstCase == 18)
                b18 = true;
        if (firstCase == 19)
                b19 = true;
        if (firstCase == 20) 
                b20 = true;
        if (firstCase == 21)
                b21 = true;
        if (firstCase == 22)
                b22 = true;
        if (firstCase == 23) 
                b23 = true;
        if (firstCase == 24)
                b24 = true;
        if (firstCase == 25)
                b25 = true;
        if (firstCase == 26) 
                b26 = true;

        for (int roundCount = 0; roundCount <=24; roundCount++)
        {
                   
                if (b1)
                        s01 = ("--"); 
                if (b2)
                        s02 = ("--");
                if (b3)
                        s03 = ("--");
                if (b4)
                        s04 = ("--");
                if (b5)
                        s05 = ("--");
                if (b6)
                        s06 = ("--"); 
                if (b7)
                        s07 = ("--");
                if (b8)
                        s08 = ("--");
                if (b9)
                        s09 = ("--");
                if (b10)
                        s10 = ("--");
                if (b11)
                        s11 = ("--"); 
                if (b12)
                        s12 = ("--");
                if (b13)
                        s13 = ("--");
                if (b14) 
                        s14 = ("--");
                if (b15)
                        s15 = ("--");
                if (b16)
                        s16 = ("--"); 
                if (b17)
                        s17 = ("--");
                if (b18)
                        s18 = ("--");
                if (b19) 
                        s19 = ("--");
                if (b20)
                        s20 = ("--");
                if (b21)
                        s21 = ("--"); 
                if (b22)
                        s22 = ("--");
                if (b23)
                        s23 = ("--");
                if (b24) 
                        s24 = ("--");
                if (b25)
                        s25 = ("--");
                if (b26)
                        s26 = ("--"); 

                if (money[0] == 0)
                        val[0] = ("---------");
                if (money[1] == 0)
                        val[1] = ("---------"); 
                if (money[2] == 0)
                        val[2] = ("---------");
                if (money[3] == 0)
                        val[3] = ("---------"); 
                if (money[4] == 0)
                        val[4] = ("---------");
                if (money[5] == 0)
                        val[5] = ("---------"); 
                if (money[6] == 0)
                        val[6] = ("---------");
                if (money[7] == 0)
                        val[7] = ("---------"); 
                if (money[8] == 0)
                        val[8] = ("---------");
                if (money[9] == 0)
                        val[9] = ("---------"); 
                if (money[10] == 0)
                        val[10] = ("---------");
                if (money[11] == 0)
                        val[11] = ("---------"); 
                if (money[12] == 0)
                        val[12] = ("---------");
                if (money[13] == 0)
                        val[13] = ("---------"); 
                if (money[14] == 0)
                        val[14] = ("---------");
                if (money[15] == 0)
                        val[15] = ("---------"); 
                if (money[16] == 0)
                        val[16] = ("---------");
                if (money[17] == 0)
                        val[17] = ("---------"); 
                if (money[18] == 0)
                        val[18] = ("---------");
                if (money[19] == 0)
                        val[19] = ("---------"); 
                if (money[20] == 0)
                        val[20] = ("---------");
                if (money[21] == 0)
                        val[21] = ("---------"); 
                if (money[22] == 0)
                        val[22] = ("---------");
                if (money[23] == 0)
                        val[23] = ("---------"); 
                if (money[24] == 0)
                        val[24] = ("---------");
                if (money[25] == 0)
                        val[25] = ("---------"); 
                
                caseAvg = (money[1]+money[2]+money[3]+money[4]+money[5]+money[6]+money[7]+money[8]+money[9]+money[10]+money[11]+money[12]+money[13]+money[14]+money[15]+money[16]+money[17]+money[18]+money[19]+money[20]+money[21]+money[22]+money[23]+money[24]+money[25]+money[0]) / (26-roundCount); 
                
                //crazy visual string crap
                System.out.println ("\n\n------------------------------------\nRound: " + (roundCount + 1));
                System.out.println ("\t\t\t\t\t\t\t\t\t\t|- DOLLAR  AMOUNTS -|");
                System.out.println ("        |- CASE  CHOICES -|\t\t\t\t$-------------------$");
                System.out.println ("\t\t\t\t\t\t\t\t\t\t|" + val[c1-1] + "|" + val[c14-1] + "|");
                System.out.println ("| " + s20 + " | " + s21 + " | " + s22 + " | " + s23  + " | " + s24 + " | " + s25 + " | " + s26 + " |\t|" + val[c2-1] + "|" + val[c15-1] + "|"); 
                System.out.println ("\t\t\t\t\t\t\t\t\t\t|" + val[c3-1] + "|" + val[c16-1] + "|");
                System.out.println ("| " + s13 + " | " + s14 + " | " + s15 + " | " + s16  + " | " + s17 + " | " + s18 + " | " + s19 + " |\t|" + val[c4-1] + "|" + val[c17-1] + "|"); 
                System.out.println ("\t\t\t\t\t\t\t\t\t\t|" + val[c5-1] + "|" + val[c18-1] + "|");
                System.out.println ("  | " + s07 + " | " + s08 + " | " + s09 + " | " + s10  + " | " + s11 + " | " + s12 + " |\t\t|" + val[c6-1] + "|" + val[c19-1] + "|"); 
                System.out.println ("\t\t\t\t\t\t\t\t\t\t|" + val[c7-1] + "|" + val[c20-1] + "|");
                System.out.println ("  | " + s01 + " | " + s02 + " | " + s03 + " | " + s04  + " | " + s05 + " | " + s06 + " |\t\t|" + val[c8-1] + "|" + val[c21-1] + "|"); 
                System.out.println ("\t\t\t\t\t\t\t\t\t\t|" + val[c9-1] + "|" + val[c22-1] + "|");
                System.out.println ("\t\t\t\t\t\t\t\t\t\t|" + val[c10-1] + "|" + val[c23-1] + "|"); 
                System.out.println ("\t\t\t\t\t\t\t\t\t\t|" + val[c11-1] + "|" + val[c24-1] + "|");
                System.out.println ("\t\tHolding: | " + firstCase + " |\t\t\t\t\t|" + val[c12-1] + "|" + val[c25-1] + "|"); 
                System.out.println ("\t\t\t\t\t\t\t\t\t\t|" + val[c13-1] + "|" + val[c26-1] + "|");
                System.out.println ("\t\t\t\t\t\t\t\t\t\t$-------------------$\n"); 
                if (show == true)
                           System.out.println ("Case average: $" + caseAvg);
                System.out.print ("Choose the next case: " ); 
                caseChoose = scan.nextInt();
                
                while (rtrn == true)
                {
                           System.out.println ("You've already chosen that case."); 
                           System.out.print ("Choose the case: ");
                           caseChoose = scan.nextInt();
                           rtrn = false;
                } 
                //choose your case
                if (caseChoose == 1 && b1 == false)
                {
                        System.out.println ("$" + money[0]); 
                        money[0] = 0;
                        b1 = true;
                }
                if (caseChoose == 1 && b1 == true)
                        rtrn = true; 
                        
                if (caseChoose == 2 && b2 == false)
                {
                        System.out.println ("$" + money[1]);
                        money[1] = 0; 
                        b2 = true;
                }
                if (caseChoose == 2 && b2 == true)
                        rtrn = true;
                        
                if (caseChoose == 3 && b3 == false)
                {
                        System.out.println ("$" + money[2]);
                        money[2] = 0; 
                        b3 = true;
                }
                if (caseChoose == 3 && b3 == true)
                        rtrn = true;
                        
                if (caseChoose == 4 && b4 == false)
                {
                        System.out.println ("$" + money[3]);
                        money[3] = 0; 
                        b4 = true;
                }
                if (caseChoose == 4 && b4 == true)
                        rtrn = true;
                        
                if (caseChoose == 5 && b5 == false)
                {
                        System.out.println ("$" + money[4]);
                        money[4] = 0; 
                        b5 = true;
                }
                if (caseChoose == 5 && b5 == true)
                        rtrn = true;
                        
                if (caseChoose == 6 && b6 == false)
                {
                        System.out.println ("$" + money[5]);
                        money[5] = 0; 
                        b6 = true;
                }
                if (caseChoose == 6 && b6 == true)
                        rtrn = true;
                        
                if (caseChoose == 7 && b7 == false)
                {
                        System.out.println ("$" + money[6]);
                        money[6] = 0; 
                        b7 = true;
                }
                if (caseChoose == 7 && b7 == true)
                        rtrn = true;
                        
                if (caseChoose == 8 && b8 == false)
                {
                        System.out.println ("$" + money[7]);
                        money[7] = 0; 
                        b8 = true;
                }
                if (caseChoose == 8 && b8 == true)
                        rtrn = true;
                        
                if (caseChoose == 9 && b9 == false)
                {
                        System.out.println ("$" + money[8]);
                        money[8] = 0; 
                        b9 = true;
                }
                if (caseChoose == 9 && b9 == true)
                        rtrn = true;
                        
                if (caseChoose == 10 && b10 == false)
                {
                        System.out.println ("$" + money[9]);
                        money[9] = 0; 
                        b10 = true;
                }
                if (caseChoose == 10 && b10 == true)
                        rtrn = true;
                        
                if (caseChoose == 11 && b11 == false)
                {
                        System.out.println ("$" + money[10]);
                        money[10] = 0; 
                        b11 = true;
                }
                if (caseChoose == 11 && b11 == true)
                        rtrn = true;
                        
                if (caseChoose == 12 && b12 == false)
                {
                        System.out.println ("$" + money[11]);
                        money[11] = 0; 
                        b12 = true;
                }
                if (caseChoose == 12 && b12 == true)
                        rtrn = true;
                        
                if (caseChoose == 13 && b13 == false)
                {
                        System.out.println ("$" + money[12]);
                        money[12] = 0; 
                        b13 = true;
                }
                if (caseChoose == 13 && b13 == true)
                        rtrn = true;
                        
                if (caseChoose == 14 && b14 == false)
                {
                        System.out.println ("$" + money[13]);
                        money[13] = 0; 
                        b14 = true;
                }
                if (caseChoose == 14 && b14 == true)
                        rtrn = true;
                        
                if (caseChoose == 15 && b15 == false)
                {
                        System.out.println ("$" + money[14]);
                        money[14] = 0; 
                        b15 = true;
                }
                if (caseChoose == 15 && b15 == true)
                        rtrn = true;
                        
                if (caseChoose == 16 && b16 == false)
                {
                        System.out.println ("$" + money[15]);
                        money[15] = 0; 
                        b16 = true;
                }
                if (caseChoose == 16 && b16 == true)
                        rtrn = true;
                        
                if (caseChoose == 17 && b17 == false)
                {
                        System.out.println ("$" + money[16]);
                        money[16] = 0; 
                        b17 = true;
                }
                if (caseChoose == 17 && b17 == true)
                        rtrn = true;
                        
                if (caseChoose == 18 && b18 == false)
                {
                        System.out.println ("$" + money[17]);
                        money[17] = 0; 
                        b18 = true;
                }
                if (caseChoose == 18 && b18 == true)
                        rtrn = true;
                        
                if (caseChoose == 19 && b19 == false)
                {
                        System.out.println ("$" + money[18]);
                        money[18] = 0; 
                        b19 = true;
                }
                if (caseChoose == 19 && b19 == true)
                        rtrn = true;
                        
                if (caseChoose == 20 && b20 == false)
                {
                        System.out.println ("$" + money[19]);
                        money[19] = 0; 
                        b20 = true;
                }
                if (caseChoose == 20 && b20 == true)
                        rtrn = true;
                        
                if (caseChoose == 21 && b21 == false)
                {
                        System.out.println ("$" + money[20]);
                        money[20] = 0; 
                        b21 = true;
                }
                if (caseChoose == 21 && b21 == true)
                        rtrn = true;
                        
                if (caseChoose == 22 && b22 == false)
                {
                        System.out.println ("$" + money[21]);
                        money[21] = 0; 
                        b22 = true;
                }
                if (caseChoose == 22 && b22 == true)
                        rtrn = true;
                        
                if (caseChoose == 23 && b23 == false)
                {
                        System.out.println ("$" + money[22]);
                        money[22] = 0; 
                        b23 = true;
                }
                if (caseChoose == 23 && b23 == true)
                        rtrn = true;
                        
                if (caseChoose == 24 && b24 == false)
                {
                        System.out.println ("$" + money[23]);
                        money[23] = 0; 
                        b24 = true;
                }
                if (caseChoose == 24 && b24 == true)
                        rtrn = true;
                        
                if (caseChoose == 25 && b25 == false)
                {
                        System.out.println ("$" + money[24]);
                        money[24] = 0; 
                        b25 = true;
                }
                if (caseChoose == 25 && b25 == true)
                        rtrn = true;
                        
                if (caseChoose == 26 && b26 == false)
                {
                        System.out.println ("$" + money[25]);
                        money[25] = 0; 
                        b26 = true;
                }
                if (caseChoose == 26 && b26 == true)
                        rtrn = true;
                        
                if (rtrn == true)
                           rtrn = true;


                rtrn = false;
                caseAvg = (money[1]+money[2]+money[3]+money[4]+money[5]+money[6]+money[7]+money[8]+money[9]+money[10]+money[11]+money[12]+money[13]+money[14]+money[15]+money[16]+money[17]+money[18]+money[19]+money[20]+money[21]+money[22]+money[23]+money[24]+money[25]+money[0]) / (26-roundCount); 
                
        }
	}
}
