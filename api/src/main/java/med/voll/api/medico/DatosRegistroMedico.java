package med.voll.api.medico;

import med.voll.api.direccion.DatosDireccion;

// DatosRegistroMedico es nuestro DTO para recibir lo que viene de la API
public record DatosRegistroMedico(
        String nombre,
        String email,
        String documentos,
        Especialidad especialidad,
        DatosDireccion direccion
) {
}
