public class contenedor {

  private final int maximo = 1000;
  int codigo, storage;

  public contenedor(int cod) {
    codigo = cod;
    storage = 0;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public int getStorage() {
    return storage;
  }

  /*al agregar valores al contendor este retornara si se pudo guargar o no 
   * el valor deseado
  */
  public boolean addStorage(int st) {
    if (storage + st <= maximo) {
      storage += st;
      return true;
    } else {
      return false;
    }
  }
}
