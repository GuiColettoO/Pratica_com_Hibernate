package br.com.exemplo.projetogames.principal

import br.com.exemplo.projetogames.dados.AluguelDAO
import br.com.exemplo.projetogames.dados.Banco
import br.com.exemplo.projetogames.dados.GamersDAO
import br.com.exemplo.projetogames.dados.JogosDAO
import br.com.exemplo.projetogames.modelo.Periodo

fun main() {
  val manager = Banco.getEntityManager()
  val jogoDAO = JogosDAO(manager)
  val gamerDAO = GamersDAO(manager)
  val aluguelDAO = AluguelDAO(manager)

  val gamer = gamerDAO.recuperarPeloId(1)
  val jogo = jogoDAO.recuperarPeloId(3)
  val aluguel = gamer.alugaJogo(jogo, Periodo())

  aluguelDAO.adicionar(aluguel)

  val listaAluguel = aluguelDAO.getLista()
  println(listaAluguel)

  manager.close()
}