# Conversor de Moedas

## Descrição do Projeto

O Conversor de Moedas é um software desenvolvido em Java que permite converter valores entre diferentes moedas utilizando a API ExchangeRate-API. Ele fornece uma interface interativa para o usuário selecionar a moeda de origem e a moeda de destino, além de informar o valor a ser convertido. A taxa de câmbio é obtida em tempo real a partir da API, garantindo a precisão dos valores convertidos.

## Funcionalidade do Projeto

### Exemplo Visual

Ao executar o programa, o usuário verá um menu como este:

Seja Bem-Vindo ao Conversor de Moeda =)

    1) Dólar =>> Peso Argentino

    2) Peso Argentino =>> Dólar

	3) Dólar =>> Real Brasileiro

	4) Real Brasileiro =>> Dólar

	5) Dólar =>> Peso Colombiano

	6) Peso Colombiano =>> Dólar

	7) Sair

Escolha uma opção válida:


O programa continua em execução até que o usuário escolha a opção "7) Sair".

Após escolher uma opção, o usuário deve digitar o valor que deseja converter. O programa exibirá o resultado da conversão, como no exemplo abaixo:

	Digite o valor que deseja converter:
	100
	Valor 100 USD corresponde ao valor final de =>>> 9300 ARS


## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal utilizada para desenvolver o software.
- **ExchangeRate-API**: API utilizada para obter as taxas de câmbio em tempo real.
- **Gson**: Biblioteca Java para converter objetos Java em sua representação JSON e vice-versa.
- **Java HttpClient**: Biblioteca para fazer requisições HTTP e obter os dados da API.
