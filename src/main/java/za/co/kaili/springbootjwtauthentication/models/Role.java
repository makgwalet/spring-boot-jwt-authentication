package za.co.kaili.springbootjwtauthentication.models;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "roles")
@NoArgsConstructor
@AllArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;

}
