package testpkg;

import com.virenautomationtesting.springboot.HelloWorldController;
import com.virenautomationtesting.springboot.MyWebApplication;
import com.virenautomationtesting.springboot.javacode;
import org.junit.Test;


public class Testcases {

    @Test
    public void test(){
        HelloWorldController obj= new HelloWorldController();
        obj.hello2("viren");
    }

    @Test
    public void addint(){
        javacode a= new javacode();
        int c=a.add(10,20);
        System.out.println(c);
    }

}
