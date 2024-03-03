package proiect;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class Test_proiect {

	Algoritmul_lui_Dijkstra obj;

	/*@BeforeEach
	void setUp() throws Exception {
		obj = new Algoritmul_lui_Dijkstra();
	}

	@AfterEach
	void tearDown() throws Exception {
		obj = null;
	}*/

	@Test
	public void test_Parcurs1() throws IOException {
		String[] rute_info = Algoritmul_lui_Dijkstra.Parcurs("Timisoara", "Timisoara");
		String[] str = rute_info[0].split(" ");
		assertEquals(str.length, 1);
	}
	
	@Test
	public void test_Parcurs2() throws IOException {
		String[] rute_info = Algoritmul_lui_Dijkstra.Parcurs("Arad", "Arad");
		assertEquals(rute_info[1], String.valueOf(0.0));
	}
	
	@Test
	public void test_Parcurs3() throws IOException {
		String[] rute_info = Algoritmul_lui_Dijkstra.Parcurs("Oradea", "Oradea");
		assertEquals(rute_info[2], String.valueOf(0));
	}
	
	@Test
	public void test_Parcurs4() throws IOException {
		String[] rute_info = Algoritmul_lui_Dijkstra.Parcurs("Cluj-Napoca", "Cluj-Napoca");
		assertEquals(rute_info[3], "Niciuna/Fragil/Pretios/Periculos");
	}
	
	@Test
	public void test_Parcurs5() throws IOException {
		String[] rute_info = Algoritmul_lui_Dijkstra.Parcurs("Sibiu", "Sibiu");
		assertEquals(rute_info[4], "14:00");
	}
	
	@Test
	public void test_Parcurs6() throws IOException {
		String[] rute_info = Algoritmul_lui_Dijkstra.Parcurs("Timisoara", "Arad");
		String[] str = rute_info[0].split(" ");
		assertEquals(str.length, 2);
	}
	
	@Test
	public void test_Parcurs7() throws IOException {
		String[] rute_info = Algoritmul_lui_Dijkstra.Parcurs("Timisoara", "Deva");
		assertEquals(rute_info[1], String.valueOf(154.0));
	}
	
	@Test
	public void test_Parcurs8() throws IOException {
		String[] rute_info = Algoritmul_lui_Dijkstra.Parcurs("Deva", "Timisoara");
		assertEquals(rute_info[2], String.valueOf(115));
	}
	
	@Test
	public void test_Parcurs9() throws IOException {
		String[] rute_info = Algoritmul_lui_Dijkstra.Parcurs("Cluj-Napoca", "Oradea");
		assertEquals(rute_info[3], "Niciuna/Fragil/Pretios/Periculos");
	}
	
	@Test
	public void test_Parcurs10() throws IOException {
		String[] rute_info = Algoritmul_lui_Dijkstra.Parcurs("Oradea", "Cluj-Napoca");
		assertEquals(rute_info[4], "12:00");
	}
	
	@Test
	public void test_Parcurs11() throws IOException {
		String[] rute_info = Algoritmul_lui_Dijkstra.Parcurs("Timisoara", "Cluj-Napoca");
		String[] str = rute_info[0].split(" ");
		assertEquals(str.length, 4);
	}
	
	@Test
	public void test_Parcurs12() throws IOException {
		String[] rute_info = Algoritmul_lui_Dijkstra.Parcurs("Cluj-Napoca", "Timisoara");
		assertEquals(rute_info[1], String.valueOf(324.4));
	}	
	
	@Test
	public void test_Parcurs13() throws IOException {
		String[] rute_info = Algoritmul_lui_Dijkstra.Parcurs("Oradea", "Sibiu");
		assertEquals(rute_info[2], String.valueOf(341));
	}	
	
	@Test
	public void test_Parcurs14() throws IOException {
		String[] rute_info = Algoritmul_lui_Dijkstra.Parcurs("Sibiu", "Oradea");
		assertEquals(rute_info[3], "Niciuna");
	}	
	
	@Test
	public void test_Parcurs15() throws IOException {
		String[] rute_info = Algoritmul_lui_Dijkstra.Parcurs("Deva", "Oradea");
		assertEquals(rute_info[4], "11:00");
	}	
	
	@Test
	public void test_Parcurs16() throws IOException {
		String[] rute_info = Algoritmul_lui_Dijkstra.Parcurs("Timis", "Timis");
		String[] str = rute_info[0].split(" ");
		assertEquals(str.length, 1);
	}	
	
	@Test
	public void test_Parcurs17() throws IOException {
		String[] rute_info = Algoritmul_lui_Dijkstra.Parcurs("timisoara", "oradea");
		assertEquals(rute_info[1], String.valueOf(173.6));
	}
	
	@Test
	public void test_Parcurs18() throws IOException {
		String[] rute_info = Algoritmul_lui_Dijkstra.Parcurs("Timisoara", "Bucuresti");
		assertEquals(rute_info[2], String.valueOf(0));
	}	
	
	@Test
	public void test_Parcurs19() throws IOException { //Fals pozitiv
		String[] rute_info = Algoritmul_lui_Dijkstra.Parcurs("1232", "21312");
		assertEquals(rute_info[3], "Niciuna/Fragil/Pretios/Periculos");
	}	
	
	@Test
	public void test_Parcurs20() throws IOException {
		String[] rute_info = Algoritmul_lui_Dijkstra.Parcurs("t1", "b@");
		assertEquals(rute_info[4], "9:00");
	}
}
