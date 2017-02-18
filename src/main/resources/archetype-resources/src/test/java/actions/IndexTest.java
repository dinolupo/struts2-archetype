#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.actions;

import ${package}.actions.Index;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.StrutsTestCase;

public class IndexTest extends StrutsTestCase {

    public void testIndex() throws Exception {
        Index index = new Index();
        String result = index.execute();
        assertTrue("Expected a success result!", ActionSupport.SUCCESS.equals(result));
        assertTrue("Expected the 'hello' action name!!", "hello".equals(index.getRedirectName()));
    }
    
    
    
}
