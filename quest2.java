public class Prime{
    public static void main(String[] args) {
        if(prime(11,2))
        System.out.println("Yes");
        else
        System.out.println("No");
    }
    public static boolean prime(int n, int i){
        if (n <= 2)
                        return (n == 2) ? true : false;
        if(n%i==0) return false;
        if (i*i>n) return true;
        return prime(n, i+1 );
    }
}
