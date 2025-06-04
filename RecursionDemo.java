class RecusionDemo{
     static int factorial(int n) {
     if (n<=1) {
     return 1;
     }
     else{
     return n* factorial(n-1);
     }
     public static void main(String [] args){
     int number=8;
     int result = facorial(number);
     System.out.println("factorial of "+ number +" "is" +result");
   }
 }
