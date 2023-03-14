package es.aulanosa.gestionfp.model;

import jakarta.persistence.*;
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "idAsignatura")
    private int idAsignatura;

    @Column(name = "dia")
    private char dia;

    @Column(name = "inicio")
    private Time inicio;

    @Column(name = "fin")
    private Time fin;



}
