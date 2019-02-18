package com.bridgelabz.jdbc.repository;

import java.sql.SQLException;
import com.bridgelabz.jdbc.model.RegisterUser;
/**
 * Register Repository Interface
 * @author nisha
 *since 13/02/2019
 */
public interface RegisterRepositoryInterface {
	public void openConnection() throws SQLException;
	public void closeConnection() throws SQLException;
    public void save(RegisterUser user) throws SQLException;

}
