package com.eiji.app_btg.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "pedido_id")
    private Long codigoPedido;

    @Column(name = "cliente_id")
    private Integer codigoCliente;

    @Column(name = "pedido_lista")
    private List pedido;

    @Column(name = "valor_total")
    private Double valorTotal;
}
