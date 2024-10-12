public class q3_IsArmstrong_number {

    public static boolean isArmstrong(int n){
        
        int dup=n;
        int sum=0;
        while (n>0) {
            int id=id%10;
            sum=sum+id;
            n=n/10;
        }
    }

public static void main(String args[]){
    int n=371;
    System.out.println(isArmstrong(n));
}

}
