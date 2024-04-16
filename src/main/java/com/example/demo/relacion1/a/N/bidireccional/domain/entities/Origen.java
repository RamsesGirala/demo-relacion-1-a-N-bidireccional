package com.example.demo.relacion1.a.N.bidireccional.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Origen extends Base{

    private String campoOrigen;

    @OneToMany
    @JoinColumn(name = "origen_foreign_key")
    private Set<Destino> destinos = new HashSet<>();
}
