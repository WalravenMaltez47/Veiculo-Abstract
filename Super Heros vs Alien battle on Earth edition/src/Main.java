import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner prompt = new Scanner(System.in);

        // setting a vida (hp)
        MuqueMan muqueMan = new MuqueMan(200);
        RaioLaser raioLaser = new RaioLaser(200);
        Relampago relampago = new Relampago(200);
        EvilAlien evilAlien = new EvilAlien(200);


        // Escolha do personagem
        System.out.println("Escolha seu personagem: ");
        System.out.println("1 - Muque-Man");
        System.out.println("2 - Raio-Laser");
        System.out.println("3 - Relâmpago");
        int escolhaDoPersonagem = prompt.nextInt();

        System.out.println("digite 'start' para comecar");
        String start = prompt.next();


        if (start.equals("start")) {
            int dado;
            int Round;
            String golpe;

            switch (escolhaDoPersonagem) {
                case 1:
                    for (Round = 1; Round <= 6; Round++) {
                        // tipo de golpe
                        System.out.println("x para 'Chute'");
                        System.out.println("y para 'Tornado'");
                        System.out.println("z para 'Berserker'");
                        golpe = prompt.next();

                        System.out.println("Vez do Muque-Man.. Jogando os dados..");
                        dado = prompt.nextInt(); // sera trocado por random

                        if (dado == 1 || dado == 2) {
                            System.out.println("Alien sofreu +10 de dano de Muque-Man e agora esta com " + evilAlien.dano(10) + " hp ");
                        } else if (dado >= 3 && dado <= 5) {
                            System.out.println("Alien sofreu +10 de dano de Muque-Man e agora esta com " + evilAlien.dano(20) + " hp ");
                        } else if (dado == 6) {
                            System.out.println("Alien sofreu +10 de dano de Muque-Man e agora esta com " + evilAlien.dano(40) + " hp ");
                        }

                        System.out.println("Vez do Alien.. Jogando os dados..");
                        dado = prompt.nextInt(); // sera trocado por random
                        if (dado == 1 || dado == 2) {
                            System.out.println("Muque-Man sofreu +10 de dano de Alien e agora esta com " + muqueMan.dano(10) + " hp ");
                        } else if (dado >= 3 && dado <= 5) {
                            System.out.println("Muque-Man sofreu +10 de dano de Alien e agora esta com " + muqueMan.dano(20) + " hp ");
                        } else if (dado == 6) {
                            System.out.println("Muque-Man sofreu +10 de dano de Alien e agora esta com " + muqueMan.dano(40) + " hp ");
                        }

                        // special ability
                        System.out.println("abilidade especial do Muque-Man lhe concede +5 de hp, agora ele esta com " + muqueMan.habilidadeEspecial(5) + " hp ");

                    } break;

                case 2:
                    for (Round = 1; Round <= 6; Round++) {
                        // tipo de golpe
                        System.out.println("x para 'Chute'");
                        System.out.println("y para 'Tornado'");
                        System.out.println("z para 'Berserker'");
                        golpe = prompt.next();

                        System.out.println("Vez do Muque-Man.. Jogando os dados..");
                        dado = prompt.nextInt(); // sera trocado por random

                        if (dado == 1 || dado == 2) {
                            System.out.println("Alien sofreu +10 de dano de Muque-Man e agora esta com " + evilAlien.dano(10) + " hp ");
                        } else if (dado >= 3 && dado <= 5) {
                            System.out.println("Alien sofreu +10 de dano de Muque-Man e agora esta com " + evilAlien.dano(20) + " hp ");
                        } else if (dado == 6) {
                            System.out.println("Alien sofreu +10 de dano de Muque-Man e agora esta com " + evilAlien.dano(40) + " hp ");
                        }

                        System.out.println("Vez do Alien.. Jogando os dados..");
                        dado = prompt.nextInt(); // sera trocado por random
                        if (dado == 1 || dado == 2) {
                            System.out.println("Muque-Man sofreu +10 de dano de Alien e agora esta com " + muqueMan.dano(10) + " hp ");
                        } else if (dado >= 3 && dado <= 5) {
                            System.out.println("Muque-Man sofreu +10 de dano de Alien e agora esta com " + muqueMan.dano(20) + " hp ");
                        } else if (dado == 6) {
                            System.out.println("Muque-Man sofreu +10 de dano de Alien e agora esta com " + muqueMan.dano(40) + " hp ");
                        }

                        // special ability
                        ////

                    } break;

                case 3:
                    for (Round = 1; Round <= 6; Round++) {
                        // tipo de golpe
                        System.out.println("x para 'Chute'");
                        System.out.println("y para 'Tornado'");
                        System.out.println("z para 'Berserker'");
                        golpe = prompt.next();

                        System.out.println("Vez do Muque-Man.. Jogando os dados..");
                        dado = prompt.nextInt(); // sera trocado por random

                        if (dado == 1 || dado == 2) {
                            System.out.println("Alien sofreu +10 de dano de Muque-Man e agora esta com " + evilAlien.dano(10) + " hp ");
                        } else if (dado >= 3 && dado <= 5) {
                            System.out.println("Alien sofreu +10 de dano de Muque-Man e agora esta com " + evilAlien.dano(20) + " hp ");
                        } else if (dado == 6) {
                            System.out.println("Alien sofreu +10 de dano de Muque-Man e agora esta com " + evilAlien.dano(40) + " hp ");
                        }

                        System.out.println("Vez do Alien.. Jogando os dados..");
                        dado = prompt.nextInt(); // sera trocado por random
                        if (dado == 1 || dado == 2) {
                            System.out.println("Muque-Man sofreu +10 de dano de Alien e agora esta com " + muqueMan.dano(10) + " hp ");
                        } else if (dado >= 3 && dado <= 5) {
                            System.out.println("Muque-Man sofreu +10 de dano de Alien e agora esta com " + muqueMan.dano(20) + " hp ");
                        } else if (dado == 6) {
                            System.out.println("Muque-Man sofreu +10 de dano de Alien e agora esta com " + muqueMan.dano(40) + " hp ");
                        }

                        // special ability
                        /////

                    } break;

            }

            // DETERMINAR QUEM VENCEU:
            if (muqueMan.getVidaFinal() > evilAlien.getVidaFinal()) {
                System.out.println("O vencedor e Muqueman");
            } else if (muqueMan.getVidaFinal() < evilAlien.getVidaFinal()) {
                System.out.println("O vencedor e Alien");
            } else {
                System.out.println("empate");
            }
        }
    }
}