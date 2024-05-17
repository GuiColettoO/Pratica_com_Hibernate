package br.com.exemplo.projetogames.principal

import br.com.exemplo.projetogames.dados.Banco
import br.com.exemplo.projetogames.dados.GamersDAO
import br.com.exemplo.projetogames.dados.PlanosDAO
import br.com.exemplo.projetogames.modelo.Gamer

fun main(){
  val gamer = Gamer("Monica", "monica@email.com", "15/03/1995", "moni")

  val manager = Banco.getEntityManager()
  val gamerDAO = GamersDAO(manager)
  val planosDAO = PlanosDAO(manager)

  gamer.plano = planosDAO.recuperarPeloId(3)

  gamerDAO.adicionar(gamer)

  val listaGamersBanco = gamerDAO.getLista()
  println(listaGamersBanco)

  manager.close()
}