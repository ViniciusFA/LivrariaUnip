/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ALPOO;

import java.sql.*;
/**
 *
 * @author viniciusfa
 */
public class Query {
    
     public static void main(String[] args){
        Connection con;
        String url="jdbc:postgresql://localhost:5432/livraria";
        String user ="postgres";
        String password="";
        
        try{
            con = DriverManager.getConnection(url,user,password);
            System.out.println("Conexao estabelecida.");
            Statement stm = con.createStatement();
            ResultSet rs;
            rs = stm.executeQuery("select * from books");  
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("Temos" + rsmd.getColumnCount() + " colunas.");
            System.out.println(rsmd.getColumnName(1)+":"+rsmd.getCatalogName(4));
            while(rs.next()){
                System.out.println(rs.getString("title") + ":" + rs.getDouble("price"));  
            }
            rs.close();
            stm.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
            
        }
    }
    
}
