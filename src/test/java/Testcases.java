import com.virenautomationtesting.springboot.HelloWorldController;
import com.virenautomationtesting.springboot.MyWebApplication;
import org.junit.Test;

public class Testcases {

    @Test
    public void test(){
        HelloWorldController obj= new HelloWorldController();
        obj.hello2();
    }

    @Test
    public void testmain(){
        MyWebApplication obj2= new MyWebApplication();
       obj2.toString();
    }

}
