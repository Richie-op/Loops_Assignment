public class LoopExamples {
    public void  forLoopExample(int number){
        System.out.println("For Loop Output");
        for (int i = 0; i <= number ; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    public void whileLoopExample(int number){
        System.out.println("While Loop Output:");
        int i = 0;
        while (i <= number){
            System.out.println(i + " ");
            i++;
        }
        System.out.println();
    }
    public void doWhileLoopExample(int number){
        System.out.println("Do-While Loop Output:");
        int i = 0;
        do {
            System.out.println(i + " ");
            i++;
        } while (i <= number);
        System.out.println();
    }
}
