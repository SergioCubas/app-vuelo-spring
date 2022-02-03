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
public class Incidencia {

    @Id
    private Integer idIncidencia;
    private String codigoIncidencia;
    private LocalDate fechaIncidencia;

    /*private Integer idMotivo;
    private Integer idTipoDoc;
    private Integer idEstado;
    private Integer idSede;
    private Integer idAgraviado;
    private Integer idUsuario;
    private Integer tipoAtencion;
    private String fechaAproximada;
    private Integer existeDocs;
    private String fileDocs;
    private String pedidoIncidencia;
    private String detalleIncidencia;*/
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private LocalDate deletedAt;

<<<<<<< HEAD
||||||| dfd438a
    @OneToMany(mappedBy = "tipoIncidencia", cascade = CascadeType.ALL)
    private List<TipoIncidencia> tipoIncidencias;
=======
    @JsonIgnoreProperties("tipoIncidencia")
    @OneToMany(mappedBy = "tipoIncidencia", cascade = CascadeType.ALL)
    private List<TipoIncidencia> tipoIncidencias;
>>>>>>> ece553fe7aad55baf03f296918283657b1146a56

<<<<<<< HEAD
    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false, updatable = false)
    @JsonIgnoreProperties("idUsuario")
    private Usuario usuario;
||||||| dfd438a
    @OneToMany(mappedBy = "motivo", cascade = CascadeType.ALL)
    private List<Motivo> motivos;
=======
    @JsonIgnoreProperties("motivo")
    @OneToMany(mappedBy = "motivo", cascade = CascadeType.ALL)
    private List<Motivo> motivos;
>>>>>>> ece553fe7aad55baf03f296918283657b1146a56

<<<<<<< HEAD
    @ManyToOne
    @JoinColumn(name = "idTipoIncidencia", nullable = false, updatable = false)
    @JsonIgnoreProperties("idTipoIncidencia")
    private TipoIncidencia tipoIncidencia;
||||||| dfd438a
    @OneToMany(mappedBy = "tipoDocumento", cascade = CascadeType.ALL)
    private List<TipoDocumento> tipoDocumentos;
=======
    @JsonIgnoreProperties("tipoDocumento")
    @OneToMany(mappedBy = "tipoDocumento", cascade = CascadeType.ALL)
    private List<TipoDocumento> tipoDocumentos;
>>>>>>> ece553fe7aad55baf03f296918283657b1146a56

<<<<<<< HEAD
||||||| dfd438a
    @OneToMany(mappedBy = "estado", cascade = CascadeType.ALL)
    private List<Estado> estados;
=======
    @JsonIgnoreProperties("estado")
    @OneToMany(mappedBy = "estado", cascade = CascadeType.ALL)
    private List<Estado> estados;
>>>>>>> ece553fe7aad55baf03f296918283657b1146a56

<<<<<<< HEAD
    @ManyToOne
    @JoinColumn(name = "idMotivo", nullable = false, updatable = false)
    @JsonIgnoreProperties("idMotivo")
    private Motivo motivo;
||||||| dfd438a
    @OneToMany(mappedBy = "sede", cascade = CascadeType.ALL)
    private List<Sede> sedes;
=======
    @JsonIgnoreProperties("sede")
    @OneToMany(mappedBy = "sede", cascade = CascadeType.ALL)
    private List<Sede> sedes;
>>>>>>> ece553fe7aad55baf03f296918283657b1146a56

<<<<<<< HEAD
    @ManyToOne
    @JoinColumn(name = "idEstado", nullable = false, updatable = false)
    @JsonIgnoreProperties("idEstado")
    private Estado estado;


    @ManyToOne
    @JoinColumn(name = "idAgraviado", nullable = false, updatable = false)
    @JsonIgnoreProperties("idAgraviado")
    private Agraviado agraviado;

    @ManyToOne
    @JoinColumn(name = "idSede", nullable = false, updatable = false)
    @JsonIgnoreProperties("idSede")
    private Sede sede;
||||||| dfd438a
    @OneToMany(mappedBy = "agraviado", cascade = CascadeType.ALL)
    private List<Agraviado> agraviados;
=======
    @JsonIgnoreProperties("agraviado")
    @OneToMany(mappedBy = "agraviado", cascade = CascadeType.ALL)
    private List<Agraviado> agraviados;
>>>>>>> ece553fe7aad55baf03f296918283657b1146a56

<<<<<<< HEAD
||||||| dfd438a
    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Usuario usuario;
=======
    @JsonIgnoreProperties("usuario")
    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Usuario usuario;
>>>>>>> ece553fe7aad55baf03f296918283657b1146a56
}

// revisar el tipo de valor, para que sea Lazy en lugar de eagear
