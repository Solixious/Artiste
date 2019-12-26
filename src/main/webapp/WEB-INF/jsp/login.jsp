<html>
    <head>
        <title>
            Artist Login
        </title>
        <link href="/css/common.css" rel="stylesheet"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>
        <script type="text/javascript" src="/js/common.js"></script>
    </head>

    <body>
        <h1 id="heading">Arts By <span class="red-font">Pratyush</span></h1>
        <div id="content">
			<form method="POST" action="${contextPath}/login" class="form form-login">
			    <h2>Artist Login</h2>
				<div class="form-content ${error != null ? 'has-error' : ''}">
					<span>${message}</span>
					<p><input name="username" type="text" class="form-element form-input" placeholder="Username"
						autofocus="true"/></p>
					<p><input name="password" type="password" class="form-element form-input" placeholder="Password"/></p>
					<p><span>${error}</span></p>
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
					<p><button class="form-button-primary" type="submit">Log In</button></p>
					<p><div class="form-extra-links">
						<a href="#">Forgot Password</a>
						<a href="${contextPath}/registration" class="float-right">Create an account</a>
					</div></p>
				</div>
			</form>
		</div>
        <div id="footer">Made with <span class="red-font">&hearts;</span> by Pratyush Choudhary</div>
    </body>
</html>
