package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;              /*Eu implemento, escrevendo @JsonIgnoreProperties(ignoreUnknow = true).
                                                                            Assim, definimos que tudo o que não for encontrado seja ignorado*/
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao
                         /*@JsonProperty("imdbVotes") String votos*/ ) {
}

// @JsonAlias - serve para eu dizer para aplicação terá um apilido para cada descrição dos dados da minha série;
// @JsonProsperty - serve para desserializar quanto serializar, no uso da aplicação acima ele iria ler imdbVotes
// e retornar o que lê. Ele serve para os dois caminhos.
