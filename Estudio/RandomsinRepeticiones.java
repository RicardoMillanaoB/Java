
    public static void main(String[] args) {
      
        Random aleatorio = new Random();
        
        int aux;
        
        System.out.println("Ingrese el largo del arreglo");
        int largo = intro.nextInt();
        
        int [] arreglo = new int[largo];
        
        //Random din repeticiones
         for ( int i = 0; i < arreglo.length; i++){
            arreglo[i] = aleatorio.nextInt(30)+1;
            for (int j = 0; j <i; j++){
                if (arreglo[i] == arreglo[j]){
                    i--;
                }
            }
        }
      
        
        for ( int i = 0; i < arreglo.length; i++){
            System.out.println("Arreglo "+i+" = "+ arreglo[i]);
        }

    }
    
}
