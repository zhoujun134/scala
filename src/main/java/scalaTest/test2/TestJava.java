package scalaTest.test2;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class TestJava {
    static ArrayList<Object> values;

    public static void main(String[]args){
        values = new ArrayList<>(Arrays.asList(1,2,3,43));
        values = map(new Function<Object, Object>() {
            @Override
            public Object apply(Object object) {
                return "x == " + object;
            }
        });
        values.stream().reduce(new BinaryOperator<Object>() {
            @Override
            public Object apply(Object o, Object o2) {
                return null;
            }
        });

        System.out.println(values.getClass());
        values.forEach(System.out :: println);

    }

    public static ArrayList<Object> map(Function<Object, Object> f){
        for(int i=0; i< values.size(); i++){
            values.set(i, f.apply(values.get(i)));
        }
        return values;
    }
}
