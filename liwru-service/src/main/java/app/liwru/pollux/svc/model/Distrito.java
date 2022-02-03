package app.liwru.pollux.svc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Distrito {

    @Id
    private Integer idDistrito;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "idProvincia", nullable = false, updatable = false)
    @JsonIgnoreProperties("idProvincia")
    private Provincia provincia;

}
