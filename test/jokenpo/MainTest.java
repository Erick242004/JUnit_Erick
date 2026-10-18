package jokenpo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MainTest {

    private Main jogo;

    @BeforeEach
    public void setUp() {
        jogo = new Main();
    }

    // ---------- Empates ----------

    @Test
    public void empatePapelComPapel() {
        assertEquals(0, jogo.jogar(1, 1));
    }

    @Test
    public void empatePedraComPedra() {
        assertEquals(0, jogo.jogar(2, 2));
    }

    @Test
    public void empateTesouraComTesoura() {
        assertEquals(0, jogo.jogar(3, 3));
    }

    // ---------- Jogador 1 vence ----------

    @Test
    public void jogador1VenceComPapelContraPedra() {
        assertEquals(1, jogo.jogar(1, 2));
    }

    @Test
    public void jogador1VenceComPedraContraTesoura() {
        assertEquals(1, jogo.jogar(2, 3));
    }

    @Test
    public void jogador1VenceComTesouraContraPapel() {
        assertEquals(1, jogo.jogar(3, 1));
    }

    // ---------- Jogador 2 vence ----------

    @Test
    public void jogador2VenceComPapelContraPedra() {
        assertEquals(2, jogo.jogar(2, 1));
    }

    @Test
    public void jogador2VenceComPedraContraTesoura() {
        assertEquals(2, jogo.jogar(3, 2));
    }

    @Test
    public void jogador2VenceComTesouraContraPapel() {
        assertEquals(2, jogo.jogar(1, 3));
    }

    // ---------- Opções inválidas ----------

    @Test
    public void jogador1ComZeroEhInvalido() {
        assertEquals(-1, jogo.jogar(0, 1));
    }

    @Test
    public void jogador1ComQuatroEhInvalido() {
        assertEquals(-1, jogo.jogar(4, 1));
    }

    @Test
    public void jogador1ComValorNegativoEhInvalido() {
        assertEquals(-1, jogo.jogar(-1, 2));
    }

    @Test
    public void jogador2ComZeroEhInvalido() {
        assertEquals(-1, jogo.jogar(1, 0));
    }

    @Test
    public void jogador2ComQuatroEhInvalido() {
        assertEquals(-1, jogo.jogar(1, 4));
    }

    @Test
    public void jogador2ComValorNegativoEhInvalido() {
        assertEquals(-1, jogo.jogar(2, -5));
    }

    @Test
    public void ambosJogadoresInvalidosRetornamInvalido() {
        assertEquals(-1, jogo.jogar(0, 4));
    }

    @Test
    public void jogadasInvalidasIguaisNaoSaoEmpate() {
        assertEquals(-1, jogo.jogar(0, 0));
    }
}
