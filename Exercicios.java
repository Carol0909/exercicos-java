public class Exercicios {
    public static void main(String[] args) {
        // 1 - Média de Três Números
        double n1 = 8, n2 = 7, n3 = 6;
        double media = (n1 + n2 + n3) / 3;
        System.out.println(media >= 7 ? "Aprovado" : "Reprovado");

        // 2 - Verificação de Maioridade
        int anoNascimento = 2005, anoAtual = 2025;
        int idade = anoAtual - anoNascimento;
        System.out.println(idade >= 18 ? "Maior de idade" : "Menor de idade");

        // 3 - Número Positivo ou Negativo
        int numero = -5;
        if (numero > 0) {
            System.out.println("Positivo");
        } else if (numero < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }

        // 4 - Verificação de Par ou Ímpar
        int num = 7;
        System.out.println(num % 2 == 0 ? "Par" : "Ímpar");

        // 5 - Divisível por 3 e 5
        int valor = 15;
        if (valor % 3 == 0 && valor % 5 == 0) {
            System.out.println("Divisível por 3 e 5");
        } else {
            System.out.println("Não é divisível por 3 e 5");
        }

        // 6 - Nota de Aluno
        double nota = 6.5;
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        // 7 - Impressão de Intervalo
        int x = 15;
        System.out.println((x >= 10 && x <= 20) ? "Número dentro do intervalo" : "Número fora do intervalo");

        // 8 - Verificação de Signo (exemplo simplificado)
        int dia = 25, mes = 10;
        if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            System.out.println("Escorpião");
        } else {
            System.out.println("Outro signo");
        }

        // 9 - Cálculo de Desconto
        double compra = 120;
        double desconto = compra > 100 ? compra * 0.10 : compra * 0.05;
        System.out.println("Valor final: " + (compra - desconto));

        // 10 - Cálculo de IMC
        double peso = 70, altura = 1.75;
        double imc = peso / (altura * altura);
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }

        // 11 - Classificação de Triângulo
        int a = 5, b = 5, c = 5;
        if (a == b && b == c) {
            System.out.println("Equilátero");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isósceles");
        } else {
            System.out.println("Escaleno");
        }

        // 12 - Idade para Dirigir
        int idade2 = 17;
        System.out.println(idade2 >= 18 ? "Você pode dirigir" : "Você não pode dirigir");

        // 13 - Qualidade de Águas
        double ph = 7;
        if (ph < 7) {
            System.out.println("Ácido");
        } else if (ph == 7) {
            System.out.println("Neutro");
        } else {
            System.out.println("Alcalino");
        }

        // 14 - Verificação de Eleição
        int idade3 = 18;
        if (idade3 >= 16) {
            System.out.println("Você pode votar");
            if (idade3 >= 18) {
                System.out.println("Você deve votar");
            }
        }

        // 15 - Dia da Semana
        int diaSemana = 3;
        switch (diaSemana) {
            case 1: System.out.println("Segunda-feira"); break;
            case 2: System.out.println("Terça-feira"); break;
            case 3: System.out.println("Quarta-feira"); break;
            case 4: System.out.println("Quinta-feira"); break;
            case 5: System.out.println("Sexta-feira"); break;
            case 6: System.out.println("Sábado"); break;
            case 7: System.out.println("Domingo"); break;
            default: System.out.println("Número inválido");
        }

        // 16 - Comparação de Dois Números
        int nA = 10, nB = 20;
        if (nA > nB) {
            System.out.println("Maior: " + nA);
        } else if (nB > nA) {
            System.out.println("Maior: " + nB);
        } else {
            System.out.println("São iguais");
        }

        // 17 - Verificação de Ano Bissexto
        int ano = 2024;
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Ano comum");
        }

        // 18 - Verificação de Carro Esportivo
        int velocidade = 130;
        if (velocidade > 120) {
            System.out.println("Velocidade acima do limite");
            int multa = (velocidade - 120) * 10;
            System.out.println("Multa: R$ " + multa);
        }
    }
}
