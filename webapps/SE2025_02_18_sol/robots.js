console.log('Page robots.js')
images=document.getElementsByTagName("img");
for (i=0; i< images.length; i++) {
    button = document.createElement("input");
    button.setAttribute("type", "button");
    button.setAttribute("value", "Contract");
    button.setAttribute("onclick", "contract(this)");
    tbody=images[i].parentElement.parentElement.parentElement;
    tdName = tbody.getElementsByTagName("td")[2];
    robotName = tdName.innerHTML;
    button.setAttribute("id", robotName);
    images[i].parentElement.appendChild(button);
}
function contract(button) {
    console.log('function contract');
    imgSrc = button.parentElement.getElementsByTagName("img")[0].src;
    imgRobot = document.createElement("img");
    imgRobot.setAttribute("src", imgSrc);
    imgRobot.setAttribute("onclick", "deleteImg(this)");
    imgRobot.setAttribute("class", button.id);
    titleH1=document.getElementsByTagName("H1")[0];
    titleH1.appendChild(imgRobot);
}
function deleteImg(img) {
        alert(img.className);
}