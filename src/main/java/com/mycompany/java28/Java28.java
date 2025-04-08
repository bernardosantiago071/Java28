/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java28;

/**
 *
 * @author 10725116225
 */
import javax.swing.*;

public class Java28 {

    public static void main(String[] args) {
        // Criando a matriz 3x3
        int[][] matriz = new int[3][3];

        // Leitura da matriz usando JOptionPane
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Lê cada elemento da matriz
                String input = JOptionPane.showInputDialog(null, 
                    "Digite o elemento [" + i + "][" + j + "]:");
                matriz[i][j] = Integer.parseInt(input);
            }
        }

        // A. Soma dos elementos da primeira coluna
        int somaPrimeiraColuna = 0;
        for (int i = 0; i < 3; i++) {
            somaPrimeiraColuna += matriz[i][0];
        }
        JOptionPane.showMessageDialog(null, "Soma dos elementos da primeira coluna: " + somaPrimeiraColuna);

        // B. Soma dos elementos de cada coluna
        StringBuilder resultadoColunas = new StringBuilder();
        for (int j = 0; j < 3; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 3; i++) {
                somaColuna += matriz[i][j];
            }
            resultadoColunas.append("Soma dos elementos da coluna " + (j + 1) + ": " + somaColuna + "\n");
        }
        JOptionPane.showMessageDialog(null, resultadoColunas.toString());

        // C. Produto dos elementos da primeira linha
        int produtoPrimeiraLinha = 1;
        for (int j = 0; j < 3; j++) {
            produtoPrimeiraLinha *= matriz[0][j];
        }
        JOptionPane.showMessageDialog(null, "Produto dos elementos da primeira linha: " + produtoPrimeiraLinha);

        // D. Soma de todos os elementos da matriz
        int somaTotal = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                somaTotal += matriz[i][j];
            }
        }
        JOptionPane.showMessageDialog(null, "Soma de todos os elementos da matriz: " + somaTotal);

        // E. Média dos elementos da matriz
        double media = somaTotal / 9.0;
        JOptionPane.showMessageDialog(null, "Média dos elementos da matriz: " + media);

        // F. Elementos maiores que a média
        StringBuilder maioresQueMedia = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > media) {
                    maioresQueMedia.append("Elemento [" + i + "][" + j + "]: " + matriz[i][j] + "\n");
                }
            }
        }
        if (maioresQueMedia.length() > 0) {
            JOptionPane.showMessageDialog(null, "Elementos maiores que a média:\n" + maioresQueMedia.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Não há elementos maiores que a média.");
        }

        // G. Maior elemento da matriz e sua posição
        int maior = matriz[0][0];
        int maiorI = 0, maiorJ = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    maiorI = i;
                    maiorJ = j;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Maior elemento: " + maior + " na posição [" + maiorI + "][" + maiorJ + "]");

        // H. Menor elemento da matriz e sua posição
        int menor = matriz[0][0];
        int menorI = 0, menorJ = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    menorI = i;
                    menorJ = j;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Menor elemento: " + menor + " na posição [" + menorI + "][" + menorJ + "]");

        // I. Soma dos elementos da diagonal principal
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < 3; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }
        JOptionPane.showMessageDialog(null, "Soma dos elementos da diagonal principal: " + somaDiagonalPrincipal);

        // J. Soma dos elementos da diagonal secundária
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < 3; i++) {
            somaDiagonalSecundaria += matriz[i][2 - i];
        }
        JOptionPane.showMessageDialog(null, "Soma dos elementos da diagonal secundária: " + somaDiagonalSecundaria);
    }
}

