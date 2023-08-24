<%@page import="model.Con_purchaseDAO"%>
<%@page import="model.ContactDAO"%>
<%@page import="model.ContactDTO"%>
<%@page import="model.UsersDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter" %>

<link rel="stylesheet" href= "css/bootstrap.css">



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 게시판 웹 사이트</title>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Traveler &mdash; Free Website Template, Free HTML5
	Template by FreeHTML5.co</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description"
	content="Free HTML5 Website Template by FreeHTML5.co" />
<meta name="keywords"
	content="free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive" />
<meta name="author" content="FreeHTML5.co" />

<!-- Facebook and Twitter integration -->
<meta property="og:title" content="" />
<meta property="og:image" content="" />
<meta property="og:url" content="" />
<meta property="og:site_name" content="" />
<meta property="og:description" content="" />
<meta name="twitter:title" content="" />
<meta name="twitter:image" content="" />
<meta name="twitter:url" content="" />
<meta name="twitter:card" content="" />

<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700"
	rel="stylesheet">

<!-- Animate.css -->
<link rel="stylesheet" href="css/animate.css">
<!-- Icomoon Icon Fonts-->
<link rel="stylesheet" href="css/icomoon.css">
<!-- Themify Icons-->
<link rel="stylesheet" href="css/themify-icons.css">
<!-- Bootstrap  -->
<link rel="stylesheet" href="css/bootstrap.css">

<!-- Magnific Popup -->
<link rel="stylesheet" href="css/magnific-popup.css">

<!-- Magnific Popup -->
<link rel="stylesheet" href="css/bootstrap-datepicker.min.css">

<!-- Owl Carousel  -->
<link rel="stylesheet" href="css/owl.carousel.min.css">
<link rel="stylesheet" href="css/owl.theme.default.min.css">

<!-- Theme style  -->
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/stylewrite.css">

<!-- Modernizr JS -->
<script src="js/modernizr-2.6.2.min.js"></script>
<!-- FOR IE9 below -->
<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->

</head>
<body>

<div class="gtco-loader"></div>
	<div id="page">
		<!-- <div class="page-inner"> -->
		<nav class="gtco-nav" role="navigation">
			<div>
				<div class="row">
					<div class="col-sm-4 col-xs-12">
						<div id="gtco-logo">
							<a href="index.jsp">AMORA</a>
						</div>
					</div>
					<div class="col-xs-8 text-right menu-1">
						<ul>
							<li class ="has-dropdown"><a href="community.jsp">커뮤니티</a>
								<ul class="dropdown">
								    <li><a href="community.jsp">전체 글 보기</a></li>
									<li><a href="request.jsp">건의사항</a></li>
									<li><a href="hobby.jsp">취미생활</a></li>
									<li><a href="baby.jsp">육아</a></li>
									<li><a href="find.jsp">찾아주세요</a></li>
									<li><a href="food.jsp">동네맛집</a></li>
								</ul>
							</li>
							<li class ="has-dropdown"> <a href="secondhand.jsp">중고거래/나눔</a>	
								<ul class="dropdown">
									<li><a href="secondhand.jsp">중고거래</a></li>
									<li><a href="share.jsp">나눔</a></li>
								</ul>
							</li>
							<li><a href="contact.jsp">공동구매</a></li>
							<li><a href="promotion.jsp">홍보</a></li>
							<li><a href="pricing.jsp">공지사항</a></li>
							<li><a href="destination.jsp">마이페이지</a></li>
						</ul>
					</div>
				</div>

			</div>
		</nav>

		  <header id="gtco-header" class="gtco-cover gtco-cover-sm"
         role="banner" style="background-image: url(images/bgapt.jpg); height: 150px">
		<div class="overlay"></div>
			<div class="gtco-container">
			 	<div class="row">
					<div class="col-md-12 col-md-offset-0 text-center">
						<!-- <div class="row row-mt-15em">
							<div class="col-md-12 mt-text animate-box"
								data-animate-effect="fadeInUp">
								<h1> 게시글 수정</h1>
							</div>

						</div> -->
					</div>
				</div>
			</div> -->
		</header>


   <% 
   
   
      UsersDTO info =(UsersDTO)session.getAttribute("info"); 
      String nickname = info.getNickname();
      
      int gb_Num = 0;
      
      if (request.getParameter("gb_Num") != null) {
    	  gb_Num = Integer.parseInt(request.getParameter("gb_Num")); // AD_NUM 게시글 번호 
         //SQL ROWNUM ORDER BY COM_DATE DESC;
         
         //SELECT COM_CATEGORY, COM_NUM, COM_TITLE, NICKNAME, COM_DATE, COM_VIEWS FROM COMMUNITY ORDER BY COM_NUM DESC;
         
      }
    /*   if (com_Num == 0) {
         PrintWriter script = response.getWriter();
         script.println("<script>");
         script.println("alert('유효하지 않는 글입니다.')");
         script.println("location.href = 'community.jsp'");
         script.println("history.back()");
         script.println("</script>");
      } */
      
      ContactDTO dto = new ContactDAO().getContactDTO(gb_Num);
     
      
   %>
  
   <div class="container">
      <div class="row">
         <table class="table table-striped" style="text-align: center; border: 1px solid #dddddd">
            <thead>
               <tr>
                  <th colspan="3" style="background-color: #eeeeee; text-align: center;">게시판 글보기</th>                  
               </tr>
            </thead>
            <tbody>
               <tr>
                  <td style="width: 20%;">글제목</td>
                  <td colspan="2"><%= dto.getGb_Title().replaceAll(" ", "&nbsp;").replaceAll("<", "&lt;").replaceAll(">","&gt;").replaceAll("\n", "<br>") %></td>
               </tr>
               <tr>
                  <td>작성자</td>
                  <td colspan="2"><%= dto.getNickname() %></td>
               </tr>
               <tr>
                  <td>작성일자</td>
                  <td colspan="2"><%= dto.getGb_Date().substring(0, 11) + dto.getGb_Date().substring(11, 13) + "시" + dto.getGb_Date().substring(14, 16) + "분 " %></td>
               </tr>
               <tr>
                  <td>작성자</td>
                  <td colspan="2"><%= dto.getNickname() %></td>
               </tr>

               <%--공동구매자 갯수 세기 불러오기--%>
               <%
               		Con_purchaseDAO conDAO = new Con_purchaseDAO();
               		int count = conDAO.purchase_count(gb_Num);
               %>
               
              
               <tr>
                  <td>신청자 수</td>
                  <td colspan="2"><%= count %></td>
               </tr>
               
               <%--파일 url 을 불러오기 --%>
               <%--상세보기 클릭에서 넘어온 ad_Num을 받아서 불러왔다 --%>
				<%
					ContactDAO contactDAO = new ContactDAO();
					String imagePath = contactDAO.gb_img(gb_Num);
												 
					if(imagePath == null){
					  imagePath = "/gb_img/빈사진.png";
					}
				%>
				
				<%-- 사진을 불러옵니다 --%>
			   <tr>
                  <td>사진</td>
                  <td colspan="2"><img class="card-img-top" src="${pageContext.request.contextPath}<%=imagePath%>"  alt="..." /></td>
               </tr>
               <tr>
                  <td>내용</td>

                  <td colspan="2" style="min-height: 200px; text-align: left;"><%= dto.getGb_Content().replaceAll(" ", "&nbsp;").replaceAll("<", "&lt;").replaceAll(">","&gt;").replaceAll("\n", "<br>") %></td>
               </tr>
               
               
            </tbody>
         </table>
         
         <%-- 구매신청/취소 버튼 --%>
         <%-- db조회해서 아이디와 gb_num이 동시에 들어간 행이 있으면 취소버튼이 뜨고 
         	없으면 구매 버튼이 뜬다
          --%>
         <%
         String id = info.getId();

         Con_purchaseDAO conDAO2 = new Con_purchaseDAO();
         int check = conDAO2.purchase_check(gb_Num, id);

         if(check==0){
         %>
         
        <form action="con_purchase" method="get">
    	<input type="hidden" name="gb_Num" value="<%= gb_Num %>">
   	 	<button type="submit" class="btn btn-primary">구매신청</button>
		</form>
		
		<%}else{%>
		
		<form action="con_purchase_del" method="get">
    	<input type="hidden" name="gb_Num" value="<%= gb_Num %>">
   	 	<button type="submit" class="btn btn-primary">구매취소</button>
		</form>
		
        <% } %>
        
        
         <a href="contact.jsp" class="btn btn-primary">목록</a>
         <%
            if (nickname != null && nickname.equals(dto.getNickname())) {
         %>
               <a href="con_update.jsp?gb_Num=<%= gb_Num %>" class="btn btn-primary">수정</a>
               <a onclick="return confirm('정말로 삭제하시겠습니까?')" href="con_deleteAction?gb_Num=<%= gb_Num %>&gb_Title=<%= dto.getGb_Title() %>" class="btn btn-primary">삭제</a>
               <!-- 삭제의 기준이 되는 com_Num과 com_Category의 값을 무조건 받아야함,그래서 전달도 같이 해줘야함. -->
         <%
            }
         %>      
         
      </div>
   </div>
   
 <footer id="gtco-footer" role="contentinfo">
		<div class="gtco-container">
			<div class="row row-p	b-md">

				<div class="col-md-4">
					<div class="gtco-widget">
						<h3>About Us</h3>
						<p>아모라 아파트</p>
					</div>
				</div>

				<div class="col-md-2 col-md-push-1">
					<div class="gtco-widget">
						<h3>관리사무소</h3>
						<ul class="gtco-footer-links">
							<li><a href="#">Europe</a></li>
						</ul>
					</div>
				</div>

				<div class="col-md-3 col-md-push-1">
					<div class="gtco-widget">
						<h3>전화번호</h3>
						<ul class="gtco-quick-contact">
							<li><a href="#"><i class="icon-phone"></i> +1 234 567
									890</a></li>
						</ul>
					</div>
				</div>

			</div>

			<div class="row copyright">
				<div class="col-md-12">
					<p class="pull-left">
						<small class="block">&copy; 2016 Free HTML5. All Rights
							Reserved.</small> <small class="block">Designed by <a
							href="https://freehtml5.co/" target="_blank">freehtml5.co</a>
							Demo Images: <a href="http://unsplash.com/" target="_blank">Unsplash</a></small>
					</p>
					<p class="pull-right">
					<ul class="gtco-social-icons pull-right">
						<li><a href="#"><i class="icon-twitter"></i></a></li>
						<li><a href="#"><i class="icon-facebook"></i></a></li>
						<li><a href="#"><i class="icon-linkedin"></i></a></li>
						<li><a href="#"><i class="icon-dribbble"></i></a></li>
					</ul>
					</p>
				</div>
			</div>

		</div>
	</footer>
	<!-- </div> -->
	</div>

	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="icon-arrow-up"></i></a>
	</div>

	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- Carousel -->
	<script src="js/owl.carousel.min.js"></script>
	<!-- countTo -->
	<script src="js/jquery.countTo.js"></script>

	<!-- Stellar Parallax -->
	<script src="js/jquery.stellar.min.js"></script>

	<!-- Magnific Popup -->
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/magnific-popup-options.js"></script>

	<!-- Datepicker -->
	<script src="js/bootstrap-datepicker.min.js"></script>


	<!-- Main -->
	<script src="js/main.js"></script>

</body>
</html>
