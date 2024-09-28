/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sio.paris2024.model;

import java.util.ArrayList;

/**
 *
 * @author zakina
 */
public class Epreuve {
    
    private int id;
    private String nom ;
    private Sport sport ;
    private ArrayList<Athlete> athletes ;

    public Epreuve() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public ArrayList<Athlete> getAthletes() {
        return athletes;
    }

    public void setAthletes(ArrayList<Athlete> athletes) {
        this.athletes = athletes;
    }
    
    public void addAthlete(Athlete a){
        if (athletes == null){
            athletes = new ArrayList<Athlete>();
        }
        athletes.add(a);
    }
    
    public int getNbAthletes(){
        return athletes.size();
    }
    
    
}
