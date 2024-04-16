package Generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            al.add(i+1);
        }

        //simple lamda exp
        al.forEach((item)->System.out.printf("%d ",item*5));

        //Using Consumer
        Consumer<Integer> fun = (item)->System.out.printf("%d ",item*5);
        al.forEach(fun);

        Operation sum = (a,b)->a+b;
        Operation sub = (a,b)->a-b;
        Operation prod = (a,b)->a*b;
        Operation div = (a,b)->a/b;

        LambdaFunctions myCalc = new LambdaFunctions();
        System.out.println(myCalc.operate(2, 4, sum));
        System.out.println(myCalc.operate(2, 4, sub));
        System.out.println(myCalc.operate(2, 4, prod));
        System.out.println(myCalc.operate(2, 4, div));
    }

    private int operate(int a,int b,Operation op){
        return op.operation(a, b);
    }

}

interface  Operation {
    int operation(int a,int b);
}
