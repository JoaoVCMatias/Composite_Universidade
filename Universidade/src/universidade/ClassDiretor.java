/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade;

/**
 *
 * @author joaov
 */
public class ClassDiretor implements IFuncionario {
    private String nomeDiretor;

    public ClassDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }
    
    @Override
    public String getNomeFuncionario() {
        return this.nomeDiretor;
    }

    @Override
    public String getTipoFuncionario() {
        return "Diretor";
    }
    
}
