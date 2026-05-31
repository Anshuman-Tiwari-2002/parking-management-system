package com.mycompany.signup;

import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class ResultSetTableModel {

    public static DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {

        ResultSetMetaData metaData = rs.getMetaData();

        Vector<String> columnNames = new Vector<>();

        int columnCount = metaData.getColumnCount();

        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        Vector<Vector<Object>> data = new Vector<>();

        while (rs.next()) {
            Vector<Object> vector = new Vector<>();

            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }

            data.add(vector);
        }

        return new DefaultTableModel(data, columnNames);
    }
}