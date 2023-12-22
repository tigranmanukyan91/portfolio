package Lambdas;
class ExecutableImplementation implements Executable{

    @Override
    public void execute() {
        System.out.println("Hi");
    }
}

interface Executable{
    void execute();
}

class Runner{
    public void run(Executable executable){
            executable.execute();
    }
}

public class LambdaImpl {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new ExecutableImplementation());
        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Anonymous class");
            }
        });
        runner.run(() -> System.out.println("Lambda"));
    }
}
