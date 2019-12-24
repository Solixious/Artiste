<html>
    <head>
        <title>
            My Drawings
        </title>
        <link href="/css/common.css" rel="stylesheet"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>

    <body onload="init()">
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
    <script>
        var drawings = ['/file/1.jpg', '/file/2.jpg', '/file/3.jpg', '/file/4.jpg', '/file/5.jpg',
                        '/file/6.jpg', '/file/7.jpg', '/file/8.jpg', '/file/9.jpg', '/file/10.jpg',
                        '/file/11.jpg', '/file/12.jpg', '/file/13.jpg'];
        var photographs = ['/file/6.jpg', '/file/7.jpg', '/file/8.jpg', '/file/9.jpg', '/file/10.jpg',
                        '/file/11.jpg', '/file/12.jpg', '/file/13.jpg', '/file/1.jpg', '/file/2.jpg',
                        '/file/3.jpg', '/file/4.jpg', '/file/5.jpg',];
        var contentDrawing = 'content-drawing';
        var contentPhotography = 'content-photography';

        function init() {
            selectDrawing();
        }

        function loadImages(divName, images) {
            var imageDiv = document.getElementById(divName);

            if(imageDiv.childElementCount !== 0) {
                return;
            }

            var i;
            for(i = 0; i < images.length; i++) {
                var newDiv = document.createElement('div');
                newDiv.className = 'content-image';
                var newImg = document.createElement('img');
                newImg.src = images[i];
                newDiv.appendChild(newImg);
                imageDiv.appendChild(newDiv);
            }
        }

        function selectDrawing() {
            hideAll();
            document.getElementById(contentDrawing).style.display = 'block';
            document.title = "My Drawings";
            loadImages(contentDrawing, drawings);
        }
        function selectPhotography() {
            hideAll();
            document.getElementById(contentPhotography).style.display = 'block';
            document.title = "Photography";
            loadImages(contentPhotography, photographs);
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
        function fadeIn(el){
          el.classList.add('show');
          el.classList.remove('hide');
        }
        function fadeOut(el){
          el.classList.add('hide');
          el.classList.remove('show');
        }
    </script>
</html>
