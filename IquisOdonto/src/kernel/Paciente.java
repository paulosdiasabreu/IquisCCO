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
    public void setFicha(FichaClinica ficha) {
        this.ficha = ficha;
    }
    // FIM --> METODOS GET

    
    public void imprimeDiagnostico() {
        
    }

    
    public void imprimeProcedimento() {
        
        
    }
    
    
    
}
