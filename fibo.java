public class fibo{
    public static void  fib(int a, int b,int count){
     if(count==0)return;
     System.out.println(a+" ");
     fib(b,a+b,count-1);
    }
    public static void main(String[] args) {
    fib(0,1,10);
    }
}