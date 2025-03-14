
@Tabela("Teste")
public class Main {
    public static void main(String[] args) {
        Class<?> annotation = Main.class;
        Tabela Tabela = annotation.getAnnotation(Tabela.class);
        System.out.println("Nome da Tabela: " + Tabela.value());
    }
}