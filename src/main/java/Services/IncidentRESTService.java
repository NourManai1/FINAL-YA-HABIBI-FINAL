/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author amelb
 */
import Entities.Traffic;
//import Service.connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import Services.connection;



@Path("/incident")
public class IncidentRESTService {
    
    
    @Path("/showAll")
@GET
@Produces(MediaType.APPLICATION_JSON)
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
    e.printStackTrace(); // Print the stack trace for debugging
    throw new RuntimeException("Error retrieving data from the database", e);
}

    return incidents;
}

    
    //User want to see the accidents Description and Severity in the street and city he choose.
@Path("/show")
@GET
@Produces(MediaType.APPLICATION_JSON)
public List<Traffic> showAccidents(
  //  @QueryParam("street") String street,
   // @QueryParam("city") String city
) {
    List<Traffic> incidents = new ArrayList<>();


    // Base SQL query with specific conditions
    String sql = "SELECT * FROM localisation WHERE City='Cityville' AND Street='Main Street'";

    try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
         ResultSet resultSet = preparedStatement.executeQuery()) {

        while (resultSet.next()) {
            Traffic incident = mapResultSetToIncident(resultSet);
            incidents.add(incident);
        }

    } catch (SQLException e) {
        e.printStackTrace(); // Handle the exception appropriately
    }

    return incidents;
}



  
   @POST
@Path("/ajouterIncident")
@Consumes(MediaType.APPLICATION_JSON)
public void ajouterIncident(Traffic incident) {
    String sql = "INSERT INTO localisation (ID, Source, Severity, Street, City, Country) VALUES (?, ?, ?, ?, ?, ?)";

     try (PreparedStatement preparedStatement = connection.prepareStatement(sql)){

        // Set values for the placeholders from the incident object
        preparedStatement.setString(1, incident.getID());
        preparedStatement.setString(2, incident.getSource());
        preparedStatement.setInt(3, incident.getSeverity());
        preparedStatement.setString(4, incident.getStreet());
        preparedStatement.setString(5, incident.getCity());
        preparedStatement.setString(6, incident.getCountry());

        preparedStatement.executeUpdate();
    } catch (SQLException e) {
    e.printStackTrace(); // Log the exception
    throw new RuntimeException("Error inserting data into the database: " + e.getMessage(), e);
}
}

    
    

    
    
    private Traffic mapResultSetToIncident(ResultSet resultSet) throws SQLException {
        Traffic traffic = new Traffic();
        
        traffic.setDescription(resultSet.getString("Description"));
        traffic.setSeverity(resultSet.getInt("Severity"));
        
       
        return traffic ;
        

    }
  
}