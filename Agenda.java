import java.util.List;
public class Agenda {
    private List<Contacto> contactos;
    public Agenda(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    public void agregarContacto(String nombre, String telefono) {
        Contacto nuevoContacto = new Contacto(nombre, telefono);
        contactos.add(nuevoContacto);
    }
    public Contacto buscarContacto(String nombre){
        for (Contacto contacto : contactos){
            if(contacto.getNombre().equalsIgnoreCase(nombre)){
                return contacto;
            }
        }
        return null;
    }
    public void mostrarContacto(){
        System.out.println("Lista de contactos:");
        for (Contacto contacto:contactos){
            System.out.println(contacto);
        }
    }
}
