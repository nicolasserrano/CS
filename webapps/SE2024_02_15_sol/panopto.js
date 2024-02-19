console.log("panopto.js file");
playButton = document.createElement("input");

playButton.setAttribute("type", "button");
playButton.setAttribute("value", "Add buttons");
playButton.setAttribute("onclick", "changeLinks(this)");
place=document.getElementById("place");
place.setAttribute("class", "menu");
place.appendChild(playButton);

function changeLinks(buttonEl) {
    table = document.getElementsByTagName("table")[0];
    console.log("Version panopto 1.1")
    tr = table.getElementsByTagName("tr");

    console.log("tr.length: " + tr.length)
    for (i=0; i< tr.length; i++) {
        console.log("tr " + i)
        cell1=tr[i].getElementsByTagName("td")[1];
        image1 = cell1.getElementsByTagName("img")[0];
        imgSrc = image1.src;
        cell2=tr[i].getElementsByTagName("td")[2];
        link1 = cell2.getElementsByTagName("a")[0];
        button2 = document.createElement("input");
        button2.setAttribute("type", "button");
        button2.setAttribute("value", "View");
        button2.setAttribute("onclick", "createIframe('" + imgSrc+ "')");
        cell2.appendChild(button2);
    }
}

function createIframe(imgSrc) {
    img2 = document.createElement("img");
    img2.setAttribute("src", imgSrc);
    img2.setAttribute("width", "600px");
    img2.setAttribute("height", "400px");
    place.appendChild(img2);
}