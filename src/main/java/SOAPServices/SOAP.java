/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package SOAPServices;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Entities.Traffic;
import Services.connection;


/**
 *
 * @author nourm
 */
@WebService(serviceName = "SOAP")
public class SOAP {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "ShowAllSOAP")
    public List<Traffic> showFirstFiveAccidents() {
        List<Traffic> incidents = new ArrayList<>();

        String sql = "SELECT * FROM soc_db.localisation LIMIT 10 ";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Traffic incident = mapResultSetToIncident(resultSet);
                incidents.add(incident);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error retrieving data from the database", e);
        }

        return incidents;
    }

    private Traffic mapResultSetToIncident(ResultSet resultSet) throws SQLException {
        Traffic traffic = new Traffic();

       traffic.setCounty(resultSet.getString("County"));
        traffic.setCity(resultSet.getString("City"));
        traffic.setStreet(resultSet.getString("Street"));
        traffic.setSeverity(resultSet.getInt("Severity"));
        traffic.setDescription(resultSet.getString("Description"));

        traffic.setStart_Time(resultSet.getString("Start_Time"));

        return traffic;
    }
}




   
   
