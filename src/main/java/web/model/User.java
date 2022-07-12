package web.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "old_club")
    private String oldClub;

    @Column(name = "new_club")
    private String newClub;

    public User(String name, String oldClub, String newClub) {
        this.name = name;
        this.oldClub = oldClub;
        this.newClub = newClub;
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOldClub() {
        return oldClub;
    }

    public void setOldClub(String oldClub) {
        this.oldClub = oldClub;
    }

    public String getNewClub() {
        return newClub;
    }

    public void setNewClub(String newClub) {
        this.newClub = newClub;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", oldClub='" + oldClub + '\'' +
                ", newClub='" + newClub + '\'' +
                '}';
    }
}
