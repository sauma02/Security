/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia.ejercicios.mains;

import com.mycompany.herencia.ejercicios.entidades.Edificio;
import com.mycompany.herencia.ejercicios.entidades.EdificioDeOficinas;
import com.mycompany.herencia.ejercicios.entidades.Polideportivo;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 *
 * @author Admin
 */
public class Comparador {
    public static Comparator<Edificio> filtrarSinTechoConTecho = new Comparator<Edificio>(){
        public int compare(Polideportivo o1, Polideportivo o2) {
            return o2.getTipoTecho().compareTo(o1.getTipoTecho());
        }

        @Override
        public Comparator<Edificio> reversed() {
            return Comparator.super.reversed(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }

        @Override
        public Comparator<Edificio> thenComparing(Comparator<? super Edificio> other) {
            return Comparator.super.thenComparing(other); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }

        @Override
        public <U> Comparator<Edificio> thenComparing(Function<? super Edificio, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
            return Comparator.super.thenComparing(keyExtractor, keyComparator); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }

        @Override
        public <U extends Comparable<? super U>> Comparator<Edificio> thenComparing(Function<? super Edificio, ? extends U> keyExtractor) {
            return Comparator.super.thenComparing(keyExtractor); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }

        @Override
        public Comparator<Edificio> thenComparingInt(ToIntFunction<? super Edificio> keyExtractor) {
            return Comparator.super.thenComparingInt(keyExtractor); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }

        @Override
        public Comparator<Edificio> thenComparingLong(ToLongFunction<? super Edificio> keyExtractor) {
            return Comparator.super.thenComparingLong(keyExtractor); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }

        @Override
        public Comparator<Edificio> thenComparingDouble(ToDoubleFunction<? super Edificio> keyExtractor) {
            return Comparator.super.thenComparingDouble(keyExtractor); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }

        @Override
        public int compare(Edificio o1, Edificio o2) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
    };
}
