package com.ganesh.others;
/*

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DbOperations {

    Connection con;

    public DbOperations() {
        con = DbUtil.getConnection();
    }

    public boolean insertCategory(String type) throws SQLException {
        String query = "insert into category(type) values(\""+type+"\")";
        Statement st = con.createStatement();
        boolean i = st.execute(query);
        System.out.println("value inserted");
        return i;
    }

    public ArrayList getCategoryById(int id) throws SQLException {
        String query = "select * from category where id=" + id ;
        Statement st = con.createStatement();
        ResultSet rs1 = st.executeQuery(query);
        ArrayList al = new ArrayList();
        rs1.next();
        al.add(rs1.getInt("id"));
        al.add(rs1.getString("type"));
        System.out.println("List of value" + al);
        return al;
    }
    public ResultSet getAllCategory() throws SQLException {
        Connection con = DbUtil.getConnection();
        PreparedStatement ps = con.prepareStatement("select * from category");
        return ps.executeQuery();
    }

    public boolean insertProduct(String name, float price, String type) throws SQLException {
        boolean flag = false;
            PreparedStatement ps = con.prepareStatement("insert into product(name,price,category_id) values(?,?,(select id from category where type=?))");
            ps.setString(1, name);
            ps.setFloat(2, price);
            ps.setString(3, type);
            int f = ps.executeUpdate();
            if (f > 0) flag = true;
        return flag;
    }

    public ArrayList getProductById(int id) throws SQLException {
        String query = "select * from product where id=" + id + ";";
        Statement st = con.createStatement();
        ResultSet rs1 = st.executeQuery(query);
        ArrayList al = new ArrayList();
        rs1.next();
        al.add(rs1.getInt("id"));
        al.add(rs1.getString("name"));
        al.add(rs1.getFloat("price"));
        al.add(rs1.getInt("category_id"));
        System.out.println("List of value" + al);
        return al;
    }

    public ResultSet getAllProduct() throws SQLException {
        Connection con = DbUtil.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from product");
            return ps.executeQuery();
    }

    public boolean insertOrder(String product_name, Date date) throws SQLException {
        boolean flag = false;
            PreparedStatement ps = con.prepareStatement("insert into orders(product_id,date) values(select id from product where name="+product_name+",?)");
            ps.setDate(1, date);
            int f = ps.executeUpdate();
            if (f > 0) flag = true;
        return flag;
    }

    public ArrayList getOrderById(int id) throws SQLException {
            PreparedStatement ps = con.prepareStatement("select * from orders where id=?");
            ps.setInt(1, id);
            ResultSet result = ps.executeQuery();
            ArrayList result1 = new ArrayList();
            result.next();
            result1.add(result.getInt("id"));
            result1.add(result.getInt("product_id"));
            result1.add(result.getDate("date"));
            return result1;
    }

    public ResultSet getAllOrder() throws SQLException {
            PreparedStatement ps = con.prepareStatement("select * from order");
            return ps.executeQuery();

    }
}



class RunningScripts {
    public void runDbScript() throws Exception {
        //Getting the connection
        Connection con = DbUtil.getConnection();
        //Initialize the script runner
        ScriptRunner sr = new ScriptRunner(con);
        //Creating a reader object
        Reader reader = new BufferedReader(new FileReader("//projects//challenge//JDBC//db.sql"));
        //Running the script
        sr.runScript(reader);


    }
}

*/

