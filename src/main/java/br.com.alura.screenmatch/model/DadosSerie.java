package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias; //Lê o termo do Json (entre parênteses) e
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
// se for escrever, ele usa o nome do atributo (ex.: título)

//import com.fasterxml.jackson.annotation.JsonProperty; //Lê e escreve o termo do Json
// (entre parênteses) e também procura um conjunto ou array de nomes

@JsonIgnoreProperties(ignoreUnknown = true) //ignora tudo que não for listado abaixo (Title etc)

public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao) {
                         //@JsonProperty("imdbVotes") String votos)
}

