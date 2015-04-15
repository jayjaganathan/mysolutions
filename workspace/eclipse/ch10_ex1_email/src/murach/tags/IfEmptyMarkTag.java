package murach.tags;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;

public class IfEmptyMarkTag extends TagSupport {

    private String field;
    private String color = "green";

    public void setField(String field) {
        this.field = field;
    }

    public void setColor(String color) {
        this.color = color;
        if(color.length() <= 0) color = "green";
    }

    @Override
    public int doStartTag() throws JspException {
        try {
            JspWriter out = pageContext.getOut();
            if(color.length() <= 0) color = "green";
            if (field == null || field.length() == 0) {
                out.print("<font color=" + color + "> *</font>");
            }
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
        return SKIP_BODY;
    }
}
