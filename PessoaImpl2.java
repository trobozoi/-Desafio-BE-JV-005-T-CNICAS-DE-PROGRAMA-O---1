import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import static java.time.temporal.ChronoUnit.YEARS;

public class PessoaImpl2 implements Pessoa {
    private String nome;
    private LocalDate dataNascimento;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public void setDataNascimento(String dataNascimento) {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .appendPattern("dd-MM-")
                .appendValueReduced(ChronoField.YEAR, 2, 2, LocalDate.now().getYear() - 99)
                .toFormatter();
        this.setDataNascimento(LocalDate.parse(dataNascimento, formatter));
    }

    @Override
    public long getIdade(){
        long anos = YEARS.between(this.getDataNascimento(), LocalDate.now());
        return anos;
    }

    @Override
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public PessoaImpl2(String nome, String dataNascimento){
        this.nome = nome;

        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .appendPattern("dd-MM-")
                .appendValueReduced(ChronoField.YEAR, 2, 2, LocalDate.now().getYear() - 99)
                .toFormatter();

        this.dataNascimento = LocalDate.parse(dataNascimento, formatter);
    }
}
