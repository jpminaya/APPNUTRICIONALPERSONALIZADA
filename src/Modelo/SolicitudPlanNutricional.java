
package Modelo;

    public class SolicitudPlanNutricional {
    private int idSolicitud;
    private int idUsuario;
    private String objetivo;
    private String actividadFisica;
    private int frecuenciaEjercicioSemana;
    private String condicionesMedicas;
    private String preferenciasAlimenticias;
    private String alergias;
    private String estiloAlimentacionActual;

    // Constructor vacío
    public SolicitudPlanNutricional() {}

    // Constructor con parámetros
    public SolicitudPlanNutricional(int idSolicitud, int idUsuario, String objetivo, String actividadFisica,
                                    int frecuenciaEjercicioSemana, String condicionesMedicas,
                                    String preferenciasAlimenticias, String alergias, String estiloAlimentacionActual) {
        this.idSolicitud = idSolicitud;
        this.idUsuario = idUsuario;
        this.objetivo = objetivo;
        this.actividadFisica = actividadFisica;
        this.frecuenciaEjercicioSemana = frecuenciaEjercicioSemana;
        this.condicionesMedicas = condicionesMedicas;
        this.preferenciasAlimenticias = preferenciasAlimenticias;
        this.alergias = alergias;
        this.estiloAlimentacionActual = estiloAlimentacionActual;
    }

    // Getters y Setters
    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getActividadFisica() {
        return actividadFisica;
    }

    public void setActividadFisica(String actividadFisica) {
        this.actividadFisica = actividadFisica;
    }

    public int getFrecuenciaEjercicioSemana() {
        return frecuenciaEjercicioSemana;
    }

    public void setFrecuenciaEjercicioSemana(int frecuenciaEjercicioSemana) {
        this.frecuenciaEjercicioSemana = frecuenciaEjercicioSemana;
    }

    public String getCondicionesMedicas() {
        return condicionesMedicas;
    }

    public void setCondicionesMedicas(String condicionesMedicas) {
        this.condicionesMedicas = condicionesMedicas;
    }

    public String getPreferenciasAlimenticias() {
        return preferenciasAlimenticias;
    }

    public void setPreferenciasAlimenticias(String preferenciasAlimenticias) {
        this.preferenciasAlimenticias = preferenciasAlimenticias;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getEstiloAlimentacionActual() {
        return estiloAlimentacionActual;
    }

    public void setEstiloAlimentacionActual(String estiloAlimentacionActual) {
        this.estiloAlimentacionActual = estiloAlimentacionActual;
    }
}
    
