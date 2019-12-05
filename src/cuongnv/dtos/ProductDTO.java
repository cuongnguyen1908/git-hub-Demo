/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuongnv.dtos;

/**
 *
 * @author cuong
 */
public class ProductDTO {
    String username, password;

    public ProductDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public ProductDTO() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
