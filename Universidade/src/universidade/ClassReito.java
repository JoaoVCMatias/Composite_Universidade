/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade;

/**
 *
 * @author joaov
 */
public class ClassReito implements IFuncionario {
    private String nomeReito;

    public ClassReito(String nomeReito) {
        this.nomeReito = nomeReito;
    }

    @Override
    public String getNomeFuncionario() {
        return this.nomeReito;
    }

    @Override
    public String getTipoFuncionario() {
        return "Reito";
    }
    
}
