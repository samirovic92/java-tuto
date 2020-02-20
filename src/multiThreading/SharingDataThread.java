package multiThreading;


public class SharingDataThread {
    public static void main(String[] args){
        int x = 4;
        int y = 4;
        int result = sum(x, y);

    }
    static int sum( int a , int b){
        return a + b;
    }
}
