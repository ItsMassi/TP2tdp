public class robot extends entidad{
    private final int cargaMaxima =550; //esto es en kilos
    int carga;
    //el numero de identificacion de los robots tambien es un legajo
    //funcion recolectar titanio
    //tienen un compartimiento para guardar el tintanio
    //cada pieza de titanio pesa 10 kilos
    // pueden guaradr titanio siempre y cuando no hayan superado su capacidad máxima de carga que es de 550 kilos. 
    //los robots almacenan el titanio en los contenedores con capacidad sufiente para la carga del mismo
    public robot(int id){
        legajo = id;
    }
    public void recolectar(){
        if(carga != cargaMaxima){
            carga = carga + 10;
        }else{
            System.out.println("Carga llena");
        }
    }

    public int vaciar(fabrica f){//falta por saber el funcionamiento de la fabrica
        int retorno = carga;
        carga = 0;
        return retorno;
    }
}
