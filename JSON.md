# JSON

## Create JSON object
- Open the console (F12) and try:

```
a={}
a.b=55
JSON.stringify(a)
as=JSON.stringify(a)
JSON.parse(as)
```
Result (as): "{"b":55}"

## Example of JSON with a TED conference

- [Example of JSON data from TED](https://nicolasserrano.github.io/CS/JavaScript/TedData.html)

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
document.body.innerHTML=""
```

## Other AJAX examples
- Basic AJAX 1 [Ajax.html](AJAX/Ajax.html)
- Book form [bookForm2.html](AJAX/bookForm2.html)

