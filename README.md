#DesafiosBeca-MoniqueParente

#Desafio(1) Beca : Modelo Conceitual


Nome: Monique Parente Lima.|
Categoria: CJ Junior – Center.| 
Mentor: Flavius Gama.
______________________________________________________________________________________________________________________________________________________________________________
1.	Pensamentos Iniciais de Estruturação.
2.	Resumo da aplicação.
3.	Modelagem de dados.
4.	Ferramentas.
5.	Frameworks.
______________________________________________________________________________________________________________________________________________________________________________
1.	Pensamentos Iniciais de Estruturação.

Para introduzir alguns pensamentos nesse tópico devemos planejar algumas estratégias que de início podem parecer imaturas porém vão se tornar mais concretas, ágeis e compactas para evitar erros de execução.  

Algumas dicas para estruturação de um sistema, pensar de forma objetiva, escolher um substantivo adequado para definir uma entidade, utilizar de raciocínio lógico inspirado em programação orienta objeto e por fim verificar a normalização. Existem diversos ambientes nos quais podem ser utilizados para realizar um Modelo de Entidade Relacional (MER), alguns exemplos: Workbench, BrModelo, Draw.oi, entre outros.

2.	Resumo da Aplicação

	Plano de Negócios.
A aplicação MP Peças tem como objetivo proporcionar a venda de produtos que integram a montagem de um computador e seus periféricos.
	Escopo do Produto
O produto final consiste no site MP Peças a aplicação proporciona ao proprietário de um estabelecimento cadastrar produtos e que o funcionário realize vendas.

![MODELOCONCEITUALWORKBENCH.png](MODELOCONCEITUAL-WORKBENCH.png)
 
 IDE utilizada na modelagem: Workbench.

Conclusão, o usuário deste site poderá efetuar uma venda enquanto entrar em contato com o site através da classe venda, poderá pesquisar se um produto existe em estoque para assim poder solicitar que a classe produto ligada a estoque retorne a classe venda a informação de código referente ao produto pesquisado, dessa forma a partir da classe venda com o código do produto validado no estoque vai ser possível adicionar ao carrinho para finalização da venda.
•	Premissas: 
- Aplicação será desenvolvida de Segunda-Feira às Sextas-Feiras em horário comercial.
•	Restrições:
- Tratamento de erros relacionados ao desenvolvimento e versionamento.

3.	Ferramentas
- GitHub.
- Intelij.
- Workbench.

4.	Frameworks
- JPA.
- Sprint Boot.
