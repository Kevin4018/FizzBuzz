package lab1;

public class Multiples {
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        int i = 1;
        while(i < 1000){
            if (i % 3 == 0){
                System.out.println(i);
            }
            else if(i % 5 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
