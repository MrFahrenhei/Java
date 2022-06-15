package collazt;

import java.util.Scanner;

public class Collatz {
	public static int number;
    public static void main(String[] args) {
        getInfo();
        init(number);
    }
    public static void getInfo(){
        Scanner entry = new Scanner (System.in);
        System.out.println("Adicione um número");
        number = entry.nextInt();
    }
    static void init(int number){
        int i = 0;
        while (number > 1){
            System.out.printf("%s ", number);
            if(number % 2 != 0){
                number = 3*number+1;
            }else{
                number = number/2;
            }
            i++;
        }
        //System.out.println(i);
        System.out.println(number);

    }
}
