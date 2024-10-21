package co.edu.unicolombo.s3.poo.GestionCentroComercial.Infrastructure.Repositories;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IPaymentRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Payment;
import java.util.List;

/**
 *
 * @author CLEYMER
 */
public class PaymentRepository implements IPaymentRepository{
    private List<Payment> paymentDb;

    @Override
    public Payment save(Payment payment) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Payment findById(int paymentId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Payment> findAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int paymentId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Payment update(int paymentId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
