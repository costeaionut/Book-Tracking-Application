/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-05-26 13:03:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Classes.Carti;
import java.util.ArrayList;

public final class AdaugareCarti_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/cartiCititePage.css\">\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h2>Carti disponibile:</h2>\r\n");

    ArrayList<Carti> _carti = Carti.selectAllEntries();
    out.print("<div class=\"table-wrapper\">");
    out.print("<table style=\"width:100%\", class=\"fl-table\"> <tr> <th>Titlu</th> <th>Autor</th> <th>Nr. Pagini</th> </tr>");
    for (Carti c:
         _carti)
    {
        out.println("<tr> <td>" + c.getTitlu() + " </td> <td> " + c.getAutor() + "</td> <td>" + c.getNrPagini() + "</td> </tr> <br>");
    }
    out.print("</table></div>");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<form method=\"post\", action = \"/CartiCitite\">\r\n");
      out.write("    ");
  out.println("<input hidden readonly type=\"text\" id=\"user\" name=\"user\" value="+ session.getAttribute("numeUtilizator") + "><br>"); 
      out.write("\r\n");
      out.write("    <label for = \"adaugareCarte\"> Carte de adaugat: </label> <br>\r\n");
      out.write("    <input type=\"text\", id = \"adaugareCarte\", name = \"carte\", align = \"right\"><br>\r\n");
      out.write("    <input type=\"submit\", value = \"Adauga carte\">\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}