<A NAME="inicio"></A>
# Curso b&aacute;sico de lenguaje HTML

*Índice*

<H1>

Curso b&aacute;sico de lenguaje HTML</H1></CENTER>

<HR>

<H2>

&Iacute;ndice</H2>


<TABLE WIDTH="90%" UNITS="relative" >
<TR>
<TD VALIGN=BASELINE>
<UL>
<LI>
<A HREF="#estrgral">Estructura general de un fichero HTML</A>&nbsp;</LI>
<LI>
<A HREF="#parrafos">Formato de p&aacute;rrafos</A>&nbsp;</LI>
<LI>
<A HREF="#texto">Formato de texto</A>&nbsp;</LI>
<LI>
<A HREF="#listasno">Listas no ordenadas</A>&nbsp;</LI>
<LI>
<A HREF="#listasor">Listas ordenadas</A>&nbsp;</LI>
<LI>
<A HREF="#tablas">Tablas</A>&nbsp;</LI>
<LI>
<A HREF="#anclas">Anclas</A>&nbsp;</LI>
</UL>
</TD>
<TD VALIGN=BASELINE>
<UL>
<LI>
<A HREF="#link">Links</A>&nbsp;</LI>
<LI>
<A HREF="#inimag">Inserci&oacute;n de im&aacute;genes</A></LI>
<LI>
<A HREF="#imclic">Im&aacute;genes clicables</A></LI>
</UL>
</TD>
</TR>
</TABLE>



<HR>

<H3>

<A NAME="estrgral"></A>Estructura general de un fichero HTML</H3>

HTML (HyperText Markup Language) es el lenguaje utilizado en la Internet

para definir las p&aacute;ginas del WORLD WIDE WEB. Los ficheros HTML son

ficheros puramente ASCII, que pueden ser escritos con cualquier editor

b&aacute;sico, tal como Notepad en Windows o vi en Unix. Tambi&eacute;n

se pueden utilizar procesadores de texto m&aacute;s complicados como Microsoft

Word, pero en este caso hay que asegurarse que el fichero es guardado en

disco como "text only". En este fichero de texto se introducen unas marcas

o caracteres de control llamadas TAGs, que son interpretadas por el browser.

Cuando &eacute;ste lee un fichero ASCII con extensi&oacute;n *.htm o *.html

interpreta estas TAGs y formatea el texto de acuerdo con ellas.



<P>Todas las TAGs de HTML van encerradas entre los caracteres menor que

( &lt;) y mayor que ( >), como por ejemplo &lt;HTML>. Adem&aacute;s, la

mayor parte de ellas son dobles, en el sentido de que hay una TAG de comienzo

y otra de final; entre ambas est&aacute; el texto afectado por dichas TAGs.

La marca de final es como la de comienzo, pero incluyendo una barrra (/).

Por ejemplo, la marca de final de &lt;HTML> es &lt;/HTML>. De la misma

forma, la TAG de final de &lt;P> es &lt;/P>, y as&iacute; con otras TAGs.

<PRE><FONT SIZE=+0>&lt;HTML>

&nbsp;&nbsp;&nbsp; &lt;HEAD>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &lt;TITLE>T&iacute;tulo de la p&aacute;gina&lt;/TITLE>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ...

&nbsp;&nbsp;&nbsp; &lt;/HEAD>



&nbsp;&nbsp;&nbsp; &lt;BODY>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ...

&nbsp;&nbsp;&nbsp; &lt;/BODY>

&lt;/HTML></FONT></PRE>

<FONT SIZE=+1><A HREF="#inicio">Volver al inicio</A></FONT>&nbsp;

<HR width="100%">

<H3>

<A NAME="parrafos"></A>Formato de p&aacute;rrafos</H3>



<TABLE BORDER WIDTH="100%" >

<TR>

<TH><B>As&iacute; se escribe:</B></TH>



<TH><B>As&iacute; se ve:</B>&nbsp;</TH>

</TR>



<TR>

<TD WIDTH="50%">

<PRE>&lt;P>Este es un ejemplo de c&oacute;mo se&nbsp;

formatean los p&aacute;rrafos en lenguaje HTML.&nbsp;

En esta celda de la Tabla se incluyen dos&nbsp;

p&aacute;rrafos&lt;/P>



&lt;P>El resultado puede verse en la&nbsp;

celda vecina incluida en la columna de la&nbsp;

derecha&lt;/P></PRE>

</TD>



<TD WIDTH="50%">Este es un ejemplo de c&oacute;mo se formatean los p&aacute;rrafos

en lenguaje HTML. En esta celda de la Tabla se incluyen dos p&aacute;rrafos&nbsp;



<P>El resultado puede verse en la celda vecina incluida en la columna de

la derecha&nbsp;</TD>

</TR>



<TR>

<TD WIDTH="50%">

<PRE>&lt;P>Los p&aacute;rrafos se separan con un espaciado&nbsp;

superior al correspondiente&nbsp;

a una nueva l&iacute;nea. &lt;BR>

Para tener un espaciado m&aacute;s compacto&nbsp;

puede utilizarse el Line Break,&nbsp;

como en este ejemplo.&lt;/P></PRE>

</TD>



<TD WIDTH="50%">Los p&aacute;rrafos se separan con un espaciado superior

al correspondiente a una nueva l&iacute;nea.&nbsp;

<BR>Para tener un espaciado m&aacute;s compacto puede utilizarse el Line

Break, como en este ejemplo.&nbsp;</TD>

</TR>



<TR>

<TD><TT>&lt;P>L&iacute;neas horizontales:&lt;/P></TT>&nbsp;



<P><TT>&lt;HR>&lt;HR WIDTH=80%>&lt;HR SIZE=4>&lt;HR NOSHADE></TT></TD>



<TD>L&iacute;neas horizontales:&nbsp;

<HR width="100%">

<HR width="80%">

<HR size=4 width="100%">

<HR noshade width="100%"></TD>

</TR>



<TR>

<TD><TT>&lt;P>Los p&aacute;rrafos pueden indentarse.</TT>&nbsp;



<P><TT>&lt;BLOCKQUOTE>Block quote indenta un p&aacute;rrafo. Se&nbsp;</TT>&nbsp;



<P><TT>deshace esta indentaci&oacute;n con el fin de la</TT>&nbsp;



<P><TT>TAG Block quote,&lt;/BLOCKQUOTE></TT>&nbsp;



<P><TT>como se ve en el ejemplo.&lt;/P></TT></TD>



<TD>Los p&aacute;rrafos pueden indentarse.&nbsp;

<UL>Block quote indenta un p&aacute;rrafo. Se deshace esta indentaci&oacute;n

con el fin de la TAG Block quote,</UL>

como se ve en el ejemplo.</TD>

</TR>



<TR>

<TD><TT>&lt;PRE>La TAG Preformatted permite</TT>&nbsp;

<UL>

<UL><TT>respetar la forma</TT>&nbsp;

<UL><TT>original</TT>&nbsp;



<P><TT>en que se ha&nbsp;</TT>&nbsp;

<UL><TT>escrito el texto.&lt;/PRE></TT></UL>

</UL>

</UL>

</UL>

</TD>



<TD>La TAG Preformatted permite&nbsp;

<UL>respetar la forma&nbsp;

<UL>original&nbsp;



<P>en que se ha&nbsp;

<UL>escrito el texto.</UL>

</UL>

</UL>

</TD>

</TR>



<TR>

<TD>&lt;ADRESS>&nbsp;

<BR>&lt;P>Escuela Superior de Ingenieros Industriales&nbsp;

<BR>&lt;P>P&ordm; Manuel de Lardiz&aacute;bal, 13&nbsp;

<BR>&lt;P>E-20009 San Sebasti&aacute;n&nbsp;

<BR>&lt;/ADRESS></TD>



<TD>Escuela Superior de Ingenieros Industriales&nbsp;

<BR>P&ordm; Manuel de Lardiz&aacute;bal, 13&nbsp;

<BR>E-20009 San Sebasti&aacute;n&nbsp;

<BR>&nbsp;<I> (<FONT SIZE=-1>Esto aparece al principio del documento, a

la izquierda)</FONT></I></TD>

</TR>

</TABLE>

<FONT SIZE=+1><A HREF="#inicio"></A></FONT>



<P><FONT SIZE=+1><A HREF="#inicio">Volver al inicio</A></FONT>



<P>

<HR>

<H3>

<A NAME="texto"></A>Formato de texto</H3>

Una idea importante de HTML es la de definir lo que se desea hacer (resaltar

una palabra o un p&aacute;rrafo, utilizar un espaciado constante, etc.),

pero no decir c&oacute;mo se desea hacerlo, dejando que esta funci&oacute;n

la realice el browser de acuerdo con sus posibilidades. Por ejemplo, se

le puede decir al browser que se quiere remarcar una palabra sin decirle

que la ponga en bold; de ordinario la remarcar&aacute; poni&eacute;ndola

en bold, pero si el browser se est&aacute; ejecutando en un ordenador que

no permite texto en bold, el propio browser buscar&aacute; una forma alternativa

de remarcar esa palabra.



<P>De todas formas, los autores quieren muchas veces determinar m&aacute;s

en concreto c&oacute;mo va a aparecer su texto en la pantalla del browser.

Adem&aacute;s, cada vez es m&aacute;s infrecuente ejecutar un browser que

no tenga las amplias posibilidades de formatear texto de Mac o Windows.

La consecuencia es que HTML se ha extendido y permite tanto definir de

modo general la funci&oacute;n del texto como determinar en concreto el

formato con que se debe representar. A continuaci&oacute;n se muestran

algunos ejemplos de ambas formas de definir los formatos.

<TABLE BORDER WIDTH="100%" >

<TR>

<TH><B>As&iacute; se escribe:</B></TH>



<TH><B>As&iacute; se ve:</B>&nbsp;</TH>

</TR>



<TR>

<TD><TT>&lt;FONT SIZE="+1" COLOR="red" FACE="Arial"></TT>&nbsp;

<BR><TT>Define tipo de letra, tama&ntilde;o y color a tu gusto</TT>&nbsp;

<BR><TT>&lt;/FONT></TT></TD>



<TD><FONT COLOR="#FF0000"><FONT SIZE=+3><FONT FACE="Arial,Helvetica">Define

tipo de letra, tama&ntilde;o y color a tu gusto</FONT>&nbsp;</FONT></FONT></TD>

</TR>



<TR>

<TD WIDTH="50%">

<PRE>&lt;P>Una palabra o un fragmento de texto se&nbsp;

puede resaltar con el tag STRONG&nbsp;

o con el tag EM, que en la mayor&nbsp;

parte de los browsers se corresponden&nbsp;

con &lt;STRONG>bold&lt;/STRONG> e&nbsp;

&lt;EM>italic&lt;/EM>&lt;/P></PRE>

</TD>



<TD WIDTH="50%">Una palabra o un fragmento de texto se puede resaltar con

el tag STRONG o con el tag EM, que en la mayor parte de los browsers se

corresponden con <B>bold</B> e <I>italic</I>.&nbsp;</TD>

</TR>



<TR>

<TD WIDTH="50%">

<PRE>&lt;P>En cualquier caso, tambi&eacute;n se&nbsp;

pueden utilizar los tags&nbsp;

&lt;B>bold&lt;/B> (B) e &lt;I>italic&lt;/I> (I).&lt;/P></PRE>

</TD>



<TD WIDTH="50%">En cualquier caso, tambi&eacute;n se pueden utilizar los

tags <B>bold</B> (B) e <I>italic</I> (I).&nbsp;</TD>

</TR>



<TR>

<TD WIDTH="50%">

<PRE>&lt;P>Para escribir con una &lt;TT>letra de paso</PRE>



<PRE>constante (estilo teletipo)&lt;/TT> se emplea la&nbsp;</PRE>



<PRE>Tag TeleType&lt;/P></PRE>

</TD>



<TD WIDTH="50%">Para escribir con una <TT>letra de paso constante (estilo

teletipo)</TT> se emplea la Tag TeleType.</TD>

</TR>



<TR>

<TD WIDTH="50%">

<PRE>&lt;P>Para que el texto &lt;BLINK>parpadee&lt;/BLINK></PRE>



<PRE>se emplea la TAG Blink.&lt;/P></PRE>

</TD>



<TD WIDTH="50%">Para que el texto <BLINK>parpadee </BLINK>se emplea la

Tag Blink.&nbsp;</TD>

</TR>



<TR>

<TD><TT>&lt;P>T&iacute;tulos: &lt;H1>1&lt;/H1>&lt;H2>2&lt;/H2>&lt;H3>3&lt;/H3></TT>&nbsp;



<P><TT>&lt;H4>4&lt;/H4>&lt;H5>5&lt;/H5>&lt;H6>6&lt;/H6>&lt;/P></TT></TD>



<TD>T&iacute;tulos: <FONT SIZE=+4>1</FONT><FONT SIZE=+3>2</FONT><FONT SIZE=+2>3</FONT><FONT SIZE=+1>4</FONT>5<FONT SIZE=-1>6</FONT></TD>

</TR>



<TR>

<TD><TT>&lt;P>Alineados:&lt;/P></TT>&nbsp;



<P><TT>&lt;P ALIGN="LEFT">Izquierda&lt;/P></TT>&nbsp;



<P><TT>&lt;P ALIGN="RIGHT">Derecha&lt;/P></TT>&nbsp;



<P><TT>&lt;P ALIGN="CENTER">Centrado&lt;/P></TT>&nbsp;



<P><TT>&lt;/P></TT></TD>



<TD>Alineados:&nbsp;



<P>Izquierda&nbsp;

<DIV ALIGN=right>Derecha</DIV>



<CENTER>Centrado</CENTER>

</TD>

</TR>



<TR>

<TD><TT>Otros efectos:&nbsp;</TT>&nbsp;

<BR><TT>&lt;P>&lt;U>subrayado&lt;/U>&nbsp;</TT>&nbsp;

<BR><TT>&lt;P>&lt;STRIKE>tachado&lt;/STRIKE>&nbsp;</TT>&nbsp;

<BR><TT>&lt;P>&lt;BIG>letra m&aacute;s grande que el est&aacute;ndar&lt;/BIG>&nbsp;</TT>&nbsp;

<BR><TT>&lt;P>&lt;SMALL>letra m&aacute;s peque&ntilde;a que el est&aacute;ndar&lt;/SMALL>&nbsp;</TT>&nbsp;

<BR><TT>&lt;P>Texto tipo&lt;SUB>sub&iacute;ndice&lt;/SUB>&nbsp;</TT>&nbsp;

<BR><TT>&lt;P>Texto tipo&lt;SUP>super&iacute;ndice&lt;/SUP></TT></TD>



<TD>Otros efectos:&nbsp;



<P><U>subrayado</U>&nbsp;



<P><STRIKE>tachado&nbsp;</STRIKE>&nbsp;



<P><FONT SIZE=+1>letra m&aacute;s grande que el est&aacute;ndar</FONT>&nbsp;



<P><FONT SIZE=-1>letra m&aacute;s peque&ntilde;a que el est&aacute;ndar</FONT>&nbsp;



<P>Texto tipo<SUB>sub&iacute;ndice</SUB>&nbsp;



<P>Texto tipo<SUP>super&iacute;ndice</SUP></TD>

</TR>

</TABLE>

<FONT SIZE=+1><A HREF="#inicio"></A></FONT>



<P><FONT SIZE=+1><A HREF="#inicio">Volver al inicio</A></FONT>&nbsp;

<HR>

<H3>

<A NAME="listasno"></A>Listas no ordenadas</H3>



<TABLE BORDER WIDTH="100%" >

<TR>

<TH><B>As&iacute; se escribe:</B></TH>



<TH><B>As&iacute; se ve:</B>&nbsp;</TH>

</TR>



<TR>

<TD WIDTH="50%">

<PRE>&lt;P>Las listas no ordenadas:

&lt;UL>

&lt;LI>Van precedidas por "bullets"

&lt;LI>Se entiende que no importa el orden

&lt;LI>Se utilizan con mucha frecuencia

&lt;/UL></PRE>

</TD>



<TD WIDTH="50%">Las listas no ordenadas:&nbsp;

<UL>

<LI>

Van precedidas por "bullets"&nbsp;</LI>



<LI>

Se entiende que no importa el orden&nbsp;</LI>



<LI>

Se utilizan con mucha frecuencia&nbsp;</LI>

</UL>

</TD>

</TR>

</TABLE>

<FONT SIZE=+1><A HREF="#inicio"></A></FONT>



<P><FONT SIZE=+1><A HREF="#inicio">Volver al inicio</A></FONT>&nbsp;

<HR>

<H3>

<A NAME="listasor"></A>Listas ordenadas:</H3>



<TABLE BORDER WIDTH="100%" >

<TR>

<TH><B>As&iacute; se escribe:</B></TH>



<TH><B>As&iacute; se ve:</B>&nbsp;</TH>

</TR>



<TR>

<TD WIDTH="50%">

<PRE>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

Las listas ordenadas:

&lt;P>Las listas ordenadas:

&lt;OL>

&lt;LI>Van precedidas por n&uacute;meros

&lt;LI>La numeraci&oacute;n es autom&aacute;tica

&lt;LI>Son tambi&eacute;n muy utilizadas



&lt;/OL></PRE>

</TD>



<TD WIDTH="50%">Las listas ordenadas:&nbsp;

<OL>

<LI>

Van precedidas por n&uacute;meros&nbsp;</LI>



<LI>

La numeraci&oacute;n es autom&aacute;tica&nbsp;</LI>



<LI>

Son tambi&eacute;n muy utilizadas&nbsp;</LI>

</OL>

</TD>

</TR>

</TABLE>

<FONT SIZE=+1><A HREF="#inicio"></A></FONT>



<P><FONT SIZE=+1><A HREF="#inicio">Volver al inicio</A></FONT>&nbsp;


<HR><A NAME="tablas"></A>Tablas</H3>

Las tablas son uno de los elementos m&aacute;s interesantes de HTML. Permiten,

por ejemplo, escribir texto en varias columnas, hacer listas de equivalencias,

tablas propiamente dichas, etc. Este documento es un ejemplo de las posibilidades

ofrecidas por las tablas.

<TABLE BORDER WIDTH="100%" >

<TR>

<TH><B>As&iacute; se escribe:</B></TH>



<TH><B>As&iacute; se ve:</B>&nbsp;</TH>

</TR>



<TR>

<TD WIDTH="50%">

<PRE>&lt;TABLE BORDER=1>

&lt;TR>&lt;TD>celda (1,1)&lt;/TD>&lt;TD>celda (1,2)&lt;/TD>&lt;/TR>

&lt;TR>&lt;TD>celda (2,1)&lt;/TD>&lt;TD>celda (2,2)&lt;/TD>&lt;/TR>

&lt;/TABLE></PRE>

</TD>



<TD WIDTH="50%">

<TABLE BORDER >

<TR>

<TD>celda (1,1)</TD>



<TD>celda (1,2)</TD>

</TR>



<TR>

<TD>celda (2,1)</TD>



<TD>celda (2,2)</TD>

</TR>

</TABLE>

&nbsp;</TD>

</TR>



<TR>

<TD WIDTH="50%">

<PRE>&lt;CENTER>&lt;TABLE BORDER=1>

&lt;TR>&lt;TD>celda (1,1)&lt;/TD>&lt;TD>celda (1,2)&lt;/TD>&lt;/TR>

&lt;TR>&lt;TD>celda (2,1)&lt;/TD>&lt;TD>celda (2,2)&lt;/TD>&lt;/TR>

&lt;/TABLE>&lt;/CENTER></PRE>

</TD>



<TD WIDTH="50%">

<CENTER><TABLE BORDER >

<TR>

<TD>

<CENTER>celda (1,1)</CENTER>

</TD>



<TD>

<CENTER>celda (1,2)</CENTER>

</TD>

</TR>



<TR>

<TD>

<CENTER>celda (2,1)</CENTER>

</TD>



<TD>

<CENTER>celda (2,2)</CENTER>

</TD>

</TR>

</TABLE></CENTER>

&nbsp;</TD>

</TR>

</TABLE>

&nbsp;

<H3>

<FONT SIZE=+1><A HREF="#inicio">Volver al inicio&nbsp;

<HR width="100%"><A NAME="anclas"></A></A></FONT><B>Anclas</B></H3>

Las anclas son referencias que se emplean en el archivo con el fin de ser

el punto de destino de un <I>link. </I>En el archivo son invisibles pero

al clicar sobre una palabra se&ntilde;alada como <I>link</I>, la visualizaci&oacute;n

de la p&aacute;gina pasa a ser el punto donde se hab&iacute;a definido

el ancla.

<TABLE BORDER WIDTH="100%" >

<TR>

<TH><B>As&iacute; se escribe:</B></TH>



<TH><B>As&iacute; se ve:</B>&nbsp;</TH>

</TR>



<TR>

<TD WIDTH="50%">

<PRE>&lt;P>&lt;A NAME "ancla"></PRE>

</TD>



<TD WIDTH="50%"><A NAME="ancla"></A>&nbsp;</TD>

</TR>

</TABLE>

&nbsp;

<H3>

<FONT SIZE=+1><A HREF="#inicio">Volver al inicio&nbsp;

<HR width="100%"><A NAME="link"></A></A></FONT>Links</H3>

Los <I>links</I> son palabras diferenciadas en un archivo HTML, y tienen

la funci&oacute;n de enviar al usuario a alg&uacute;n ordenador remoto,

o a alg&uacute;n sitio de la p&aacute;gina, que est&eacute; se&ntilde;alada

por un ancla. Los <I>links </I>forman lo que se llama hipertexto.

<TABLE BORDER WIDTH="100%" >

<TR>

<TH><B>As&iacute; se escribe:</B></TH>



<TH><B>As&iacute; se ve:</B>&nbsp;</TH>

</TR>



<TR>

<TD WIDTH="50%">

<PRE>&lt;P>Este link env&iacute;a al Web de la Universidad&lt;P></PRE>



<PRE>&lt;A HREF="http://193.145.249.23">Al Web&lt;/A></PRE>

</TD>



<TD WIDTH="50%">Este link env&iacute;a al Web de la Universidad&nbsp;



<P><A HREF="http://193.145.249.23">Al Web</A>&nbsp;</TD>

</TR>



<TR>

<TD WIDTH="50%">

<PRE>&lt;P>Este link env&iacute;a al ancla&lt;P></PRE>



<PRE>&lt;A HREF="#ancla">Al ancla&lt;/A></PRE>

</TD>



<TD WIDTH="50%">Este link env&iacute;a; al ancla&nbsp;



<P><A HREF="#ancla">Al ancla</A></TD>

</TR>

</TABLE>

&nbsp;

<H3>

<FONT SIZE=+1><A HREF="#inicio">Volver al inicio&nbsp;

<HR width="100%"><A NAME="inimag"></A></A></FONT>Inserci&oacute;n de im&aacute;genes</H3>

Un recurso que da mucha vida a una p&aacute;gina hecha con HTML es la inserci&oacute;n

de elementos gr&aacute;ficos. La forma de insertar una imagen es la siguiente:

<TABLE BORDER WIDTH="100%" >

<TR>

<TH><B>As&iacute; se escribe:</B></TH>



<TH><B>As&iacute; se ve:</B>&nbsp;</TH>

</TR>



<TR>

<TD WIDTH="50%">

<PRE>&lt;IMG SRC="todo.gif"></PRE>

</TD>



<TD WIDTH="50%"><IMG SRC="todo.gif" HEIGHT=100 WIDTH=200></TD>

</TR>

</TABLE>

&nbsp;

<H3>

<FONT SIZE=+1><A HREF="#inicio">Volver al inicio&nbsp;

<HR width="100%"><A NAME="imclic"></A></A></FONT>Im&aacute;genes clicables</H3>

Se pueden unir los dos apartados anteriores, es decir, se puede crear una

imagen que a la vez sea un link. Al clicar sobre la imagen, &eacute;sta

te enviar&aacute; a un documento o un ancla destino.

<TABLE BORDER WIDTH="100%" >

<TR>

<TH><B>As&iacute; se escribe:</B></TH>



<TH><B>As&iacute; se ve:</B>&nbsp;</TH>

</TR>



<TR>

<TD WIDTH="50%">

<PRE>&lt;P>&lt;A HREF="#ancla"></PRE>



<PRE>&lt;IMG SRC="todo.gif"></PRE>



<PRE>&lt;/A></PRE>

</TD>



<TD WIDTH="50%"><A HREF="#ancla"><IMG SRC="todo.gif" HEIGHT=100 WIDTH=200></A></TD>

</TR>

</TABLE>

&nbsp;

<H3>

<FONT SIZE=+1><A HREF="#inicio">Volver al inicio&nbsp;

<HR width="100%">
   
   
<H3>

<A NAME="plantilla"></A>Una plantilla de ayuda</H3>



<TABLE BORDER WIDTH="100%" >

<TR>

<TH><B>As&iacute; se escribe:</B></TH>



<TH><B>As&iacute; se ve:</B>&nbsp;</TH>

</TR>



<TR>

<TD WIDTH="50%">

<PRE>&lt;P>Texto aqu&iacute;</PRE>

</TD>



<TD WIDTH="50%">Texto aqu&iacute;</TD>

</TR>



<TR>

<TD WIDTH="50%">

<PRE>&lt;P>Texto aqu&iacute;</PRE>

</TD>



<TD WIDTH="50%">Texto aqu&iacute;&nbsp;</TD>

</TR>

</TABLE>

<FONT SIZE=+1><A HREF="Curso011.htm#Inicio"></A></FONT>



<P><FONT SIZE=+1><A HREF="Curso01.htm#Inicio">Volver al inicio</A></FONT>

<BR>

<HR WIDTH="100%">

&Uacute;ltima actualizaci&oacute;n: 5 de Marzo de 2020
