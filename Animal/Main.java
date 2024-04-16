public class Main {
    public static void main(String[] args) {
        // Crear animales
        Animal perro = new Mamifero("Perro", "Pelo corto");
        Animal gato = new Mamifero("Gato", "Pelo largo");
        Animal leon = new Mamifero("Leon", "Melena");
        Animal vibora = new Reptil("Vibora", true);
        Animal cocodrilo = new Reptil("Cocodrilo", true);
        Animal lagarto = new Reptil("Lagarto", false);
        Animal aguila = new Ave("Aguila", "Pico ganchudo");
        Animal paloma = new Ave("Paloma", "Pico corto");
        Animal cuervo = new Ave("Cuervo", "Pico afilado");
        Animal serpientes = new Reptil("Serpientes", false);

        // Crear jaulas
        JaulaTipo1 jaulaTipo1Mamiferos = new JaulaTipo1(Mamifero.class);
        Jaula jaulaReptiles = new JaulaTipo1(Reptil.class);
        JaulaTipo2 jaulaTipo2 = new JaulaTipo2(Ave.class);

        // Agregar animales a las jaulas
        jaulaTipo1Mamiferos.agregarAnimal(perro);
        jaulaTipo1Mamiferos.agregarAnimal(gato);
        jaulaTipo1Mamiferos.agregarAnimal(leon);
        jaulaReptiles.agregarAnimal(perro);
        jaulaReptiles.agregarAnimal(cocodrilo);
        jaulaReptiles.agregarAnimal(lagarto);
        jaulaTipo2.agregarAnimal(aguila);
        jaulaTipo2.agregarAnimal(paloma);
        jaulaTipo2.agregarAnimal(cuervo);
        jaulaReptiles.agregarAnimal(serpientes);

        // Imprimir los animales en cada jaula
        System.out.println("Animales en la jaula de mamíferos:");
        jaulaTipo1Mamiferos.imprimirAnimales();
        System.out.println("\nAnimales en la jaula de reptiles:");
        jaulaReptiles.imprimirAnimales();
        System.out.println("\nAnimales en la jaula de aves:");
        jaulaTipo2.imprimirAnimales();
    }
}
