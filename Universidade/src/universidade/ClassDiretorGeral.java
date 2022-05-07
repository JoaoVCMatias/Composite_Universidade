/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade;

/**
 *
 * @author joaov
 */
public class ClassDiretorGeral implements IFuncionario {
    private String nomeDiretorGeral;

    public ClassDiretorGeral(String nomeDiretorGeral) {
        this.nomeDiretorGeral = nomeDiretorGeral;
    }
    
    
    @Override
    public String getNomeFuncionario() {
        return this.nomeDiretorGeral;
    }

    @Override
    public String getTipoFuncionario() {
        return "Diretor Geral";
    }
    
}
