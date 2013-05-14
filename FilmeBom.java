package filmebom;

import java.util.Scanner;

public class FilmeBom {
    private static Scanner in = new Scanner(System.in);
    private static ListaEncadeada l= new ListaEncadeada();

    public static void main(String[] args) {
        showMenu();
    }
    
    public static void showMenu() {
        System.out.println("Digite a opção desejada:");
        System.out.println("1 - Cadastrar DVD");
        System.out.println("2 - Verificar disponibilidade de filme");
        System.out.println("3 - Locação de DVD");
        System.out.println("4 - Devolução de DVD");
        System.out.println("5 - Venda de DVD");
        System.out.println("6 - SAIR");
        
        switch (in.nextInt()) {
            case 1:
                novoDvd();
                break;
            case 2:
                verificarDisponibilidade();
                break;
            case 3:
                locarDvd();
                break;
            case 4:
                devolverDvd();
                break;
            case 5:
                venderDvd();
                break;
            case 6:
                sair();
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
    
    public static void novoDvd() {
        
        Dvd dvd = new Dvd();
        
        System.out.println("Digite o código do dvd");
        dvd.setCodigo(in.nextInt());
        
        System.out.println("Digite o nome do filme");
        dvd.setNome(in.next());
        
        System.out.println("Digite o ano do filme");
        dvd.setAno(in.nextInt());
        
        System.out.println("Digite o estilo do filme");
        dvd.setEstilo(in.next());
        
        dvd.setDisponivel(true);
        
        Node banana = new Node(dvd);
        l.addEnd(banana);
        System.out.println("O dvd foi cadastrado com sucesso");
        
    }
    
    public static void verificarDisponibilidade() {
        
    }

    private static void locarDvd() {
        
    }

    private static void devolverDvd() {
        
    }

    private static void venderDvd() {
        
    }

    private static void sair() {
                
    }
}
