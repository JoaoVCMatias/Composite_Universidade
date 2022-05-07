/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidade;

/**
 *
 * @author joaov
 */
public class Universidade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CompositeFuncionario universidade1 = new CompositeFuncionario();
        
        universidade1.addFuncionario(new ClassReito("Joao"));
        universidade1.addFuncionario(new ClassDiretor("Pedro"));
        universidade1.addFuncionario(new ClassDiretorGeral("Manoel"));
        
        universidade1.getListaFuncionarios();
    }
    
}
