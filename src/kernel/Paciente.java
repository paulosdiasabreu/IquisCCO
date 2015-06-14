package kernel;

public class Paciente extends Pessoa implements ImprimeRelatorio   {
    
    private FichaClinica ficha;

    //METODOS SET 
    //<!-- INICIO
    public FichaClinica getFicha() {
        return ficha;
    }
    // FIM --> METODOS SET
    
    //METODOS GET
    //<!-- INICIO
    public void setFicha(Integer diabetes, Integer hipertenso, Integer hemofilico,
                        Integer fumante, Integer tratamento, Integer gravida) {
        FichaClinica f = new FichaClinica();
        f.setDiabetes(diabetes);
        f.setHipertenso(hipertenso);
        f.setHemofilico(hemofilico);
        f.setFumante(fumante);
        f.setTratamentoMedico(tratamento);
        f.setGravidaOuLactante(gravida);
        
    }
    // FIM --> METODOS GET

    
    public void imprimeDiagnostico() {
        
    }

    
    public void imprimeProcedimento() {
        
        
    }
    
    
    
}
