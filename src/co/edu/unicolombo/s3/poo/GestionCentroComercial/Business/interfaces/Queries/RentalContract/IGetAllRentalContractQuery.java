/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.RentalContract;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.RentalContract;
import java.util.List;

/**
 *
 * @author CLEYMER
 */
public interface IGetAllRentalContractQuery {
        public List<RentalContract> getAllRentalContract() throws Exception;
}
