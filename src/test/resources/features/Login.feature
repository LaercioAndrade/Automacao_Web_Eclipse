#language: pt
Funcionalidade: Validar Login no site
@test
	Cenario: Realizar login com usuário válido
			Dado que acesso o site
			Quando informo o usuario "standard_user"
			E informo a senha "secret_sauce"
			E clico no botão login
			Então valido se o login foi realizado com sucesso