package com.egov.ex.service;

public interface FunctionWithException<T,R,E extends Exception>  {
    R apply(T t) throws E;
}
