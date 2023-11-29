
package co.unicauca.microkernel.plugins.brasil;

import co.unicauca.microkernel.common.entities.Delivery;
import co.unicauca.microkernel.common.entities.Product;
import co.unicauca.microkernel.common.interfaces.IDeliveryPlugin;

public class BrasilDeliveryPlugin implements IDeliveryPlugin {

    /**
     * Calcular el costo de envío de un producto de la tienda enviado dentro de
     * Brasil.
     *
     */
    @Override
    public double calculateCost(Delivery delivery) {

        Product product = delivery.getProduct();

        double cost;
        
        //El peso del producto determina el costo.
        if(product.getWeight()>5){
            cost = delivery.getDistance() * 2;
        }else if(product.getWeight()>1){
            cost = 1.5 * delivery.getDistance();
        }else{
            cost = 50;
        }
        
        return cost;
    }
}
