# Curso básico de formularios en lenguaje HTML

Última actualización: 20 de Marzo de 2019

Índice

<table WIDTH="90%" UNITS="relative">
  <tr>
    <td VALIGN="BASELINE"><ul>
      <li><a HREF="#form">Formularios</a></li>
      <li><a href="#check">Casillas de verificación</a></li>
      <li><a href="#radio">Botones de opciones</a></li>
    </ul>
    </td>
    <td VALIGN="BASELINE"><ul>
      <li><a href="#ventana">Ventana de selección</a></li>
      <li><a HREF="#lista">Listas</a>&nbsp;</li>
     </ul>
    </td>
  </tr>
</table>

## Formularios </font></h3>

<table BORDER="1" WIDTH="100%">
  <tr>
    <th><b>Así se escribe:</b></th>
    <th><b>Así se ve:</b>&nbsp;</th>
  </tr>
  <tr>
    <td WIDTH="50%"><pre>&lt;form action=&quot;http://www1.tecnun.es/asignaturas/informat3/Material/query.asp&quot;
 method=&quot;GET&quot; name=&quot;form&quot;&gt;
&lt;pre&gt;
  Nombre:&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp; &lt;input NAME=&quot;nombre&quot; size=&quot;20&quot;&gt; 
  Contraseña: &lt;input TYPE=&quot;password&quot; NAME=&quot;contrasena&quot; size=&quot;20&quot;&gt;
  &lt;input TYPE=&quot;SUBMIT&quot; VALUE=&quot;Enviar&quot;&gt; 
&lt;/pre&gt;
&lt;/form&gt;</pre>
    </td>
    <td WIDTH="50%"><form action="query.html" method="GET" name="form" target="res">
      <pre>      Nombre:&nbsp;&nbsp;&nbsp;&nbsp; <input name="nombre" size="20"> 
      Contraseña: <input type="password" name="contrasena" size="20">
      <input type="SUBMIT" value="Enviar"> 
    </pre>
    </form>
    </td>
  </tr>
  <tr>
    <td WIDTH="50%"><pre>&lt;form action=&quot;http://www1.tecnun.es/asignaturas/informat3/Material/query.asp&quot;
 method=&quot;GET&quot; name=&quot;comentario&quot;&gt;
  Caja de texto de varias líneas:&lt;p&gt;
  &lt;textarea rows=&quot;3&quot; name=&quot;comentario&quot; cols=&quot;20&quot;&gt;Texto inicial&lt;/textarea&gt;
  &lt;input TYPE=&quot;SUBMIT&quot; VALUE=&quot;Enviar&quot;&gt; 
  &lt;input TYPE=&quot;RESET&quot; VALUE=&quot;Borrar&quot;&gt;
&lt;/form&gt;</pre>
    </td>
    <td WIDTH="50%"><form action="http://www1.tecnun.es/asignaturas/informat3/Material/query.asp" method="GET" name="comentario" target="res">
      <p>Caja de texto de varias líneas:</p>
      <p><textarea rows="3" name="comentario" cols="20">Texto inicial</textarea></p>
      <p><input type="SUBMIT" value="Enviar"> <input type="RESET" value="Borrar"> </p>
    </form>
    </td>
  </tr>
</table>

<hr>

<h3><a NAME="check"></a>Casillas de verificación</h3>

<table BORDER="1" WIDTH="100%">
  <tr>
    <th><b>Así se escribe:</b></th>
    <th><b>Así se ve:</b>&nbsp;</th>
  </tr>
  <tr>
    <td WIDTH="50%"><pre>&lt;form action=&quot;http://www1.tecnun.es/asignaturas/informat3/Material/query.asp&quot;
 method=&quot;GET&quot;  name=&quot;checks&quot;&gt;
      &lt;p&gt;Indique los idiomas que hablar:&lt;/p&gt;
      &lt;input TYPE=&quot;checkbox&quot; NAME=&quot;Idioma&quot; VALUE=&quot;euskera&quot;&gt; Euskera &lt;br&gt;
      &lt;input TYPE=&quot;checkbox&quot; NAME=&quot;Idioma&quot; VALUE=&quot;ingles&quot;&gt; Inglés &lt;br&gt;
      &lt;input TYPE=&quot;checkbox&quot; NAME=&quot;Idioma&quot; VALUE=&quot;frances&quot;&gt; Francés &lt;br&gt;
      &lt;input TYPE=&quot;SUBMIT&quot; VALUE=&quot;Enviar&quot;&gt;
&lt;/form&gt;</pre>
    </td>
    <td WIDTH="50%"><form action="http://www1.tecnun.es/asignaturas/informat3/Material/query.asp" method="GET"
    name="checks" target="res">
      <p>Indique los idiomas que hablar:</p>
      <p><input TYPE="checkbox" NAME="Idioma" VALUE="euskera"> Euskera <br>
      <input TYPE="checkbox" NAME="Idioma" VALUE="ingles"> Inglés <br>
      <input TYPE="checkbox" NAME="Idioma" VALUE="frances"> Francés <br>
      <input TYPE="SUBMIT" VALUE="Enviar"> </p>
    </form>
    </td>
  </tr>
</table>

<p><font SIZE="+1"><a HREF="Curso011.htm#Inicio"></a></p>
</font>

<p><font SIZE="+1"><a HREF="#inicio">Volver al inicio</a></font>&nbsp; </p>

<hr>

<h3><a NAME="radio"></a>Botones de opciones</h3>

<table BORDER="1" WIDTH="100%">
  <tr>
    <th><b>Así se escribe:</b></th>
    <th><b>Así se ve:</b>&nbsp;</th>
  </tr>
  <tr>
    <td WIDTH="50%"><pre>&lt;form action=&quot;http://www1.tecnun.es/asignaturas/informat3/Material/query.asp&quot;
 method=&quot;GET&quot;    name=&quot;radio&quot;&gt;
      &lt;p&gt;Seleccione el idioma:&lt;/p&gt;
      &lt;input TYPE=&quot;radio&quot; NAME=&quot;Idioma&quot; VALUE=&quot;euskera&quot;&gt; Euskera &lt;br&gt;
      &lt;input TYPE=&quot;radio&quot; NAME=&quot;Idioma&quot; VALUE=&quot;ingles&quot;&gt; Inglés &lt;br&gt;
      &lt;input TYPE=&quot;radio&quot; NAME=&quot;Idioma&quot; VALUE=&quot;frances&quot;&gt; Francés &lt;br&gt;
      &lt;input TYPE=&quot;SUBMIT&quot; VALUE=&quot;Enviar&quot;&gt;
    &lt;/form&gt;</pre>
    </td>
    <td WIDTH="50%"><form action="http://www1.tecnun.es/asignaturas/informat3/Material/query.asp" method="GET"
    name="radio" target="res">
      <p>Seleccione el idioma:</p>
      <p><input TYPE="radio" NAME="Idioma" VALUE="euskera"> Euskera <br>
      <input TYPE="radio" NAME="Idioma" VALUE="ingles"> Inglés <br>
      <input TYPE="radio" NAME="Idioma" VALUE="frances"> Francés <br>
      <input TYPE="SUBMIT" VALUE="Enviar"> </p>
    </form>
    </td>
  </tr>
</table>

<p><font SIZE="+1"><a HREF="Curso011.htm#Inicio"></a></p>
</font>

<p><font SIZE="+1"><a HREF="#inicio">Volver al inicio</a></font>&nbsp; </p>

<hr WIDTH="100%">

<h3><a NAME="ventana"></a>Ventana de selección</h3>

<table BORDER="1" WIDTH="100%">
  <tr>
    <th><b>Así se escribe:</b></th>
    <th><b>Así se ve:</b>&nbsp;</th>
  </tr>
  <tr>
    <td WIDTH="50%"><pre>&lt;form action=&quot;http://www1.tecnun.es/asignaturas/informat3/Material/query.asp&quot;
method=&quot;GET&quot; name=&quot;ventana&quot;&gt;
&lt;p&gt;Indique la forma de pago:&lt;/p&gt;
  &lt;p&gt;&lt;select NAME=&quot;Pago&quot; size=&quot;1&quot; &gt;
      &lt;option VALUE=&quot;metalico&quot;&gt; En metálico &lt;/option&gt;
      &lt;option VALUE=&quot;cheque&quot;&gt; Cheque &lt;/option&gt;
      &lt;option VALUE=&quot;transferencia&quot;&gt; Transferencia bancaria &lt;/option&gt;
  &lt;/select&gt; &lt;input TYPE=&quot;SUBMIT&quot; VALUE=&quot;Enviar&quot;&gt; &lt;/p&gt;
&lt;/form&gt;</pre>
    </td>
    <td WIDTH="50%"><form action="http://www1.tecnun.es/asignaturas/informat3/Material/query.asp" method="GET"
    name="ventana" target="res">
      <p>Indique la forma de pago:</p>
      <p><select NAME="Pago" size="1">
        <option VALUE="metalico"> En metálico </option>
        <option VALUE="cheque"> Cheque </option>
        <option VALUE="transferencia"> Transferencia bancaria </option>
      </select> <input TYPE="SUBMIT" VALUE="Enviar"> </p>
    </form>
    </td>
  </tr>
</table>

<p><font SIZE="+1"><a HREF="Curso011.htm#Inicio"></a></p>
</font>

<p><font SIZE="+1"><a HREF="#inicio">Volver al inicio</a></font>&nbsp; </p>

<hr WIDTH="100%">

<h3><a NAME="lista"></a>Listas</h3>

<table BORDER="1" WIDTH="100%">
  <tr>
    <th><b>Así se escribe:</b></th>
    <th><b>Así se ve:</b>&nbsp;</th>
  </tr>
  <tr>
    <td WIDTH="50%"><pre>&lt;form action=&quot;http://www1.tecnun.es/asignaturas/informat3/Material/query.asp&quot;
method=&quot;GET&quot; name=&quot;lista&quot;&gt;
&lt;p&gt;Indique la forma de pago:&lt;/p&gt;
  &lt;p&gt;&lt;select NAME=&quot;Pago&quot; size=&quot;3&quot; MULTIPLE&gt;
      &lt;option VALUE=&quot;metalico&quot;&gt; En metálico &lt;/option&gt;
      &lt;option VALUE=&quot;cheque&quot;&gt; Cheque &lt;/option&gt;
      &lt;option VALUE=&quot;transferencia&quot;&gt; Transferencia bancaria &lt;/option&gt;
  &lt;/select&gt; &lt;input TYPE=&quot;SUBMIT&quot; VALUE=&quot;Enviar&quot;&gt; &lt;/p&gt;
&lt;/form&gt;</pre>
    </td>
    <td WIDTH="50%"><form action="http://www1.tecnun.es/asignaturas/informat3/Material/query.asp" method="GET"
    name="lista" target="res">
      <p>Indique la forma de pago:</p>
      <p><select NAME="Pago" size="3" MULTIPLE>
        <option VALUE="metalico"> En metálico </option>
        <option VALUE="cheque"> Cheque </option>
        <option VALUE="transferencia"> Transferencia bancaria </option>
      </select> <input TYPE="SUBMIT" VALUE="Enviar"> </p>
    </form>
    </td>
  </tr>
</table>

<p><font SIZE="+1"><a HREF="Curso011.htm#Inicio"></a></p>
</font>

<p><font SIZE="+1"><a HREF="#inicio">Volver al inicio</a></font>&nbsp; </p>

<hr WIDTH="100%">
</body>
</html>
