package jpabook.jpabookex.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
public class Team {

        @Id
        @GeneratedValue
        @Column(name = "team_id")
        private Long id;
        private String name;

        @OneToMany(mappedBy = "teamId")
        private List<TeamMember> teamMembers = new ArrayList<>();

        public Team(String name) {
                this.name = name;
        }
}
