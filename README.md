# Desafio de Automacao :dart:

<b>Integrantes:</b></br>
	<ul>
		<li>Luciene Borges</li>
		<li>Luiza Gusmão</li> 
		<li>Michele Farias</li> 
		<li>Noelen Giovanna</li>
		<li>Patricia Silva</li> 
		<li>Priscila Cardoso</li>
    <li>Robert Bernardo </li>
	</ul> 
<br>



# O desafio: uma aplicação de testes com Selenium, Cucumber e JUnit :memo:
Validação no site da Accenture utilizando Cucumber, JUnit, Selenium WebDriver em Java.

- [x] <b>Caso de teste 1</b>
	>*Acessar o site da accenture e aceitar os cookies do LGPD.<br>*
	<br>
	<b>Cenário:</b> Aceitar o cookie LGPD <br>
	dado que eu estou no site da accenture <br>
	E abro as configurações de cookies <br>
	E clico em Confirmar minhas escolhas <br>
  Então deve fechar o modal <br>
	<br>
	<b>Cenário:</b> Configurações do cookie <br>
	dado que eu estou no site da accenture <br>
	E abro as configurações de cookies <br>
	E clico em Confirmar minhas escolhas <br>
  e clico em configurações de cookie <br>
	Então devo ver o item de "sua privacidade" <br>
	E devo ver "Cookies estritamente necessárias" <br>
	e devo ver "Cookies Analíticos de Primeira Parte" <br>
	e devo ver "Cookies de Desempenho e Cookies Funcionais" <br>
	e devo ver "Cookies de Publicidade e Redes Sociais" <br>
	<br> <br>

- [x] <b>Caso de teste 2</b>
	>*Acessar o site da accenture a mostrar a lista de serviços.<br>*
	<br>
	<b>Cenário:</b> listar serviços da Accenture <br>
	dado que eu estou no site da accenture <br>
	e clico no menu serviços <br>
	Então devo ver os serviços abaixo <br>
	-	| Accenture Strategy | <br>
	-	| Application Services | <br>
	-	| Artificial Intelligence | <br>
	-	| Automation | <br>
	-	| Business Process Services | <br>
	-	| Change Management | <br>
	-	| Cloud | <br>
	-	| Customer Experience | <br>
	-	| Data & Analytics | <br>
	-	| Ecosystem Partners | <br>
	-	| Finance Consulting | <br>
	-	| Industry X | <br>
	-	| Infrastructure | <br>
	-	| Marketing | <br>
	-	| Mergers & Acquisitions (M&A) | <br>
	-	| Operating Models | <br>
	-	| Security | <br>
	-	| Supply Chain Management | <br>
	-	| Sustainability | <br>
	-	| Technology Consulting | <br>
	-	| Technology Innovation | <br>
	-	| Zero Based Budgeting (ZBB) | <br>	
 <br>
	<b>Cenário:</b> Clicar no serviço cloud <br>
	dado que eu estou no site da accenture <br>
	e clico no menu serviços <br>
	e clico no item do menu cloud <br>
	Então devo encontrar o título "Serviços de Cloud"<br>
	<br> <br>
  
- [x] <b> Caso de teste 3</b>
	>*Acessar a lista de carreiras da accenture.<br>*
	<br>
	<b>Cenário:</b> Acessar o item de vagas de tecnologia <br>
	dado que eu estou no site da accenture <br>
	e clico no menu carreiras <br>
	e clico no item do menu vagas em tecnologia <br>
	Então devo ver o destaque em "Carreiras em Tecnologia" <br>
	<br>
	<b>Cenário:</b> Procurando uma vaga <br>
	dado que eu estou no site da accenture <br>
	e digito no campo de busca "desenvolvedor" <br>
	e clico no botão procurar <br>
	Então devo encontrar vagas para programadores <br>
	 <br> <br>

- [x] <b>Caso de teste 4</b>
	>*Sobre a accenture.<br>*
	<br>
	<b>Cenário:</b> Ver as características da accenture <br>
	dado que eu estou no site da accenture <br>
	e clico no menu sobre a accenture <br>
	e clico no item do menu sobre a accenture <br>
	Então devo ver o destaque em "Nosso propósito" <br>
	<br>
  
## Tecnologias utilizadas :computer:

:heavy_check_mark: <b>Java</b><br>
Linguagem de programação para desenvolvimento da aplicação <br>

:heavy_check_mark: <b>Cucumber</b><br>
Framework responsável por traduzir uma linguagem humana em código Java<br>

:heavy_check_mark: <b>JUnit</b><br>
Framework responsável pela criação e manutenção do código para a automação de testes com apresentação dos resultados.<br>

:heavy_check_mark: <b>Selenium</b><br>
Framework responsável por fazer a integração do código java com a linguagem Gherkin(Cucumber) abrindo o browser fazendo o teste de comportamento<br>



