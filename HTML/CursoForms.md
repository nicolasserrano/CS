# Curso básico de formularios en lenguaje HTML

*Índice*

<table WIDTH="90%" UNITS="relative">
  <tr>
    <td VALIGN="BASELINE"><ul>
      <li><a HREF="#form">Formularios</a></li>
      <li><a href="#radio">Botones de opciones</a></li>
      <li><a href="#check">Casillas de verificación</a></li>
    </ul>
    </td>
    <td VALIGN="BASELINE"><ul>
      <li><a href="#ventana">Ventana de selección</a></li>
      <li><a HREF="#lista">Listas</a>&nbsp;</li>
      <li><a HREF="#otros">Otros elementos</a>&nbsp;</li>
     </ul>
    </td>
  </tr>
</table>

<a NAME="form"></a>
## Formularios

<table BORDER="1" WIDTH="100%">
  <tr>
    <th><b>Así se escribe:</b></th>
    <th><b>Así se ve:</b>&nbsp;</th>
  </tr>
  <tr>
    <td WIDTH="50%"><pre>&lt;form action=&quot;query.html&quot; method=&quot;GET&quot; name=&quot;form&quot;&gt;
&lt;pre&gt;
  Nombre:&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp; &lt;input NAME=&quot;nombre&quot; size=&quot;20&quot;&gt; 
  Contraseña: &lt;input TYPE=&quot;password&quot; NAME=&quot;contrasena&quot; size=&quot;20&quot;&gt;
  &lt;input TYPE=&quot;SUBMIT&quot; VALUE=&quot;Enviar&quot;&gt; 
&lt;/pre&gt;
&lt;/form&gt;</pre>
    </td>
    <td WIDTH="50%"><form action="query.html" method="GET" name="form" target="res1">
      <pre>      Nombre:&nbsp;&nbsp;&nbsp;&nbsp; <input name="nombre" size="20"> 
      Contraseña: <input type="password" name="contrasena" size="20">
      <input type="SUBMIT" value="Enviar"> 
    </pre>
    </form>
    </td>
  </tr>
  <tr>
    <td WIDTH="50%"><pre>&lt;form action=&quot;query.html&quot;
 method=&quot;GET&quot; name=&quot;comentario&quot;&gt;
  Caja de texto de varias líneas:&lt;p&gt;
  &lt;textarea rows=&quot;3&quot; name=&quot;comentario&quot; cols=&quot;20&quot;&gt;Texto inicial&lt;/textarea&gt;
  &lt;input TYPE=&quot;SUBMIT&quot; VALUE=&quot;Enviar&quot;&gt; 
  &lt;input TYPE=&quot;RESET&quot; VALUE=&quot;Borrar&quot;&gt;
&lt;/form&gt;</pre>
    </td>
    <td WIDTH="50%"><form action="query.html" method="GET" name="comentario" target="res1">
      <p>Caja de texto de varias líneas:</p>
      <p><textarea rows="3" name="comentario" cols="20">Texto inicial</textarea></p>
      <p><input type="SUBMIT" value="Enviar"> <input type="RESET" value="Borrar"> </p>
    </form>
    </td>
  </tr>
</table>

<iframe name="res1"></iframe>
<hr>

<a NAME="radio"></a>
## Botones de opciones

<table BORDER="1" WIDTH="100%">
  <tr>
    <th><b>Así se escribe:</b></th>
    <th><b>Así se ve:</b>&nbsp;</th>
  </tr>
  <tr>
    <td WIDTH="50%"><pre>&lt;form action=&quot;query.html&quot;
 method=&quot;GET&quot;    name=&quot;radio&quot;&gt;
      &lt;p&gt;Seleccione el idioma:&lt;/p&gt;
      &lt;input TYPE=&quot;radio&quot; NAME=&quot;Idioma&quot; VALUE=&quot;euskera&quot;&gt; Euskera &lt;br&gt;
      &lt;input TYPE=&quot;radio&quot; NAME=&quot;Idioma&quot; VALUE=&quot;ingles&quot;&gt; Inglés &lt;br&gt;
      &lt;input TYPE=&quot;radio&quot; NAME=&quot;Idioma&quot; VALUE=&quot;frances&quot;&gt; Francés &lt;br&gt;
      &lt;input TYPE=&quot;SUBMIT&quot; VALUE=&quot;Enviar&quot;&gt;
    &lt;/form&gt;</pre>
    </td>
    <td WIDTH="50%"><form action="query.html" method="GET" name="radio" target="res3">
      <p>Seleccione el idioma:</p>
      <p><input type="radio" name="Idioma" value="euskera"> Euskera <br>
      <input type="radio" name="Idioma" value="ingles"> Inglés <br>
      <input type="radio" name="Idioma" value="frances"> Francés <br>
      <input type="SUBMIT" value="Enviar"> </p>
    </form>
    </td>
  </tr>
</table>

<iframe name="res3"></iframe>
<hr WIDTH="100%">

<a NAME="check"></a>
## Casillas de verificación

<table BORDER="1" WIDTH="100%">
  <tr>
    <th><b>Así se escribe:</b></th>
    <th><b>Así se ve:</b>&nbsp;</th>
  </tr>
  <tr>
    <td WIDTH="50%"><pre>&lt;form action=&quot;query.html&quot;
 method=&quot;GET&quot;  name=&quot;checks&quot;&gt;
      &lt;p&gt;Indique los idiomas que habla:&lt;/p&gt;
      &lt;input TYPE=&quot;checkbox&quot; NAME=&quot;Idioma&quot; VALUE=&quot;euskera&quot;&gt; Euskera &lt;br&gt;
      &lt;input TYPE=&quot;checkbox&quot; NAME=&quot;Idioma&quot; VALUE=&quot;ingles&quot;&gt; Inglés &lt;br&gt;
      &lt;input TYPE=&quot;checkbox&quot; NAME=&quot;Idioma&quot; VALUE=&quot;frances&quot;&gt; Francés &lt;br&gt;
      &lt;input TYPE=&quot;SUBMIT&quot; VALUE=&quot;Enviar&quot;&gt;
&lt;/form&gt;</pre>
    </td>
    <td WIDTH="50%"><form action="query.html" method="GET" name="checks" target="res2">
      <p>Indique los idiomas que habla:</p>
      <p><input type="checkbox" name="Idioma" value="euskera"> Euskera <br>
      <input type="checkbox" name="Idioma" value="ingles"> Inglés <br>
      <input type="checkbox" name="Idioma" value="frances"> Francés <br>
      <input type="SUBMIT" value="Enviar"> </p>
    </form>
    </td>
  </tr>
</table>

<iframe name="res2"></iframe>
<hr>

<a NAME="ventana"></a>
## Ventana de selección

<table BORDER="1" WIDTH="100%">
  <tr>
    <th><b>Así se escribe:</b></th>
    <th><b>Así se ve:</b>&nbsp;</th>
  </tr>
  <tr>
    <td WIDTH="50%"><pre>&lt;form action=&quot;query.html&quot;
method=&quot;GET&quot; name=&quot;ventana&quot;&gt;
&lt;p&gt;Indique la forma de pago:&lt;/p&gt;
  &lt;p&gt;&lt;select NAME=&quot;Pago&quot; size=&quot;1&quot; &gt;
      &lt;option VALUE=&quot;metalico&quot;&gt; En metálico &lt;/option&gt;
      &lt;option VALUE=&quot;cheque&quot;&gt; Cheque &lt;/option&gt;
      &lt;option VALUE=&quot;transferencia&quot;&gt; Transferencia bancaria &lt;/option&gt;
  &lt;/select&gt; &lt;input TYPE=&quot;SUBMIT&quot; VALUE=&quot;Enviar&quot;&gt; &lt;/p&gt;
&lt;/form&gt;</pre>
    </td>
    <td WIDTH="50%"><form action="query.html" method="GET" name="ventana" target="res4">
      <p>Indique la forma de pago:</p>
      <p><select name="Pago" size="1">
        <option value="metalico"> En metálico </option>
        <option value="cheque"> Cheque </option>
        <option value="transferencia"> Transferencia bancaria </option>
      </select> <input type="SUBMIT" value="Enviar"> </p>
    </form>
    </td>
  </tr>
</table>

<iframe name="res4"></iframe>
<hr WIDTH="100%">

<a NAME="lista"></a>
## Listas

<table BORDER="1" WIDTH="100%">
  <tr>
    <th><b>Así se escribe:</b></th>
    <th><b>Así se ve:</b>&nbsp;</th>
  </tr>
  <tr>
    <td WIDTH="50%"><pre>&lt;form action=&quot;query.html&quot;
method=&quot;GET&quot; name=&quot;lista&quot;&gt;
&lt;p&gt;Indique la forma de pago:&lt;/p&gt;
  &lt;p&gt;&lt;select NAME=&quot;Pago&quot; size=&quot;3&quot; MULTIPLE&gt;
      &lt;option VALUE=&quot;metalico&quot;&gt; En metálico &lt;/option&gt;
      &lt;option VALUE=&quot;cheque&quot;&gt; Cheque &lt;/option&gt;
      &lt;option VALUE=&quot;transferencia&quot;&gt; Transferencia bancaria &lt;/option&gt;
  &lt;/select&gt; &lt;input TYPE=&quot;SUBMIT&quot; VALUE=&quot;Enviar&quot;&gt; &lt;/p&gt;
&lt;/form&gt;</pre>
    </td>
    <td WIDTH="50%"><form action="query.html" method="GET" name="lista" target="res5">
      <p>Indique la forma de pago:</p>
      <p><select name="Pago" size="3" multiple="">
        <option value="metalico"> En metálico </option>
        <option value="cheque"> Cheque </option>
        <option value="transferencia"> Transferencia bancaria </option>
      </select> <input type="SUBMIT" value="Enviar"> </p>
    </form>
    </td>
  </tr>
</table>

<iframe name="res5"></iframe>

<hr WIDTH="100%">

<a NAME="otros"></a>
## Otros elementos

<table BORDER="1" WIDTH="100%">
  <tr>
    <th><b>Así se escribe:</b></th>
    <th><b>Así se ve:</b>&nbsp;</th>
  </tr>
  <tr>
    <td WIDTH="50%"><pre>&lt;form action=&quot;query.html&quot;
method=&quot;GET&quot; name=&quot;lista&quot;&gt;
&lt;p&gt;Bot&oacute;n: &lt;input type="button" value="Click me" onclick="alert('clicked')"&gt;&lt;/p&gt;<br /> &lt;p&gt;Color: &lt;input type="color" name="colorInput"&gt;&lt;/p&gt;<br /> &lt;p&gt;Date: &lt;input type="date" name="dateInput"&gt;&lt;/p&gt;<br /> &lt;p&gt;Date time: &lt;input type="datetime-local" name="datetimeInput"&gt;&lt;/p&gt;<br /> &lt;p&gt;Email: &lt;input type="email" name="emailInput"&gt;&lt;/p&gt;<br /> &lt;p&gt;File: &lt;input type="file" name="fileInput"&gt;&lt;/p&gt;<br /> &lt;p&gt;Hidden:&lt;input type="hidden" value="hiddenValue" name="hiddenInput"&gt;&lt;/p&gt;<br /> &lt;p&gt;More in &lt;/p&gt;
&lt;p&gt;Range:&lt;input type="range" min="0" max="100" name="rangeInput"&gt;&lt;/p&gt;
&lt;input TYPE=&quot;SUBMIT&quot; VALUE=&quot;Enviar&quot;&gt; &lt;/p&gt;
&lt;/form&gt;</pre>
    </td>
    <td WIDTH="50%"><form action="query.html" method="GET" name="lista" target="res6">
      <p>Botón: <input type="button" value="Click me" onclick="alert('clicked')"></p>
      <p>Color: <input type="color" name="colorInput"></p>
      <p>Date:  <input type="date" name="dateInput"></p>
      <p>Date time:  <input type="datetime-local" name="datetimeInput"></p>
      <p>Email: <input type="email" name="emailInput"></p>
      <p>File:  <input type="file" name="fileInput"></p>
      <p>Hidden:<input type="hidden" value="hiddenValue" name="hiddenInput"></p>
      <p>Range:<input type="range" min="0" max="100" name="rangeInput"></p>
      <p>More in HTML <a target='_blank' href='https://www.w3schools.com/tags/att_input_type.asp'>&lt;input&gt;</a></p>
       <input type="SUBMIT" value="Enviar">
    </form>
    </td>
  </tr>
</table>
<iframe name="res6" class="height"></iframe>
<hr WIDTH="100%">

&Uacute;ltima actualizaci&oacute;n: 08 de Marzo de 2024

<style>
iframe {
    height: 4em;
    width: 100%;
}
iframe.height {
   height: 8em;
}}
</style>
<style>
form:hover {
    outline: 4px dashed red;
}
</style>
