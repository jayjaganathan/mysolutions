package jsp_servlet;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class __index extends  weblogic.servlet.jsp.JspBase  implements weblogic.servlet.jsp.StaleIndicator {

    private static void _releaseTags(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag t) {
        while (t != null) {
            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, t);
            if(t instanceof javax.servlet.jsp.tagext.Tag) {
                javax.servlet.jsp.tagext.Tag tmp = (javax.servlet.jsp.tagext.Tag)t;
                t = ((javax.servlet.jsp.tagext.Tag) t).getParent();
                try {
                    tmp.release();
                } catch(java.lang.Exception ignore) {}
            }
            else {
                t = ((javax.servlet.jsp.tagext.SimpleTag)t).getParent();
            }
        }
    }

    public boolean _isStale(){
        boolean _stale = _staticIsStale((weblogic.servlet.jsp.StaleChecker) getServletConfig().getServletContext());
        return _stale;
    }

    public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
        if (sci.isResourceStale("/index.jsp", 1427976088072L ,"10.3.6.0","America/New_York")) return true;
        return false;
    }

    private static boolean _WL_ENCODED_BYTES_OK = true;
    private static final java.lang.String _WL_ORIGINAL_ENCODING = "ISO-8859-1".intern();

    private static byte[] _getBytes(java.lang.String block){
        try {
            return block.getBytes(_WL_ORIGINAL_ENCODING);
        } catch (java.io.UnsupportedEncodingException u){
            _WL_ENCODED_BYTES_OK = false;
        }
        return null;
    }

    private final static java.lang.String  _wl_block0 ="<!DOCTYPE html>\r\n<html>\r\n<head>\r\n    <meta charset=\"utf-8\">\r\n    <title>Murach\'s Java Servlets and JSP</title>\r\n    <link rel=\"stylesheet\" href=\"styles/main.css\" type=\"text/css\"/>\r\n</head>\r\n<body>\r\n    \r\n<h1>CD list</h1>\r\n<table> \r\n    <tr>\r\n        <th>Description</th>\r\n        <th class=\"right\">Price</th>\r\n        <th>&nbsp;</th>\r\n    </tr>\r\n    <tr>\r\n        <td>86 (the band) - True Life Songs and Pictures</td>\r\n        <td class=\"right\">$14.95</td>\r\n        <td><form action=\"cart\" method=\"post\">\r\n                <input type=\"hidden\" name=\"productCode\" value=\"8601\">\r\n                <input type=\"submit\" value=\"Add To Cart\">\r\n            </form><!--<a href=\"cart?productCode=8601\">Add To Cart</a>--></td>\r\n    </tr>\r\n    <tr>\r\n        <td>Paddlefoot - The first CD</td>\r\n        <td class=\"right\">$12.95</td>\r\n        <td><form action=\"cart\" method=\"post\">\r\n                <input type=\"hidden\" name=\"productCode\" value=\"pf01\">\r\n                <input type=\"submit\" value=\"Add To Cart\">\r\n            </form></td>\r\n    </tr>\r\n    <tr>\r\n        <td>Paddlefoot - The second CD</td>\r\n        <td class=\"right\">$14.95</td>\r\n        <td><form action=\"cart\" method=\"post\">\r\n                <input type=\"hidden\" name=\"productCode\" value=\"pf02\">\r\n                <input type=\"submit\" value=\"Add To Cart\">\r\n            </form></td>\r\n    </tr>\r\n    <tr>\r\n        <td>Joe Rut - Genuine Wood Grained Finish</td>\r\n        <td class=\"right\">$14.95</td>\r\n        <td><form action=\"cart\" method=\"post\">\r\n                <input type=\"hidden\" name=\"productCode\" value=\"jr01\">\r\n                <input type=\"submit\" value=\"Add To Cart\">\r\n            </form></td>\r\n    </tr>\r\n</table>\r\n        \r\n</body>\r\n</html>";
    private final static byte[]  _wl_block0Bytes = _getBytes( _wl_block0 );

    static private weblogic.jsp.internal.jsp.JspFunctionMapper _jspx_fnmap = weblogic.jsp.internal.jsp.JspFunctionMapper.getInstance();

    public void _jspService(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) 
    throws javax.servlet.ServletException, java.io.IOException {

        javax.servlet.ServletConfig config = getServletConfig();
        javax.servlet.ServletContext application = config.getServletContext();
        javax.servlet.jsp.tagext.JspTag _activeTag = null;
        java.lang.Object page = this;
        javax.servlet.jsp.PageContext pageContext = javax.servlet.jsp.JspFactory.getDefaultFactory().getPageContext(this, request, response, null, true , 8192 , true );
        response.setHeader("Content-Type", "text/html");
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter)out;
        _bw.setInitCharacterEncoding(_WL_ORIGINAL_ENCODING, _WL_ENCODED_BYTES_OK);
        javax.servlet.jsp.JspWriter _originalOut = out;
        javax.servlet.http.HttpSession session = request.getSession( true );
        try {;
            _bw.write(_wl_block0Bytes, _wl_block0);
        } catch (java.lang.Throwable __ee){
            if(!(__ee instanceof javax.servlet.jsp.SkipPageException)) {
                while ((out != null) && (out != _originalOut)) out = pageContext.popBody(); 
                _releaseTags(pageContext, _activeTag);
                pageContext.handlePageException(__ee);
            }
        }
    }
}
