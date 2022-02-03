package app.liwru.pollux.svc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sede {

    @Id
    private Integer idSede;
    private String nombre;
    private String direccion;
    private Integer estado;
    private String gerente;
    private String telefono;
    private LocalDate createdAt;
    private LocalDate updateAt;
    private LocalDate deletedAt;

<<<<<<< HEAD
    @ManyToOne
    @JoinColumn(name = "idEmpresa", nullable = false, updatable = false)
    @JsonIgnoreProperties("idEmpresa")
    private Empresa empresa;

||||||| dfd438a
    @JsonIgnore
    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idEmpresa", insertable = false, updatable = false)
    private Empresa empresa;

    @JsonIgnore
    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idSede", insertable = false, updatable = false)
    private Incidencia sede;
=======
    @ManyToOne
    @JoinColumn(name = "idSede", insertable = false, updatable = false)
    private Incidencia sede;
>>>>>>> ece553fe7aad55baf03f296918283657b1146a56
}
