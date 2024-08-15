package br.com.alura.screenmatch.service;

public interface IConverteDados{
    <T> T obterDados (String json, Class<T> classe);

    // No java, Como não sabemos qual será o retorno, usamos o Generics no início dessa mesma linha escrevemos <T> T
    //Usamos o <T> T justamente quado não sabemos qual entidade será devolvida.
}
