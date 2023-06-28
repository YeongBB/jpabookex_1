package jpabook.jpabookex.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@NoArgsConstructor
@Getter
public class TeamMember {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @Column(name = "username")
    private String name;


/*
    @Column(name = "team_id")
    private Long teamId;
    */


    @OneToOne
    @JoinColumn(name = "locker_id")
    private Locker locker;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team teamId;


    public TeamMember(String name, Team teamId) {
        this.name = name;
        this.teamId = teamId;
        teamId.getTeamMembers().add(this);
    }
}
