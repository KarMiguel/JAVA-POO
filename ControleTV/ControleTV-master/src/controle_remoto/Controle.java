package controle_remoto;

public class Controle implements Controlador {

    private int volume;
    private boolean ligado;
    private boolean tocando;

    public Controle() {
        this.volume = 50;
        this.ligado = false;
        this.tocando =  false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    public boolean setLigado(boolean ligado) {
        return this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
        this.setTocando(true);
        System.out.println("Controle Ligado com sucesso");

        }

    @Override
    public void desligar() {
        this.setLigado(false);
        this.setTocando(false);
        System.out.println("Controle Desligado ");
    }

    @Override
    public void abrirMenu() {
        System.out.println("----------MENU----------");
        System.out.println("Esta ligado? "+this.getLigado());
        System.out.println("Esta tocando? "+this.getTocando());
        System.out.print("Volume: "+this.getVolume());
        for(int i = 0;i<this.getVolume();i+=10){
            System.out.print(" | ");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("\nFechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 5);
            System.out.println("Volume aumentado com sucesso!!");

        }else{
            System.out.println("Impossivel aumentar Volume!!");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 5);
            System.out.println("Volume abaixado com sucesso!!");
        }else{
            System.out.println("Impossivel diminuir Volume!!");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume()>0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume()==0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
       if(this.getLigado() && !(this.getTocando())){
                this.setTocando(true);
                System.out.println("Play acionado !! ");
        }else{
            System.out.println("Play ja esta ligado!!");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
                this.setTocando(false);
                System.out.println("Pause acionado !!");
        }else{
            System.out.println("Ja esta pausado!!");
        }
    }
}
