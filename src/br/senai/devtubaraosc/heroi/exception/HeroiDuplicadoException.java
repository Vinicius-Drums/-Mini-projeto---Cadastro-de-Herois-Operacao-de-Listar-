// Pacote para as exceções relacionadas aos heróis
package br.senai.devtubaraosc.heroi.exception;

// Exceção para indicar que um herói com o mesmo nome já está cadastrado
public class HeroiDuplicadoException extends Exception {
    // Construtor que recebe a mensagem de erro
    public HeroiDuplicadoException(String mensagem) {
        super(mensagem);
    }
}
