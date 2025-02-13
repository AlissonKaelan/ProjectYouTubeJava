/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoyoutubejava;

/**
 *
 * @author Alisson Kaelan
 */
public class ProjetoYouTubeJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Video v[] = new Video[3];
        v[0] = new Video("Teste01");
        v[1] = new Video("Gameplay Gof of wars");
        v[2] = new Video("Video Clip musical sing");
        
        
        Usuario u[] = new Usuario[2];
        u [0] = new Usuario("Jose", "M", 18, 0, "Jose1234");
        u [1] = new Usuario("Creuza", "F", 24, 0, "creuz023");
       
        
       Visualizacao vis[] = new Visualizacao[5];//Jose
       vis[0] = new Visualizacao(u[1], v[2]);//creuza assistiu video 2
       vis[0].avaliar();
       System.out.println(vis[0].toString());
        
        
    }
    
}
