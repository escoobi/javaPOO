package br.com.dio;
/**
 * Vantagens de Usar o Poo
 * Melhor coesão
 * Melhor acoplamento
 * Diminuição do Gap semântico
 * Coletor de lixo
 * *******************
 * 3 Pilares da POO
 * Abstração — Característica de um Objeto
 * Reuso — Reusar códigos já utilizados
 * Encapsulamento — Esconder complexidades e proteger Dados
 **********************************
 * Estrutura básica para poo
 * 1 Classe, são conceitos reais (Abstrata: Venda) ou (Concreta: Livro)
 * 2 Atributo, são características da classe
 * 3 Método, serve para identificar um serviço ou uma ação é oferecido pela Classe
 *      Construtor e Destrutor
 *      Sobrecarga do Método: Mudar a assinatura de acordo com as necessidades
 * 4 Objeto é um conceito de alguma entidade do mundo real e pode ser fisica ou abstrata
 *      é a instancia da Classe
 * 5 Mensagem é a que ativa o método
 * *****************************************
 * Herança é uma extensão de uma super classe ou classe mãe. Com isso podemos utilizar
 *  os métodos e atributos da classe mãe.
 *  Tipos de herança
 *      Simples a filha só tem uma mãe
 *      Mútiplas a filha tem mais de uma mãe
 *      herança upcast e downcast
 *      Polimorfismo, um mesmo método, mas se comportando de formas diferentes.
 *      Sobrescrita0
 * Associação, classse e objetos podem pedir ajudar a outras classe e a outro objetos
 *  Tipo de associação:
 *      Estrutural:
 *          Composição
 *          Agregação
 *      Comportamental:
 *          Dependência
 *
 * Interface
 *
 *
 * */
public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setCor("branco");
        carro.setModelo("uno");
        carro.setCapacidadeTanque(45);


        System.out.println(carro.getCor());
        System.out.println(carro.getModelo());
        System.out.println(carro.getCapacidadeTanque());
        System.out.println(carro.calcularTanque(6.79));

        Carro carro1 = new Carro("uno", "branco", 45);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.calcularTanque(6.79));


        /*Instância do objeto*/
        Funcionario funcionario = new Funcionario();

        /**Upcast*/
        Funcionario gerente = new Gerente();
        Funcionario faxineiro = new Faxineiro();
        Funcionario vendedor = new Vendedor();

        /**Downcast não usar
         * O que tem na classe Funcionário tem na Vendedor, mas as que tem
         * em Vendedor não tem em Funcionário o que apresenta um erro de Cast*/
        //Vendedor vendedor_ = (Vendedor) new Funcionario();


        Mae[] maes = new Mae[]{new Filha(), new FilhaFilha(), new Mae()};

        for (Mae mae: maes){
            mae.metodo1();
        }
        System.out.println("\n");
        for (Mae mae: maes){
            mae.metodo2();
        }
        System.out.println("\n");
        FilhaFilha filhaFilha = new FilhaFilha();
        filhaFilha.metodo2();



    }

}
