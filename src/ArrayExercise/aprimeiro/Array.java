package ArrayExercise.aprimeiro;

public class Array {
    public static void main(String[] args) {
        ArrayMethods arrayMethods = new ArrayMethods();
        String[] nome = new String[3];
        nome[0] = "joy";
        nome[1] = "jo";
        nome[2] = "j";
        for (int i = 0; i < nome.length; i++) {
            System.out.println(nome);
        }
   for (String nomes : nome){
       System.out.println(nomes);
   }
arrayMethods.loop();

        }
    }
