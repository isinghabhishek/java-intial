// package Recursion;

public class TowerOfHanoi {
    public static void towerOfHanoi(int n, String src, String helper, String dist){
        if(n==1){
            System.out.println("Transfer Disk "+ n +" from " +src+" to "+ dist);
            return;
        }
        towerOfHanoi(n-1, src, dist, helper);
        System.out.println("Transfer Disk "+ n +" from " +src+" to "+ dist);
        towerOfHanoi(n-1, helper, src, dist);
    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");
    }
}
