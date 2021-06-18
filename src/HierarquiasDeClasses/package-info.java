/*
 * Hierarquias de classes
Voc� j� aprendeu que objetos se associam entre si, por exemplo, na composi��o de um carro (todo), 
que se associa com o motor, rodas, portas etc. (suas partes); ou na agrega��o de um objeto, que pode 
ou n�o estar dentro de uma embalagem.

Entretanto, quando procuramos entender o mundo � nossa volta, tamb�m agrupamos os objetos por suas 
caracter�sticas. Um exemplo cl�ssico est� na biologia: quando estudamos os animais, os subdividimos 
em reinos, filos, ra�as etc. Assim, sabemos que c�es e gatos s�o bichos completamente diferentes, mas 
guardam similaridades por serem ambos mam�feros. Embora a biologia tenha essa hierarquia definida formalmente, 
n�s fazemos o tempo todo uma organiza��o mais informal, como no exemplo ilustrado na Figura 1, nesse caso para 
organizar diferentes tipos de ve�culos:

Figura 1 � Hierarquia dos ve�culos
Fonte: Autores (2021).


Observe que:

Carros, ônibus e motos possuem características diferentes: no número de rodas, capacidade de passageiros
 etc. Porém, várias similares: a impulsão usa um motor, o deslocamento é sobre rodas etc. e isso permite 
 entendê-las como veículos automotores.
Isso significa que um carro ou moto possuem as mesmas características e operações que um veículo automotor,
 pois eles são um tipo mais específico deste tipo de veículo (especialização).
Da mesma forma, os veículos automotores e os impulsionados podem agrupados como veículos, uma vez que 
podem deslocar pessoas livremente de um ponto a outro (generalização).
Classes mais gerais também são chamadas de “superclasses” ou “classes pai”, analogamente, as mais
 específicas são chamadas de “subclasses ou classes filhas”. Exemplo: meio de locomoção é uma 
 superclasse de patins.
Especializa��o e generaliza��o
Observe este exemplo de hierarquia, representado com UML: as rela��es de heran�a s�o indicadas pelo
 s�mbolo do 
tri�ngulo vazado, que aponta para a classe pai, ou superclasse. 

Nesse caso, a leitura do diagrama acompanha o sentido da hierarquia:

Da subclasse para a superclasse � a generaliza��o: vai para a classe mais geral, ou gen�rica.
Da superclasse para a subclasse � a especializa��o: vai para a classe mais espec�fica.
 */
package HierarquiasDeClasses;