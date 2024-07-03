import java.util.Scanner;

public class FerragistaTerminal {

  @SuppressWarnings({ "resource", "unused" })
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double prego = 0.10, parafuso = 0.15, rebite = 0.05, martelo =
      25.90, serrote = 47.53, tekBond = 18.80, rebitadora = 28.48, trena =
      28.90, alicate = 28.90, escada = 369.90, total, total_parcela;
    double vl_prego = 0, vl_parafuso = 0, vl_rebite = 0, vl_martelo =
      0, vl_serrote = 0, vl_tekBond = 0, vl_rebitadora = 0, vl_trena =
      0, vl_alicate = 0, vl_escada = 0;
    int qtd_prego, qtd_parafuso, qtd_rebite, qtd_martelo, qtd_serrote, qtd_tekBond, qtd_rebitadora, qtd_trena, qtd_alicate, qtd_escada, produto, pag, frmPag, parcela, v_parcela;
    String nome, continuar = "", numCar, cvv, cdc;

    System.out.println(
      "Bom dia seja bem vindo a ferragista online Tek Bonders"
    );
    System.out.print("Digite seu nome para fazer o cadastro: ");
    nome = ler.next();
    System.out.println("Quais produtos você vai levar hoje " + nome + "? ");
    System.out.println("Digite o respectivo número para cada produto!!: "
    );

    while (!"n".equals(continuar)) {
      System.out.println(
        "\nAqui está nosso catálogo:\n 1. Prego por 0.10 \n 2. Parafuso por 0.15 \n 3. Rebite por 0.05 \n 4. Martelo por 25.90 \n 5. Serrote por 47.53 \n 6. TekBond por 18.80 \n 7. Rebitadora por 28.48 \n 8. Alicate por 25.90 \n 9. Trena por 28.90 \n 10. Escada por 369.90"
      );
      System.out.println("Digite o número do produto: ");
      produto = ler.nextInt();

      switch (produto) {
        case 1:
          System.out.println("Qual a quantidade de prego(s)?: ");
          qtd_prego = ler.nextInt();
          vl_prego = prego * qtd_prego;
          System.out.println(
            "O valor em que você terá que pagar em prego(s) será de: " +
            vl_prego
          );
          break;
        case 2:
          System.out.println("Qual a quantidade de parafuso(s): ");
          qtd_parafuso = ler.nextInt();
          vl_parafuso = parafuso * qtd_parafuso;
          System.out.println(
            "O valor em que você terá que pagar em parafuso(s) será de: " +
            vl_parafuso
          );
          break;
        case 3:
          System.out.println("Qual a quantidade de rebite(s)?: ");
          qtd_rebite = ler.nextInt();
          vl_rebite = rebite * qtd_rebite;
          System.out.println(
            "O valor em que você terá que pagar em rebite(s) será de: " +
            vl_rebite
          );
          break;
        case 4:
          System.out.println("Qual a quantidade de martelo(s)?: ");
          qtd_martelo = ler.nextInt();
          vl_martelo = martelo * qtd_martelo;
          System.out.println(
            "O valor em que você terá que pagar em martelo(s) será de: " +
            vl_martelo
          );
          break;
        case 5:
          System.out.println("Qual a quantidade de serrote(s)?: ");
          qtd_serrote = ler.nextInt();
          vl_serrote = serrote * qtd_serrote;
          System.out.println(
            "O valor em que você terá que pagar em serrote(s) será de: " +
            vl_serrote
          );
          break;
        case 6:
          System.out.println("Qual a quantidade de tek Bond(s)?: ");
          qtd_tekBond = ler.nextInt();
          vl_tekBond = tekBond * qtd_tekBond;
          System.out.println(
            "O valor em que você terá que pagar em tek Bond(s) será de: " +
            vl_tekBond
          );
          break;
        case 7:
          System.out.println("Qual a quantidade de rebitadora(s)?: ");
          qtd_rebitadora = ler.nextInt();
          vl_rebitadora = rebitadora * qtd_rebitadora;
          System.out.println(
            "O valor em que você terá que pagar em rebitadora(s) será de: " +
            vl_rebitadora
          );
          break;
        case 8:
          System.out.println("Qual a quantidade de alicate(s)");
          qtd_alicate = ler.nextInt();
          vl_alicate = alicate * qtd_alicate;
          System.out.println(
            "O valor em que você terá que pagar em alicate(s) será de: " +
            vl_alicate
          );
          break;
        case 9:
          System.out.println("Qual a quantidade de trenas(s)");
          qtd_trena = ler.nextInt();
          vl_trena = trena * qtd_trena;
          System.out.println(
            "O valor em que você terá que pagar em trena(s) será de: " +
            vl_trena
          );
          break;
        case 10:
          System.out.println("Qual a quantidade de escada(s)");
          qtd_escada = ler.nextInt();
          vl_escada = escada * qtd_escada;
          System.out.println(
            "O valor em que você terá que pagar em escada(s) será de: " +
            vl_escada
          );
          break;
        default:
          System.out.println("Produto inexistente");
          break;
      }
      System.out.println("Quer comprar mais algum produto <s/n>");
      continuar = ler.next();
    }

    total =
      vl_prego +
      vl_parafuso +
      vl_rebite +
      vl_martelo +
      vl_serrote +
      vl_tekBond +
      vl_rebitadora +
      vl_alicate +
      vl_trena +
      vl_escada;
    System.out.println(
      nome + " o valor total da sua compra ficou em: " + total
    );
    System.out.println(
      "Qual a forma de pagamento? \n 1. Dinheiro \n 2. Cartão \n 3. Pix"
    );
    pag = ler.nextInt();

    switch (pag) {
      case 1:
        if (total > 20) {
          System.out.println(
            "Em dinheiro o preço fica em " +
            (total - 5) +
            " pode pagar lá no caixa"
          );
        } else {
          System.out.println(
            "O valor total ficou esse mesmo, pode passar lá no caixa"
          );
        }
        break;
      case 2:
        System.out.println("\n 1. Débito \n 2. Crédito");
        frmPag = ler.nextInt();
        if (frmPag == 2) {
          System.out.println("Vai querer parcelar? \n 1. Sim \n 2. Não");
          parcela = ler.nextInt();
          if (parcela == 1) {
            System.out.println("Em quantas vezes?:");
            v_parcela = ler.nextInt();
            total_parcela = (total / v_parcela);
            System.out.println(
              "Parcelado em " + v_parcela + " fica em: " + total_parcela
            );
          }
        }
        System.out.println("Insira os dados do cartão: ");
        System.out.println("Qual o número do cartão: ");
        numCar = ler.next();
        System.out.println("Qual a validade do cartão: ");
        cvv = ler.next();
        System.out.println("Qual o código de segurança: ");
        cdc = ler.next();
        break;
        
      case 3:
        System.out.println("Pode mandar o Pix pra ***.***.***-**");
        break;
     
      default:
        System.out.println("Forma de pagamento inválida");
        break;
    }
    System.out.println("Pagamento realizado com sucesso!!!");
    System.out.println("Obrigo por comprar na Tek Bonders, volte sempre!!!");
  }
}
