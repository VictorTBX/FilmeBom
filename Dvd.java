package filmebom;

import java.util.Calendar;

public class Dvd {
    private int codigo;
    private String nome;
    private int ano;
    private String estilo;
    private boolean disponivel;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo < 0) {
            throw new IllegalArgumentException("codigo deve ser maior que zero");
        }

        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        nome = nome.trim();

        if (nome.equals("")) {
            throw new IllegalArgumentException("nome não pode ser vazio");
        }

        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano < 1800) {
            throw new IllegalArgumentException("ano deve ser maior que 1800");
        }

        if (ano > Calendar.getInstance().get(Calendar.YEAR)) {
            throw new IllegalArgumentException("ano não deve ser maior que o ano atual");
        }
        
        this.ano = ano;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
