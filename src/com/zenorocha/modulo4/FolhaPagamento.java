/*
 * Modulo 3
 * Projeto e Construcao de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 30/03/2011
 * 
 * --------------------------------------------------------------------------------------------
 * 
 * Programa Folha de Pagamento � Pessoas e Empresas
 * 
 * 	Gere uma nova vers�o do programa anterior, considerando o seguinte design: As classes
 * 	Empregado* implementam uma interface IElementoFolha. A interface IElementoFolha
 * 	estende duas interfaces: IPagamento e INome.
 * 	A interface IPagamento possui a seguinte opera��o:getPagamentoLiquido e getRegime.
 * 		
 * 		� A opera��o getPagamentoLiquido retorna o pagamento l�quido conforme as f�rmulas
 * 		de c�lculo definidas anteriormente.
 * 		� A opera��o getTipo retorna o tipo do elemento para impress�o na folha (Horista, Assalariado, Bonificado).
 * 
 * 	A interface INome possui a opera��o getNome.
 * 	Modifique tamb�m a classe FolhaPagamento de forma que o array n�o seja mais da
 * 	superclasse Empregado, mas sim um array de IElementoFolha, ou seja, de objetos que implementem esta interface.
 * 	Uma vez que a nova vers�o do programa esteja funcionando, agora com interfaces, fa�a a seguinte extens�o:
 * 	Crie uma classe Empresa que tamb�m implementar� a interface IElementoFolha, com
 * 	nome, um valor bruto, uma taxa de IR e uma taxa de ISS como descontos.
 * 	
 * 	O valor l�quido de uma empresa � dado pela seguinte f�rmula: Valor Bruto * (1 � taxaIR � taxaISS).
 * 	A implementa��o da opera��o getRegime de empresa dever� retornar o string �Pessoa Jur�dica�.
 * 
 * 	Modifique a classe FolhaPagamento de forma a imprimir uma rela��o de pagamentos a
 * 	serem efetuados, considerando horistas, assalariados, bonificados e empresas. Para tal,
 * 	inicialize o vetor de elementos do tipo IElementoFolha definido em FolhaPagamento para
 * 	que tenha 3 elementos de cada tipo, ou seja, 3 horistas, 3 assalariados, 3 bonificados e 3 empresas.
 * 
 */

package com.zenorocha.modulo4;

public class FolhaPagamento {

    private IElementoFolha[] vetorEmpregados;
    
    public FolhaPagamento() {
    	vetorEmpregados = new IElementoFolha[12];
    }
    
    public IElementoFolha[] getVetorEmpregados() {
    	return this.vetorEmpregados;
    }
    
    public IElementoFolha getVetorEmpregados(int indice) {
    	return this.vetorEmpregados[indice];
    }
    
    public void setVetorEmpregados(int indice, IElementoFolha empregado) {
    	this.vetorEmpregados[indice] = empregado;
    }
    
    public void Print() {
    	for (int i = 0; i < this.vetorEmpregados.length; i++) {
    		System.out.println(this.vetorEmpregados[i].getNome() + " - " + this.vetorEmpregados[i].getRegime() + " - " + this.vetorEmpregados[i].getPagamentoLiquido());
    	}
    }
    
    public static void main(String[] args) {
    	
    	EmpregadoAssalariado empregado01 = new EmpregadoAssalariado("Joao", 1000f, 0.07f);
    	EmpregadoAssalariado empregado02 = new EmpregadoAssalariado("Carlos", 2000f, 0.07f);
    	EmpregadoAssalariado empregado03 = new EmpregadoAssalariado("Antonio", 3000f, 0.15f);
    	
    	EmpregadoBonificado empregado04 = new EmpregadoBonificado("Maria", 6000f, 0.27f, 0.1f);
    	EmpregadoBonificado empregado05 = new EmpregadoBonificado("Jose", 3500f, 0.15f, 0.4f);
    	EmpregadoBonificado empregado06 = new EmpregadoBonificado("Lais", 1435f, 0.24f, 0.05f);
    	
    	EmpregadoHorista empregado07 = new EmpregadoHorista("Juliano", 10, 30);
    	EmpregadoHorista empregado08 = new EmpregadoHorista("Marcos", 50, 20);
    	EmpregadoHorista empregado09 = new EmpregadoHorista("Roberto", 35, 20);

        Empresa empresa01 = new Empresa(30000f, 0.3f, 0.1f);
        Empresa empresa02 = new Empresa(90000f, 0.4f, 0.3f);
        Empresa empresa03 = new Empresa(70000f, 0.35f, 0.2f);
    	
    	FolhaPagamento folhaPagamento = new FolhaPagamento();
    	
    	folhaPagamento.setVetorEmpregados(0, empregado01);
    	folhaPagamento.setVetorEmpregados(1, empregado02);
    	folhaPagamento.setVetorEmpregados(2, empregado03);
    	folhaPagamento.setVetorEmpregados(3, empregado04);
    	folhaPagamento.setVetorEmpregados(4, empregado05);
    	folhaPagamento.setVetorEmpregados(5, empregado06);
    	folhaPagamento.setVetorEmpregados(6, empregado07);
    	folhaPagamento.setVetorEmpregados(7, empregado08);
    	folhaPagamento.setVetorEmpregados(8, empregado09);
        folhaPagamento.setVetorEmpregados(9, empresa01);
    	folhaPagamento.setVetorEmpregados(10, empresa02);
    	folhaPagamento.setVetorEmpregados(11, empresa03);
    	
    	folhaPagamento.Print();
    	
    }
}
