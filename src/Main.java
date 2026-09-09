public class Main {

    public static void main(String[] args) {

        Personagem personagem = new Personagem("Guerreiro");

        System.out.println("=== STATUS INICIAL ===");
        mostrarStatus(personagem);

        System.out.println("\n=== TESTE DE ATAQUE ===");
        personagem.atacar();
        mostrarStatus(personagem);

        System.out.println("\n=== TESTE DE DESCANSO ===");
        personagem.descansar();
        mostrarStatus(personagem);

        System.out.println("\n=== TESTE DE DANO ===");
        personagem.receberDano(40);
        mostrarStatus(personagem);

        System.out.println("\n=== TESTE DE ATAQUES ===");

        personagem.atacar();
        personagem.atacar();
        personagem.atacar();
        personagem.atacar();
        personagem.atacar();

        mostrarStatus(personagem);

        System.out.println("\n=== TESTE DE DANO FATAL ===");
        personagem.receberDano(100);
        mostrarStatus(personagem);

        System.out.println("\n=== TESTE DE ATAQUE DERROTADO ===");
        personagem.atacar();

        System.out.println("\n=== TESTE DE DESCANSO DERROTADO ===");
        personagem.descansar();

        mostrarStatus(personagem);
    }

    public static void mostrarStatus(Personagem personagem) {

        System.out.println("Nome: " + personagem.getNome());
        System.out.println("Vida: " + personagem.getVida());
        System.out.println("Energia: " + personagem.getEnergia());
        System.out.println("Nível: " + personagem.getNivel());
        System.out.println("Status: " + personagem.getStatus());
    }
}