/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tony
 */
public class Student {

    int id;  
    int credithours;  
    int points;  
    double GPA;

    public void setID(int n) 
    {  
    id = n;  
    } 

    public void setCreditHours(int n) 
    {  
    credithours = n;  
    } 

    public void setPoints(int n) 
    {  
    points = n;  
    } 

    public void setGPA(double d) 
    {  
    GPA = d;  
    } 

    public int getID() 
    {  
    return id;  
    } 

    public int getCreditHours() 
    {  
    return credithours;  
    } 

    public int getPoints() 
    {  
    return points;  
    } 

    public double getGPA() 
    { 
    if (credithours > 0) { 
            GPA = (points / credithours); 
        } else { 
            GPA = 0.0; 
        } 
        return GPA;  
    } 
    
    }


