package com.mycompany.introduccionjdbc;

import java.sql.*;



public class IntroduccionJDBC {
    
    public static void main(String [] args){
        //Paso 1: creamos nuestra cadena de conexino a mysql
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
        
        
        try{
            //paso 2: creamos el objeto de conextion a la base de datoss
            Connection conexion = DriverManager.getConnection(url, "root","admin");
            //paso 3: Creamos un objeto de tipo statement
            Statement intruccion = conexion.createStatement();
            //Paso 4: Creamos el query
            String sql = "Select id_persona, nombre, apellido, email, telefono from persona";
            //paso 5: Ejecucion de query
            ResultSet resultado = intruccion.executeQuery(sql);
            //paso 6: Procesamos el resultado
            while(resultado.next()){
                //Acceder a las columnas
                System.out.println("Id persona: "+resultado.getInt(1));
                System.out.println(" Nombre: "+resultado.getString(2));
                System.out.println(" Apellido: "+resultado.getString(3));
                System.out.println(" Email: "+resultado.getString(4));
                System.out.println(" Telefono: "+resultado.getString(5));
            }
            //cerramos cada objetos que hemos utilizado
            resultado.close();
            intruccion.close();
            conexion.close();
            
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
}
