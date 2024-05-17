package br.com.exemplo.projetogames.principal

import br.com.exemplo.projetogames.dados.Banco
import br.com.exemplo.projetogames.dados.JogosDAO
import br.com.exemplo.projetogames.modelo.Jogo

fun main() {
    val jogo = Jogo("The Last of Us Part I", "https://cdn.cloudflare.steamstatic.com/steam/apps/1888930/header.jpg?t=1686864554", 5.99,"Uma aventura pós-apocalíptica de sobrevivência em um mundo infestado por zumbis e facções em conflito.")
    val jogo2 = Jogo("The Last of Us Part I", "https://cdn.cloudflare.steamstatic.com/steam/apps/1888930/header.jpg?t=1686864554", 5.99,"Uma aventura pós-apocalíptica de sobrevivência em um mundo infestado por zumbis e facções em conflito.")

    val manager = Banco.getEntityManager()
    val jogoDao = JogosDAO(manager)
//    jogoDao.adicionar(jogo)

    val jogoRecuperado = jogoDao.recuperarPeloId(2)
    println(jogoRecuperado)

    jogoDao.apagar(2)

    val listaJogos: List<Jogo> = jogoDao.getLista()
    println(listaJogos)

    manager.close()
}