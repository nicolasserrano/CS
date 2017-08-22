# JavaScript and AJAX

## Class structure:
- Architecture Client - Server
- Why JavasScript
- JavaScript in Web Applications
- How &lt;script&gt; tag, examples, tools, JQuery, jQuery ui, Bootstrap
- Ajax
- JSON

## Architecture Client - Server
- Architecture: <http://chimera.labs.oreilly.com/books/1234000000262/ch01.html#infrastructure-diagram>
- Process of rendering a Web page: <http://friendlybit.com/css/rendering-a-web-page-step-by-step/> (used in Startup Engineering of Coursera)
- Command tracert (in MS-DOS) www.casio.jp

## User Interface
- [Video interfaces](https://youtu.be/M0IR40ud0jU?t=2m16s) to 3m0s
- Example of interface: drag and drop: <https://jqueryui.com/droppable/#default> al objeto #draggable añadir las propiedades: (background-color: rgba(173, 255, 47, 0.2); border-radius: 26px; border-width: 5px;)
- [Example of dynamic elements](http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_document_createelement2)

## Examples of use of Javascript
- [Calculator](http://www.calculator.net/scientific-calculator.html)
- [Google charts](https://developers.google.com/chart/interactive/docs/gallery/motionchart#Example)
- [Graphs](http://dygraphs.com/) [Function Plotter](http://dygraphs.com/gallery/#g/plotter)
- [Lego builder](https://www.buildwithchrome.com/builder#)
- [TinyMCE](http://www.tinymce.com/tryit/inline.php)
- [SVG-Edit](http://svg-edit.googlecode.com/svn/branches/2.6/editor/svg-editor.html)
- [Wix](http://wix.com)
- [Doodle](http://doodle.com/)
- [Example of processor simulator](https://nicolasserrano.github.io/c5i/c5i-ui.html)
- [Nozbe task manager](http://app.nozbe.com/#login)
- [Data Driven Documents](http://d3js.org/)

Other examples:
- <http://www.drawastickman.com/>
- <www.alsa.es>
- <http://www.kayak.es/>

## Examples
- [basic example](JavaScript/basicJavascript.html)
- [Examples 1](JavaScript/JavaScript1.html)
- [Examples 2](JavaScript/JavaScript2.html)

## Components
- Combo (select with input) [combo.html](JavaScript/components/combo.html)
- Dialog with jQuery [dialog.html](JavaScript/components/dialog.html)
- Dialog with JavaScript [dialog2.html](JavaScript/components/dialog2.html)

## AJAX examples
- AJAX 1 [Ajax.html](AJAX/Ajax.html)
- Book list [book.html](AJAX/book.html)
- Book form [bookForm.html](AJAX/bookForm.html)
- Book form 2 [bookForm2.html](AJAX/bookForm2.html)

## JSON
- JSON object
- Open the console (F12) and try:

```
a={}
a.b=55
JSON.stringify(a)
as=JSON.stringify(a)
JSON.parse(as)
```
Result (as): "{"b":55}"

- [Example of JSON with TED talks](http://www.ted.com/talks/subtitles/id/70/lang/en)

```
var t = document.body.innerText
t2 = eval('(' + t + ')')
t2.captions
for (x in t2.captions) { document.write(t2.captions[x].startTime + ":" + t2.captions[x].content ); document.write('<br>')}
document.write("<table border=1>");for (x in t2.captions) { document.write("<tr><td>" + t2.captions[x].startTime + "</td><td>" + t2.captions[x].content + "</td></tr>")}
```
Clear screen:

```
document.body.innerHTML
```

## DOM Manipulation
- [Basic tutorial](http://callmenick.com/post/basics-javascript-dom-manipulation)
- Examples of book "JavaScript & JQuery : Interactive Front-end Web Development" By Jon Duckett [web](http://javascriptbook.com/) [code examples](http://javascriptbook.com/code/)
  - [Update list](http://javascriptbook.com/code/c05/example.html)
  - [JSON data with Ajax](http://javascriptbook.com/code/c08/data-json.html)
- [Reference from mozilla](https://developer.mozilla.org/en-US/docs/Web/API/Document_Object_Model/Introduction)

## Resouces
- [JavaScript in One Page](JavaScript/JavascriptOnePage.pdf)
- [Beginner tutorials](http://elijahmanor.com/beginner-html5-javascript-jquery-backbone-and-css3-resources/)
- [Add target](http://stackoverflow.com/questions/6822945/add-target-blank-to-link-with-javascript)
- [Read a local file](https://www.html5rocks.com/en/tutorials/file/dndfiles/)
- [Drawing with Raphael JavaScript library](http://dmitrybaranovskiy.github.io/raphael/)
- [Charts with Dygraph](http://dygraphs.com/gallery/#g/plotter)

---
[Edit](https://github.com/nicolasserrano/CS/edit/master/JavaScript.md)
<style>
div.container ul, div.container ol {
    padding-left: 1.4em;
}
</style>
