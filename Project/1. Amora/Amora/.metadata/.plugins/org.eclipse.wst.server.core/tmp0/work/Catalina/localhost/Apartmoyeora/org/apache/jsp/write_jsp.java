/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-08-17 07:08:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class write_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<!--\r\n");
      out.write("   Traveler by freehtml5.co\r\n");
      out.write("   Twitter: http://twitter.com/fh5co\r\n");
      out.write("   URL: http://freehtml5.co\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<title>Traveler &mdash; Free Website Template, Free HTML5\r\n");
      out.write("   Template by FreeHTML5.co</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta name=\"description\"\r\n");
      out.write("   content=\"Free HTML5 Website Template by FreeHTML5.co\" />\r\n");
      out.write("<meta name=\"keywords\"\r\n");
      out.write("   content=\"free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive\" />\r\n");
      out.write("<meta name=\"author\" content=\"FreeHTML5.co\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Facebook and Twitter integration -->\r\n");
      out.write("<meta property=\"og:title\" content=\"\" />\r\n");
      out.write("<meta property=\"og:image\" content=\"\" />\r\n");
      out.write("<meta property=\"og:url\" content=\"\" />\r\n");
      out.write("<meta property=\"og:site_name\" content=\"\" />\r\n");
      out.write("<meta property=\"og:description\" content=\"\" />\r\n");
      out.write("<meta name=\"twitter:title\" content=\"\" />\r\n");
      out.write("<meta name=\"twitter:image\" content=\"\" />\r\n");
      out.write("<meta name=\"twitter:url\" content=\"\" />\r\n");
      out.write("<meta name=\"twitter:card\" content=\"\" />\r\n");
      out.write("\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,700\"\r\n");
      out.write("   rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Animate.css -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("<!-- Icomoon Icon Fonts-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/icomoon.css\">\r\n");
      out.write("<!-- Themify Icons-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/themify-icons.css\">\r\n");
      out.write("<!-- Bootstrap  -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Magnific Popup -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Magnific Popup -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap-datepicker.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Owl Carousel  -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Theme style  -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/stylewrite.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Modernizr JS -->\r\n");
      out.write("<script src=\"js/modernizr-2.6.2.min.js\"></script>\r\n");
      out.write("<!-- FOR IE9 below -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("   <script src=\"js/respond.min.js\"></script>\r\n");
      out.write("   <![endif]-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- 여기부터 메뉴바 -->\r\n");
      out.write("   <div class=\"gtco-loader\"></div>\r\n");
      out.write("   <div id=\"page\">\r\n");
      out.write("      <!-- <div class=\"page-inner\"> -->\r\n");
      out.write("      <nav class=\"gtco-nav\" role=\"navigation\">\r\n");
      out.write("         <div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("               <div class=\"col-sm-4 col-xs-12\">\r\n");
      out.write("                  <div id=\"gtco-logo\">\r\n");
      out.write("                     <a href=\"index.jsp\">AMORA</a>\r\n");
      out.write("                  </div>\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"col-xs-8 text-right menu-1\">\r\n");
      out.write("                  <ul>\r\n");
      out.write("                     <li class=\"has-dropdown\"><a href=\"community.jsp\">커뮤니티</a>\r\n");
      out.write("                        <ul class=\"dropdown\">\r\n");
      out.write("                           <li><a href=\"community.jsp\">전체 글 보기</a></li>\r\n");
      out.write("                           <li><a href=\"request.jsp\">건의사항</a></li>\r\n");
      out.write("                           <li><a href=\"hobby.jsp\">취미생활</a></li>\r\n");
      out.write("                           <li><a href=\"baby.jsp\">육아</a></li>\r\n");
      out.write("                           <li><a href=\"find.jsp\">찾아주세요</a></li>\r\n");
      out.write("                           <li><a href=\"food.jsp\">동네맛집</a></li>\r\n");
      out.write("                        </ul></li>\r\n");
      out.write("                     <li class=\"has-dropdown\"><a href=\"secondhand.jsp\">중고거래/나눔</a>\r\n");
      out.write("                        <ul class=\"dropdown\">\r\n");
      out.write("                           <li><a href=\"secondhand.jsp\">중고거래</a></li>\r\n");
      out.write("                           <li><a href=\"share.jsp\">나눔</a></li>\r\n");
      out.write("                        </ul></li>\r\n");
      out.write("                     <li><a href=\"contact.jsp\">공동구매</a></li>\r\n");
      out.write("                     <li><a href=\"promotion.jsp\">홍보</a></li>\r\n");
      out.write("                     <li><a href=\"pricing.jsp\">공지사항</a></li>\r\n");
      out.write("                     <li><a href=\"destination.jsp\">마이페이지</a></li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("         </div>\r\n");
      out.write("      </nav>\r\n");
      out.write("\r\n");
      out.write("      <header id=\"gtco-header\" class=\"gtco-cover gtco-cover-sm\"\r\n");
      out.write("         role=\"banner\" style=\"background-image: url(images/bgapt.jpg); height: 150px\">\r\n");
      out.write("         <div class=\"overlay\"></div>\r\n");
      out.write("         <div class=\"gtco-container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("               <div class=\"col-md-12 col-md-offset-0 text-center\">\r\n");
      out.write("                  <!-- \r\n");
      out.write("                  <div class=\"row row-mt-15em\">\r\n");
      out.write("                     <div class=\"col-md-12 mt-text animate-box\"\r\n");
      out.write("                        data-animate-effect=\"fadeInUp\">\r\n");
      out.write("                        <!-- <h1>Plans for Everyone</h1> \r\n");
      out.write("                     </div>\r\n");
      out.write("                        -->\r\n");
      out.write("\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("      </header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <div>\r\n");
      out.write("         <!--class=\"gtco-section\" -->\r\n");
      out.write("         <div style=\"width:840px; height:1600px; position:relative; left:40px; top:20px;\" class=\"gtco-container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("               <div class=\"topmargin\">\r\n");
      out.write("                  <!--class=\"col-md-8 col-md-offset-2 text-center gtco-heading animate-box\"-->\r\n");
      out.write("                <form action =\"writee\" method=\"post\" enctype = \"multipart/form-data\">\r\n");
      out.write("                  <div class=\"board_wrap\">\r\n");
      out.write("                     <div class=\"board_title\">\r\n");
      out.write("                        <h1>커뮤니티</h1>\r\n");
      out.write("                        <p>아모라 아파트 소통해요 !</p>\r\n");
      out.write("                     </div>\r\n");
      out.write("                     \r\n");
      out.write("                     <div class=\"board_list_wrap\">\r\n");
      out.write("                  \r\n");
      out.write("                        <div class=\"board_list\">\r\n");
      out.write("                           <div style=\"float: left; display:flex;\">\r\n");
      out.write("                              <select style=\"height:50px;\" id=\"category\" name =\"com_Category\">\r\n");
      out.write("                                 <option value=\"request\">건의사항</option>\r\n");
      out.write("                                 <option value=\"hobby\">취미생활</option>\r\n");
      out.write("                                 <option value=\"baby\">육아</option>\r\n");
      out.write("                                 <option value=\"find\">찾아주세요</option>\r\n");
      out.write("                                 <option value=\"food\">동네맛집</option>\r\n");
      out.write("                              </select>\r\n");
      out.write("                              <textarea name =\"com_Title\" style=\"height:50px; width: 668px;\" rows=\"1\" cols=\"65 text-align: center;\" placeholder=\" 제목입력\"></textarea>\r\n");
      out.write("                           </div>\r\n");
      out.write("                           <div>\r\n");
      out.write("                                 <textarea style=\"width:840px; position:relative; top:50px;\" name =\"com_Content\"rows=\"10\" cols=\"65\" placeholder=\" 관리자의 판단하에 비방글은 삭제 됩니다.\"></textarea>\r\n");
      out.write("\r\n");
      out.write("                                 <!-- row:높이 column:너비 -->\r\n");
      out.write("                              \r\n");
      out.write("                           </div>\r\n");
      out.write("                        </div>   \r\n");
      out.write("                        </div>\r\n");
      out.write("                  \r\n");
      out.write("                  <div>\r\n");
      out.write("                           <div  class=\"wi_line\"></div>\r\n");
      out.write("                           <input style=\"position:relative; top:50px; display:flex;\" type=\"file\" name=\"SelectFile\" >\r\n");
      out.write("                        \r\n");
      out.write("   \r\n");
      out.write("                     <div style=\"position:relative; left:670px;\"class=\"bt_wrap\">\r\n");
      out.write("                      <div>\r\n");
      out.write("                             <input name=\"write\" type=\"submit\" value=\"완료\">\r\n");
      out.write("                             <a href=\"promotion.jsp\"><button style=\"margin-left: 10px;\">취소</button></a>\r\n");
      out.write("                         </div>\r\n");
      out.write("                         <!-- <input  style=\"position:relative; top:10px; width: 80px ; height: 42px; justify-content: space-between; text-align:center; font-size:30px; background-color:#00000; border:3px solid #7297F7; \" name =\"write\" type = \"submit\" value=\"완료\">\r\n");
      out.write("                        <a style=\" border:1px solid #000; font-color: black;\"href=\"community.jsp\">취소</a> -->\r\n");
      out.write("                     </div></div>\r\n");
      out.write("                     \r\n");
      out.write("                     \r\n");
      out.write("                     \r\n");
      out.write("                  </div>\r\n");
      out.write("                  </form>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("               <div class=\"col-md-8 col-md-offset-2\">\r\n");
      out.write("                  <ul class=\"fh5co-faq-list\">\r\n");
      out.write("\r\n");
      out.write("                  </ul>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <!--  <div id=\"gtco-subscribe\">\r\n");
      out.write("      <div class=\"gtco-container\">\r\n");
      out.write("         <div class=\"row animate-box\">\r\n");
      out.write("            <div class=\"col-md-8 col-md-offset-2 text-center gtco-heading\">\r\n");
      out.write("               <h2>Subscribe</h2>\r\n");
      out.write("               <p>Be the first to know about the new templates.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"row animate-box\">\r\n");
      out.write("            <div class=\"col-md-8 col-md-offset-2\">\r\n");
      out.write("               <form class=\"form-inline\">\r\n");
      out.write("                  <div class=\"col-md-6 col-sm-6\">\r\n");
      out.write("                     <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"email\" class=\"sr-only\">Email</label>\r\n");
      out.write("                        <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Your Email\">\r\n");
      out.write("                     </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col-md-6 col-sm-6\">\r\n");
      out.write("                     <button type=\"submit\" class=\"btn btn-default btn-block\">Subscribe</button>\r\n");
      out.write("                  </div>\r\n");
      out.write("               </form>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("   </div> -->\r\n");
      out.write("\r\n");
      out.write("      <footer id=\"gtco-footer\" role=\"contentinfo\">\r\n");
      out.write("         <div class=\"gtco-container\">\r\n");
      out.write("            <div class=\"row row-p   b-md\">\r\n");
      out.write("               <div class=\"col-md-4\">\r\n");
      out.write("                  <div class=\"gtco-widget\">\r\n");
      out.write("                     <h3>About Us</h3>\r\n");
      out.write("                     <p>아모라 아파트</p>\r\n");
      out.write("                  </div>\r\n");
      out.write("               </div>\r\n");
      out.write("\r\n");
      out.write("               <div class=\"col-md-2 col-md-push-1\">\r\n");
      out.write("                  <div class=\"gtco-widget\">\r\n");
      out.write("                     <h3>관리사무소</h3>\r\n");
      out.write("                     <ul class=\"gtco-footer-links\">\r\n");
      out.write("                        <li><a href=\"#\">사과시 복숭아동 아모라아파트</a></li>\r\n");
      out.write("                     </ul>\r\n");
      out.write("                  </div>\r\n");
      out.write("               </div>\r\n");
      out.write("\r\n");
      out.write("               <div class=\"col-md-3 col-md-push-1\">\r\n");
      out.write("                  <div class=\"gtco-widget\">\r\n");
      out.write("                     <h3>Get In Touch</h3>\r\n");
      out.write("                     <ul class=\"gtco-quick-contact\">\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"icon-phone\"></i> +1 234 567\r\n");
      out.write("                              890</a></li>\r\n");
      out.write("                     </ul>\r\n");
      out.write("                  </div>\r\n");
      out.write("               </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row copyright\">\r\n");
      out.write("               <div class=\"col-md-12\">\r\n");
      out.write("                  <p class=\"pull-left\">\r\n");
      out.write("                     <small class=\"block\">&copy; 2016 Free HTML5. All Rights\r\n");
      out.write("                        Reserved.</small> <small class=\"block\">Designed by <a\r\n");
      out.write("                        href=\"https://freehtml5.co/\" target=\"_blank\">freehtml5.co</a>\r\n");
      out.write("                        Demo Images: <a href=\"http://unsplash.com/\" target=\"_blank\">Unsplash</a></small>\r\n");
      out.write("                  </p>\r\n");
      out.write("                  <p class=\"pull-right\">\r\n");
      out.write("                  <ul class=\"gtco-social-icons pull-right\">\r\n");
      out.write("                     <li><a href=\"#\"><i class=\"icon-twitter\"></i></a></li>\r\n");
      out.write("                     <li><a href=\"#\"><i class=\"icon-facebook\"></i></a></li>\r\n");
      out.write("                     <li><a href=\"#\"><i class=\"icon-linkedin\"></i></a></li>\r\n");
      out.write("                     <li><a href=\"#\"><i class=\"icon-dribbble\"></i></a></li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("                  </p>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("         </div>\r\n");
      out.write("      </footer>\r\n");
      out.write("\r\n");
      out.write("   </div>\r\n");
      out.write("\r\n");
      out.write("   <div class=\"gototop js-top\">\r\n");
      out.write("      <a href=\"#\" class=\"js-gotop\"><i class=\"icon-arrow-up\"></i></a>\r\n");
      out.write("   </div>\r\n");
      out.write("\r\n");
      out.write("   <!-- jQuery -->\r\n");
      out.write("   <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("   <!-- jQuery Easing -->\r\n");
      out.write("   <script src=\"js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("   <!-- Bootstrap -->\r\n");
      out.write("   <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("   <!-- Waypoints -->\r\n");
      out.write("   <script src=\"js/jquery.waypoints.min.js\"></script>\r\n");
      out.write("   <!-- Carousel -->\r\n");
      out.write("   <script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("   <!-- countTo -->\r\n");
      out.write("   <script src=\"js/jquery.countTo.js\"></script>\r\n");
      out.write("\r\n");
      out.write("   <!-- Stellar Parallax -->\r\n");
      out.write("   <script src=\"js/jquery.stellar.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("   <!-- Magnific Popup -->\r\n");
      out.write("   <script src=\"js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("   <script src=\"js/magnific-popup-options.js\"></script>\r\n");
      out.write("\r\n");
      out.write("   <!-- Datepicker -->\r\n");
      out.write("   <script src=\"js/bootstrap-datepicker.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   <!-- Main -->\r\n");
      out.write("   <script src=\"js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
