public class Main {
    public static void main(String[] args) {
        int numeroIf = 2;
        int numeroWhile = 0;
        int numeroDo = 2;
        int numeroFor;
        var estacion =  "Otoño";
        //if
        if(numeroIf > 0){
            System.out.println("Es positivo");
        }else if(numeroIf == 0){
            System.out.println("Es cero");
        }else if(numeroIf < 0){
            System.out.println("Es negativo");
        }
        //while
        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println("Esto es while\n" + numeroWhile);
        }
        //do while
        do{
            numeroDo++;
            System.out.println("Esto es do while\n" + numeroDo);
        }while(numeroDo < 3);
        //for
        for(numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("Esto es for \n" + numeroFor);
        }

        //switch
        switch(estacion){
            case "Primvara":
                System.out.println("Es primavera uwu");
                break;
            case "Otoño":
                System.out.println("Es otoño uwu");
                break;
            case "Invierno":
                System.out.println("Es Invierno uwu");
                break;
            case "Verano":
                System.out.println("Es verano uwu");
                break;
            default:
                System.out.println("No es una estación existente.");
                break;
        }
    }
}