import java.sql.*;
import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner hos = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("Enter the options below");
            System.out.println("1 .Insert");
            System.out.println("2 .View");
            System.out.println("3 .Search");
            System.out.println("4 .Update");
            System.out.println("5 .Delete");
            System.out.println("6 .Number of doctor");
            System.out.println("7 .Name of doctor who consult fever");
            System.out.println("8 .Exit");

            choice = hos.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Insert the data ");
                    System.out.println("Enter the patient Id");
                    int id = hos.nextInt();
                    System.out.println("Enter the patient name");
                    String name = hos.next();
                    System.out.println("Address");
                    String add = hos.next();
                    System.out.println("pincode");
                    int pin = hos.nextInt();
                    System.out.println("Phone Number");
                    String phone = hos.next();
                    System.out.println("Symptoms");
                    String symp = hos.next();
                    System.out.println("Doctor name");
                    String docName = hos.next();

                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb", "root", "");
                        String sql = "INSERT INTO `patients`(`patient_id`, `name`, `address`, `pincode`, `phone`, `symptoms`, `doc_name`) VALUES (?,?,?,?,?,?,?)";
                        PreparedStatement stmt = con.prepareStatement(sql);
                        stmt.setInt(1, id);
                        stmt.setString(2, name);
                        stmt.setString(3, add);
                        stmt.setInt(4, pin);
                        stmt.setString(5, phone);
                        stmt.setString(6, symp);
                        stmt.setString(7, docName);
                        stmt.executeUpdate();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 2:
                    System.out.println("View the data ");
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb","root","");
                        String sql = "SELECT  `patient_id`, `name`, `address`, `pincode`, `phone`, `symptoms`, `doc_name` FROM `patients`  ";
                        Statement stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);
                        while (rs.next()){
                            String getId = rs.getString("patient_id");
                            String getName = rs.getString("name");
                            String getAddr = rs.getString("address");
                            String getPin = rs.getString("pincode");
                            String getPhone = rs.getString("Phone");
                            String getSymp = rs.getString("symptoms");
                            String getDoc = rs.getString("doc_name");
                            System.out.println("Patient id="+getId);
                            System.out.println("Patient name="+getName);
                            System.out.println("Patient Address="+getAddr);
                            System.out.println("Patient pincode="+getPin);
                            System.out.println("Patient phone="+getPhone);
                            System.out.println("Patient Symptoms="+getSymp);
                            System.out.println("Patient Doctor name="+getDoc+'\n');
                        }
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }
                    break;
                case 3:
                    System.out.println("Search the data ");
                    id = hos.nextInt();
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb","root","");
                        String sql = "SELECT  `patient_id`, `name`, `address`, `pincode`, `phone`, `symptoms`, `doc_name` FROM `patients` WHERE `patient_id`="+String.valueOf(id);
                        Statement stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);
                        while (rs.next()){
                            String getId = rs.getString("patient_id");
                            String getName = rs.getString("name");
                            String getAddr = rs.getString("address");
                            String getPin = rs.getString("pincode");
                            String getPhone = rs.getString("phone");
                            String getSymp = rs.getString("symptoms");
                            String getDoc = rs.getString("doc_name");
                            System.out.println("Patient id="+getId);
                            System.out.println("Patient name="+getName);
                            System.out.println("Patient Address="+getAddr);
                            System.out.println("Patient pincode="+getPin);
                            System.out.println("Patient phone="+getPhone);
                            System.out.println("Patient Symptoms="+getSymp);
                            System.out.println("Patient Doctor name="+getDoc+'\n');
                        }
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }
                    break;

            }
        }
    }
}