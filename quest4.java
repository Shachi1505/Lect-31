import java.util.Scanner;
  public  class ArmNum{
        int n, l;
        ArmNum(int n){
            l=(" " + n).length();
        }
    
   int pow(int i) {
    if(i<10) return (int) Math.pow(i,l); // If the number is a single digit
    else return pow(i/10) + pow(i%10); // Removing the last digit, recursive code
   }
   void Armstrong() {
    if(n==pow(n)) System.out.println("yes");
    System.out.println("no");
   }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x= sc.nextInt();
    ArmNum obj = new ArmNum(x); // recursion is called
    obj.Armstrong();
   }
  }
