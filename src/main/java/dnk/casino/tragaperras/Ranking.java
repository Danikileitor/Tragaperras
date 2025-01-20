package dnk.casino.tragaperras;

import java.util.ArrayList;
import java.util.List;

import dnk.casino.tragaperras.Users.Usuario;
import dnk.casino.tragaperras.Users.UsuarioService;

public class Ranking {

    private List<Usuario> usuarios;
    private List<Integer> victorias;

    public Ranking(List<Usuario> usuarios, UsuarioService usuarioService) {
        this.usuarios = usuarios;

        List<Integer> victorias = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            victorias.add(usuarioService.getWins(usuario.getId()));
        }

        this.victorias = victorias;
    }

    public List<Integer> getVictorias() {
        return victorias;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}