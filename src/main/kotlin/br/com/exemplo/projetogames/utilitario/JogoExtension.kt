package br.com.exemplo.projetogames.utilitario

import br.com.exemplo.projetogames.dados.JogoEntity
import br.com.exemplo.projetogames.modelo.InfoJogoJson
import br.com.exemplo.projetogames.modelo.Jogo

fun InfoJogoJson.criaJogo(): Jogo {
    return Jogo(this.titulo, this.capa, this.preco, this.descricao)
}

fun Jogo.toEntity(): JogoEntity {
    return JogoEntity(this.titulo, this.capa, this.preco, this.descricao, this.id)
}

fun JogoEntity.toModel(): Jogo {
    return Jogo(this.titulo, this.capa, this.preco, this.descricao, this.id)
}