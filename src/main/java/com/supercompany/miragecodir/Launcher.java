/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supercompany.miragecodir;

import com.supercompany.miragecodir.ihm.Canvas;

/**
 *
 * @author FlorianDELSOL
 */
public class Launcher {
    
    private Launcher(){}
    
    public static void main(String[] args){
        Canvas canvas = Canvas.getCanvasInstance();
        canvas.setVisible(true);
    }
    
}
