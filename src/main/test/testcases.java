package test;
import org.junit.Test;

public class testcases {

    @Test
    public void add(){
        HelloWorldController hc= new HelloWorldController();
        hc.hello();
        System.out.println("print code");
    }

}