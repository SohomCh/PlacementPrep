import java.util.*;


    


class oddeven{   
    public static void main(String args[]){
        System.out.println("enter your number");
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("it is even");
        }
        else{
            System.out.println("odd");
        }
        
    }


}