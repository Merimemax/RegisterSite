<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
		<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
		<title>Google Nexus Website Menu</title>
		<meta name="description" content="A sidebar menu as seen on the Google Nexus 7 website" />
		<meta name="keywords" content="google nexus 7 menu, css transitions, sidebar, side menu, slide out menu" />
		<meta name="author" content="Codrops" />
				
		<link rel="stylesheet" type="text/css"href="<spring:url value="/css/adminCss/normalize.css" />"/>
		 <link rel="stylesheet" type="text/css" href="<spring:url value="/css/adminCss/demo.css" />"/>
		<link rel="stylesheet" type="text/css" href="<spring:url value="/css/adminCss/component.css" />" />
		
			 <spring:url value="/js/adminJs/modernizr.custom.js" var="jqueryJsf" />
		 <script src="${jqueryJsf}"></script>
		<!-- <script src="js/adminJs/modernizr.custom.js"></script> -->
</head>
<body>
<div class="container">
			<ul id="gn-menu" class="gn-menu-main">
				<li class="gn-trigger">
					<a class="gn-icon gn-icon-menu"><span>Menu</span></a>
					<nav class="gn-menu-wrapper">
						<div class="gn-scroller">
							<ul class="gn-menu">
								<li class="gn-search-item">
									<input placeholder="Search" type="search" class="gn-search">
									<a class="gn-icon gn-icon-search"><span>Search</span></a>
								</li>
								<li>
									<a class="gn-icon gn-icon-download" href="<spring:url value="/admin/block" />">Semester Choice</a>
									<ul class="gn-submenu">
										<li><a class="gn-icon gn-icon-illustrator">Vector Illustrations</a></li>
										<li><a class="gn-icon gn-icon-photoshop">Photoshop files</a></li>
									</ul>
								</li>
								<li><a class="gn-icon gn-icon-cog">Settings</a></li>
								<li><a class="gn-icon gn-icon-help">Help</a></li>
								<li>
									<a class="gn-icon gn-icon-archive">Archives</a>
									<ul class="gn-submenu">
										<li><a class="gn-icon gn-icon-article">Articles</a></li>
										<li><a class="gn-icon gn-icon-pictures">Images</a></li>
										<li><a class="gn-icon gn-icon-videos">Videos</a></li>
									</ul>
								</li>
							</ul>
						</div><!-- /gn-scroller -->
					</nav>
				</li>
				<li><a href="<spring:url value="/admin/block" />">Go To Blocks Selection</a></li>
				<li><a class="codrops-icon codrops-icon-prev" href="<spring:url value="/courseList" />"><span>Courses</span></a></li>
				<li><a class="codrops-icon codrops-icon-drop" href="<spring:url value="/" />"><span>Back to HomePage</span></a></li>
			</ul>
		<header>
				<!-- <h1>Google Nexus Website Menu <span>A sidebar menu as seen on the <a href="http://www.google.com/nexus/index.html">Google Nexus 7</a> page</span></h1>	 -->
			<jsp:include page="${param.content}.jsp" flush="true"/>
			</header>  
			
		</div><!-- /container -->
		
		<spring:url value="/js/adminJs/classie.js" var="jqueryJs" />
		 <spring:url value="/js/adminJs/gnmenu.js" var="jqueryJs2" />
		 <script src="${jqueryJs}"></script>
		 <script src="${jqueryJs2}"></script>
<%-- 		
 <script src="${openid-jquery_url}" type="text/javascript">
	 <script src="${openid-jquery_url}"></script>
			<spring:url value="/js/adminJs/gnmenu.js" var="openid-jquery_url2" />
		<script src="${openid-jquery_url2}" type="text/javascript">
		<script src="${openid-jquery_url2}"></script> --%>
		<script>
			new gnMenu( document.getElementById( 'gn-menu' ) );
		</script>
</body>
</html>