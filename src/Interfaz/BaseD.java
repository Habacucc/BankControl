package Interfaz;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stephanie
 */
 class Datos
{
    String nombre;
    String password;
    Datos liga;
    Datos(String nom, String pass)
    {
        nombre=nom;
        password=pass;
        liga=null;
    }
}
public class BaseD {
    Datos iniLista;
    BaseD()
    {
        iniLista=null;
    }
    
    void inserta(Datos nuevo)
    {
        Datos aux;
        aux=iniLista;
        if(iniLista==null)
        {
            iniLista=nuevo;
       //     finLista=nuevo;
        }
        else
        {
            while(aux.liga!=null)
            {
                aux=aux.liga;
            }
            aux.liga=nuevo;
            //finLista=aux;
        }
    }
    
    void escribeA()
    {
       
          try{
                FileOutputStream fos = new FileOutputStream("base.txt");
                PrintWriter pw = new PrintWriter(fos);
                //pw.println("Imprimimos una cadena y un entero " + 5);
                Datos aux=iniLista;
                while (aux!=null)
                {
                   pw.println(aux.nombre + " " + aux.password);
                   aux=aux.liga;
                }
                pw.flush();
                pw.close();
                fos.close();
           }catch (FileNotFoundException e){System.out.println("sss"); }
        catch (IOException e2){ }
            
        
        
    }
    
    void inicializa()
    {
        try
         {
            String linea;
            String archivo=  "base.txt";
            BufferedReader u =new BufferedReader(new InputStreamReader(System.in));   	
            BufferedReader a= new BufferedReader( new FileReader(archivo));
            //if((linea= a.readLine())!= null)
            //{
            String us="";
              while((linea=a.readLine())!=null)
              {
                //System.out.println(linea);
                  StringTokenizer dividir = new StringTokenizer(linea);
                  while(dividir.hasMoreTokens())
                {
                     us=dividir.nextToken();
                     String pa=dividir.nextToken();
                     Datos dat=new Datos(us,pa);
                     this.inserta(dat);
                }
                
              }
              a.close();
              u.close();
                 }catch(Exception e)
                {
                }
             
    }
    boolean busca(String nombre)
    {
        Datos aux=this.iniLista;
        boolean band=false;
      //try
      //{
        if(aux!=null)
          while(aux!=null)
          {
              //System.out.println(aux.nombre + "Nombre");
              if(aux.nombre.compareTo(nombre)==0)
              {
                  //System.out.println("Encontrado");
                     band=true;;
              }
              aux=aux.liga;
          }
      //}
      //catch(Exception e){}
    else
        {//System.out.println("Falso");
            return false;}
     if(band) 
      return true;
     else
         return false;
    }
    
    String obtenPassword(String nombre)
    {
        String pass=null;
        Datos aux=this.iniLista;
        boolean band=false;
      //try
      //{
        if(aux!=null)
          while(aux!=null)
          {
              //System.out.println(aux.nombre + "Nombre");
              if(aux.nombre.compareTo(nombre)==0)
              {
                  //System.out.println("Encontrado");
                  pass=aux.password;
                     band=true;
              }
              aux=aux.liga;
          }
      //}
      //catch(Exception e){}
    else
        {//System.out.println("Falso");
            return null;
        }
     if(band) 
      return pass;
     else
         return null;
    }
    
    
    public void muestra()
  {
      if(iniLista==null)
      {}
          //System.out.println("NO SE HAN CREADO CUENTAS");
      else
      {
      Datos actual;
      actual=iniLista;
      while(actual!=null)
      {
          //System.out.println(actual.nombre + " " + actual.password);
          actual=actual.liga;
          
      }
      }
  }
    
    /*BaseD*/ void elimina(String usuario)
  {
      Datos aux,ant;
      aux=this.iniLista;
      ant=aux;
      if(iniLista==null)
      {}//System.out.println("NO SE HAN CREADO CUENTAS");
      else
        {
            if(aux.nombre.equals(usuario))
            {
                iniLista=iniLista.liga;
            
            }
            else
            {
                while(aux!=null && aux.nombre.compareTo(usuario)!=0)
                {
                    ant=aux;
                    aux=aux.liga;
                    if(aux!=null)
                    {}//System.out.println(aux.nombre);
                }
       /* if(aux.liga==null)
            ant.liga=null;
        else
            ant.liga=aux.liga.liga;
        }*/
                if (aux==null)
                {
                    //System.out.println("No existe la cuenta null");
        
                }
                else
                {
                    if(aux.nombre.equals(usuario))
                    {
                        ant.liga=aux.liga;
            
                    }
                    else
                    {}//System.out.println("No existe la cuenta");
                }
      }
      
  }
  
    //return this;
  }
}
