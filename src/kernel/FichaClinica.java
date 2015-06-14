package kernel;

public class FichaClinica {
    
    private Integer diabetes;
    private Integer hipertenso;
    private Integer hemofilico;
    private Integer fumante;
    private Integer tratamentoMedico;
    private Integer gravidaOuLactante;
    
    /*
    *Todos os valores da variaveis serão atribuidos a partir de um combo box com sim = 1 e não = 2
    *Será utilizado desta maneira para deixar a aplicação mais leve e minizar a alocação de memória
    *Visando também padronizar e facilitar em caso de implementação de banco de dados
    *LEGENDA
    *0 = <SELECIONE>
    *1 = SIM
    *2 = NÃO
    */
    
    //METODOS SET 
    //<!-- INICIO
    public void setDiabetes(Integer diabetes) {
        this.diabetes = diabetes;
    }

    public void setHipertenso(Integer hipertenso) {
        this.hipertenso = hipertenso;
    }

    public void setHemofilico(Integer hemofilico) {
        this.hemofilico = hemofilico;
    }

    public void setFumante(Integer fumante) {
        this.fumante = fumante;
    }

    public void setTratamentoMedico(Integer tratamentoMedico) {
        this.tratamentoMedico = tratamentoMedico;
    }

    public void setGravidaOuLactante(Integer gravidaOuLactante) {
        this.gravidaOuLactante = gravidaOuLactante;
    }
    // FIM --> METODOS SET
    
    //METODOS GET
    //<!-- INICIO
    public Integer getDiabetes() {
        return diabetes;
    }

    public Integer getHipertenso() {
        return hipertenso;
    }

    public Integer getHemofilico() {
        return hemofilico;
    }

    public Integer getFumante() {
        return fumante;
    }

    public Integer getTratamentoMedico() {
        return tratamentoMedico;
    }

    public Integer getGravidaOuLactante() {
        return gravidaOuLactante;
    }
    // FIM --> METODOS GET
}
