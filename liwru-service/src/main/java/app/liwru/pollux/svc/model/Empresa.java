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
public class Empresa {

    @Id
    private Integer idEmpresa;
    private String rucEmpresa;
    private String telefonoEmpresa;
    private String descripcionEmpresa;
    private LocalDate createAt;
    private LocalDate updateAt;
<<<<<<< HEAD


||||||| dfd438a

    @OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Sede> sedes;
=======
>>>>>>> ece553fe7aad55baf03f296918283657b1146a56
}
