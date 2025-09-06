import DAO.UsuarioDAO;
import entity.Usuario.Usuario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Usuario u = new Usuario();
        u.setNome("Rogerio");
        u.setLogin("rogerio");
        u.setSenha("1234");
        u.setEmail("rogerio@jgmail.com");

        new UsuarioDAO().cadastrarUsuario(u);
    }
}