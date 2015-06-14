package kernel;

public class Pessoa {
    
    private String nome;
    private String CPF;
    private String telefone;
    private String email;
    private String fatorRH;
    private String dataNascimento;
    private Endereco endereco;

    
    //METODOS SET 
    //<!-- INICIO
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFatorRH(String fatorRH) {
        this.fatorRH = fatorRH;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
//    public void setEndereco(Endereco endereco) {
//        this.endereco = endereco;
//    }
    
    public void setEndereco(String rua, Integer numero, String complemento, String bairro, String cep, 
                            String cidade, String estado, String pais){
        Endereco end = new Endereco();
        end.setRua(rua);
        end.setNumero(numero);
        end.setComplemento(complemento);
        end.setBairro(bairro);
        end.setCep(cep);
        end.setCidade(cidade);
        end.setEstado(estado);
        end.setPais(pais);
        
    }
    // FIM --> METODOS SET
    
    //METODOS GET
    //<!-- INICIO
    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getFatorRH() {
        return fatorRH;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }
    // FIM --> METODOS GET

    

    
    
    
    
    
    
}
