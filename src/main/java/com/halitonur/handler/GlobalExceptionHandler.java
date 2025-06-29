package com.halitonur.handler;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.halitonur.exception.BaseException;
import com.halitonur.handler.ApiError;
import com.halitonur.handler.Exception;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {BaseException.class})
    public ResponseEntity<ApiError<String>> handleBaseException(BaseException exception, WebRequest request) {
        return ResponseEntity
                .badRequest()
                .body(createApiError(exception.getMessage(), request));
    }

    private String getHostname() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            System.out.println("Hostname alınamadı: " + e.getMessage());
        }
        return "unknown-host";
    }

    public <E> ApiError<E> createApiError(E message, WebRequest request) {
        ApiError<E> apiError = new ApiError<>();
        apiError.setStatus(HttpStatus.BAD_REQUEST.value());

        Exception<E> exception = new Exception<>();
        exception.setCreateTime(new Date(System.currentTimeMillis()));
        exception.setHostName(getHostname());
        exception.setPath(request.getDescription(false));
        exception.setMessage(message);

        apiError.setException(exception);
        return apiError;
    }
}
