package stu.test1;

public class Test3 {
    public static void main(String[] args) {
        int sum=0;
        int n=0;
        do {
            n++;
            sum+=n;
        }while (sum<1000);
        System.out.println(n);
    }
}
