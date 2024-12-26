package core.java.interfaces;

import org.junit.jupiter.api.Test;

public class MyLambdaInterfaceSpec {

    @Test
    void createFibUsingLambda() {
        MyLambdaInterface fibInterface = (int number) -> {
            int num1 = 0, num2 = 1;
            for (int i = 0; i < number; i++) {
                int num3 = num2 + num1;
                num1 = num2;
                num2 = num3;
            }
            return num1;
        };

        assert(3 == fibInterface.calculateFibonacci(4));
    }
}
