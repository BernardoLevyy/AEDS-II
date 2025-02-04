public class Recursividade {

    // Somar todos o números até um limite definido
    public static int somarPares(int numeroPar, int limite){
        if(numeroPar > limite){
            //Parar Algoritimo
            return 0;
        }else{
            return numeroPar + somarPares(numeroPar + 2, limite);
        }
    }

    //Somar todos os números de um vetor double
    public static double somarVetor(double[] vet, int posicao){
        if(posicao > vet.length - 1){
            return 0;
        }else{
            return vet[posicao] + somarVetor(vet, posicao + 1);
        }
    }


    public static void main(String[] args) throws Exception {
        System.out.println(somarPares(0, 10));
        System.out.println(somarVetor(new double[]{1, 2, 3, 4, 5}, 0));
    }
}
