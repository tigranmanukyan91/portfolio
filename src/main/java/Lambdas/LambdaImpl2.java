package Lambdas;

public class LambdaImpl2 {
    public static void main(String[] args) {
        Runner2 runner2 = new Runner2();
        runner2.run(new Executable2() {
            @Override
            public int execute(int x , int y) {
                return x + y;
            }
        });

        runner2.run(Integer::sum);
    }
}

interface Executable2{
    int execute(int x, int y);
}

class Runner2{
    public void run(Executable2 executable){
        int a = executable.execute(10, 5);
        System.out.println(a);
    }
}


