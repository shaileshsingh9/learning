interface Camera{
    void takePhoto();
}
interface MusicPlayer{
    void playMusic();
}
class Smartphone implements Camera,MusicPlayer{

    @Override
    public void takePhoto(){
        System.out.println("Taking photo");
    }
    @Override
     public void playMusic(){
        System.out.println("Playing music ");
    }

}

public class MultipleInterfacePolym {
    public static void main(String[] args) {
        Camera camera=new Smartphone();
        camera.takePhoto();
        MusicPlayer musicPlayer=new Smartphone();
        musicPlayer.playMusic();

        Smartphone smartphone=new Smartphone();
        Camera camera1=smartphone;
        MusicPlayer player=smartphone;


    }
}
