# language: pt
	# encoding: utf-8
	
	Funcionalidade: Acessar a lista de carreiras da Accenture
	
		Cenário: Procurando uma vaga
			Dado que eu estou no site da Accenture
			Quando acesso a area de carreiras
			E clico em procurar vagas
			E digito no campo de busca <carreira>
			E clico no botão procurar
			Então devo encontrar vagas para <vagas>
				
		Exemplos:
 			  |carreira				 |vagas					 |
  		  |"desenvolvedor" |"Desenvolvedor FullStack"|
  
