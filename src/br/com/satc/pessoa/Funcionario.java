/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.pessoa;

/**
 *
 * @author Edutec
 */
public abstract class Funcionario extends Pessoa implements IFuncionario {
   
    float bonus, salario, salariof ;
    String cargo,setor;
    Funcionario supervisor;

    public Funcionario getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Funcionario supervisor) {
        this.supervisor = supervisor;
    }

    public float getSalariof() {
        return salariof;
    }

    public void setSalariof(float salariof) {
        this.salariof = salariof;
    }
    
    public Funcionario(String nome, String rg, String cpf, String cargo, String setor, float bonus, float salario) {
        super(nome, rg, cpf);
        this.cargo = cargo;
        this.setor = setor;
        this.bonus = bonus;
        this.salario = salario;
    }
    public float Calcularbonus(float valor, float porcentagem) {
        float bonus;
        bonus = (salario*porcentagem)/100;
        return bonus;
    }
    public void AdicionarBonus(float bonus){
        this.setSalariof(this.salariof + bonus);
        
    }
    
    public void Supervisor(Funcionario supervisor){
       this.setSupervisor(supervisor);
    }
            
    public float getComissao() {
        return bonus;
    }

    public void setComissao(float comissao) {
        this.bonus = comissao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    
   
    
}
