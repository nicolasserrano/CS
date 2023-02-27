//products.js
//alert("File books.js")

table = document.getElementsByTagName("table")[0];
console.log("Version books 1.1")
tr = table.getElementsByTagName("tr");

console.log("tr.length: " + tr.length)
for (i=0; i< tr.length; i++) {
    console.log("tr " + i)
    cell=tr[i].getElementsByTagName("td")[0];
    image = cell.getElementsByTagName("img")[0];
    url = image.src;
    url = url.replace("zoom=1", "zoom=3");
    link = document.createElement("a");
    link.setAttribute("href", url);
    link.setAttribute("target", "_blank");
    link.innerHTML = "Zoom";
    cell.appendChild(link);
}