public class Main {
    public static void main(String[] args) {

    }

    public static void forLoop(int[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void forWhile(int[] args) {
        int i = 0;

        while (i < 10) {
            System.out.println(i);
            i = i + 2;
        }
    }

    public static void forEach(double[] args) {
        int [] numbers = {1,2,3,4,5};

        for (int num : numbers){
            System.out.println(num);
        }
    }
}