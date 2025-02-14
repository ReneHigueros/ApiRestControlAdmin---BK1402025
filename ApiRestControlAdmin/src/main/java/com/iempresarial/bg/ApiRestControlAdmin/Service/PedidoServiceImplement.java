package com.iempresarial.bg.ApiRestControlAdmin.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.PedidoDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Entity.Pedido;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.ExcepcionDetails;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.MyAppException;
import com.iempresarial.bg.ApiRestControlAdmin.Repository.PedidoRepository;

@Service
public class PedidoServiceImplement implements PedidoService{

    @Autowired
    PedidoRepository pedidoRepository;

    public PedidoServiceImplement(PedidoRepository pedidoRepository){
        this.pedidoRepository = pedidoRepository;
    }

    @Override
    public List<Pedido> findAll(){
        List<Pedido> list;

        list = pedidoRepository.findAll();

        return list;
    }

    @Override
    public PedidoDTO findBySeriepedidoAndNumpedido(String seriepedido, Long numpedido) throws MyAppException{
        final PedidoDTO pedido;

        pedido = pedidoRepository.findBySeriepedidoAndNumpedido(seriepedido, numpedido);

        if (ObjectUtils.isEmpty(pedido)) {
            throw new MyAppException("Error en la base de datos",
                    new ExcepcionDetails("2001", "No se encontro el pedido en la base de datos", "error"));
        }

        return pedido;
    }


}
