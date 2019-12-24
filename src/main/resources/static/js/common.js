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
