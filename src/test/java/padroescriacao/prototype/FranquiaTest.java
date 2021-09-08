package padroescriacao.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FranquiaTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Franquia franquia = new Franquia(01, "Franquia Original", new Endereco("Rua de cima", 001), "Juiz de Fora");

        Franquia franquiaClone = franquia.clone();
        franquiaClone.setMatricula(02);
        franquiaClone.setNome("Franquia Clonada");
        franquiaClone.getEndereco().setNumero(02);
    }

}