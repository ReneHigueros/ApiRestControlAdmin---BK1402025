package com.iempresarial.bg.ApiRestControlAdmin.DTO;

import org.springframework.beans.factory.annotation.Value;

public interface PersonaDTO {
       
   // Long getIdepersona( );

    //String getLovtipopersona();

    String getNit();

    String getPrimernombre();

    String getSegundonombre();

    String getPrimerapellido();
    
    String getSegundoapellido();
    
    String getNombrecomercial();

    String getDescripcia();

    @Value("#{target.primernombre+' '+target.segundonombre+' '+target.primerapellido+' '+target.segundoapellido}")
    
    String getNombreCompleto();



}

