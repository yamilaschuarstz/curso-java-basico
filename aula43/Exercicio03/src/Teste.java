public class Teste {
    public static void main(String[] args) {
        Animal camelo = new Animal();
        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        camelo.setPatas(4);
        camelo.setAmbiente("Terra");
        camelo.setCor("Amarelo");
        camelo.setVelocidade(2);

        Peixe peixe = new Peixe();
        peixe.setNome("Tubarão");
        peixe.setComprimento(300);
        peixe.setVelocidade(1.5);

        Mamifero urso = new Mamifero();
        urso.setNome("Urso do Canadá");
        urso.setComprimento(180);
        urso.setPatas(4);
        urso.setCor("Vermelho");
        urso.setVelocidade(0.5);
        urso.setAlimento("Mel");

        Animal [] animais = new Animal[3];
        animais[0] = peixe;
        animais[1] = camelo;
        animais[2] = urso;

        System.out.println("Zoo: ");
        System.out.println("----------------");
        for (Animal animal : animais){
            System.out.println(animal.toString());
            System.out.println("----------------");
        }


    }
}