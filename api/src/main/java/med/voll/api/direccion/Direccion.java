package med.voll.api.direccion;

import jakarta.persistence.Embeddable;

@Embeddable
public class Direccion {
    private String calle;
    private String distrito;
    private String ciudad;
    private String numero;
    private String complemento;
}
