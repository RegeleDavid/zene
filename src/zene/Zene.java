/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zene;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
/**
 *
 * @author Dávid
 */
public class Zene {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileInputStream FIS;
            BufferedInputStream BIS;
            Player player;
            player = new Player(new BufferedInputStream(new FileInputStream("D:\\adatok\\Music\\a.mp3")));
            player.play();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
}
