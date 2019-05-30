/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author Carlos Daniel Martinez Durán
 */
public class MyObjectOutputStream extends ObjectOutputStream{

    public MyObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    public MyObjectOutputStream() throws IOException, SecurityException {
        super();
    }
    /**Redefinición del método de escribir la cabecera para que no haga nad
     * @throws java.io.IOException*/
    @Override
    protected void writeStreamHeader() throws IOException{
        
    }
}
