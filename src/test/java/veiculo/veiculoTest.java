package veiculo;

import static br.ce.wcaquino.utils.Metodos.Abastecer;
import static br.ce.wcaquino.utils.Metodos.Acelerar;
import static br.ce.wcaquino.utils.Metodos.Desligar;
import static br.ce.wcaquino.utils.Metodos.Frear;
import static br.ce.wcaquino.utils.Metodos.Ligar;
import static br.ce.wcaquino.utils.Metodos.Pintar;
import static br.ce.wcaquino.utils.Metodos.estadoAtual;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import br.ce.wcaquino.Exceptions.DeveAcelerarException;
import br.ce.wcaquino.Exceptions.DeveLigarException;
import br.ce.wcaquino.entidades.VeiculoObjeto;

public class veiculoTest {

	private VeiculoObjeto v;

	@Before
	public void antesTeste() {
		v = new VeiculoObjeto("Honda", "NSX", "ABC-1234", "vermelho", (float) 300, false, 0, 0, 20000);
	}

	@Test
	public void DeveLigarTeste() throws DeveLigarException {

		Ligar(v);

		assertTrue(v.getIsLigado());
	}

	@Test
	public void DeveDesligarTeste() throws Exception {

		Desligar(v);

		assertFalse(v.getIsLigado());
	}

	@Test
	public void DeveAcelerarTeste() throws DeveAcelerarException {

		int v1 = 20;

		Abastecer(20, v);
		Ligar(v);

		try {
			Acelerar(10, v);
			fail();
		} catch (Throwable e) {
			assertThat(v1 + 10, is(v.getVelocidade()));
		}
	}

	@Test
	public void NaoDeveAcelerarDesligadoTeste() throws Exception {

		int v1 = 0;

		try {
			Acelerar(10, v);
			fail();
		} catch (Throwable e) {
			assertThat(v1, is(v.getVelocidade()));
			// System.out.println(v.getVelocidade());
		}
	}

	@Test
	public void NaoDeveDesligarEmMovimentoTeste() throws Exception {

		Abastecer(20, v);
		// estadoAtual(v);
		Ligar(v);
		Acelerar(10, v);

		try {
			// estadoAtual(v);
			Desligar(v);
			fail();
		} catch (Throwable e) {
			// estadoAtual(v);
			assertThat(v.getIsLigado(), is(true));
		}
	}

	@Test
	public void NaoDeveAcelerarSemGasosaTeste() throws Exception {

		Ligar(v);
		// estadoAtual(v);

		try {
			// estadoAtual(v);
			Acelerar(10, v);
			fail();
		} catch (Throwable e) {
			// estadoAtual(v);
			assertThat(v.getVelocidade(), is(0));
		}
	}

	@Test
	public void NaodeveFrearParadoTeste() throws Exception {

		int v1 = v.getVelocidade();
		Ligar(v);

		estadoAtual(v);

		try {
			// estadoAtual(v);
			Frear(v);
			fail();
		} catch (Throwable e) {
			// estadoAtual(v);
			assertThat(v.getVelocidade(), is(v1));
		}
	}

	@Test
	public void PintarTeste() throws Exception {

		try {
			// estadoAtual(v);
			Pintar("Preto", v);
			fail();
		} catch (Throwable e) {
			// estadoAtual(v);
			assertThat(v.getCor(), is("Preto"));
		}
	}

}
