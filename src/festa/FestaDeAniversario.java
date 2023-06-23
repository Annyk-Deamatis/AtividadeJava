package festa;
public abstract class FestaDeAniversario {
    private String nomeAniversariante;
    private int idadeAniversariante;
    private String local;
    private int numeroConvidados;
    private boolean temBolo;

    public String getNomeAniversariante() {
        return nomeAniversariante;
    }

    public void setNomeAniversariante(String nomeAniversariante) {
        this.nomeAniversariante = nomeAniversariante;
    }

    public int getIdadeAniversariante() {
        return idadeAniversariante;
    }

    public void setIdadeAniversariante(int idadeAniversariante) {
        this.idadeAniversariante = idadeAniversariante;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getNumeroConvidados() {
        return numeroConvidados;
    }

    public void setNumeroConvidados(int numeroConvidados) {
        this.numeroConvidados = numeroConvidados;
    }

    public boolean isTemBolo() {
        return temBolo;
    }

    public void setTemBolo(boolean temBolo) {
        this.temBolo = temBolo;
    }

    public static void main(String[] args) {
        // Criando uma instância de FestaDeAniversario
        FestaDeAniversario festa = new FestaDeAniversario() {
            @Override
            public void realizarFesta() {
                // Implementação vazia, já que é uma classe abstrata
            }
        };

        // Definindo os atributos utilizando os setters
        festa.setNomeAniversariante("João");
        festa.setIdadeAniversariante(30);
        festa.setLocal("Salão de Festas");
        festa.setNumeroConvidados(50);
        festa.setTemBolo(true);

        // Obtendo os atributos utilizando os getters e exibindo-os
        System.out.println("Nome do Aniversariante: " + festa.getNomeAniversariante());
        System.out.println("Idade do Aniversariante: " + festa.getIdadeAniversariante() + " anos");
        System.out.println("Local: " + festa.getLocal());
        System.out.println("Número de Convidados: " + festa.getNumeroConvidados());
        System.out.println("Tem Bolo: " + (festa.isTemBolo() ? "Sim" : "Não"));
    }

    public abstract void realizarFesta();
}