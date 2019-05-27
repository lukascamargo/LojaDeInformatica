/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import View.VendasView;
import View.CadastroProdutoView;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author pedro.areichmann
 */
public class LojaDeInformatica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LojaDeInformatica.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //VendasView v = new VendasView();
        CadastroProdutoView v = new CadastroProdutoView();
        v.setVisible(true);
    }
    
}
