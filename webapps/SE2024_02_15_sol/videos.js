    playButton = document.createElement("input");

    playButton.setAttribute("type", "button");
    playButton.setAttribute("value", "Change to play");
    playButton.setAttribute("onclick", "changeLinks(this)");
    title=document.getElementsByTagName("h2")[0];
    title.appendChild(playButton);

function changeLinks(buttonEl) {
    alert("videos.js file");
}