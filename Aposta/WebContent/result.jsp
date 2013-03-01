<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
	<head>
		<title> Casa De Apostas Ravagnani</title>
		<link type="text/css" rel="stylesheet" href="estilo.css" />
		<img src="Logo.jpg" />
	</head>
	<body>
			<form action="oi" method="post" >
		<h1>Bem Vindo A Casa De Apostas Ravagnani</h1>
		<h2> Aberto As Apostas Para A Copa Das Confederações</h2>
		<p class="Intro"> Favor Confirme os Seus Dados</br>
		Nome: ${param.nome} </br>
		Sexo: ${param.sexo} </br>
		Email: ${param.email} </br>
		</p>
		<div id="grupoA">
		<p>
		<h3>Primeira Fase Grupo "A"</h3><br/>
		Sábado 15/06 16:00 <img src="brasil.png" />Brasil ${param.Brasil1} X ${param.Japao1} Japão <img src="japao.png" /><br/>
		Domingo 16/06 16:00 <img src="mexico.png" />Mexico ${param.Mexico1} X ${param.Italia1} Itália <img src="italia.png" />	<br/>
		Quarta 19/06 16:00 <img src="brasil.png" />Brasil ${param.Brasil2} X ${param.Mexico2} México <img src="mexico.png" /><br/>
		Quarta 19/06 19:00 <img src="italia.png" />Itália ${param.Italia2} X ${param.Japao2} Japão <img src="japao.png" /><br/>
		Sabado 22/06 16:00 <img src="japao.png" />Japão ${param.Japao3} X ${param.Mexico3} México <img src="mexico.png" /><br/>	
		Sabado 22/06 16:00 <img src="italia.png" />Itália ${param.Italia3} X ${param.Brasil3} Brasil <img src="brasil.png" />
		 </p>
		</div>
		<div id="grupoB">
		<p>
		<h3>Primeira Fase Grupo "B"</h3><br/>
		Domingo 16/06 19:00 <img src="espanha.png" />Espanha ${param.Espanha1} X ${param.Uruguai1} Uruguai <img src="uruguai.png" /><br/>
		Segunda 17/06 16:00 <img src="taiti.png" />Taiti ${param.Taiti1} X ${param.Nigeria1} Nigéria <img src="nigeria.png" />	<br/>
		Quinta 20/06 16:00 <img src="espanha.png" />Espanha ${param.Espanha2} X ${param.Taiti2} Taiti <img src="taiti.png" /><br/>
		Quinta 20/06 19:00 <img src="nigeria.png" />Nigéria ${param.Nigeria2} X ${param.Uruguai2} Uruguai <img src="uruguai.png" /><br/>
		Domingo 23/06 16:00 <img src="nigeria.png" />Nigéria ${param.Nigeria3} X ${param.Espanha3} Espanha <img src="espanha.png" /><br/>	
		Domingo 23/06 16:00 <img src="uruguai.png" />Uruguai ${param.Uruguai3} X ${param.Taiti3} Taiti <img src="taiti.png" /><br/>
		</p>
		</div>
		<p class="submit"> <input type="submit" value="Confirmar" /> <br/></p>
		<footer>© 2013-2013 Todos Os direitos Reservados à André Ravagnani. Contato andreskiter@gmail.com</footer>
	
	</body>
<head>