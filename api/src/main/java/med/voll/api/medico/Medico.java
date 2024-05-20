package med.voll.api.medico;

import jakarta.persistence.*;
import med.voll.api.direccion.Direccion;

// Entidad Medico se encarga de la persistencia de datos con nuestro modelo de base de datos
@Table(name = "medicos")
@Entity(name = "Medico")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private String documento;
    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;
    @Embedded
    private Direccion direccion;

}
