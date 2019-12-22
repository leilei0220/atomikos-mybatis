package com.example.po.db2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Description TODO
 * @Author leilei
 * @Date 2019/12/21 17:20
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "grade")
public class GradePO implements Serializable {

    @Id
    private String id;
    private String subjects;
    private Integer score;
}
