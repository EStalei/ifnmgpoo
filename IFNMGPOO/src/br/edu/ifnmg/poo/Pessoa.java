package br.edu.ifnmg.poo;

/**
 * Teste
 * @author Eike
 */
public class Pessoa {
    private String nome;
    protected Integer id;
    
    public void setNome (String nome){
    this.nome=nome;
    }
    public String getNome (){
        return this.nome;
    }
    
    public void setId (Integer id){
    this.id=id;
    }
    public Integer getId (){
        return this.id;
    }
}

