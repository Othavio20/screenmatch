package br.com.othavio.screenmatch.service;

public interface IConverteDados {
    <T>T obterDados(String json, Class<T> classe);
}
