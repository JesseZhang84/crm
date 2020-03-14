package com.crm.handle;

import com.crm.exception.CrmException;
import com.crm.utils.ResponseResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandle {

    @ExceptionHandler(CrmException.class)
    public ResponseEntity handle(CrmException e) {
        return ResponseEntity.status(e.getExceptionEnums().getStatus()).body(new ResponseResult(e.getExceptionEnums()));
    }
}
