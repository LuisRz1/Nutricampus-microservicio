package com.upao.pe.microserviciodieta.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "hora_dia")
@Entity
public class HoraDia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_hora_dia")
    private Long idHoraDia;
    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;
    @Column(name = "hora", nullable = false)
    private LocalTime hora;
    @OneToMany(mappedBy = "horaDia", cascade = CascadeType.ALL)
    private List<DietaComida> dietaComidas;
}
