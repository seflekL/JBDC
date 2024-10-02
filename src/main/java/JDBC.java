import java.sql.*;

public class JDBC {

	/*

	NOT! EGER JDBC TESTINE BASLAYACAKSANIZ YAPMANIZ GEREKEN ILK IS
		 DATABASE YONETICISINDEN DATABASE BAGLANTI BILGILERINI ALMAK OLMALIDIR...

	 */

	/*
		type	jdbc:mysql
		host/ip	195.35.59.63
		port	3306
		database_name	u201212290_loantec
		username	u201212290_loantecuser
		password	HPo?+7r$
	 */

	/*
	URL: "jdbc:mysql://195.35.59.63/u201212290_loantec";
	USERNAME= "u201212290_loantecuser";
	PASSWORD="HPo?+7r$";
	 */

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1. ADIM: JDBC Sürücüsünü Yükleme

        Class.forName("com.mysql.jdbc.Driver");


        // 2. ADIM: Veritabanı Bağlantısı Kurma


        String URL= "jdbc:mysql://195.35.59.63/u201212290_loantec";
        String USERNAME= "u201212290_loantecuser";
        String PASSWORD="HPo?+7r$";

        Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);

        // 3. ADIM: SQL Sorguları Oluşturma

        String query = "SELECT * FROM users";

        // 4. ADIM: SQL Sorguları Çalıştırma

        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

        ResultSet resultSet = statement.executeQuery(query);

        // 5. ADIM: Sonuçları İşleme

        // ResultSet icerisinde islem yapmal icin ITERATOR kullanilir.

        resultSet.next();
        System.out.println(resultSet.getString("firstname")); // Elf gelmeli.

        resultSet.next();
        System.out.println(resultSet.getString(2));  //Test

        System.out.println(resultSet.getString("username"));  // tester


        resultSet.absolute(8);
        System.out.println(resultSet.getString("firstname"));


        resultSet.next();
        System.out.println(resultSet.getLong("mobile"));

        resultSet.first();
        System.out.println(resultSet.getString("country_code"));


        resultSet.next();
        System.out.println(resultSet.getInt("status"));

        resultSet.previous();
        System.out.println(resultSet.getInt("ts"));


    }



}