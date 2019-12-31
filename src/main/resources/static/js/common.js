
var ME_DRAWINGS = 'My Drawings';
var PHOTOGRAPHY = 'Photography';
var ABOUT_ME = 'About Me';
var CONTACT_ME = 'Contact Me';
var API_DRAWINGS = '/api/drawings?page=0';
var API_PHOTOGRAPHS = '/api/photographs?page=0';
var GET = 'GET';

var drawings;
var photographs;
var myList;
var contentDrawing = 'content-drawing';
var linkDrawing = 'link-drawing';
var contentPhotography = 'content-photography';
var linkPhotography = 'link-photography';
var contentAbout = 'content-about';
var linkAbout = 'link-about';
var contentContact = 'content-contact';
var linkContact = 'link-contact';
var contentBlocking = 'content-blocking';
var contentImage = 'content-image';
var bigImageDiv = 'big-image-div';
var bigImage = 'big-image';
var bigImageTitle = 'big-image-title';
var block = 'block';
var none = 'none';
var div = 'div';
var img = 'img';
var navSelectedColor = '#cc3333';
var navUnselectedColor = '#878787';

var drawing = 'drawing';
var photograph = 'photograph';

function init() {
    selectDrawing();
}

function loadImages(divName, images, type) {
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
        newImg.src = images[i].image;
        newImg.setAttribute('onclick', 'displayPicture(' + i + ', ' + type + ')');
        newDiv.appendChild(newImg);
        imageDiv.appendChild(newDiv);
    }
}

function selectDrawing() {
    hideAll();
    document.getElementById(contentDrawing).style.display = block;
    document.getElementById(linkDrawing).style.color = navSelectedColor;
    document.title = ME_DRAWINGS;
    document.getElementById(contentBlocking).style.display = block;

    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            drawings = JSON.parse(this.responseText);
            loadImages(contentDrawing, drawings, drawing);
        }
    };
    xhttp.open(GET, API_DRAWINGS, true);
    xhttp.send();
}
function selectPhotography() {
    hideAll();
    document.getElementById(contentPhotography).style.display = block;
    document.getElementById(linkPhotography).style.color = navSelectedColor;
    document.title = PHOTOGRAPHY;
    document.getElementById(contentBlocking).style.display = block;

    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            photographs = JSON.parse(this.responseText);
            loadImages(contentPhotography, photographs, photograph);
        }
    };
    xhttp.open(GET, API_PHOTOGRAPHS, true);
    xhttp.send();
}
function selectAbout() {
    hideAll();
    document.getElementById(contentAbout).style.display = block;
    document.getElementById(linkAbout).style.color = navSelectedColor;
    document.title = ABOUT_ME;
}
function selectContact() {
    hideAll();
    document.getElementById(contentContact).style.display = block;
    document.getElementById(linkContact).style.color = navSelectedColor;
    document.title = CONTACT_ME;
}
function hideAll() {
    document.getElementById(contentPhotography).style.display = none;
    document.getElementById(contentDrawing).style.display = none;
    document.getElementById(contentAbout).style.display = none;
    document.getElementById(contentContact).style.display = none;
    document.getElementById(linkPhotography).style.color = navUnselectedColor;
    document.getElementById(linkDrawing).style.color = navUnselectedColor;
    document.getElementById(linkAbout).style.color = navUnselectedColor;
    document.getElementById(linkContact).style.color = navUnselectedColor;
}
function hideBigImage() {
    document.getElementById(bigImageDiv).style.display=none;
    var div = document.getElementById(bigImageDiv);
    div.onkeydown = null;
}
function displayPicture(index, type) {
    if(type == drawing) {
        myList = drawings;
    } else {
        myList = photographs;
    }
    document.getElementById(bigImageDiv).style.display=block;
    document.getElementById(bigImage).src=myList[index].image;
    document.getElementById(bigImageTitle).innerHTML = myList[index].title;
    var div = document.getElementById(bigImageDiv);
    div.focus();
    div.onkeydown = function(evt) {
        evt = evt || window.event;
        if(evt.keyCode == 27) {
            hideBigImage();
        }
        if(evt.keyCode == 39) {
            index++;
            index = index % (myList.length);
            document.getElementById(bigImage).src = myList[index].image;
            document.getElementById(bigImageTitle).innerHTML = myList[index].title;
        }
        if(evt.keyCode == 37) {
            index--;
            index += myList.length;
            index = index % (myList.length);
            document.getElementById(bigImage).src = myList[index].image;
            document.getElementById(bigImageTitle).innerHTML = myList[index].title;
        }
        console.log("keydown: " + evt.keyCode);
    };
}
