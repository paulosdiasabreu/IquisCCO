package kernel;

import javax.swing.JOptionPane;

public class Dentista  extends Pessoa{
    
    private Integer cro;

    //METODOS SET 
    //<!-- INICIO
    public void setCro(Integer cro) {
        this.cro = cro;
    }
    // FIM --> METODOS SET
    
    //METODOS GET
    //<!-- INICIO
    public Integer getCro() {
        return cro;
    }
    // FIM --> METODOS GET
    
    public void imprimeDados(){
        JOptionPane.showMessageDialog(null,"Dentista:" + super.getNome() +
                                        "\nCRO: " + getCro());
    }
    
}
