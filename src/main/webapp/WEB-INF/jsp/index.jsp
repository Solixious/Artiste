<html>
    <head>
        <title>
            My Drawings
        </title>
        <link href="/css/common.css" rel="stylesheet"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>

    <body>
        <h1 id="heading">Arts By <span class="black-font">Pratyush</span></h1>
        <div id="social-links">
            <a href="#" class="fa fa-facebook"></a>
            <a href="#" class="fa fa-instagram"></a>
        </div>
        <div id="nav">
            <div class="nav-item"><a href="#" onclick="selectDrawing()">Drawings</a></div>
            <div class="nav-item"><a href="#" onclick="selectPhotography()">Photography</a></div>
            <div class="nav-item"><a href="#" onclick="selectAbout()">About</a></div>
            <div class="nav-item"><a href="#" onclick="selectContact()">Contact</a></div>
        </div>
        <div id="content">
            <div id="content-drawing">
                <div class="content-image"><img src="/file/1.jpg"/></div>
                <div class="content-image"><img src="/file/2.jpg"/></div>
                <div class="content-image"><img src="/file/3.jpg"/></div>
                <div class="content-image"><img src="/file/4.jpg"/></div>
                <div class="content-image"><img src="/file/5.jpg"/></div>
                <div class="content-image"><img src="/file/6.jpg"/></div>
                <div class="content-image"><img src="/file/7.jpg"/></div>
                <div class="content-image"><img src="/file/8.jpg"/></div>
                <div class="content-image"><img src="/file/9.jpg"/></div>
                <div class="content-image"><img src="/file/10.jpg"/></div>
                <div class="content-image"><img src="/file/11.jpg"/></div>
                <div class="content-image"><img src="/file/12.jpg"/></div>
                <div class="content-image"><img src="/file/13.jpg"/></div>
            </div>
            <div id="content-photography">
                <div class="content-image"><img src="/file/6.jpg"/></div>
                <div class="content-image"><img src="/file/7.jpg"/></div>
                <div class="content-image"><img src="/file/8.jpg"/></div>
                <div class="content-image"><img src="/file/9.jpg"/></div>
                <div class="content-image"><img src="/file/10.jpg"/></div>
                <div class="content-image"><img src="/file/11.jpg"/></div>
                <div class="content-image"><img src="/file/12.jpg"/></div>
                <div class="content-image"><img src="/file/13.jpg"/></div>
                <div class="content-image"><img src="/file/1.jpg"/></div>
                <div class="content-image"><img src="/file/2.jpg"/></div>
                <div class="content-image"><img src="/file/3.jpg"/></div>
                <div class="content-image"><img src="/file/4.jpg"/></div>
                <div class="content-image"><img src="/file/5.jpg"/></div>
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
    <script>
        function selectDrawing() {
            hideAll();
            document.getElementById('content-drawing').style.display = 'block';
            document.title = "My Drawings";
        }
        function selectPhotography() {
            hideAll();
            document.getElementById('content-photography').style.display = 'block';
            document.title = "Photography";
        }
        function selectAbout() {
            hideAll();
            document.getElementById('content-about').style.display = 'block';
            document.title = "About Me";
        }
        function selectContact() {
            hideAll();
            document.getElementById('content-contact').style.display = 'block';
            document.title = "Contact Me";
        }
        function hideAll() {
            document.getElementById('content-photography').style.display = 'none';
            document.getElementById('content-drawing').style.display = 'none';
            document.getElementById('content-about').style.display = 'none';
            document.getElementById('content-contact').style.display = 'none';
        }
    </script>
</html>
