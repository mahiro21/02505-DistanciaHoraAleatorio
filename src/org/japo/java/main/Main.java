/* 
 * Copyright 2019 Mario Merlos Abella <mario.merlos.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Calendar;
import java.util.Random;

/**
 *
 * @author Mario Merlos Abella <mario.merlos.alum@iescamp.es>
 */
public final class Main {

    /**
     *
     */
    public static final Random RND = new Random();

    public static void main(String[] args) {

        // Generar dato
        Calendar tiempo = Calendar.getInstance();

        int secondI, secondA;
        int horaCal, minutoCal, segundoCal;

        //Datos Aleatorios
        int hora = RND.nextInt(23 - 0 + 1) + 0;
        int minuto = RND.nextInt(60 - 0 + 1) + 0;
        int segundo = RND.nextInt(60 - 0 + 1) + 0;

        //Devolver resultado
        System.out.printf("Hora inicio ......: %02d:%02d:%02d%n", hora, minuto, segundo);
        System.out.printf("Hora Actual ......: %tT%n ", tiempo);

        //Operaciones
        secondI = hora * 3600 + minuto * 60 + segundo;
        secondA = tiempo.get(Calendar.HOUR_OF_DAY) * 3600 + tiempo.get(Calendar.MINUTE) * 60 + tiempo.get(Calendar.SECOND);
        //segundos
        System.out.println(secondA);
        System.out.println(secondI);
        segundoCal = secondA - secondI;

        //Minutos
        minutoCal = segundoCal / 60;
        segundoCal = segundoCal % 60;

        //Horas
        horaCal = minutoCal / 60;
        minutoCal = minutoCal % 60;
        System.out.printf("Tiempo de clase ..: %02d:%02d:%02d%n", horaCal, minutoCal, segundoCal);
    }

}
