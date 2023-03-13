#include<stdio.h>
int main()
{
    int n,r,result=0,temp;
    printf("Enter the number = ");
    scanf("%d",&n);
    temp=n;
    while(temp!=0){
        r=temp%10;
        result=(result*10)+r;
        temp=temp/10;
    }
    if(n==result){
        printf("%d is a palindrome number",n);
    }
    else{
        printf("%d is not a palindrome number",n);
    }
    return 0;
}