<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<%@ include file="../common/common.jsp" %>
	<title>WeConnect</title>
</head>
<body>
	<%@ include file="../common/header.jsp" %>

    <!-- Carousel
    ================================================== -->
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
      </ol>
      <div class="carousel-inner" role="listbox">
        <div class="item active">
          <img class="first-slide" src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="First slide">
          <div class="container">
            <div class="carousel-caption">
              <h1>一种连接世界的方式。</h1>
              <p><br/><br/><br/><br/><br/></p>
            </div>
          </div>
        </div>
        <div class="item">
          <img class="third-slide" src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Third slide">
          <div class="container">
            <div class="carousel-caption">
              <h1>Google是一种能力。</h1>
              <p>连接上WeConnect，程序员随时Google查阅Stack Overflow，学生随时查阅Quora Questions，外贸工作者随时了解国际市场。<br/><br/><br/><br/><br/></p>
            </div>
          </div>
        </div>
        <div class="item">
          <img class="second-slide" src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Second slide">
          <div class="container">
            <div class="carousel-caption">
              <h1>优秀的应用服务。</h1>
              <p>Google YouTuBe Pinterest Tumblr Facebook Twitter Github Quora<br/><br/><br/><br/><br/></p>
            </div>
          </div>
        </div>
      </div>
      <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
    </div><!-- /.carousel -->
    
    <!-- Marketing messaging and featurettes
    ================================================== -->
    <!-- Wrap the rest of the page in another container to center all the content. -->

    <div class="container marketing">

      <!-- Three columns of text below the carousel -->
      <div class="row">
        <div class="col-lg-4">
          <img class="img-circle" src="${cp}/resources/image/stable.png" alt="Generic placeholder image" width="140" height="140">
          <h2>稳定</h2>
          <p>采用Cisco网络技术，AnyConnect协议，连接稳定，支持长达24小时不断线。</p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-circle" src="${cp}/resources/image/fast.png" alt="Generic placeholder image" width="140" height="140">
          <h2>快速</h2>
          <p>采用VPC专用网络，200Mpbs带宽网络。国内外站点流量自动分流。数据压缩传输。</p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-circle" src="${cp}/resources/image/easy.png" alt="Generic placeholder image" width="140" height="140">
          <h2>简单</h2>
          <p>支持iOS，MacOS，Windows，Linux多种操作系统。配置简单，连接简单。一个账号支持两部设备。</p>
        </div><!-- /.col-lg-4 -->
      </div><!-- /.row -->
            <!-- FOOTER -->
      <footer>
        <p></p>
      </footer>
     </div>

</body>
</html>