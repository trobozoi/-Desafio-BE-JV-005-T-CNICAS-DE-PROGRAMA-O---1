import java.time.LocalDate;

public interface Pessoa {
    String getNome();

    void setNome(String nome);

    LocalDate getDataNascimento();

    void setDataNascimento(String dataNascimento);

    long getIdade();

    void setDataNascimento(LocalDate dataNascimento);
}
