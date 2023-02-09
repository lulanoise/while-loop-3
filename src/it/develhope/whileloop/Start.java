package it.develhope.whileloop;

public class Start {

    public static void main(String[] args){
        // you can declare in one line to avoid repeating int 4 times
        int a = 0, b = 1, c = 0, sum;

        while (c < 10) {
            System.out.println(a);
            sum = a + b;
            a = b;
            b = sum;
            c++;
        }
    }
}