package br.com.gpr.gpr_music.principal;

import br.com.gpr.gpr_music.modelos.MinhasPreferidas;
import br.com.gpr.gpr_music.modelos.Music;
import br.com.gpr.gpr_music.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Music minhaMusica = new Music();
        minhaMusica.setTitulo("Não é Normal");
        minhaMusica.setArtista("NXZero");


        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Podpah");
        meuPodcast.setHost("Igão e Mítico");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
