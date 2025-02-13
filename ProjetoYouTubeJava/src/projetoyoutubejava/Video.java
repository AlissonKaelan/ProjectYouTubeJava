/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoyoutubejava;

/**
 *
 * @author Alisson Kaelan
 */
public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao, views, curtida, dislike;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtida = 0;
        this.dislike = 0;
        this.reproduzindo = false;
    }

    
    
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int novaAvaliacao;
        novaAvaliacao = (int) ((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = novaAvaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtida() {
        return curtida;
    }

    public void setCurtida(int curtida) {
        this.curtida = curtida;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtida ++;
    }

    @Override
    public void dislike() {
        this.dislike ++;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo = " + titulo + ", avaliacao = " + avaliacao + ", views = " 
                + views + ", curtida = " + curtida + ", dislike = " + dislike + ", reproduzindo = " + reproduzindo + '}';
    }
    
    
    
}
