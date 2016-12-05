/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub.model;

import java.util.ArrayList;


/**
 *
 * @author Melanie
 */
public class CatalogueProduits {
    
    private ArrayList<Article> catalogue;
    
    private CatalogueProduits(){
        
    }
    
    public void ajouterArticle(double prix, String descriptif, boolean achetable){
        int numeroArt = catalogue.size();
        Article nouvelArticle = new Article(numeroArt, prix, descriptif, achetable);
        catalogue.add(nouvelArticle);
    }
    
    private static CatalogueProduits instance;
    
    public static CatalogueProduits getInstance(){
        return instance;
    }
    
    
    
}
