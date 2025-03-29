package edu.Victor.PrimeiroTopico;

/*
 * Projeto: Jogo de Números Aleatórios
 * Autor: Victor Fiuza
 * Curso: Engenharia da Computação - UFRB
 * Descrição: Este programa implementa um jogo simples baseado em números aleatórios.
 * Data de Criação: Março de 2025
 * Versão: 1.0
 */

import java.util.Random;
import java.util.Scanner;

public class DesafioNumeroAleatorio {
 
    public static void main(String[] args) {
    
    // Declaro as Variaveis
    int numeroAleatorio = numeroAleatorio();
    int i=0;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite seu palpite: ");
    int palpite = scanner.nextInt();
   
       

    // estrutura de repetição
    while (palpite != numeroAleatorio) {

        if (palpite < numeroAleatorio){
            System.out.print("\nO numero é maior que o palpite. Digite seu novo palpite: ");
            palpite = scanner.nextInt(); 
        }

        else if (palpite > numeroAleatorio){
            System.out.print("\nO numero é menor que o palpite. Digite seu novo palpite: ");
            palpite = scanner.nextInt(); 
        }
        i = i+1;
        }

        System.out.println(" \nParabéns você acertou, o número era " + palpite + "\nE o  numero de tentativas foi: " + i);


        
        scanner.close();
    }

    // Metodo para gerar numero aleaorio
    public static int numeroAleatorio() {
        Random numeroAleatorio = new Random();
        return numeroAleatorio.nextInt(100)+1;
    
    }


 }
