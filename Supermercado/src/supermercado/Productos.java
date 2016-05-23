/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Adrián
 */
@Entity
@Table(name = "productos", catalog = "supermercado", schema = "")
@NamedQueries({
    @NamedQuery(name = "Productos.findAll", query = "SELECT p FROM Productos p"),
    @NamedQuery(name = "Productos.findByIdproductos", query = "SELECT p FROM Productos p WHERE p.idproductos = :idproductos"),
    @NamedQuery(name = "Productos.findByNombre", query = "SELECT p FROM Productos p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Productos.findByPrecio", query = "SELECT p FROM Productos p WHERE p.precio = :precio"),
    @NamedQuery(name = "Productos.findByDescripcion", query = "SELECT p FROM Productos p WHERE p.descripcion = :descripcion")})
public class Productos implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idproductos")
    private Integer idproductos;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "precio")
    private int precio;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;

    public Productos() {
    }

    public Productos(Integer idproductos) {
        this.idproductos = idproductos;
    }

    public Productos(Integer idproductos, String nombre, int precio, String descripcion) {
        this.idproductos = idproductos;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public Integer getIdproductos() {
        return idproductos;
    }

    public void setIdproductos(Integer idproductos) {
        Integer oldIdproductos = this.idproductos;
        this.idproductos = idproductos;
        changeSupport.firePropertyChange("idproductos", oldIdproductos, idproductos);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        int oldPrecio = this.precio;
        this.precio = precio;
        changeSupport.firePropertyChange("precio", oldPrecio, precio);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        String oldDescripcion = this.descripcion;
        this.descripcion = descripcion;
        changeSupport.firePropertyChange("descripcion", oldDescripcion, descripcion);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproductos != null ? idproductos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productos)) {
            return false;
        }
        Productos other = (Productos) object;
        if ((this.idproductos == null && other.idproductos != null) || (this.idproductos != null && !this.idproductos.equals(other.idproductos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "supermercado.Productos[ idproductos=" + idproductos + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
