# Java

## Servlets

## Http request:
- enter a URL, click a link, submit a form or any event in the broswer: example: <http://www.amazon.com>
- create the HTTP request: Developer tool -> Network, click on <http://www.amazon.com>, see Headers, Request header.
  - Search for amazon. Open a cookie.
  - Remove all shown
  - New request (F5) to www.amazon.com with "Developer tool -> Network" open
    - See Request (no cookies)
    - See Response (new cookies)
  - Second request to amazon (F5):
    - See Request (the previous cookies)
    - See Response (no cookies)
- IP number of the address (ping in CommandPrompt  ping www.casio.jp)
- connection to the server (tracert in CommandPrompt:   tracert www.casio.jp)
- process in the server: web -> application -> thread -> process & DDBB -> application -> web
- browser get the response: Developer tool -> Network, see Headers -> Response header and Response
- build the DOM tree: Developer tool -> Elements
- browser request other resources (images, js, css): Developer tool -> Network (second and next requests)
- styles are applied (remove head node in Developer tool -> Elements)
- JavaScript is applied
- the page is rendered

## Session in Web Applications
- Hidden fields. Example in ShoppingCart.java
- URL Rewriting
- Cookies

## Cookies
- See the cookies with [Browser settings](chrome://settings/) and Settings ->Show advanced settings... ->Content settings... -> All cookies and site data
- Cookies in the network: Console (F12), Network, reload (F5) and click url - > headers -> view source
- Example with Amazon

## Example of Session in applications

### Login [code](webapps/northbrickSession/WEB-INF/classes/CheckLogin.java)

```Java
 public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String logged = check(connection, login, password);
        System.out.println("check Login logged: " + logged);
        System.out.println("check Login login, password: " + login + " " + password);
        if (logged != null) {
            HttpSession session = req.getSession(true);
            session.setAttribute("login", logged);
            res.sendRedirect("ProductList");
        } else {
        ...
```
        
### Function [code](webapps/northbrickSession/WEB-INF/classes/ProductList.java)

```Java
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();
        String categoryId = req.getParameter("id");
        HttpSession session = req.getSession(false);
        String login = null;
        if (session != null) {
            login = (String)session.getAttribute("login");
            System.out.println("ProductList logged");
            System.out.println("ProductList login: " + login);
        }
        toClient.println(Utils.header("Products", login));
        
        ...
```
        
### Logout [code](webapps/northbrickSession/WEB-INF/classes/Logout.java)

```Java
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        HttpSession session = req.getSession(false);
        if (session != null) {
            session.invalidate();
            res.sendRedirect("CheckLogin");
        }
    }
```
In folder [northbrickSession](https://github.com/nicolasserrano/CS/tree/master/webapps/northbrickSession)

## Session in Servlets
- Java Classes:
  - [HttpServletRequest getSession(boolean create)](https://javaee.github.io/javaee-spec/javadocs/javax/servlet/http/HttpServletRequest.html#i22)
  - [HttpSession](https://javaee.github.io/javaee-spec/javadocs/index.html?javax/servlet/http/HttpSession.html)
    - [getAttribute(String name)](https://javaee.github.io/javaee-spec/javadocs/javax/servlet/http/HttpSession.html#i0)
    - [setAttribute(String name, Object value)](https://javaee.github.io/javaee-spec/javadocs/javax/servlet/http/HttpSession.html#i15)

## Server Sent Event
  - Example in [https://github.com/nicolasserrano/CS/tree/master/webapps/ServerSentEvent](https://github.com/nicolasserrano/CS/tree/master/webapps/ServerSentEvent) - [HTML file](https://nicolasserrano.github.io/CS/webapps/ServerSentEvent/index.html)
  - Example of [chat with SSE](https://github.com/mariaserranomartinez/ChatSSE)

### Using a pendrive to execute the programas  
[See the instructions](Tomcat.md#run-from-pendrive)
<!-- [See the instructions with Tomcat 5.5](Java/Pendrive.md) -->


---
[Edit v8.1](https://github.com/nicolasserrano/CS/edit/master/Servlets.md)
<style>
div.container ul, div.container ol {
    padding-left: 1.4em;
}
</style>
