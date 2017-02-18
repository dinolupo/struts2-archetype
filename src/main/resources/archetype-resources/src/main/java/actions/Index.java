#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Namespaces(value={@Namespace("/")})
@Results({
        @Result(name = ActionSupport.SUCCESS, location = "${symbol_dollar}{redirectName}", type = "redirectAction")
})
@Actions(value={@Action(""),@Action("home")})
public class Index extends ActionSupport {

    private String redirectName;

    public String execute() {
        redirectName = "hello";
        return SUCCESS;
    }

    public String getRedirectName() {
        return redirectName;
    }

}
