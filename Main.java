//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Agenda miAgenda = new Agenda();

        //Agregar contactos
        miAgenda.agregarContacto("Juan","123456789");
        miAgenda.agregarContacto("Maria","987654321");

        //Buscar contacto
        Contacto contactoBuscado = miAgenda.buscarContacto("Juan");
        if (contactoBuscado!=null){
            System.out.println("Contacto encontrado: " + contactoBuscado);
        } else {
            System.out.println("Contacto no encontrado. ");
        }
        //Mostrar todos los contactos
        miAgenda.mostrarContacto();
    }
}