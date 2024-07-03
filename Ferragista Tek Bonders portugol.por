programa {
  funcao inicio() {
    real prego, parafuso, rebite, martelo, serrote, tekBond, rebitadora, total, total_parcela, trena, alicate, escada
    real vl_prego, vl_parafuso, vl_rebite, vl_martelo, vl_serrote, vl_tekBond, vl_rebitadora, vl_trena, vl_alicate, vl_escada
    inteiro qtd_prego, qtd_parafuso, qtd_rebite, qtd_martelo, qtd_serrote, qtd_tekBond, qtd_rebitadora, qtd_trena, qtd_alicate, qtd_escada, produto, pag, frmPag, parcela, v_parcela
    cadeia nome, cvv, numCar, cdc
    caracter continuar

    prego = 0.10
    parafuso = 0.15
    rebite = 0.05
    martelo = 25.90
    serrote = 47.53
    tekBond = 18.80
    rebitadora = 28.48
    trena = 28.90
    alicate = 28.90
    escada = 369.90

    vl_martelo = 0
    vl_parafuso = 0
    vl_prego = 0 
    vl_rebitadora = 0 
    vl_rebite = 0 
    vl_serrote = 0
    vl_tekBond = 0 
    vl_trena = 0
    vl_alicate = 0
    vl_escada = 0

    escreva("Bom dia seja bem vindo a ferragista online Tek Bonders")
    escreva("\nDigite seu nome para fazer o cadastro: ")
    leia(nome)
    escreva ("\nQuais produtos você vai levar hoje ", nome, "?")
    escreva ("\nDigite o respectivo número para cada produto!!: ")

    faca {
    limpa()
    escreva ("\nAqui está nosso catálogo:\n 1. Prego por 0.10 \n 2. Parafuso por 0.15 \n 3. Rebite por 0.05 \n 4. Martelo por 25.90 \n 5. Serrote por 47.53 \n 6. TekBond por 18.80 \n 7. Rebitadora por 28.48 \n 8. Alicate por 25.90 \n 9. Trena por 28.90 \n 10. Escada por 369.90\n")
    escreva("Digite o número do produto: ")
    leia (produto)
    
    escolha (produto){
      caso 1:
        escreva("Qual a quantidade de pregos?: ")
        leia(qtd_prego)
        vl_prego = prego * qtd_prego
        escreva("\nO valor em que você terá que pagar em prego(s) será de: ", vl_prego)
      pare 
      
      caso 2:
        escreva("Qual a quantidade de parafusos?: ")
        leia(qtd_parafuso)
        vl_parafuso = parafuso * qtd_parafuso
        escreva("\nO valor em que você terá que pagar em parafuso(s) será de: ", vl_parafuso)
      pare

      caso 3: 
        escreva("Qual a quantidade de rebites?: ")
        leia(qtd_rebite)
        vl_rebite = rebite * qtd_rebite
        escreva("\nO valor em que você terá que pagar em rebite(s) será de: ", vl_rebite)
      pare

      caso 4: 
        escreva("Qual a quantidade de martelos?: ")
        leia(qtd_martelo)
        vl_martelo = martelo * qtd_martelo
        escreva("\nO valor em que você terá que pagar em martelo(s) será de: ", vl_martelo)
      pare

      caso 5: 
        escreva("Qual a quantidade de serrotes?: ")
        leia(qtd_serrote)
        vl_serrote = serrote * qtd_serrote
        escreva("\nO valor em que você terá que pagar em serrote(s) será de: ", vl_serrote)
      pare

      caso 6: 
        escreva("Qual a quantidade de tek Bonds?: ")
        leia(qtd_tekBond)
        vl_tekBond = tekBond * qtd_tekBond
        escreva("\nO valor em que você terá que pagar em tek Bond(s) será de: ", vl_tekBond)
      pare

      caso 7: 
        escreva("Qual a quantidade de rebitadoras?: ")
        leia(qtd_rebitadora)
        vl_rebitadora = rebitadora * qtd_rebitadora
        escreva("\nO valor em que você terá que pagar em rebitadora(s) será de: ", vl_rebitadora)
      pare

      caso 8: 
        escreva("Qual a quantidade de alicate(s): ")
        leia(qtd_alicate)
        vl_alicate = alicate * qtd_alicate
        escreva("O valor em que você terá que pagar em alicate(s) será de: ", vl_alicate)
      pare

      caso 9: 
        escreva("Qual a quantidade de trenas(s): ")
        leia(qtd_trena)
        vl_trena = trena * qtd_trena
        escreva("O valor em que você terá que pagar em trena(s) será de: ", vl_trena)
      pare

      caso 10: 
        escreva("Qual a quantidade de escada(s): ")
        leia(qtd_escada)
        vl_escada = escada * qtd_escada
        escreva("O valor em que você terá que pagar em escada(s) será de: ", vl_escada)
      pare

      caso contrario:
        escreva("Produto inexistente")
      pare
    }

    escreva("\nVai querer comprar mais algum produto <s/n>")
    leia(continuar)
    } enquanto (continuar != "n")

    limpa()
    total = vl_prego + vl_parafuso + vl_rebite + vl_martelo + vl_serrote + vl_tekBond + vl_rebitadora + vl_alicate + vl_trena + vl_escada
    escreva(nome, " a valor total da sua compra ficou em: ", total)
    escreva("\nQual a forma de pagamento? \n 1. Dinheiro \n 2. Cartão \n 3. Pix \n")
    leia(pag)

    escolha (pag){
      caso 1: 
        se (total > 20){
          escreva("\nEm dinheiro o preço fica em ", total - 2, " pode passar lá no caixa")
        } senao {
          escreva("\nO valor total ficou esse mesmo, pode passar lá no caixa")
        }
      pare

      caso 2: 
        escreva("\n1. Débito \n2. Crédito: ")
        leia(frmPag)
        limpa()
        
        se(frmPag == 2){
          escreva("Vai querer parcelar? \n 1. Sim \n 2. Não: ")
          leia(parcela)


          se(parcela == 1){
            escreva("Em quantas vezes?:")
            leia(v_parcela)
            total_parcela = (total / v_parcela)
            escreva("Parcelado em ", v_parcela, " fica em: ", total_parcela)
          }
        }
        limpa()

        escreva("Insira os dados do cartão: ")
        escreva("\nQual o número do cartão: ")
        leia(numCar)
        escreva("Qual a validade do cartão: ")
        leia(cvv)
        escreva("Qual o código de segurança: ")
        leia(cdc)

      pare

      caso 3: 
        escreva("Pode mandar o Pix pra ***.***.***-**")
      pare

      caso contrario: 
        escreva("Forma de pagamento inválida")
      pare
    }
      limpa()
      escreva("Pagamento realizado com sucesso!!!")
      escreva("\nObrigo por comprar na Tek Bonders, volte sempre!!!")
  }
}
