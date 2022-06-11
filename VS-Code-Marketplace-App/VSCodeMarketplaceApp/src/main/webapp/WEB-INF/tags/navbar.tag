<%@ tag import="com.example.demo.app.CurrentUser" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<nav class="navbar navbar-expand-lg bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="/">
      <img class="logo" rel="icon"
        src="https://www.accenture.com/t20180820T080700Z__w__/au-en/_acnmedia/Accenture/Dev/Redesign/Acc_Logo_Black_Purple_RGB.PNG">
      <div id="marketPlaceLogoLink" class="marketPlaceLogoLink">| Marketplace</div>
    </a>


    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
      aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent"></div>
    <% CurrentUser currentUser = new CurrentUser();
      if(!currentUser.isLoggedIn()) { %>
    <a type="button" class="btn btn-login btn-dark" href="/login">Sign In</a>
    <% } else { %>
    <a type="button" class="btn btn-login btn-dark" href="/logout">Sign Out ${currentUser.getEmail()}</a>
    <% } %>
  </div>
</nav>