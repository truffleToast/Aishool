/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-08-17 02:29:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.ApartDAO;
import model.UsersDTO;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("model.UsersDTO");
    _jspx_imports_classes.add("model.ApartDAO");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<!--\r\n");
      out.write("	Traveler by freehtml5.co\r\n");
      out.write("	Twitter: http://twitter.com/fh5co\r\n");
      out.write("	URL: http://freehtml5.co\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("	<head>\r\n");
      out.write("	<meta charset=\"UTF-8\">\r\n");
      out.write("	<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("	<title>Travel &mdash; Free Website Template, Free HTML5 Template by FreeHTML5.co</title>\r\n");
      out.write("	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("	<meta name=\"description\" content=\"Free HTML5 Website Template by FreeHTML5.co\" />\r\n");
      out.write("	<meta name=\"keywords\" content=\"free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive\" />\r\n");
      out.write("	<meta name=\"author\" content=\"FreeHTML5.co\" />\r\n");
      out.write("\r\n");
      out.write("  	<!-- Facebook and Twitter integration -->\r\n");
      out.write("	<meta property=\"og:title\" content=\"\"/>\r\n");
      out.write("	<meta property=\"og:image\" content=\"\"/>\r\n");
      out.write("	<meta property=\"og:url\" content=\"\"/>\r\n");
      out.write("	<meta property=\"og:site_name\" content=\"\"/>\r\n");
      out.write("	<meta property=\"og:description\" content=\"\"/>\r\n");
      out.write("	<meta name=\"twitter:title\" content=\"\" />\r\n");
      out.write("	<meta name=\"twitter:image\" content=\"\" />\r\n");
      out.write("	<meta name=\"twitter:url\" content=\"\" />\r\n");
      out.write("	<meta name=\"twitter:card\" content=\"\" />\r\n");
      out.write("\r\n");
      out.write("	<link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,700\" rel=\"stylesheet\">\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("<!-- 스타일시트 링크 추가 -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/NewFile.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Animate.css -->\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("	<!-- Icomoon Icon Fonts-->\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"css/icomoon.css\">\r\n");
      out.write("	<!-- Themify Icons-->\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"css/themify-icons.css\">\r\n");
      out.write("	<!-- Bootstrap  -->\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("\r\n");
      out.write("	<!-- Magnific Popup -->\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\r\n");
      out.write("\r\n");
      out.write("	<!-- Magnific Popup -->\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"css/bootstrap-datepicker.min.css\">\r\n");
      out.write("\r\n");
      out.write("	<!-- Owl Carousel  -->\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\r\n");
      out.write("\r\n");
      out.write("	<!-- Theme style  -->\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("	<!-- Modernizr JS -->\r\n");
      out.write("	<script src=\"js/modernizr-2.6.2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</head>\r\n");
      out.write("	<body>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	");

               String apart_name="";
               UsersDTO info =(UsersDTO)session.getAttribute("info");
               if (info==null){
                  apart_name="A M O R A";
               }
               else{
                  ApartDAO dao =new ApartDAO();
                  String addr = info.getAddr();
                  apart_name =dao.getApartName(addr);
               }
               
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<div class=\"gtco-loader\"></div>\r\n");
      out.write("	\r\n");
      out.write("	<div id=\"page\">\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<!-- <div class=\"page-inner\"> -->\r\n");
      out.write("	<nav class=\"gtco-nav\" role=\"navigation\">\r\n");
      out.write("		<div>\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("				<div class=\"col-sm-4 col-xs-12\">\r\n");
      out.write("					<div id=\"gtco-logo\"><a href=\"index.jsp\">AMORA</a></div>\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				<div class=\"col-xs-8 text-right menu-1\" align=\"center !important;\">\r\n");
      out.write("	\r\n");
      out.write("	<!-- 메뉴바 살짝 왼쪽으로 밀기! -->			\r\n");
      out.write("    <ul style=\"margin-right:10px;\">\r\n");
      out.write("        ");
 if(info!= null){
      out.write("\r\n");
      out.write("        <li class=\"has-dropdown\"><a href=\"community.jsp\" style=\"font-size: 70%;\">커뮤니티</a>\r\n");
      out.write("            <ul class=\"dropdown\">\r\n");
      out.write("                <li><a href=\"community.jsp\">전체 글 보기</a></li>\r\n");
      out.write("                <li><a href=\"request.jsp\">건의사항</a></li>\r\n");
      out.write("                <li><a href=\"hobby.jsp\">취미생활</a></li>\r\n");
      out.write("                <li><a href=\"baby.jsp\">육아</a></li>\r\n");
      out.write("                <li><a href=\"find.jsp\">찾아주세요</a></li>\r\n");
      out.write("                <li><a href=\"food.jsp\">동네맛집</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"has-dropdown\"><a href=\"secondhand.jsp\" style=\"font-size: 70%;\">중고거래/나눔</a>	\r\n");
      out.write("            <ul class=\"dropdown\">\r\n");
      out.write("                <li><a href=\"secondhand.jsp\">중고거래</a></li>\r\n");
      out.write("                <li><a href=\"share.jsp\">나눔</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li><a href=\"contact.jsp\" style=\"font-size: 70%;\">공동구매</a></li>\r\n");
      out.write("        <li><a href=\"promotion.jsp\" style=\"font-size: 70%;\">홍보</a></li>\r\n");
      out.write("        <li><a href=\"pricing.jsp\" style=\"font-size: 70%;\">공지사항</a></li>\r\n");
      out.write("        \r\n");
      out.write("        <li class=\"has-dropdown\"><a href=\"destination.jsp\" style=\"font-size: 70%;\">마이페이지</a>\r\n");
      out.write("            <ul class=\"dropdown\">\r\n");
      out.write("                <li><a href=\"secondhand.jsp\">마이페이지</a></li>\r\n");
      out.write("                <li><a href=\"LogoutService\">로그아웃</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        \r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("    </ul>	\r\n");
      out.write("</div>\r\n");
      out.write("	\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("		</div>\r\n");
      out.write("	</nav>\r\n");
      out.write("	\r\n");
      out.write("	<header id=\"gtco-header\" class=\"gtco-cover gtco-cover-md\" role=\"banner\" style=\"background-image: url(images/bgapt.jpg)\">\r\n");
      out.write("		<div class=\"overlay\"></div>\r\n");
      out.write("		<div class=\"gtco-container\">\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-md-12 col-md-offset-0 text-left\">\r\n");
      out.write("					<div class=\"row row-mt-15em\">\r\n");
      out.write("						<div class=\"col-md-7 mt-text animate-box\" data-animate-effect=\"fadeInUp\">\r\n");
      out.write("						\r\n");
      out.write("						");
if(info==null){ 
      out.write("\r\n");
      out.write("						<h1>환영합니다.</h1>\r\n");
      out.write("							<h1><b>");
      out.print( apart_name );
      out.write("</b> 입니다.</h1>				\r\n");
      out.write("							\r\n");
      out.write("						");
}else{
      out.write("\r\n");
      out.write("							<h1>환영합니다.</h1>\r\n");
      out.write("							<h1><b>");
      out.print( apart_name );
      out.write("</b> 입니다.</h1>				\r\n");
      out.write("							<h1></h1>\r\n");
      out.write("							");
} 
      out.write("\r\n");
      out.write("							\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col-md-4 col-md-push-1 animate-box container\" data-animate-effect=\"fadeInRight\">\r\n");
      out.write("							\r\n");
      out.write("							\r\n");
      out.write("							");
 if(info != null){ 
      out.write("\r\n");
      out.write("							<div class=\"card\" style=\"background:#F0F0F0 !important;\">\r\n");
      out.write("							    <div class=\"imgBx\">	    \r\n");
      out.write("							      <img src=\"https://i.ibb.co/CskPFGX/Amora.png\" >\r\n");
      out.write("							    </div>\r\n");
      out.write("							    <div class=\"contentBx\">\r\n");
      out.write("							      <h2 style=\"color:black; font-size:200%;\"><b>A M O R A</b></h2>\r\n");
      out.write("							      <br>\r\n");
      out.write("							      <br>\r\n");
      out.write("								  <br>\r\n");
      out.write("							      <form action=\"LogoutService\" method=\"post\">\r\n");
      out.write("							      \r\n");
      out.write("							      <div class=\"row form-group\">\r\n");
      out.write("										<div class=\"col-md-12\">\r\n");
      out.write("											<div style=\"margin-left: 10px; margin-right: 10px;\">\r\n");
      out.write("												<label for=\"activities\">");
      out.print( info.getNickname() );
      out.write(" 님 환영합니다!</label>\r\n");
      out.write("											\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("									\r\n");
      out.write("							      \r\n");
      out.write("							      \r\n");
      out.write("								     <div class=\"row form-group\">\r\n");
      out.write("										<div class=\"col-md-12\">\r\n");
      out.write("										<div style=\"margin-left: 20px; margin-right: 20px;\">\r\n");
      out.write("											<input type=\"submit\" class=\"btn btn-primary btn-block\" value=\"로그아웃\">\r\n");
      out.write("										</div>\r\n");
      out.write("										</div>\r\n");
      out.write("									 </div>\r\n");
      out.write("								    </form>\r\n");
      out.write("								\r\n");
      out.write("									\r\n");
      out.write("							    </div>\r\n");
      out.write("							  </div>\r\n");
      out.write("							\r\n");
      out.write("							\r\n");
      out.write("							\r\n");
      out.write("							");
 }else{ 
      out.write("\r\n");
      out.write("							  <div class=\"card\" style=\"background:#F0F0F0 !important;\">\r\n");
      out.write("							    <div class=\"imgBx\">	    \r\n");
      out.write("							      <img src=\"https://i.ibb.co/CskPFGX/Amora.png\" >\r\n");
      out.write("							    </div>\r\n");
      out.write("							    <div class=\"contentBx\">\r\n");
      out.write("							      <h2 style=\"color:black; font-size:200%;\"><b>A M O R A</b></h2>\r\n");
      out.write("							      <br>\r\n");
      out.write("							      \r\n");
      out.write("							      <form action=\"LoginService\" method=\"post\">\r\n");
      out.write("							      <div class=\"row form-group\">\r\n");
      out.write("										<div class=\"col-md-12\">\r\n");
      out.write("											<label for=\"activities\" style=\"float: left; margin-left: 10px;\">ID</label>\r\n");
      out.write("											<div style=\"margin-left: 10px; margin-right: 10px;\">\r\n");
      out.write("											<input type=\"text\" id=\"ID\" name=\"id\" placeholder = \" 아이디 입력\" class=\"form-control\">\r\n");
      out.write("												\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("									\r\n");
      out.write("									<div class=\"row form-group\">\r\n");
      out.write("										<div class=\"col-md-12\">\r\n");
      out.write("											<label for=\"PW\" style=\"float: left; margin-left: 10px;\">PW</label>\r\n");
      out.write("											<div style=\"margin-left: 10px; margin-right: 10px;\">\r\n");
      out.write("										    <input type=\"password\" id=\"PW\" name =\"pw\" placeholder = \" 비밀번호 입력\" class=\"form-control\">												</div>\r\n");
      out.write("											</div>\r\n");
      out.write("									</div>\r\n");
      out.write("							      \r\n");
      out.write("							      \r\n");
      out.write("								     <div class=\"row form-group\">\r\n");
      out.write("										<div class=\"col-md-12\">\r\n");
      out.write("										<div style=\"margin-left: 20px; margin-right: 20px;\">\r\n");
      out.write("											<input type=\"submit\" class=\"btn btn-primary btn-block\" value=\"로그인\">\r\n");
      out.write("										</div>\r\n");
      out.write("										</div>\r\n");
      out.write("									 </div>\r\n");
      out.write("								    </form>\r\n");
      out.write("								\r\n");
      out.write("									<div class=\"row form-group\">\r\n");
      out.write("										<div class=\"col-md-12\">\r\n");
      out.write("										<div style=\"margin-left: 20px; margin-right: 20px;\">\r\n");
      out.write("											<input type=\"submit\" class=\"btn btn-primary1 btn-block\" value=\"회원가입\" onclick=\"window.location.href='joinchoice.jsp';\">\r\n");
      out.write("										</div>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("							    </div>\r\n");
      out.write("							  </div>\r\n");
      out.write("							");
 } 
      out.write("\r\n");
      out.write("							\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("							\r\n");
      out.write("					\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</header>\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<div class=\"row copyright\">\r\n");
      out.write("				<div class=\"col-md-12\">\r\n");
      out.write("					<p class=\"pull-left\">\r\n");
      out.write("						<small class=\"block\">&copy; 2016 Free HTML5. All Rights Reserved.</small> \r\n");
      out.write("						<small class=\"block\">Designed by <a href=\"https://freehtml5.co/\" target=\"_blank\">FreeHTML5.co</a> Demo Images: <a href=\"http://unsplash.com/\" target=\"_blank\">Unsplash</a></small>\r\n");
      out.write("					</p>\r\n");
      out.write("					<!-- <p class=\"pull-right\">\r\n");
      out.write("						<ul class=\"gtco-social-icons pull-right\">\r\n");
      out.write("							<li><a href=\"#\"><i class=\"icon-twitter\"></i></a></li>\r\n");
      out.write("							<li><a href=\"#\"><i class=\"icon-facebook\"></i></a></li>\r\n");
      out.write("							<li><a href=\"#\"><i class=\"icon-linkedin\"></i></a></li>\r\n");
      out.write("							<li><a href=\"#\"><i class=\"icon-dribbble\"></i></a></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</p>-->\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</footer>\r\n");
      out.write("	</div> \r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"gototop js-top\">\r\n");
      out.write("		<a href=\"#\" class=\"js-gotop\"><i class=\"icon-arrow-up\"></i></a>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	<!-- jQuery -->\r\n");
      out.write("	<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("	<!-- jQuery Easing -->\r\n");
      out.write("	<script src=\"js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("	<!-- Bootstrap -->\r\n");
      out.write("	<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("	<!-- Waypoints -->\r\n");
      out.write("	<script src=\"js/jquery.waypoints.min.js\"></script>\r\n");
      out.write("	<!-- Carousel -->\r\n");
      out.write("	<script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("	<!-- countTo -->\r\n");
      out.write("	<script src=\"js/jquery.countTo.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<!-- Stellar Parallax -->\r\n");
      out.write("	<script src=\"js/jquery.stellar.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<!-- Magnific Popup -->\r\n");
      out.write("	<script src=\"js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("	<script src=\"js/magnific-popup-options.js\"></script>\r\n");
      out.write("	\r\n");
      out.write("	<!-- Datepicker -->\r\n");
      out.write("	<script src=\"js/bootstrap-datepicker.min.js\"></script>\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("	<!-- Main -->\r\n");
      out.write("	<script src=\"js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
