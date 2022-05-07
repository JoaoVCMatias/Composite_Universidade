/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade;

import java.util.ArrayList;

/**
 *
 * @author joaov
 */
public class CompositeFuncionario {
    private ArrayList<IFuncionario> listaFuncionarios = new ArrayList<IFuncionario>();

    public void addFuncionario(IFuncionario func){
        listaFuncionarios.add(func);
        System.out.println("Funcionario Cadastrado Com Sucesso!");
    }

    public void getListaFuncionarios() {
        for(int i = 0; i < listaFuncionarios.size(); i++){
            System.out.println(listaFuncionarios.get(i).getNomeFuncionario()+ " / " + listaFuncionarios.get(i).getTipoFuncionario());
        }
    }
    
    
    
}
