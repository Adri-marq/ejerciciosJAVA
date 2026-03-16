package com.Intefaces.act11;

public interface Repositorio<T> {
void add(T item);
T findById(String id);
int size();
boolean remove(T item);
}
