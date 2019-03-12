# Examples
- Ajax 1 [Ajax.html](Ajax.html)
- Books [book.html](book.html)
- Image
![AJAX flowchart](https://sureshjain.files.wordpress.com/2007/04/untitled.jpg)

Simple code:
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

Returning an object JSON
