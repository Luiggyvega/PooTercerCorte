package models;

public abstract class Miembro {
    private String documentoDeIdentidad;
    private String codigo;
    private String nombre;
    private String correo;

    public Miembro(String documentoDeIdentidad, String codigo, String nombre, String correo) {
        this.documentoDeIdentidad = documentoDeIdentidad;
        this.codigo = codigo;
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getDocumentoDeIdentidad() {
        return documentoDeIdentidad;
    }

    public void setDocumentoDeIdentidad(String documentoDeIdentidad) {
        this.documentoDeIdentidad = documentoDeIdentidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


    @Override
    public String toString() {
        return "Miembro{" +
                "documentoDeIdentidad='" + documentoDeIdentidad + '\'' +
                ", codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
