package com.teachme.model;

import javax.persistence.*;
/**
 * @autor miguel Corma
 */
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;

    @Column(name = "apPaterno", nullable = false, length = 30)
    private String apPaterno;

    @Column(name = "apMaterno", nullable = false, length = 30)
    private String apMaterno;

    @Column(name = "ci", nullable = false, length = 50)
    private String ci;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name = "usuario", nullable = false, length = 50)
    private String usuario;

    @Column(name = "contrasenia", nullable = false, length = 30)
    private String contrasenia;

    @Column(name = "vcontrasenia", nullable = false, length = 30)
    private String vcontrasenia;

    @ManyToOne
    @JoinColumn(name="rol_id")
    private Rol rol;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getVcontrasenia() {
        return vcontrasenia;
    }

    public void setVcontrasenia(String vcontrasenia) {
        this.vcontrasenia = vcontrasenia;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
