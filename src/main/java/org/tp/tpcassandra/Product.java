package org.tp.tpcassandra;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table
public class Product {
    @PrimaryKey
    private String id;
    private String name;
    private double price;
    private int quantity;
}