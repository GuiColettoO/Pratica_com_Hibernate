package br.com.exemplo.projetogames.modelo

import jakarta.persistence.Embeddable
import java.time.LocalDate
import java.time.Period

@Embeddable
data class Periodo(
    val dataInicial: LocalDate = LocalDate.now(),
    val dataFinal: LocalDate = LocalDate.now().plusDays(7)) {
    val emDias = Period.between(dataInicial, dataFinal).days
}