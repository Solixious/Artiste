
var ME_DRAWINGS = 'Admin - Upload';
var PHOTOGRAPHY = 'Admin - List';
var ABOUT_ME = 'Admin - Edit';
var CONTACT_ME = 'Admin - Settings';
var API_DRAWINGS = '/api/drawings';
var API_PHOTOGRAPHS = '/api/photographs';
var GET = 'GET';

var drawings;
var photographs;
var contentUpload = 'content-upload';
var linkUpload = 'link-upload';
var contentList = 'content-list';
var linkList = 'link-list';
var contentEdit = 'content-edit';
var linkEdit = 'link-edit';
var contentSettings = 'content-settings';
var linkSettings = 'link-settings';
var contentBlocking = 'content-blocking';
var contentImage = 'content-image';
var block = 'block';
var none = 'none';
var div = 'div';
var img = 'img';
var navSelectedColor = '#cc3333';
var navUnselectedColor = '#878787';

function init() {
    upload();
}

function loadImages(divName, images) {
    var imageDiv = document.getElementById(divName);

    document.getElementById(contentBlocking).style.display = none;
    if(imageDiv.childElementCount !== 0) {
        return;
    }
    var i;
    for(i = 0; i < images.length; i++) {
        var newDiv = document.createElement(div);
        newDiv.className = contentImage;
        var newImg = document.createElement(img);
        newImg.src = images[i];
        newDiv.appendChild(newImg);
        imageDiv.appendChild(newDiv);
    }
}

function upload() {
    hideAll();
    document.getElementById(contentUpload).style.display = block;
    document.getElementById(linkUpload).style.color = navSelectedColor;
    document.title = ME_DRAWINGS;
}
function list() {
    hideAll();
    document.getElementById(contentList).style.display = block;
    document.getElementById(linkList).style.color = navSelectedColor;
    document.title = PHOTOGRAPHY;
    document.getElementById(contentBlocking).style.display = block;

    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            var photographs = JSON.parse(this.responseText);
            loadImages(contentList, photographs);
        }
    };
    xhttp.open(GET, API_PHOTOGRAPHS, true);
    xhttp.send();
}
function edit() {
    hideAll();
    document.getElementById(contentEdit).style.display = block;
    document.getElementById(linkEdit).style.color = navSelectedColor;
    document.title = ABOUT_ME;
}
function settings() {
    hideAll();
    document.getElementById(contentSettings).style.display = block;
    document.getElementById(linkSettings).style.color = navSelectedColor;
    document.title = CONTACT_ME;
}
function hideAll() {
    document.getElementById(contentList).style.display = none;
    document.getElementById(contentUpload).style.display = none;
    document.getElementById(contentEdit).style.display = none;
    document.getElementById(contentSettings).style.display = none;
    document.getElementById(linkList).style.color = navUnselectedColor;
    document.getElementById(linkUpload).style.color = navUnselectedColor;
    document.getElementById(linkEdit).style.color = navUnselectedColor;
    document.getElementById(linkSettings).style.color = navUnselectedColor;
}
