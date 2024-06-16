package com.upao.pe.microserviciodieta.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "dieta")
@Entity
public class Dieta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_dieta")
    private Long idDieta;
    @Column(name = "raciones", nullable = false)
    private int raciones;
    @OneToMany(mappedBy = "dieta", cascade = CascadeType.ALL)
    private List<DietaComida> dietaComidas;
}

