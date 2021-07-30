package uz.pdp.appwarehouse.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column
    private String lastName;

    @Column(nullable = false, unique = true)
    private String phoneNumber;

    @Column(unique = true)
    private Integer code;

    @Column
    private String password;

    @Column(columnDefinition = "boolean default true")
    private Boolean active;

    @ManyToMany
    private Set<Warehouse> warehouses;
}
