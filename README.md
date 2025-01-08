# 🖥️ JBDC Projesi
<br><br>
JBDC Projesi, Java tabanlı veritabanı bağlantılarını ve işlemlerini kolaylaştırmak için geliştirilmiş bir framework'tür.  
Bu proje, veritabanı sorgularını güvenli ve optimize edilmiş bir şekilde yürütmek için tasarlanmıştır.<br><br>

### Bu proje aşağıdaki özellikleri içerir:<br><br>

- Java Database Connectivity (JDBC) ile veritabanı bağlantısı.  
- SQL sorgularının yürütülmesi ve sonuçların işlenmesi.  
- Dinamik parametre yönetimi ve veritabanı işlemlerinin optimize edilmesi.  
- Çeşitli veritabanlarıyla uyumlu çalışma.  
<br><br>

## ✨ Ana Özellikler
<br><br>
- **Veritabanı Bağlantısı**: JDBC ile kolay ve güvenilir bağlantı yönetimi.  
- **SQL Sorguları**: Veritabanı üzerinde dinamik ve statik sorguların yürütülmesi.  
- **Performans Optimizasyonu**: Veritabanı işlemlerinin hızlı ve doğru bir şekilde gerçekleştirilmesi.  
- **Hata Yönetimi**: Veritabanı hatalarının kolayca ayıklanması ve yönetimi.  
<br><br>

## 📐 Kullanılan Teknolojiler ve Bağımlılıklar
Bu projede aşağıdaki teknolojiler kullanılmıştır:<br><br>

- **JDBC**: Java Database Connectivity API'si.  
- **MySQL**: Veritabanı yönetim sistemi.  
- **Maven**: Proje yapılandırma ve bağımlılık yönetimi.  
<br><br>

## 🔧 Kurulum ve Çalıştırma
<br><br>
Projeyi yerel bilgisayarınıza klonlayın:  
`git clone https://github.com/seflekL/JBDC.git`  
<br><br>
Proje dizinine gidin:  
`cd JBDC`  
<br><br>
Maven bağımlılıklarını yükleyin:  
`mvn clean install`  
<br><br>
Uygulamayı çalıştırın:  
`java -jar target/JBDC-1.0-SNAPSHOT.jar`  
<br><br>

## 📊 Proje Özellikleri
<br><br>
### Desteklenen Veritabanı İşlemleri
- **SELECT**: Veritabanından veri çekme.  
- **INSERT**: Yeni veri ekleme.  
- **UPDATE**: Mevcut verileri güncelleme.  
- **DELETE**: Veritabanından veri silme.  
<br><br>

### Örnek Kullanım
```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JBDCExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/database_name";
        String user = "username";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM users WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, 1);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println("Kullanıcı Adı: " + resultSet.getString("username"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
📫 İletişim
<br><br> Projeyi geliştiren kişiye ulaşmak için:
GitHub: seflekL
