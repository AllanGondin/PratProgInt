package br.paises.com;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;




@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaisesTest {
//	Paises paises = new Paises();
	//Paises copia = new Paises();
	Paises paises,copia;
	static int id = 0;
	static long populacao;
	static double area;
	static String nome;
	

	/*
	 * Antes de rodar este teste, certifique-se que nao ha no banco nenhuma linha
	 * com o id igual ao do escolhido para o to instanciado abaixo. Se houver,
	 * delete. Certifique-se também que sobrecarregou o equals na classe Cliente.
	 * Certifique-se que a fixture cliente1 foi criada no banco. Além disso, a ordem
	 * de execução dos testes é importante; por isso a anotação FixMethodOrder logo
	 * acima do nome desta classe
	 */
	
	@Before
	public void setUp() throws Exception {
		System.out.println("\nsetup");
		paises = new Paises(id, "Brazil", 1246700, 12878.00);
		copia = new Paises(id, "Brazil", 1246700, 12878.00);
		System.out.println(paises);
		System.out.println(copia);
		System.out.println(id);
	}

	@Test
	public void test00Carregar() {
		System.out.println("\ncarregar");
//para funcionar o cliente 1 deve ter sido carregado no banco por fora
		Paises fixture = new Paises(2, "Canada", 1235466899, 8898966.30);
		Paises novo = new Paises(2, null, 0, 0);
		novo.carregar();
		assertEquals("testa inclusao", novo, fixture);
	}
	@Test
	public void test01Criar() {
		System.out.println("\ncriar");
		paises.criar();
		id = paises.getId();
		System.out.println(id);
		copia.setId(id);
		System.out.println("--------------------------------------------");
		System.out.println(paises);
		System.out.println(copia);
		System.out.println("--------------------------------------------");
		assertEquals("testa criacao", paises, copia);
	}
	

	@Test
	public void test02Atualizar() {
		System.out.println("\natualizar");
		paises.setId(1);
		copia.setId(1);
		paises.setArea(9.9);
		copia.setArea(9.9);
		paises.atualizar();
		paises.carregar();
		System.out.println("--------------------------------------------");
		System.out.println(paises);
		System.out.println(copia);
		System.out.println("--------------------------------------------");
		assertEquals("testa atualizacao", paises, copia);
	
	}

	@Test
	public void test03Excluir() {
		System.out.println("\nexcluir");
		copia.setId(0);
		copia.setNome(null);
		copia.setPopulacao(0);
		copia.setArea(0.0);
		paises.excluir();
		paises.carregar();
		System.out.println("--------------------------------------------");
		System.out.println(paises);
		System.out.println(copia);
		System.out.println("--------------------------------------------");
		assertEquals("testa exclusao", paises, copia);
	}
	
	@Test
	public void test04menorArea() {
		System.out.println("\nMenor Area");
//para funcionar o cliente 1 deve ter sido carregado no banco por forassss
		paises.menorArea();
		area = paises.getArea();
		nome = paises.getNome();
		copia.setArea(area);
		copia.setNome(nome);
		System.out.println("--------------------------------------------");
		System.out.println(paises);
		System.out.println(copia);
		System.out.println("--------------------------------------------");
		assertEquals("testa a menor area", copia, paises);
	}
	
	@Test
	public void test04maiorPopulacao() {
		System.out.println("\nMaiorPopulação");
		paises.maiorPopulacao();
		populacao = paises.getPopulacao();
		nome = paises.getNome();
		copia.setPopulacao(populacao);
		copia.setNome(nome);
		System.out.println("--------------------------------------------");
		System.out.println(paises);
		System.out.println(copia);
		System.out.println("--------------------------------------------");
		assertEquals("Testa o menor valor da tabela", copia, paises);
	}
	
	@Test
	public void test05testarVetor() {
		System.out.println("\nVetor 3 Paises");
		Paises[] vetor = Paises.tresPaises();
		for (Paises paises : vetor) {
			id = paises.getId();
			area = paises.getArea();
			nome = paises.getNome();
			populacao = paises.getPopulacao();
			copia.setId(id);
			copia.setArea(area);
			copia.setNome(nome);
			copia.setPopulacao(populacao);
			System.out.println("--------------------------------------------");
			System.out.println(paises);
			System.out.println(copia);
			System.out.println("--------------------------------------------");
			assertEquals("Testa o menor valor da tabela", copia, paises);
		}
	}
}

