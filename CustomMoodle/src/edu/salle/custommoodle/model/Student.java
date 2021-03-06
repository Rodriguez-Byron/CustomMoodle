/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.model;

import java.util.Objects;

/**
 *
 * @author K A
 */
public class Student{
    private String name;
    private String lastName;
    private String id;
    
    public Student(){
        
    }

    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    @Override
    public String toString()
    {
        return String.format("id= %s,\nname= %s,\nlastName= %s", id, name, lastName);
    }
    
        //retorna 1 si la cadena 1 es mayor que la 2
        // 0 las cadenas son iguales
        // -1 si la cadena 1 es menor 

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
