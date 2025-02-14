package com.iempresarial.bg.ApiRestControlAdmin.Process;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.CfgTipoMovimientoDTO;
import com.iempresarial.bg.ApiRestControlAdmin.DTO.OrdenCentroCostoDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Entity.OrdenCentroCosto;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.MyAppException;
import com.iempresarial.bg.ApiRestControlAdmin.Repository.CfgTipoMovimientoRepository;
import com.iempresarial.bg.ApiRestControlAdmin.Service.OrdenCentroCostoService;

public class ProcesaPrograma {

    public OrdenCentroCosto procesaPrograma(OrdenCentroCosto ordenCentroCosto, Long idecentrocostoactual) throws MyAppException  {
        
        OrdenCentroCostoDTO ordenCentroCostoDTO;
        OrdenCentroCostoService ordenCentroCostoService = null;
        CfgTipoMovimientoDTO cfgTipoMovimientoDTO;
        CfgTipoMovimientoRepository cfgTipoMovimientoRepository = null;

        // Obtiene centro de costo actual
        ordenCentroCostoDTO = ordenCentroCostoService.getCencosActual(ordenCentroCosto.getIdeordenprogra(),"INVENTA_PROCESO","INGRESO","N");
        
       /*  if (idecentrocostoactual != ordenCentroCostoDTO.getIdecentrocosto()){
            return -1;
        }*/

        // Marca el indicador de salida
        ordenCentroCosto.setIndsalida("S");

        // Actualiza el indicador de salida
        ordenCentroCosto = ordenCentroCostoService.saveOrdencentrocosto(ordenCentroCosto);
       
        // Obtienen el tipo de movimiento para el registro de salida
        cfgTipoMovimientoDTO = cfgTipoMovimientoRepository.findByStsmovimientoAndTipomovimiento("PRODUCIDA", "SALIDA");

        ordenCentroCosto.setIdetipomovimiento(cfgTipoMovimientoDTO.getIdetipomovimiento() );

        // Graba el registro de salida
        ordenCentroCosto = ordenCentroCostoService.saveOrdencentrocosto(ordenCentroCosto);
       
        // Obtiene el tipo de movimiento para el registro de ingreso
        cfgTipoMovimientoDTO = cfgTipoMovimientoRepository.findByStsmovimientoAndTipomovimiento("EN_PROCESO", "INGRESO");
        
        ordenCentroCosto.setIdeordenprogcencos(null);
        ordenCentroCosto.setIdetipomovimiento(cfgTipoMovimientoDTO.getIdetipomovimiento());
        
        // Graba el registro de ingreso
        ordenCentroCosto = ordenCentroCostoService.saveOrdencentrocosto(ordenCentroCosto);
        
        return ordenCentroCosto;
    }

}
