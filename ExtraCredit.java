import java.util.*;
public class ExtraCredit {
    public static void main(String args[]){
        int tc = 0;
        int arr[] = {1,2,3};
        Scanner in = new Scanner(System.in);
        for(int elem : arr)
        {
            System.out.println("round "+ elem + " out of 3");
            //start coding in the box
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
int rand1 = (int)(Math.random() * (10 - 1) + 1);
int rand2 = (int)(Math.random() * (10 - 1) + 1);
int rand3 = (int)(Math.random() * (10 - 1) + 1);
System.out.print("The product of the 3 numbers:" + (rand1 * rand2 * rand3));
System.out.print("The product of the 3 numbers:" + (rand1 + rand2 + rand3));
System.out.print("Please guess what the 3 integers may be, all seperated by a space: ");
int n1 = in.nextInt();
int n2 = in.nextInt();
int n3 = in.nextInt();

            
            
            
            
            
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            if(ExtraCredit.check(rand1, rand2, rand3, n1, n2, n3)){ // fill the check() with the correct varibles
            // DO NOT TOUCH ANYTHING BELOW THIS
                tc++; 
            }
        } 
        ExtraCredit.ending(tc);
        in.close();
    }
     //my functions (I will not fix them if you play with them) 
     public static boolean check(int a , int b, int c, int x , int y , int z){
        int p = a * b * c, s = a + b + c;
        if((p == x * y * z) && (s == x + y + z)){
            System.out.println("congrats on solving it");
            return true;
        }
        else{
            System.out.printf("the correct numbers were %d, %d, %d \n", a , b, c);
            System.out.println("you'll get it next time!");
            return false;
        }
    }
    public static void ending(int cc){
        System.out.println("you got " + cc + " / 3 correct");
        switch (cc){
            case 0:
            System.out.println("try harder next time");
            break;
            case 1:
            System.out.println("nice try");
            break;
            case 2:
            System.out.println("great job");
            break;
            case 3:
            System.out.println("perfect");
            break;
        }
    }
}
