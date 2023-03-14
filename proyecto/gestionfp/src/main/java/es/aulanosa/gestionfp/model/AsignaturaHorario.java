package es.aulanosa.gestionfp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

@Entity
@Table(name = "AsignaturaHorario")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AsignaturaHorario {

    private int id;
    private int idAsignatura;
    private char dia;
    private Time 


}
