/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rokshanprog.rokutask.ui;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rasintha_Rukshan
 */
public class ColorThemes {
    
    
    
    private static final Map<String, Map<String, Color>> theme = new HashMap<>();
    
    static {
        // accent color
        Color accent = new Color(0, 173, 181);

        // Light Theme
        Map<String, Color> light = new HashMap<>();
        light.put("primary", accent);
        light.put("background", new Color(245, 245, 245)); // Light gray
        light.put("text", new Color(30, 30, 30)); // Dark text
        light.put("secondary", new Color(255, 255, 255)); // White card or panel
        light.put("border", new Color(200, 200, 200)); // Light border

        // Dark Theme
        Map<String, Color> dark = new HashMap<>();
        dark.put("primary", accent);
        dark.put("background", new Color(24, 26, 27)); // Dark background
        dark.put("text", new Color(230, 230, 230)); // Light text
        dark.put("secondary", new Color(40, 44, 52)); // Panel or card
        dark.put("border", new Color(60, 60, 60)); // Subtle border

        // Add themes to main map
        theme.put("light", light);
        theme.put("dark", dark);
    }
    
}
 