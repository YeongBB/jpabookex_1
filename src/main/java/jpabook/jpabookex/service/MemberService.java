package jpabook.jpabookex.service;

import jakarta.persistence.EntityManager;
import jpabook.jpabookex.domain.Team;
import jpabook.jpabookex.domain.TeamMember;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final EntityManager em;

    @Transactional
    public void createMember(){
        Team team = new Team("team1");
        em.persist(team);

        TeamMember teamMember = new TeamMember("TeamMember1", team);
        em.persist(teamMember);

        TeamMember teamMember1 = em.find(TeamMember.class, team.getId());
        System.out.println("teamMember1 = " + teamMember1);

        Team findTeam = em.find(Team.class, team.getId());

        List<TeamMember> members = findTeam.getTeamMembers();

        for (TeamMember m : members) {
            System.out.println("m.getName() = " + m.getName());
        }

    }
}
