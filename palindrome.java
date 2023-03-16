import java.util.Scanner;
class pallindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,r,result=0,temp;
        System.out.println("Enter the number = ");
        n=sc.nextInt();
        temp=n;
        while (temp!=0){
            r=temp%10;
            result=(result*10)+r;
            temp=temp/10;
        }
        if(n==result){
            System.out.println(n+" is a palindrome number");
        }
        else {
            System.out.println(n+" is not a palindrome number");
        }
    }
}
