/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeronautica.pilotos;

/**
 *
 * @author JuanDMeGon
 */
public final class PilotoMilitar extends Piloto{
    public String ordenarSalida()
    {
        return this.comunicarse("Lanzarse del avión");
    }
}
