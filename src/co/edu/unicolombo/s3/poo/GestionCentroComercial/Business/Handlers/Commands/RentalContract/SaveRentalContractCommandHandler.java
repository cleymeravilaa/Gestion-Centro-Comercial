/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Commands.RentalContract;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.RentalContract.ISaveRentalContractCommand;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.RentalContract;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IRentalContractRepository;

/**
 *
 * @author CLEYMER
 */
public class SaveRentalContractCommandHandler implements ISaveRentalContractCommand {
    
    private IRentalContractRepository repository;

    @Override
    public RentalContract save(RentalContract rentalContract) throws Exception {
        return this.repository.saveRentalContract(rentalContract);
    }

}
