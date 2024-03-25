package com.hexaware.dao;


import com.hexaware.entity.Pet;
import com.hexaware.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao1 {
    private static final String INSERT_PET_QUERY = "INSERT INTO pets (name, age, breed) VALUES (?, ?, ?)";

    public void addPet(Pet pet, String connectionString) throws SQLException {
        try (Connection connection = DbUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PET_QUERY)) {
            preparedStatement.setString(1, pet.getName());
            preparedStatement.setInt(2, pet.getAge());
            preparedStatement.setString(3, pet.getBreed());
            preparedStatement.executeUpdate();
        }
    }
}