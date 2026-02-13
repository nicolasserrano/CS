console.log('Page robotsJSON.js')

buttonJSON = document.createElement("input");
buttonJSON.setAttribute("type", "button");
buttonJSON.setAttribute("value", "Create JSON");
buttonJSON.setAttribute("onclick", "createJSON(this)");
buttonJSON.setAttribute("id", buttonJSON);
table0=document.getElementsByTagName("table")[0];
table0.appendChild(buttonJSON);


function createJSON(button) {
    outputObject = [];
    titleH1=document.getElementsByTagName("H1")[0];
    images = titleH1.getElementsByTagName("img");
    for (i=0; i< images.length; i++) {
        newRobot = {};
        imageTable = getImageInTableWithSrc(images[i].src);
        tbody=imageTable.parentElement.parentElement.parentElement;
        newRobot.name = tbody.getElementsByTagName("td")[2].innerHTML;
        newRobot.company = tbody.getElementsByTagName("td")[4].innerText;
        newRobot.height = tbody.getElementsByTagName("td")[6].innerHTML;
        outputObject.push(newRobot);
    }
    strJSON = JSON.stringify(outputObject);
    alert(strJSON);
}
function getImageInTableWithSrc(imageSrc){
    table0=document.getElementsByTagName("table")[0];
    imagesTable = table0.getElementsByTagName("img");
    for (j=0; j< imagesTable.length; j++) {
        if (imagesTable[j].src == imageSrc) {
            return imagesTable[j];
        }
    }
    alert ("image not found " + imageSrc);
    return null;
}
