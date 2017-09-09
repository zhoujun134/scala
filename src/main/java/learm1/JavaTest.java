package learm1;

import java.util.Date;

public class JavaTest {
    public static void main(String[] args){
        TestPerson testPerson = () -> System.out.println(" 调用 test 方法 ！ ");;
        testPerson.test();
        testPerson.log("测试该方法 ！ ");
    }
}

interface TestPerson{
    void test();
    default void log(String msg){
        System.out.println("信息：" + (new Date()) + "  :  " + msg );
    }
}