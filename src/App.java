public class App {

    public static void main(String [] args) {
        Calculadora calculadoradeidades = new Calculadora();
        int somaDasIdades = calculadoradeidades.somar(  10, 2);
        System.out.println(somaDasIdades);

        int subtraiDasIdades = calculadoradeidades.subtrai(  10, 2);
        System.out.println(subtraiDasIdades);

        int multiplicaDasIdades = calculadoradeidades.multiplica(  10, 2);
        System.out.println(multiplicaDasIdades);

        int divideDasIdades = calculadoradeidades.divide(  10, 2);
        System.out.println(divideDasIdades);

        Comparador Comparadordevalores = new Comparador ();
        boolean comparaValor = Comparadordevalores.menorQue( 2, 4);
        System.out.println(comparaValor);

        }
    }

