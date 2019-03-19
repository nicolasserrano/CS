# AJAX
![AJAX flowchart](https://sureshjain.files.wordpress.com/2007/04/untitled.jpg)

## Simple code ([execute](https://nicolasserrano.github.io/CS/AJAX/Ajax.html)):
```  
function changeText() {
  var xmlhttp =new XMLHttpRequest();
  xmlhttp.onreadystatechange=function() {
    if (xmlhttp.readyState==4 && xmlhttp.status==200) {
      document.getElementById("id1").innerHTML=xmlhttp.responseText;
    }
  }
  xmlhttp.open("GET","text.txt",true);
  xmlhttp.send();
}
```  

## Processin a JSON object ([execute](https://nicolasserrano.github.io/CS/AJAX/bookForm2.html)):
``` 
  function getData(ISBN) {    
    var data ="";

    var request = new XMLHttpRequest();
    request.open('GET', 'https://www.googleapis.com/books/v1/volumes?q=isbn:' + ISBN, true);

    request.onload = function() {
      if (request.status >= 200 && request.status < 400) {
        // Success!
        resp = request.responseText;
        data = JSON.parse(resp);
        var table = document.getElementById("myTable");
        var row = table.insertRow(-1);
        var cell1 = row.insertCell(0);
        var cell2 = row.insertCell(1);
        var cell3 = row.insertCell(2);
        var cell4 = row.insertCell(3);
        cell1.innerHTML = "<img class='image' src='" + data.items[0].volumeInfo.imageLinks.thumbnail + "' />";
        cell2.innerHTML = data.items[0].volumeInfo.title;
        cell3.innerHTML = data.items[0].volumeInfo.authors[0];
        cell4.innerHTML = data.items[0].volumeInfo.publisher;
        document.getElementById("ISBN").value = "";
        document.getElementById("ISBN").focus();
        } else {
        // We reached our target server, but it returned an error
      }
    };

    request.send();
  }
```
