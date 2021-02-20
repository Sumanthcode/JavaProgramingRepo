class p6
{
public static void main(String[] args)
{
int a=10;
int b=20;
int c;
c= a++*2;
b= a--;
c= a++ + b-- + --c;
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
}