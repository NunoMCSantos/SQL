/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.marinha.hiber;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Formação
 */
public class Formando {
   String nome;
   String apelidos;
   String nii;
   Date data_nascimento;
   
   public static void main (String[]args)
   throws ParseException{
       Formando f1= new Formando();
       f1.nome="Cesar";
       f1.apelidos="Santos";
       f1.nii="987654321";
       SimpleDateFormat sdf=
               new SimpleDateFormat("yyyy-MM-dd");
       f1.data_nascimento= sdf.parse("1978-09-01");
       
       
   }
   
}
