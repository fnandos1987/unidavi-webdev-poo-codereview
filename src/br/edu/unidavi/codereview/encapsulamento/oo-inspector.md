# Encapsulamento

## Definição
É a técnica utilizada para esconder uma ideia, ou seja, não expôr detalhes internos para o usuário, tornando partes do sistema mais independentes possível.

Artigo: Abstração, Encapsulamento e Herança: Pilares da POO em Java.
Disponível em: http://www.devmedia.com.br/abstracao-encapsulamento-e-heranca-pilares-da-poo-em-java/26366

## Exemplos
Um exemplo dessa definição pode ser visto em uma class Conta Corrente. O usuário não pode ter a possibilidade de alterar seu limite então o atributo deve ser encapsulado de maneira a não ser acessível.

Artigo: Como não aprender Java e Orientação a Objetos: getters e setters.
Disponível em: http://blog.caelum.com.br/nao-aprender-oo-getters-e-setters.

## Ferramenta
1) Restringe o acesso aos atributos da classe.
2) Evita o uso incorreto e modificações na estrutura das classes.
3) Possui métodos possibilitando acesso as atributos que podem ser conhecidos por outras classes.
4) Provê métodos para manipular o estado dos atributos de forma segura.

## Inspeção
1 - class Cliente (Disponível em: http://profdouglas.blogspot.com.br/2012/06/conceito-de-encapsulamento-em-poo-java.html)
1) Sim
2) Sim
3) Sim
4) Sim

2 - class SqlSessionFactoryManager (Disponível em: https://github.com/andreafeccomandi/bibisco/blob/master/bibisco/src/com/bibisco/dao/SqlSessionFactoryManager.java)
1) Sim
2) Sim
3) sim
4) Sim

3 - class CharsetFilter (Disponível em: https://github.com/andreafeccomandi/bibisco/blob/master/bibisco/src/com/bibisco/filters/CharsetFilter.java)
1) Sim
2) Sim
3) Sim
4) Sim

4 - class JettyManager (Disponível em: https://github.com/andreafeccomandi/bibisco/blob/master/bibisco/src/com/bibisco/manager/JettyManager.java)
1) Sim
2) Sim
3) Sim 
4) Sim

5 - class ERDiagramActivator (Disponível em: https://github.com/roundrop/ermasterr/blob/master/src/org/insightech/er/ERDiagramActivator.java)
1) Sim
2) Sim
3) Sim
4) Sim