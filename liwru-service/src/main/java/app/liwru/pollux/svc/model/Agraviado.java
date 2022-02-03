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
public class Agraviado {

    @Id
    private Integer idAgraviado;
    private String clienteNombre;
    private String clienteApeMat;
    private String clienteApePat;
    private String clienteEmail;
    private String clienteTelefono;
    private String clienteDireccion;
    private String clienteNroDoc;
    private Integer estatusEdad;
    private Integer estado;
    private LocalDate createdAt;
    private LocalDate updatedAt;

<<<<<<< HEAD
    @ManyToOne
    @JoinColumn(name = "idDistrito", nullable = false, updatable = false)
    @JsonIgnoreProperties("idDistrito")
    private Distrito distrito;
||||||| dfd438a
    @OneToMany(mappedBy = "tipoDocumento")
    private List<TipoDocumento> tipoDocumentos;
=======
    @JsonIgnoreProperties("tipoDocumento")
    @OneToMany(mappedBy = "tipoDocumento", cascade = CascadeType.ALL)
    private List<TipoDocumento> tipoDocumentos;
>>>>>>> ece553fe7aad55baf03f296918283657b1146a56

<<<<<<< HEAD
||||||| dfd438a
    @OneToOne(mappedBy = "apoderado")
    private Apoderado apoderados;
=======
    @JsonIgnoreProperties("apoderado")
    @OneToOne(mappedBy = "apoderado", cascade = CascadeType.ALL)
    private Apoderado apoderados;
>>>>>>> ece553fe7aad55baf03f296918283657b1146a56

<<<<<<< HEAD
||||||| dfd438a
    @ManyToOne
    @JoinColumn(name = "idAgraviado", insertable = false, updatable = false)
    private Incidencia agraviado;
=======
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idAgraviado", insertable = false, updatable = false)
    private Incidencia agraviado;
>>>>>>> ece553fe7aad55baf03f296918283657b1146a56
}
