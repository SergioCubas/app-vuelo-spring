package app.liwru.pollux.svc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    private Integer idUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String emailUsuario;
    private String numeroDocUsuario;
    private Integer estado;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private LocalDate deletedAt;

<<<<<<< HEAD
    @ManyToOne
    @JoinColumn(name = "idRolUsuario", nullable = false, updatable = false)
    @JsonIgnoreProperties("idRolUsuario")
    private Rol rol;

    @ManyToOne
    @JoinColumn(name = "idTipoDoc", nullable = false, updatable = false)
    @JsonIgnoreProperties("idTipoDoc")
    private TipoDocumento tipoDocumento;
||||||| dfd438a
    @OneToOne
    @JoinColumn(name = "idUsuario", insertable = false, updatable = false)
    private Incidencia usuario;
=======
    @OneToOne
    @JoinColumn(name = "idUsuario")
    private Incidencia usuario;
>>>>>>> ece553fe7aad55baf03f296918283657b1146a56

<<<<<<< HEAD
||||||| dfd438a
    @OneToMany(mappedBy = "rolUsuario")
    private List<Rol> rols;
=======
    @JsonIgnoreProperties("rolUsuario")
    @OneToMany(mappedBy = "rolUsuario", cascade = CascadeType.ALL)
    private List<Rol> rols;
>>>>>>> ece553fe7aad55baf03f296918283657b1146a56
}
