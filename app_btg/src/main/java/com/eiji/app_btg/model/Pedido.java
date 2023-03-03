package com.eiji.app_btg.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {

    private Integer codigo_pedido;
    private Integer codigo_cliente;

    private List pedido;
}
