
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <title>
            Artist Registration
        </title>
        <link href="/css/common.css" rel="stylesheet"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>
        <script type="text/javascript" src="/js/common.js"></script>
    </head>

    <body>
        <h1 id="heading">Arts By <span class="red-font">Pratyush</span></h1>
        <div id="content">
			<form:form method="POST" modelAttribute="artistForm" class="form form-register">
			    <h2>Artist Registration</h2>
				<div class="form-content">
                    <p><spring:bind path="username">
                            <form:input type="text" path="username" class="form-element form-input" placeholder="Username"
                                autofocus="true"></form:input>
                            <form:errors path="username"></form:errors>
                    </spring:bind></p>
                    <p><spring:bind path="email">
                            <form:input type="text" path="email" class="form-element form-input" placeholder="Email Address"></form:input>
                            <form:errors path="email"></form:errors>
                    </spring:bind></p>
                    <p><spring:bind path="password">
                            <form:input type="password" path="password" class="form-element form-input" placeholder="Password"></form:input>
                            <form:errors path="password"></form:errors>
                    </spring:bind></p>
                    <p><spring:bind path="confirmPassword">
                            <form:input type="password" path="confirmPassword" class="form-element form-input"
                                placeholder="Confirm your password"></form:input>
                            <form:errors path="confirmPassword"></form:errors>
                    </spring:bind></p>
                    <p><button class="form-button-primary" type="submit">Submit</button></p>
                    <div class="form-extra-links">
                        <a href="/login">Already Have an account? Sign in here.</a>
                    </div>
                </div>
			</form:form>
		</div>
        <div id="footer">Made with <span class="red-font">&hearts;</span> by Pratyush Choudhary</div>
    </body>
</html>
