/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-08-17 03:27:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import bbs.Bbs;
import bbs.BbsDAO;

public final class ntc_005fview_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.io.PrintWriter");
    _jspx_imports_classes.add("bbs.Bbs");
    _jspx_imports_classes.add("bbs.BbsDAO");
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
      out.write("<!-- 웹 페이지의 출력을 생성하고 클라이언트 브라우저에게 보낼 수 있다  -->  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--데이터베이스 가져올수 있도록 bbs.Bbs가져온다 -->\r\n");
      out.write("\r\n");
      out.write("<!--데이터 베이스 접근객체 가져온다  -->\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<!--종권시작  -->\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name = \"viewport\" content=\"width=device-width\", initial-scale=\"1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/custom.css\">\r\n");
      out.write("<!--종권끝  -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<title>Traveler &mdash; Free Website Template, Free HTML5\r\n");
      out.write("	Template by FreeHTML5.co</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta name=\"description\"\r\n");
      out.write("	content=\"Free HTML5 Website Template by FreeHTML5.co\" />\r\n");
      out.write("<meta name=\"keywords\"\r\n");
      out.write("	content=\"free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive\" />\r\n");
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
      out.write("	rel=\"stylesheet\">\r\n");
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
      out.write("<link rel=\"stylesheet\" href=\"css/stylenotice.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Modernizr JS -->\r\n");
      out.write("<script src=\"js/modernizr-2.6.2.min.js\"></script>\r\n");
      out.write("<!-- FOR IE9 below -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("	<script src=\"js/respond.min.js\"></script>\r\n");
      out.write("	<![endif]-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write(".custom-btn {\r\n");
      out.write("    background-color: gray; /* 버튼 배경색을 회색으로 변경 */\r\n");
      out.write("    color: white; /* 버튼 글자색을 흰색으로 변경 */\r\n");
      out.write("   \r\n");
      out.write("}   \r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("		");

		//로그인이 된사람들은 로그인정보를 담을 수 있도록 만들어줍니다.
		String userID = null;
	
	    // 현재session이 존재하는 사람이라면 String으로 형변환을 해서 userID에 넣는다
		if(session.getAttribute("userID") != null){
			//스트링형태로 형변환을 한다음에 세션에 있는값을 가져오게 한다 
			userID =(String)session.getAttribute("userID");
		}
	   
	    

		
		
		
		
		
		
		
		
		
		
		
		 // bbsID를 0으로 설정한다음에//매개변수로 넘어온 bbsID라는 매개변수가 존재한다면 
	    // bbsID는 형변환 후 request.getParameter 받는다 
	    int no_num = 0;
	    if(request.getParameter("no_num")!= null){
	    	no_num= Integer.parseInt(request.getParameter("no_num"));
	   
	    //request.getParameter("bbsID")를 겪은 bbsID가 0이라면  //bbsID로 정보를 받는다
	    }if(no_num == 0){
	    	
			PrintWriter script = response.getWriter();
			
			script.println("<script>");
			script.println("alert('유효하지 않는 글입니다')");
			//다시 bbs.jsp페이지로 이동을 한다  			
			script.println("location.href ='pricing.jsp'");
			script.println("</script>");
	    }
		//.getBbs(bbsID): BbsDAO 클래스의 getBbs 메서드를 호출합니다. 
		//메서드는 매개변수로 bbsID를 받아서 해당 ID에 해당하는 게시물 정보를 데이터베이스에서 가져옵니다. 이 정보는 Bbs 객체에 담기게 됩니다.
		//만약 유효한글이라면 구체적인 정보를 bbs인스턴스안에 담게한다 
		//!!!BbsDAO 클래스의 getBbs 메서드를 호출하여 bbsID를 데이터베이스에서 가져와 bbs 변수에 저장하는 작업을 수행합니다. 
		// bbs 변수를 통해 해당 게시물의 정보에 액세스할 수 있게 될 것입니다.
		 Bbs bbs = new BbsDAO().getBbs(no_num);
		
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"gtco-loader\"></div>\r\n");
      out.write("\r\n");
      out.write("	<div id=\"page\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<!-- <div class=\"page-inner\"> -->\r\n");
      out.write("		<nav class=\"gtco-nav\" role=\"navigation\">\r\n");
      out.write("			<div>\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<div class=\"col-sm-4 col-xs-12\">\r\n");
      out.write("						<div id=\"gtco-logo\">\r\n");
      out.write("							<a href=\"index.jsp\">AMORA</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-xs-8 text-right menu-1\">\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li class =\"has-dropdown\"><a href=\"community.jsp\">커뮤니티</a>\r\n");
      out.write("								<ul class=\"dropdown\">\r\n");
      out.write("								    <li><a href=\"community.jsp\">전체 글 보기</a></li>\r\n");
      out.write("									<li><a href=\"request.jsp\">건의사항</a></li>\r\n");
      out.write("									<li><a href=\"hobby.jsp\">취미생활</a></li>\r\n");
      out.write("									<li><a href=\"baby.jsp\">육아</a></li>\r\n");
      out.write("									<li><a href=\"find.jsp\">찾아주세요</a></li>\r\n");
      out.write("									<li><a href=\"food.jsp\">동네맛집</a></li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</li>\r\n");
      out.write("							<li class =\"has-dropdown\"> <a href=\"secondhand.jsp\">중고거래/나눔</a>	\r\n");
      out.write("								<ul class=\"dropdown\">\r\n");
      out.write("									<li><a href=\"secondhand.jsp\">중고거래</a></li>\r\n");
      out.write("									<li><a href=\"share.jsp\">나눔</a></li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</li>\r\n");
      out.write("							<li><a href=\"contact.jsp\">공동구매</a></li>\r\n");
      out.write("							<li><a href=\"promotion.jsp\">홍보</a></li>\r\n");
      out.write("							<li><a href=\"pricing.jsp\">공지사항</a></li>\r\n");
      out.write("							<li><a href=\"destination.jsp\">마이페이지</a></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</nav>\r\n");
      out.write("\r\n");
      out.write("		<header id=\"gtco-header\" class=\"gtco-cover gtco-cover-sm\"\r\n");
      out.write("			role=\"banner\" style=\"background-image: url(images/bgapt.jpg)\">\r\n");
      out.write("			<div class=\"overlay\"></div>\r\n");
      out.write("			<div class=\"gtco-container\">\r\n");
      out.write("			 	<div class=\"row\">\r\n");
      out.write("					<div class=\"col-md-12 col-md-offset-0 text-center\">\r\n");
      out.write("						<div class=\"row row-mt-15em\">\r\n");
      out.write("							<div class=\"col-md-12 mt-text animate-box\"\r\n");
      out.write("								data-animate-effect=\"fadeInUp\">\r\n");
      out.write("								<h1>공지사항</h1>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div> -->\r\n");
      out.write("		</header>\r\n");
      out.write("\r\n");
      out.write("		  \r\n");
      out.write("		<p style=\"color: white;\">글씨 흰색으로</p>\r\n");
      out.write("<!-- 이종권 여기시작 -->\r\n");
      out.write("		\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		\r\n");
      out.write("				\r\n");
      out.write("	<!-- 테이블만들기 -->					\r\n");
      out.write("		</div>\r\n");
      out.write("	</nav>	\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("			<!-- table-striped 클래스는 Bootstrap에서 제공하는 스타일 클래스 중 하나로, 테이블의 행을 번갈아가며 서로 다른 배경 색으로 스트라이프 모양으로 스타일링합니다.  -->\r\n");
      out.write("		  	<table class=\"table table-striped\" style=\"text-align:center; border:1px solid #dddddd\">\r\n");
      out.write("		  		<!-- <thead>는 HTML 문서에서 테이블의 헤더(Header) 부분을 정의하는 태그입니다 -->\r\n");
      out.write("		  		<thead>\r\n");
      out.write("		  			<tr>\r\n");
      out.write("		  			    <!-- colspan=\"3\" 3개의 열을 사용한다 -->\r\n");
      out.write("		  				<th colspan=\"3\" style=\"background-color: #eeeeee; text-align: center;\">게시판 글보기 </th>\r\n");
      out.write("		  			</tr>\r\n");
      out.write("		  		</thead>\r\n");
      out.write("		  		<tbody>\r\n");
      out.write("		  			<tr>\r\n");
      out.write("		  				<td style=\"width: 20%\">글제목</td>\r\n");
      out.write("		  				<td colspan=\"2\" >");
      out.print( bbs.getNo_title().replaceAll(" ","&nbsp;").replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("\n","<br>") );
      out.write("</td>\r\n");
      out.write("						<!-- 게시글 왼쪽으로 style=\"text-align: left;\" -->			  			\r\n");
      out.write("		  			</tr>\r\n");
      out.write("		  			<tr>\r\n");
      out.write("		  				<td >작성자</td>\r\n");
      out.write("		  				<td colspan=\"2\" >");
      out.print( bbs.getNickname().replaceAll(" ","&nbsp;").replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("\n","<br>") );
      out.write("</td>\r\n");
      out.write("		  			</tr>\r\n");
      out.write("		  			<tr>\r\n");
      out.write("		  				<td >작성일자</td>\r\n");
      out.write("		  				 <td colspan=\"2\" >");
      out.print( bbs.getNo_date().substring(0,11) + bbs.getNo_date().substring(11, 13) + "시" + bbs.getNo_date().substring(14,16) + "분"  );
      out.write("</td>\r\n");
      out.write("                                \r\n");
      out.write("		  			</tr>\r\n");
      out.write("		  			<tr>\r\n");
      out.write("		  				<td >내용</td>\r\n");
      out.write("		  				<!-- min-height:200px; 최소높이 200px; -->\r\n");
      out.write("		  				<td colspan=\"2\" style=\"height: 200px; text-align: left;\">");
      out.print( bbs.getNo_content().replaceAll(" ","&nbsp;").replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("\n","<br>") );
      out.write("</td>\r\n");
      out.write("	\r\n");
      out.write("		  			</tr>		  	\r\n");
      out.write("		  		</tbody>\r\n");
      out.write("		  	<!-- \"btn btn-primary puu-right\" 하나의 버튼이 오른쪽에 있다 -->\r\n");
      out.write("		  	<!-- 글쓰기 버튼을 누르면 제출이 된다 -->	  	\r\n");
      out.write("		  		\r\n");
      out.write("			</table>\r\n");
      out.write("			<!-- 목록으로 돌아사는 목록 버튼 만들어준다  -->\r\n");
      out.write("			<a href= \"pricing.jsp\" class=\"btn btn-arraw-right custom-btn\">목록</a> \r\n");
      out.write("			");

			//아모라//관리자가 아니면 수정삭제 못하게 한다 
			//글작성자가 본인이라면 글을 수정과 삭제를 할수 있는 기능  
			//userID 현재사용자가 bbs.getUserID() 글의 작성자와 동일하다면 --> a href="update.jsp?bbsID=<%= bbsID 이게 뜬다 
			//역할이 관리자이면 수정 과 삭제를 할 수 있다 
			  if("A".equals(bbs.getRole())){
			
      out.write("	  \r\n");
      out.write("				<a href=\"ntc_update.jsp?no_num=");
      out.print(no_num );
      out.write("\" class=\"btn btn-arraw-right custom-btn\">수정</a>\r\n");
      out.write("				\r\n");
      out.write("                <!--onclick=\"return confirm('정말로 삭제하시겠습니까?')\" 버튼을 통해서 삭제를 메세지를 확인한다  -->\r\n");
      out.write("                <a onclick=\"return confirm('정말로 삭제하시겠습니까?')\" href=\"ntc_deleteAction.jsp?no_num=");
      out.print(no_num );
      out.write("\" class=\"btn btn-arraw-right custom-btn\" \">삭제</a>\r\n");
      out.write("			");
 	  
			  }
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("		\r\n");
      out.write("	  </div>	\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- 애니메이션을 담당하게 될 자바스크립트 참조 제이쿼리를 특정 홈페이지에서 가져올수 있도록한다  -->\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("	<!-- 부트스트랩에서 제공해주는 자바스크립트 파일또한 넣어준다 \r\n");
      out.write("		이 파일안에있는 부트스트랩을 참조하겠다라는 의미  -->\r\n");
      out.write("	<script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 이종권 여기끝 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<footer id=\"gtco-footer\" role=\"contentinfo\">\r\n");
      out.write("				<div class=\"gtco-container\">\r\n");
      out.write("					<div class=\"row row-p	b-md\">\r\n");
      out.write("\r\n");
      out.write("						<div class=\"col-md-4\">\r\n");
      out.write("							<div class=\"gtco-widget\">\r\n");
      out.write("								<h3>About Us</h3>\r\n");
      out.write("								<p>아모라 아파트</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"col-md-2 col-md-push-1\">\r\n");
      out.write("							<div class=\"gtco-widget\">\r\n");
      out.write("								<h3>Destination</h3>\r\n");
      out.write("								<ul class=\"gtco-footer-links\">\r\n");
      out.write("									<li><a href=\"#\">Europe</a></li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"col-md-3 col-md-push-1\">\r\n");
      out.write("							<div class=\"gtco-widget\">\r\n");
      out.write("								<h3>Get In Touch</h3>\r\n");
      out.write("								<ul class=\"gtco-quick-contact\">\r\n");
      out.write("									<li><a href=\"#\"><i class=\"icon-phone\"></i> +1 234 567\r\n");
      out.write("											890</a></li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"row copyright\">\r\n");
      out.write("						<div class=\"col-md-12\">\r\n");
      out.write("							<p class=\"pull-left\">\r\n");
      out.write("								<small class=\"block\">&copy; 2016 Free HTML5. All Rights\r\n");
      out.write("									Reserved.</small> <small class=\"block\">Designed by <a\r\n");
      out.write("									href=\"https://freehtml5.co/\" target=\"_blank\">freehtml5.co</a>\r\n");
      out.write("									Demo Images: <a href=\"http://unsplash.com/\" target=\"_blank\">Unsplash</a></small>\r\n");
      out.write("							</p>\r\n");
      out.write("							<p class=\"pull-right\">\r\n");
      out.write("							<ul class=\"gtco-social-icons pull-right\">\r\n");
      out.write("								<li><a href=\"#\"><i class=\"icon-twitter\"></i></a></li>\r\n");
      out.write("								<li><a href=\"#\"><i class=\"icon-facebook\"></i></a></li>\r\n");
      out.write("								<li><a href=\"#\"><i class=\"icon-linkedin\"></i></a></li>\r\n");
      out.write("								<li><a href=\"#\"><i class=\"icon-dribbble\"></i></a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("							</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("			</footer>\r\n");
      out.write("			<!-- </div> -->\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"gototop js-top\">\r\n");
      out.write("			<a href=\"#\" class=\"js-gotop\"><i class=\"icon-arrow-up\"></i></a>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<!-- jQuery -->\r\n");
      out.write("		<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("		<!-- jQuery Easing -->\r\n");
      out.write("		<script src=\"js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("		<!-- Bootstrap -->\r\n");
      out.write("		<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("		<!-- Waypoints -->\r\n");
      out.write("		<script src=\"js/jquery.waypoints.min.js\"></script>\r\n");
      out.write("		<!-- Carousel -->\r\n");
      out.write("		<script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("		<!-- countTo -->\r\n");
      out.write("		<script src=\"js/jquery.countTo.js\"></script>\r\n");
      out.write("\r\n");
      out.write("		<!-- Stellar Parallax -->\r\n");
      out.write("		<script src=\"js/jquery.stellar.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("		<!-- Magnific Popup -->\r\n");
      out.write("		<script src=\"js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("		<script src=\"js/magnific-popup-options.js\"></script>\r\n");
      out.write("\r\n");
      out.write("		<!-- Datepicker -->\r\n");
      out.write("		<script src=\"js/bootstrap-datepicker.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<!-- Main -->\r\n");
      out.write("		<script src=\"js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
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
