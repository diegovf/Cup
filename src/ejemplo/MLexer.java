/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;
import java.io.File; //Como usamos new File() ocupamos importar esta librería
public class MLexer{
    public static void main(String[] args){
        jflex.Main.generate(new File("src\\ejemplo\\Lexer.flex"));
    }
}