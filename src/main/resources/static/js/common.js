var drawings;
var photographs;
var contentDrawing = 'content-drawing';
var contentPhotography = 'content-photography';
var block = 'block';
var none = 'none';
var navSelected = '#cc3333';
var navUnSelected = '#878787';

function init() {
    selectDrawing();
}

function loadImages(divName, images) {
    var imageDiv = document.getElementById(divName);

    document.getElementById('content-blocking').style.display = 'none';
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
    document.getElementById(contentDrawing).style.display = block;
    document.getElementById('link-drawing').style.color = navSelected;
    document.title = "My Drawings";
    document.getElementById('content-blocking').style.display = 'block';

    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            var drawings = JSON.parse(this.responseText);
            loadImages(contentDrawing, drawings);
        }
    };
    xhttp.open("GET", "/api/drawings", true);
    xhttp.send();
}
function selectPhotography() {
    hideAll();
    document.getElementById(contentPhotography).style.display = block;
    document.getElementById('link-photography').style.color = navSelected;
    document.title = "Photography";
    document.getElementById('content-blocking').style.display = 'block';

    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            var photographs = JSON.parse(this.responseText);
            loadImages(contentPhotography, photographs);
        }
    };
    xhttp.open("GET", "/api/photographs", true);
    xhttp.send();
}
function selectAbout() {
    hideAll();
    document.getElementById('content-about').style.display = block;
    document.getElementById('link-about').style.color = navSelected;
    document.title = "About Me";
}
function selectContact() {
    hideAll();
    document.getElementById('content-contact').style.display = block;
    document.getElementById('link-contact').style.color = navSelected;
    document.title = "Contact Me";
}
function hideAll() {
    document.getElementById('content-photography').style.display = none;
    document.getElementById('content-drawing').style.display = none;
    document.getElementById('content-about').style.display = none;
    document.getElementById('content-contact').style.display = none;
    document.getElementById('link-photography').style.color = navUnSelected;
    document.getElementById('link-drawing').style.color = navUnSelected;
    document.getElementById('link-about').style.color = navUnSelected;
    document.getElementById('link-contact').style.color = navUnSelected;
}
function fadeIn(el){
  el.classList.add('show');
  el.classList.remove('hide');
}
function fadeOut(el){
  el.classList.add('hide');
  el.classList.remove('show');
}
