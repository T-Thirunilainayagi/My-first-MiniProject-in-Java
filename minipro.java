package minipro;
import java.util.*;
class Maths
{
    public void mathquiz()
    {
        Scanner sc=new Scanner(System.in);
        int i,count=0;
        System.out.println("WELCOME TO MATHS QUIZ ..... ENTER THE RIGHT OPTION AFTER EACH QUESTION IS DISPLAYED");
        System.out.println("1.What is three fifth of 100    1.20  2.30  3.60");
        i=sc.nextInt();
        if(i==3){right(); count++;}
        else{wrong();}
        System.out.println("2. Choose the correct rule followed for arithmetic operations  1. BOMDAS  2.SAMBOD  3.BODMAS");
        i=sc.nextInt();
        if(i==3){right(); count++;}
        else{wrong();}
        System.out.println("3.For applying pythagoras theorem one of the angles of triangle must be  1.90deg  2.130deg  3.40deg");
        i=sc.nextInt();
        if(i==1){right(); count++;}
        else{wrong();}
        System.out.println("4.20+(90/2) is equal to   1.50  2.65  3.70  ");
        i=sc.nextInt();
        if(i==2){right(); count++;}
        else{wrong();}
        System.out.println("5.How many sides are equal in an equilateral triangle   1.three  2.one  3.two");
        i=sc.nextInt();
        if(i==1){right(); count++;}
        else{wrong();}
        System.out.println("End of maths quiz.....");
        System.out.println("TOTAL SCORE OBTAINED IN MATHS QUIZ IS "+ count);
    }
    public void right()
    {
        System.out.println("Good.. Right Answer");
    }
    public void wrong()
    {
       System.out.println("Wrong Answer ... "); 
    }
}
class Science
{
    public void sciencequiz()
    {
        Scanner sc=new Scanner(System.in);
        int i,count=0;
        System.out.println("WELCOME TO SCIENCE QUIZ ..... ENTER THE RIGHT OPTION AFTER EACH QUESTION IS DISPLAYED");
        System.out.println("1.Which metal stays liquid at room temperature    1.Hg  2.Pb  3.Au");
        i=sc.nextInt();
        if(i==1){right(); count++;}
        else{wrong();}
        System.out.println("2. Who is father of genetics  1. Louis Pasteur  2.Gregor Mendel  3.Edison");
        i=sc.nextInt();
        if(i==2){right(); count++;}
        else{wrong();}
        System.out.println("3.Process of transfer of heridity from one person to another person is   1.Gene  2.Genetics  3.Mutation");
        i=sc.nextInt();
        if(i==2){right(); count++;}
        else{wrong();}
        System.out.println("4.In humans digestion of food starts from   1.Liver  2.Stomach  3.Mouth");
        i=sc.nextInt();
        if(i==3){right(); count++;}
        else{wrong();}
        System.out.println("5.The first enzyme that mixes with the food is called   1.Amylase 2.Trypsin  3.Pepsin  ");
        i=sc.nextInt();
        if(i==1){right(); count++;}
        else{wrong();}
        System.out.println("End of Science quiz.....");
        System.out.println("TOTAL SCORE OBTAINED IN SCIENCE QUIZ IS "+ count);  
    }
     public void right()
    {
        System.out.println("Good.. Right Answer");
    }
    public void wrong()
    {
       System.out.println("Wrong Answer ... "); 
    }   
}
class English
{
    public void englishquiz()
    {
        Scanner sc=new Scanner(System.in);
        int i,count=0;
        System.out.println("WELCOME TO ENGLISH QUIZ ..... ENTER THE RIGHT OPTION AFTER EACH QUESTION IS DISPLAYED");
        System.out.println("1.The poem 'THE SEVEN STAGES'  was written by   1.William Shakespeare  2.Robert Frost  3.Thomas Hardy");
        i=sc.nextInt();
        if(i==1){right(); count++;}
        else{wrong();}
        System.out.println("2. She is good ___ maths  1. in  2.on  3.at");
        i=sc.nextInt();
        if(i==3){right(); count++;}
        else{wrong();}
        System.out.println("3.There are ___ parts of speech   1.Five  2.Eight  3.Four");
        i=sc.nextInt();
        if(i==2){right(); count++;}
        else{wrong();}
        System.out.println("4.When 'as' and 'like' are used for comparision in a sentence it is called   1.Similie  2.Alliteration  3.Onomotopoeia");
        i=sc.nextInt();
        if(i==1){right(); count++;}
        else{wrong();}
        System.out.println("5.The poem 'THE ROAD NOT TAKEN' was written by   1.R K Narayan 2.Robert Frost  3.J K Rowling  ");
        i=sc.nextInt();
        if(i==2){right(); count++;}
        else{wrong();}
        System.out.println("End of English quiz.....");
        System.out.println("TOTAL SCORE OBTAINED IN ENGLISH QUIZ IS "+ count);  
    }
     public void right()
    {
        System.out.println("Good.. Right Answer");
    }
    public void wrong()
    {
       System.out.println("Wrong Answer ... "); 
    }   
}
    

public class Minipro {
    public static void main(String[] args)
    { int i;
     do
      {
       System.out.println("*******************************************************");
       Scanner sc=new Scanner(System.in);
       int choice;
       System.out.println("WELCOME TO JAVA MINIPROJECT...SELECT ANY ONE OPTION FROM THE FOLLOWING TO PLAY QUIZ ON IT......");
       System.out.println("1. MATHS 2.SCIENCE  3.ENGLISH");
       System.out.println("Enter your choice");
       choice=sc.nextInt();
       
       switch(choice)
          { case 1:
               Maths m=new Maths();
               m.mathquiz();
               break;
           case 2:
               Science s=new Science();
               s.sciencequiz();
               break;
           case 3:
               English e=new English();
               e.englishquiz();
               break;
                       
           default:
                System.out.println("Please enter a valid choice");
                
         }
            System.out.println("PRESS 0 TO EXIT AND 1 TO CONTINUE");
            i=sc.nextInt();
      }while(i==1);
    }
}