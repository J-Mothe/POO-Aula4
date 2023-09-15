import pacote.exemplos.*;

class Main {
    public static void main(String[] args) {

        C1 teste = new C1();
        System.out.println("C1");
        System.out.println(teste.atributoPublico);
        // C2 extende C1
        System.out.println("C2");
        C2 c2 = new C2();
        c2.executaC1();
        System.out.println("ClasseInterna");
        C1.ClasseInterna ci = teste.new ClasseInterna();
        ci.executaC1();
        // System.out.println(teste.atributoPrivado);
        // System.out.println(teste.atributoProtegido);
        // System.out.println(teste.atributoDefault);

    }

}