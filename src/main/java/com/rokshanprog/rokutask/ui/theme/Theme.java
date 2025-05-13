/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rokshanprog.rokutask.ui.theme;

import com.rokshanprog.rokutask.ui.theme.ThemeColor;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;

/**
 *
 * @author Rasintha_Rukshan
 */
public class Theme {
    
    static final Map<String, ThemeColor> theme = new HashMap();
    
    static ThemeColor accent = new ThemeColor(0, 173, 181);
    
    // Light them
    public static void setLight() {
        theme.put("primary", accent);
        theme.put("secondary", new ThemeColor(255, 255, 255)); // White card or panel
        theme.put("background", new ThemeColor(245, 245, 245)); // Light gray
        theme.put("text", new ThemeColor(30, 30, 30)); // Dark text
        theme.put("border", new ThemeColor(200, 200, 200)); // Light border
    }
    
    // Dark them
    public static void setDark() {
        theme.put("primary", accent);
        theme.put("secondary", new ThemeColor(40, 44, 52)); // Panel or card
        theme.put("background", new ThemeColor(24, 26, 27)); // Dark background
        theme.put("text", new ThemeColor(230, 230, 230)); // Light text
        theme.put("border", new ThemeColor(60, 60, 60)); // Subtle border
    }
    
    public static void loadThem() {
        
    }
    
    public static void saveThem() {
        Gson gson = new Gson();
        String themConfig = gson.toJson(theme);
        System.out.println(themConfig);
    }
    
}
 