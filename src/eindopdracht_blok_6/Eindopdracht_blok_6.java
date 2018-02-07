/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eindopdracht_blok_6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author jeroe
 */
public class Eindopdracht_blok_6 {
    File selectedFile;
    

    
    public  void main(String[] args) {
        try{
         String line;
         BufferedReader reader = new BufferedReader(new FileReader(selectedFile));
        line = reader.readLine();
        ArrayList<VirusHost> Viruslijst = new ArrayList<>(); 
         while ((line = reader.readLine()) != null) {
             
                String curLine = reader.readLine();
                String[] splitted = curLine.split("\t",-1);
                String Virus_id  = splitted[0].trim() ;
                String Host_id  = splitted[7].trim() ;
                String Hostname = splitted[8].trim();
                String VirusName = (splitted[1].trim()) ;
                String VirusClass = (splitted[2].trim());
                VirusHost V = new VirusHost(Virus_id, Hostname,Host_id,VirusName,VirusClass);
                Viruslijst.add(V);
           
         }
       
        
         
             
        
     }
     catch(FileNotFoundException e){ System.out.println("Bestand niet gevonden");}
     catch(IOException e){System.out.println("Fout lezen van regel");
        
    }
    
}}
