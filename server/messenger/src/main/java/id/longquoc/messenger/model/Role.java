package id.longquoc.messenger.model;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long id;
    @ManyToMany(mappedBy = "roles")
    private Collection<User> users;
    @Enumerated(value = EnumType.STRING)
    private UserRoles role;

}
