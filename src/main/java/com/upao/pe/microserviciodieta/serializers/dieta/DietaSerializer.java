package com.upao.pe.microserviciodieta.serializers.dieta;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class DietaSerializer {
    private int raciones;
    private List<ComidaHoraDia> comidas;
}
