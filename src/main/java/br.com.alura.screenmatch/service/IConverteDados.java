package br.com.alura.screenmatch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe); //cabeçalho utilizando Generics do
    // Java, que usamos quando o método usará mais de um tipo de dados (a especificação
    // do tipo de dado será feita na chamada como, p ex., na linha 23 da
    // classe ScreemmatchApplication
}
