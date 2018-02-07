/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eindopdracht_blok_6;

/**
 *
 * @author jeroe
 */
public class VirusHost {
    private String Host_id; 
    private String Hostname;
    private String Virus_id;
    private String Virusname;
    private String VirusClass;
   
    
    //hier worden de variabelen gedefineerd zodat er vervolgens data in opgeslagen kan worden. 
    VirusHost(String H_id, String Hname,String V_id,String Vname,String VClass ){
        this.Host_id = H_id; 
        this.Hostname = Hname;
        this.Virus_id = V_id;
        this.Virusname = Vname;
        this.VirusClass = VClass;
        
       
       
    //in onderstaande functies worden de setters en getters beschreven //    
    }

    public void setHost_id(String Host_id) {
        this.Host_id = Host_id;
    }

    public void setHostname(String Hostname) {
        this.Hostname = Hostname;
    }

    public void setVirus_id(String Virus_id) {
        this.Virus_id = Virus_id;
    }

    public void setVirusname(String Virusname) {
        this.Virusname = Virusname;
    }

    public void setVirusClass(String VirusClass) {
        this.VirusClass = VirusClass;
    }
    public String getH_ID(){
        return this.Host_id;
        
        
    }
    public String getHostname(){
        return this.Hostname;
    }
      public String getV_ID(){
        return this.Virus_id;
        
        
    }
      public String getVirusname(){
        return this.Virusname;
      }
      public String getVirusClass(){
        return this.VirusClass;
      }
}

