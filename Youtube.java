public class Youtube {
    public static void main(String[] args) {
        Usuario usu1 = new Usuario("Briana Chiñas");
        Video vid1= new Video (6000,"Mi primera chamba en poo y github :v","Https://youtube.com/v0001");
        usu1.SubirVideo(vid1);
        usu1.MostrarInfoUsuario();
        System.out.println("---");
        
        Usuario usu2 = new Usuario ("Ximena Morales");
        Comentario commt1 = new Comentario("Que video mas divertido", usu2);
        
        System.out.println("El usuario: " + usu2.getNombre() + "    Realizo el comentario: " + commt1.getContenido());
               
    }
}