import java.util.Scanner;
public class TheFirst
{
    Scanner sc;



    public TheFirst() {
    System.out.println("Enter any number to check if it is a prime number");
    sc=new Scanner(System.in);

    isPrime(sc.nextInt());
    }
    public static void isPrime(int n) {
        int i=2;
        boolean searching=true;

        while (i<n && searching ){
    if (n%i==0)
    {searching=false;
        System.out.println(" not prime");}
            i++;

        }

        if (searching) System.out.println(" is prime ");
    }

    public static void main(String[] args) {
       TheFirst f=new TheFirst();
    }
    }
