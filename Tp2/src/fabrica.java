public class fabrica {
    //tiene 5 contenedeores para lamacenar titanio
    //cada contenedor tiene un codigo y una cantidad limite de toneladas que admite [HAY QUE CREAR ESTA CLASE]
    //ademas deben decir la cantidad actual que poseen
    private contenedor cont[] = new contenedor[5]; 

    public fabrica(humano h){//cada fabrica tiene almenos un humano que la controla
        for(int i = 0; i < 5; i++){//para cada contendor genereo un codigo random y este sera guardado dentro del mismo
            double randomnumber = Math.random();
            cont[i] = new contenedor((int) (randomnumber - randomnumber % 1));
        }
    }
}
