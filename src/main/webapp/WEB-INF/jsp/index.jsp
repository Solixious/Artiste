<html>
    <head>
        <title>
            My Drawings
        </title>
        <link href="/css/common.css" rel="stylesheet"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>
        <script type="text/javascript" src="/js/common.js"></script>
    </head>

    <body onload="init()">
        <h1 id="heading">Arts By <span class="black-font">Pratyush</span></h1>
        <div id="social-links">
            <a href="#" class="fa fa-facebook"></a>
            <a href="#" class="fa fa-instagram"></a>
        </div>
        <div id="nav">
            <div class="nav-item"><a href="#" id="link-drawing" onclick="selectDrawing()">Drawings</a></div>
            <div class="nav-item"><a href="#" id="link-photography" onclick="selectPhotography()">Photography</a></div>
            <div class="nav-item"><a href="#" id="link-about" onclick="selectAbout()">About</a></div>
            <div class="nav-item"><a href="#" id="link-contact" onclick="selectContact()">Contact</a></div>
        </div>
        <div id="content">
            <div id="content-drawing">

            </div>
            <div id="content-photography">

            </div>
            <div id="content-about">
                About Me
            </div>
            <div id="content-contact">
                Contact Me
            </div>
        </div>
        <div id="footer">Made with <span class="red-font">&hearts;</span> by Pratyush Choudhary</div>
    </body>
</html>
