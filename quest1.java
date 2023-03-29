public class Prod{
    public static void main(String[] args) {
        int x=5, y=4;
        System.out.println(product(x,y));
    }
    public static int product(int x, int y){
        if(y==0) return 0;
        else return(x+ product(x, y-1));
    }
}
