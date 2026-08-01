function zoom(img) {

    img.style.width = "200px";
    document.getElementById("title").innerHTML = img.title;

}

function normal(img) {

    img.style.width = "150px";
    document.getElementById("title").innerHTML = "";

}

function preview(img) {

    document.getElementById("preview").src = img.src;

}