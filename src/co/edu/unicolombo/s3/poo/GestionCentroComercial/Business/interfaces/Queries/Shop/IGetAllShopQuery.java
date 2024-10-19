/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.Shop;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Shop;
import java.util.List;

/**
 *
 * @author CLEYMER
 */
public interface IGetAllShopQuery {
    public List<Shop> getAllShop() throws Exception;
}
