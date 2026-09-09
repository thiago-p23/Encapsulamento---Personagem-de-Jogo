public class Personagem {

    private String nome;
    private int vida;
    private int energia;
    private int nivel;

    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
        this.energia = 100;
        this.nivel = 1;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getEnergia() {
        return energia;
    }

    public int getNivel() {
        return nivel;
    }

    public void receberDano(int dano) {
        if (dano <= 0) {
            System.out.println("O dano deve ser maior que zero.");
            return;
        }

        vida -= dano;

        if (vida < 0) {
            vida = 0;
        }

        System.out.println(nome + " recebeu " + dano + " de dano.");
    }

    public void descansar() {
        if (vida == 0) {
            System.out.println(nome + " está derrotado e não pode descansar.");
            return;
        }

        energia += 30;

        if (energia > 100) {
            energia = 100;
        }

        System.out.println(nome + " descansou e recuperou energia.");
    }

    public void atacar() {
        int custoEnergia = 20;

        if (vida == 0) {
            System.out.println(nome + " está derrotado e não pode atacar.");
            return;
        }

        if (energia < custoEnergia) {
            System.out.println(nome + " não possui energia suficiente para atacar.");
            return;
        }

        energia -= custoEnergia;

        System.out.println(nome + " atacou!");
        System.out.println("Energia restante: " + energia);
    }

    public String getStatus() {
        if (vida > 0) {
            return "Vivo";
        }

        return "Derrotado";
    }
}