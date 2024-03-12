package bytebank;

public class TestaMetodos {
    public static void main(String[] args) {
        conta contaDoDouglas = new conta();
        contaDoDouglas.saldo = 100;
        contaDoDouglas.deposita(50);
        System.out.println(contaDoDouglas.saldo);
        
        boolean conseguiuRetirar = contaDoDouglas.saca(20);
        System.out.println(contaDoDouglas.saldo);
        System.out.println(conseguiuRetirar);
    }
}
