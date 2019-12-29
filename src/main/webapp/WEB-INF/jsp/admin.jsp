<html>
    <head>
        <title>
            Admin Panel
        </title>
        <link href="/css/common.css" rel="stylesheet"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>
        <script type="text/javascript" src="/js/admin.js"></script>
    </head>

    <body onload="init()">
        <h1 id="heading">Welcome Back <span class="red-font">Pratyush</span></h1>
        <div id="social-links">
            <a href="#" class="fa fa-facebook"></a>
            <a href="#" class="fa fa-instagram"></a>
        </div>
        <div id="nav">
            <div class="nav-item"><a href="#" id="link-upload" onclick="upload()">Upload</a></div>
            <div class="nav-item"><a href="#" id="link-list" onclick="list()">List</a></div>
            <div class="nav-item"><a href="#" id="link-edit" onclick="edit()">Edit</a></div>
            <div class="nav-item"><a href="#" id="link-settings" onclick="settings()">Settings</a></div>
        </div>
        <div id="content">
            <div id="content-upload">
                <form class="form form-upload" enctype="multipart/form-data" method="post" action="${contextPath}/art">
                    <h2>Upload</h2>
                    <p><input name="title" type="text" class="form-element form-input" placeholder="Title" autofocus="true"/></p>
                    <p>
                        <label class="radio-label">
                            Drawing
                            <input type="radio" name="artType" checked="checked" value="Drawing"/>
                            <span class="checkmark"></span>
                        </label>
                        <label class="radio-label">
                            Photograph
                            <input type="radio" name="artType" value="Photograph"/>
                            <span class="checkmark"></span>
                        </label>
                    </p>
                    <p>
                        <label class="custom-file-upload">
                            Choose File<input id="artwork" name="file" type="file" onchange="readUrl(this)"/>
                        </label>
                        <span id="file-selected"> </span>
                    </p>
                    <p><button class="form-button-primary" type="submit">Submit</button></p>
                    <img id="preview" src="#" style="display:none;width: 50%"/>
                </form>
            </div>
            <div id="content-list">

            </div>
            <div id="content-edit">

            </div>
            <div id="content-settings">

            </div>
            <div id="content-blocking">
                <div class="loadingio-spinner-spinner-dun95lzc55k">
                    <div class="ldio-8bgywlk1raa">
                        <div></div><div></div><div></div><div></div><div></div><div></div>
                        <div></div><div></div><div></div><div></div><div></div><div></div>
                        <div></div><div></div><div></div><div></div><div></div><div></div>
                        <div></div><div></div><div></div><div></div><div></div><div></div>
                        <div></div><div></div><div></div><div></div><div></div><div></div>
                        <div></div><div></div><div></div><div></div><div></div><div></div>
                    </div>
                </div>
            </div>
        </div>
        <div id="footer">Made with <span class="red-font">&hearts;</span> by Pratyush Choudhary</div>
    </body>
</html>
