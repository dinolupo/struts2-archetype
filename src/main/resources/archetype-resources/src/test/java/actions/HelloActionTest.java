#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.actions;

import ${package}.actions.HelloAction;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.StrutsJUnit4TestCase;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;


public class HelloActionTest extends StrutsJUnit4TestCase {
    
    public void testHelloAction() throws Exception {        
        HelloAction hello = new HelloAction();
        String result = hello.execute();
        
        assertThat("Expected a success result!", result, is(ActionSupport.SUCCESS));
        assertThat("Expected the default message!", hello.getMessage(), is(hello.getText(HelloAction.MESSAGE)));
    }
}
