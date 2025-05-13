/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rokshanprog.rokutask.ui.theme;

import java.awt.Color;

/**
 *
 * @author Rasintha_Rukshan
 */
public class ThemeColor {
    public int r, g, b;
    
    // Constracter 
    public ThemeColor(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
    
    // Constracter
    public ThemeColor(Color c) {
        this.r = c.getRed();
        this.g = c.getGreen();
        this.b = c.getBlue();
    }
    
    public Color toColor() {
        return new Color(r, g, b);
    }
}
