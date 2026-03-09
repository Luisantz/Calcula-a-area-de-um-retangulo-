void main() {
    var scanner = new Scanner(System.in);

    //Solicita a base do retangulo:
    System.out.println("Indique qual a base do retangulo:");
    var base = scanner.nextInt();

    //Solicita a altura do retangulo:
    System.out.println("Indique qual a altura do retangulo:");
    var altura = scanner.nextInt();

    //Indica a area do retangulo:
    var area = base * altura;
    System.out.printf("A area deste retangulo é: %s \n",area);
}
