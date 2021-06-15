#language: pt
 #encoding: utf-8
 
 Funcionalidade: Acessar o site da accenture e aceitar os cookies do LGPD
  
  	Cenario: Configurações do cookie
				Dado que estou no site da accenture
				Quando abro as configurações de cookies
				Quando clico em Confirmar minhas escolhas
				Quando clico em configurações de cookie
				Entao devo ver o item de "sua privacidade"
				E devo ver "Cookies estritamente necessárias"
				E devo ver "Cookies Analíticos de Primeira Parte"
				E devo ver "Cookies de Desempenho e Cookies Funcionais"
				E devo ver "Cookies de Publicidade e Redes Sociais"		
	