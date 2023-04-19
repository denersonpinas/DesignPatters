public class App {
    public static void main(String[] args) throws Exception {
        Cargo gerenteGeral = new GerenteGeral();
        Cargo gerenteJr = new GerenteGeral();
        Cargo gerente = new GerenteGeral();
        Cargo gerenteSr = new GerenteGeral();
        Desenvolvedor desenvolvedorJr = new Desenvolvedor("3500");
        Desenvolvedor desenvolvedorJr2 = new Desenvolvedor("3500");
        Desenvolvedor desenvolvedor = new Desenvolvedor("10000");
        Desenvolvedor desenvolvedorSr = new Desenvolvedor("15500");

        gerente.add(desenvolvedorJr);
        gerente.add(desenvolvedor);
        gerenteSr.add(desenvolvedorSr);
        gerenteSr.add(desenvolvedorJr2);
        gerenteGeral.add(gerenteJr);
        gerenteGeral.add(gerenteSr);
        gerenteGeral.add(gerente);

        gerenteGeral.printSalario();
    }
}
